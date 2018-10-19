package com.joao;

import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;
import java.util.List;

import static com.joao.IRUtils.getForIntName;
import static com.joao.IRUtils.getVarName;
import static com.joao.IRUtils.newTempName;

public class CryptolangSemanticListener extends CryptolangBaseListener {

    // Anotações
    private ParseTreeProperty<Integer> sizes = new ParseTreeProperty<>();
    private ParseTreeProperty<Integer> upperbounds = new ParseTreeProperty<>();
    private ParseTreeProperty<Integer> max_vals = new ParseTreeProperty<>();
    private ParseTreeProperty<String> irs = new ParseTreeProperty<>();
    private ParseTreeProperty<String> names = new ParseTreeProperty<>();

    // Tabela de simbolos
    public SymbolTable table; // tabela de símbolos atual
    private Symbol lookup(String id) {
        SymbolTable table = this.table;
        while (table.parent != null) {
            Symbol symbol = table.lookup(id);
            if (symbol != null) {
                return symbol;
            } else {
                table = table.parent;
            }
        }
        return table.lookup(id);
    }

    // Dentro de uma função?
    public FunSymbol fun = null;

    // Gerador de código
    String globals_ir = "";
    String functions_ir = "";
    public String getGeneratedCode() {
        return    globals_ir
                + functions_ir
                + "@.str = private unnamed_addr constant [4 x i8] c\"%u\\0A\\00\"\ndefine i32 @main() #0 {\n"
                + table.ir
                + "ret i32 0\n}\ndeclare i32 @printf(i8*, ...) #1";
    }

    // Regra inicial
    @Override public void enterFile(CryptolangParser.FileContext ctx) {
        table = new SymbolTable(null);
    }
    @Override public void exitFile(CryptolangParser.FileContext ctx) {
    }

    // Bloco e Declarações com blocos
    @Override public void enterBlock(CryptolangParser.BlockContext ctx) {

        // Controla o escopo
        table = new SymbolTable(table);
    }
    @Override public void exitBlock(CryptolangParser.BlockContext ctx) {

        // Anota o código
        irs.put(ctx, table.ir);

        // Muda para a tabela de símbolos pai
        table = table.parent;
    }
    @Override public void exitFor_block(CryptolangParser.For_blockContext ctx) {

        // Anota o código
        irs.put(ctx, table.ir);

        // Muda para a tabela de símbolos pai
        table = table.parent;
    }
    @Override public void exitFunc_block(CryptolangParser.Func_blockContext ctx) {

        // Anota o código
        functions_ir += table.ir;
        functions_ir += "ret i" + fun.return_size + " 0\n}\n";

        // Muda para a tabela de símbolos pai
        table = table.parent;

        // Não ta mais em uma função
        fun = null;
    }
    @Override public void exitIf_stat(CryptolangParser.If_statContext ctx) {

        /* http://llvm.org/docs/tutorial/OCamlLangImpl5.html
declare double @foo()

declare double @bar()

define double @baz(double %x) {
entry:
  %ifcond = fcmp one double %x, 0.000000e+00
  br i1 %ifcond, label %then, label %else

then:    ; preds = %entry
  %calltmp = call double @foo()
  br label %ifcont

else:    ; preds = %entry
  %calltmp1 = call double @bar()
  br label %ifcont

ifcont:    ; preds = %else, %then
  %iftmp = phi double [ %calltmp, %then ], [ %calltmp1, %else ]
  ret double %iftmp
}
         */
        String ir = "";
        List<CryptolangParser.ExpContext> exps = ctx.exp();
        List<CryptolangParser.BlockContext> blocks = ctx.block();
        int i;
        String ifcont = IRUtils.newTempLabel();
        for (i = 0; i < exps.size(); i += 1) {

            CryptolangParser.ExpContext exp = exps.get(i);
            CryptolangParser.BlockContext block = blocks.get(i);

            String comp = IRUtils.newTempName();
            String exp_ir = irs.get(exp);
            ir += exp_ir;
            ir += comp + " = icmp ne i" + sizes.get(exp) + " " + names.get(exp) + ", 0" + "\n";

            String true_label = IRUtils.newTempLabel();
            String false_label = IRUtils.newTempLabel();
            ir += "br i1 " + comp + ", label %" + true_label + ", label %" + false_label + "\n";
            ir += true_label + ":\n";
            ir += irs.get(block);
            ir += "br label %" + ifcont + "\n";
            ir += false_label + ":\n";

        }
        if (exps.size() < blocks.size()) { // tem um bloco else
            ir += irs.get(blocks.get(i));
        }
        ir += "br label %" + ifcont + "\n";
        ir += ifcont + ":\n";

        table.ir += ir;
    }
    @Override public void enterFunc_stat(CryptolangParser.Func_statContext ctx) {

        if (fun != null) {
            System.err.println("Função dentro de função");
            return;
        }

        String id = ctx.ID().getText();

        // Não declarada?
        Symbol symbol = lookup(id);
        if (symbol != null) {
            switch (symbol.type) {
                case VAR:
                    System.err.println("Variável já declarada");
                    break;
                case FUN:
                    System.err.println("Função já declarada");
                    break;
                case FORINT:
                    System.err.println("Forint já declarada");
                    break;
            }
            return;
        }

        // Adiciona a tabela de símbolos
        int n_params = ctx.param().size();
        int return_size = Integer.parseInt(ctx.size().NUMBER().getText());
        FunSymbol fun_symbol = new FunSymbol(n_params, return_size);
        table.add(id, fun_symbol);

        // Cria um novo escopo
        table = new SymbolTable(table);

        // Ta dentro de uma função
        fun = fun_symbol;

        // Gera código
        functions_ir += "define i" + return_size + " @" + id + "(";
        List<CryptolangParser.ParamContext> params = ctx.param();
        if (!params.isEmpty()) {
            CryptolangParser.ParamContext param = params.get(0);
            id = param.ID().getText();
            // Não declarada?
            symbol = lookup(id);
            if (symbol != null) {
                switch (symbol.type) {
                    case VAR:
                        System.err.println("Variável já declarada");
                        break;
                    case FUN:
                        System.err.println("Função já declarada");
                        break;
                    case FORINT:
                        System.err.println("Forint já declarada");
                        break;
                }
                return;
            }
            // Adiciona a tabela de símbolos
            Integer size = Integer.parseInt(param.size().NUMBER().getText());
            fun_symbol.sizes.add(size);
            VarSymbol var_symbol = new VarSymbol(size, true, false, true);
            table.add(id, var_symbol);
            functions_ir += "i" + size + " " + getVarName(var_symbol);
            for (int i = 1; i < params.size(); i += 1) {
                param = params.get(i);
                id = param.ID().getText();
                // Não declarada?
                symbol = lookup(id);
                if (symbol != null) {
                    switch (symbol.type) {
                        case VAR:
                            System.err.println("Variável já declarada");
                            break;
                        case FUN:
                            System.err.println("Função já declarada");
                            break;
                        case FORINT:
                            System.err.println("Forint já declarada");
                            break;
                    }
                    return;
                }
                // Adiciona a tabela de símbolos
                size = Integer.parseInt(param.size().NUMBER().getText());
                fun_symbol.sizes.add(size);
                var_symbol = new VarSymbol(size, true, false, true);
                table.add(id, var_symbol);
                functions_ir += ", i" + size + " " + getVarName(var_symbol);
            }

        }
        functions_ir += ") {\n";

    }
    @Override public void exitWhile_stat(CryptolangParser.While_statContext ctx) {
        String ir = "";
        String test_label = IRUtils.newTempLabel();
        ir += "br label %" + test_label + "\n";
        ir += test_label + ":\n";
        CryptolangParser.ExpContext exp = ctx.exp();
        ir += irs.get(exp);
        String comp = IRUtils.newTempName();
        ir += comp + " = icmp ne i" + sizes.get(exp) + " " + names.get(exp) + ", 0" + "\n";
        String block_label = IRUtils.newTempLabel();
        String out_label = IRUtils.newTempLabel();
        ir += "br i1 " + comp + ", label %" + block_label + ", label %" + out_label + "\n";
        ir += block_label + ":\n";
        ir += irs.get(ctx.block());
        ir += "br label %" + test_label + "\n";
        ir += out_label + ":\n";
        table.ir += ir;
    }
    @Override public void enterFor_stat(CryptolangParser.For_statContext ctx) {

        // Cria um novo escopo
        table = new SymbolTable(table);

        // Gera código
        // TODO: gerar código para For_stat
    }
    @Override public void exitFor_header(CryptolangParser.For_headerContext ctx) {

        String id = ctx.ID().getText();

        // Não declarada?
        Symbol symbol = lookup(id);
        if (symbol != null) {
            switch (symbol.type) {
                case VAR:
                    System.err.println("Variável já declarada");
                    break;
                case FUN:
                    System.err.println("Função já declarada");
                    break;
                case FORINT:
                    System.err.println("Forint já declarada");
                    break;
            }
            return;
        }

        // Adiciona a table de símbolos
        table.add(id, new ForIntSymbol(upperbounds.get(ctx.intv())));

        // Gera código
        // TODO: gerar código For_header
    }

    // Declarações sem blocos
    @Override public void exitVar_stat(CryptolangParser.Var_statContext ctx) {

        String id = ctx.ID().getText();

        // Não declarada?
        Symbol symbol = table.lookup(id);
        if (symbol != null) {
            switch (symbol.type) {
                case VAR:
                    System.err.println("Variável já declarada");
                    break;
                case FUN:
                    System.err.println("Função já declarada");
                    break;
                case FORINT:
                    System.err.println("Forint já declarada");
                    break;
            }
            return;
        }

        // Adicona a tabela de símbolos
        Integer size = Integer.parseInt(ctx.size().NUMBER().getText());
        VarSymbol var_symbol;
        CryptolangParser.ExpContext exp = ctx.exp();
        Boolean initialized = exp != null;
        Integer size0 = null;
        if (initialized) { // Inicializada
            size0 = sizes.get(exp);
            if (size0 > size) {
                System.err.println("Atribuindo valores maiores");
                return;
            }
        }
        boolean global = table.parent == null;
        var_symbol = new VarSymbol(size, initialized, global);
        table.add(id, var_symbol);

        // Gera código
        String ir = "";
        if (global) {
            globals_ir += IRUtils.getVarName(var_symbol) + " = global i" + size + " 0\n";
        } else {
            ir += IRUtils.getVarName(var_symbol) + " = alloca i" + var_symbol.size + "\n";
        }
        table.ir += ir;
        if (initialized) {
            table.ir += irs.get(exp);
            String name0 = names.get(exp);
            if (size0 < size) {
                String new_name0 = IRUtils.newTempName();
                table.ir += new_name0 + " = zext i" + size0 + " " + name0 + " to i" + size + "\n";
                name0 = new_name0;
            }
            table.ir += "store i" + size + " " + name0 + ", i" + size + "* " + getVarName(var_symbol) + "\n";
        }

    }
    @Override public void exitAssign_stat(CryptolangParser.Assign_statContext ctx) {

        String id = ctx.ID().getText();

        // Não declarada?
        Symbol symbol = lookup(id);
        if (symbol == null) {
            System.err.println("Variável não declarada");
            return;
        }

        // É váriavél?
        if (symbol.type == SymbolType.FUN) {
            System.err.println("Atribuição de função");
            return;
        } else if (symbol.type == SymbolType.FORINT) {
            System.err.println("Atribuição de forint");
            return;
        }

        VarSymbol var_symbol = (VarSymbol) symbol;
        Integer size = var_symbol.size;

        // Intervalo dentro do limite?
        if (ctx.intv() != null) {
            if (upperbounds.get(ctx.intv()) >= var_symbol.size) {
                System.err.println("Intervalo fora do limite");
                return;
            }
            size = sizes.get(ctx.intv());
        }

        // Valor dentro do limite?
        if (size != null && sizes.get(ctx.exp()) != null && sizes.get(ctx.exp()) > size) {
            System.err.println("Atribuindo valores maiores");
            return;
        }

        // Inicializa
        var_symbol.initialized = true;

        // Gera código
        table.ir += irs.get(ctx.exp());
        String name0 = names.get(ctx.exp());
        if (sizes.get(ctx.exp()) < size) {
            String new_name0 = IRUtils.newTempName();
            table.ir += new_name0 + " = zext i" + sizes.get(ctx.exp()) + " " + name0 + " to i" + size + "\n";
            name0 = new_name0;
        }
        table.ir += "store i" + size + " " + name0 + ", i" + size + "* " + getVarName(var_symbol) + "\n";
    }
    @Override public void enterCall(CryptolangParser.CallContext ctx) {

        String id = ctx.ID().getText();
        Symbol symbol = lookup(id);

        // Não declarada?
        if (symbol == null) {
            System.err.println("Função não declarada");
            return;
        }

        // É função?
        if (symbol.type == SymbolType.VAR) {
            System.err.println("Chamada de váriavel");
            return;
        } else if (symbol.type == SymbolType.FORINT) {
            System.err.println("Chamada de forint");
            return;
        }

        // Número certo de parâmetros?
        FunSymbol fun_symbol = (FunSymbol) symbol;
        int call_n_params = ctx.exp().size();
        if (call_n_params != fun_symbol.n_params) {
            System.err.println("Número errado de parâmetros");
        }

        // Anota
        sizes.put(ctx, fun_symbol.return_size);

    }
    @Override public void exitCall(CryptolangParser.CallContext ctx) {
        String name = IRUtils.newTempName();
        names.put(ctx, name);

        String id = ctx.ID().getText();

        String ir = "";
        FunSymbol fun_symbol = (FunSymbol) lookup(id);
        List<CryptolangParser.ExpContext> exps = ctx.exp();
        List<String> pnames = new ArrayList<>();
        for (int i = 0; i < fun_symbol.sizes.size(); i += 1) {
            CryptolangParser.ExpContext exp = exps.get(i);
            ir += irs.get(exp);
            String name0 = names.get(exp);
            Integer size0 = sizes.get(exp);
            Integer size = fun_symbol.sizes.get(i);
            if (sizes.get(exp) < fun_symbol.sizes.get(i)) {
                String new_name0 = IRUtils.newTempName();
                ir += new_name0 + " = zext i" + size0 + " " + name0 + " to i" + size + "\n";
                name0 = new_name0;
            }
            pnames.add(name0);
        }
        ir += name + " = call i" + fun_symbol.return_size + " @" + id + "(";
        for (int i = 0; i < fun_symbol.sizes.size(); i += 1) {
            ir += "i" + fun_symbol.sizes.get(i) + " " + pnames.get(i);
        }
        ir += ")\n";
        irs.put(ctx, ir);
    }
    @Override public void exitCall_stat(CryptolangParser.Call_statContext ctx) {
        table.ir += irs.get(ctx.call());
    }
    @Override public void exitPrint_stat(CryptolangParser.Print_statContext ctx) {

        CryptolangParser.ExpContext exp = ctx.exp();

        // Anota
        Integer size0 = sizes.get(exp);
        if (size0 > 32) {
            System.err.println("Print em variável maior que 32 bits");
            return;
        }

        // Gera código
        String name = IRUtils.newTempName();
        String name0 = names.get(exp);
        table.ir += irs.get(ctx.exp());
        if (size0 < 32) { // Casting
            String new_name0 = IRUtils.newTempName();
            table.ir += new_name0 + " = zext i" + size0 + " " + name0 + " to i" + 32 + "\n";
            name0 = new_name0;
        }
        table.ir += name + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i32 0, i32 0), i32 " + name0 + ")" + "\n";

    }
    @Override public void exitReturn_stat(CryptolangParser.Return_statContext ctx) {

        // Retornando fora de função?
        if (fun == null) {
            System.err.println("Retorno fora de função");
            return;
        }

        CryptolangParser.ExpContext exp = ctx.exp();
        Integer size = sizes.get(exp);
        if (size > fun.return_size) {
            System.err.println("Retornando um valor maior");
        }

        String ir = irs.get(exp);
        String name0 = names.get(ctx.exp());
        if (size < fun.return_size) { // Casting
            String new_name0 = IRUtils.newTempName();
            ir += new_name0 + " = zext i" + size + " " + name0 + " to i" + fun.return_size + "\n";
            name0 = new_name0;
        }
        ir += "ret i" + fun.return_size + " " + name0 + "\n";
        table.ir += ir;
    }

    // Expressões
    @Override public void exitExpNot(CryptolangParser.ExpNotContext ctx) {

        // Anota
        Integer size = sizes.get(ctx.exp());
        sizes.put(ctx, size);

        // Gera código
        String name = IRUtils.newTempName();
        names.put(ctx, name);
        irs.put(ctx, irs.get(ctx.exp()) + name + " = xor i" + size + " " + names.get(ctx.exp()) + ", -1\n");
    }
    @Override public void exitExpPower(CryptolangParser.ExpPowerContext ctx) {

        // Anota
        Integer n = Integer.parseInt(ctx.NUMBER().getText());
        if (n > 1) {
            CryptolangParser.ExpContext exp = ctx.exp();
            Integer size0 = sizes.get(exp);
            Integer size = size0 * n;
            sizes.put(ctx, size);

            // Gera código
            String ir = "";
            ir += irs.get(exp);
            String name = IRUtils.newTempName();
            ir += name + " = add i" + size + " 0, 0\n";
            String name0 = IRUtils.newTempName();
            ir += name0 + " = zext i" + size0 + " " + names.get(exp) + " to i" + size + "\n";
            for (int i = 0; i < n; i += 1) {
                String name1 = IRUtils.newTempName();
                ir += name1 + " = shl i" + size + " " + name0 + ", " + (size0 * i) + "\n";
                String new_name = IRUtils.newTempName();
                ir += new_name + " = or i" + size + " " + name1 + ", " + name + "\n";
                name = new_name;
            }
            irs.put(ctx, ir);
            names.put(ctx, name);
        } else {
            irs.put(ctx, irs.get(ctx.exp()));
            names.put(ctx, names.get(ctx.exp()));
        }

    }
    @Override public void exitExpShiftLeft(CryptolangParser.ExpShiftLeftContext ctx) {

        // Anota
        Integer size = sizes.get(ctx.exp());
        sizes.put(ctx, size);

        // Gera código
        String name = newTempName();
        names.put(ctx, name);
        irs.put(ctx, irs.get(ctx.exp()) + name + " = shl i" + size + " " + names.get(ctx.exp()) + ", " + ctx.NUMBER().getText());
    }
    @Override public void exitExpShiftRight(CryptolangParser.ExpShiftRightContext ctx) {

        // Anota
        Integer size = sizes.get(ctx.exp());
        sizes.put(ctx, size);

        // Gera código
        String name = newTempName();
        names.put(ctx, name);
        irs.put(ctx, irs.get(ctx.exp()) + name + " = lshr i" + size + " " + names.get(ctx.exp()) + ", " + ctx.NUMBER().getText());
    }
    @Override public void exitExpConcat(CryptolangParser.ExpConcatContext ctx) {

        // Anota
        CryptolangParser.ExpContext exp0 = ctx.exp().get(0);
        CryptolangParser.ExpContext exp1 = ctx.exp().get(1);
        Integer size0 = sizes.get(exp0);
        Integer size1 = sizes.get(exp1);
        Integer size = size0 + size1;
        sizes.put(ctx, size);

        // Gera código
        String ir = "";
        ir += irs.get(exp0);
        String name0 = IRUtils.newTempName();
        ir += name0 + " = zext i" + size0 + " " + names.get(exp0) + " to i" + size + "\n";
        ir += irs.get(exp1);
        String name1 = IRUtils.newTempName();
        ir += name1 + " = zext i" + size1 + " " + names.get(exp1) + " to i" + size + "\n";
        String name2 = IRUtils.newTempName();
        ir += name2 + " = shl i" + size + " " + name0 + ", " + size1 + "\n";
        String name3 = IRUtils.newTempName();
        ir += name3 + " = or i" + size + " " + name2 + ", " + name1 + "\n";
        irs.put(ctx, ir);
        names.put(ctx, name3);
    }
    @Override public void exitExpXor(CryptolangParser.ExpXorContext ctx) {

        // Anota
        CryptolangParser.ExpContext exp0 = ctx.exp().get(0);
        CryptolangParser.ExpContext exp1 = ctx.exp().get(1);
        Integer size0 = sizes.get(exp0);
        Integer size1 = sizes.get(exp1);
        Integer size = Math.max(size0, size1);
        sizes.put(ctx, size);

        // Gera código
        // <result> = and <ty> <op1>, <op2>   ; yields ty:result
        String ir = "";
        ir += irs.get(exp0);
        String name0 = names.get(exp0);
        if (size0 < size) { // Casting
            String new_name0 = IRUtils.newTempName();
            ir += new_name0 + " = zext i" + size0 + " " + name0 + " to i" + size + "\n";
            name0 = new_name0;
        }
        ir += irs.get(exp1);
        String name1 = names.get(exp1);
        if (size1 < size) { // Casting
            String new_name1 = IRUtils.newTempName();
            ir += new_name1 + " = zext i" + size1 + " " + name1 + " to i" + size + "\n";
            name1 = new_name1;
        }
        String name = IRUtils.newTempName();
        ir += name + "= xor i" + size + " " + name0 + ", " + name1 + "\n";
        irs.put(ctx, ir);
        names.put(ctx, name);
    }
    @Override public void exitExpAnd(CryptolangParser.ExpAndContext ctx) {

        // Anota
        CryptolangParser.ExpContext exp0 = ctx.exp().get(0);
        CryptolangParser.ExpContext exp1 = ctx.exp().get(1);
        Integer size0 = sizes.get(exp0);
        Integer size1 = sizes.get(exp1);
        Integer size = Math.max(size0, size1);
        sizes.put(ctx, size);

        // Gera código
        // <result> = and <ty> <op1>, <op2>   ; yields ty:result
        String ir = "";
        ir += irs.get(exp0);
        String name0 = names.get(exp0);
        if (size0 < size) { // Casting
            String new_name0 = IRUtils.newTempName();
            ir += new_name0 + " = zext i" + size0 + " " + name0 + " to i" + size + "\n";
            name0 = new_name0;
        }
        ir += irs.get(exp1);
        String name1 = names.get(exp1);
        if (size1 < size) { // Casting
            String new_name1 = IRUtils.newTempName();
            ir += new_name1 + " = zext i" + size1 + " " + name1 + " to i" + size + "\n";
            name1 = new_name1;
        }
        String name = IRUtils.newTempName();
        ir += name + "= and i" + size + " " + name0 + ", " + name1 + "\n";
        irs.put(ctx, ir);
        names.put(ctx, name);
    }
    @Override public void exitExpOr(CryptolangParser.ExpOrContext ctx) {

        // Anota
        CryptolangParser.ExpContext exp0 = ctx.exp().get(0);
        CryptolangParser.ExpContext exp1 = ctx.exp().get(1);
        Integer size0 = sizes.get(exp0);
        Integer size1 = sizes.get(exp1);
        Integer size = Math.max(size0, size1);
        sizes.put(ctx, size);

        // Gera código
        // <result> = or <ty> <op1>, <op2>   ; yields ty:result
        String ir = "";
        ir += irs.get(exp0);
        String name0 = names.get(exp0);
        if (size0 < size) { // Casting
            String new_name0 = IRUtils.newTempName();
            ir += new_name0 + " = zext i" + size0 + " " + name0 + " to i" + size + "\n";
            name0 = new_name0;
        }
        ir += irs.get(exp1);
        String name1 = names.get(exp1);
        if (size1 < size) { // Casting
            String new_name1 = IRUtils.newTempName();
            ir += new_name1 + " = zext i" + size1 + " " + name1 + " to i" + size + "\n";
            name1 = new_name1;
        }
        String name = IRUtils.newTempName();
        ir += name + "= or i" + size + " " + name0 + ", " + name1 + "\n";
        irs.put(ctx, ir);
        names.put(ctx, name);
    }
    @Override public void exitExpParen(CryptolangParser.ExpParenContext ctx) {

        // Anota
        Integer size = sizes.get(ctx.exp());
        sizes.put(ctx, size);

        // Gera código
        irs.put(ctx, irs.get(ctx.exp()));
        names.put(ctx, names.get(ctx.exp()));
    }
    private String bin2dec(String bin) {
        return "" + Long.parseLong(bin.substring(1), 2);
    }
    @Override public void exitExpBin(CryptolangParser.ExpBinContext ctx) {

        // Anota
        Integer size = ctx.BIN().getText().length() - 1;
        sizes.put(ctx, size);

        // Gera código
        String name = IRUtils.newTempName();
        irs.put(ctx, name + " = add i" + size + " 0, " + bin2dec(ctx.BIN().getText()) + "\n");
        names.put(ctx, name);
    }
    private String hex2dec(String hex) {
        return "" + Long.parseLong(hex.substring(2), 16);
    }
    @Override public void exitExpHex(CryptolangParser.ExpHexContext ctx) {

        // Anota
        Integer size = (ctx.HEX().getText().length() - 2) * 4;
        sizes.put(ctx, size);

        // Gera código
        String name = IRUtils.newTempName();
        irs.put(ctx, name + " = add i" + size + " 0, " + hex2dec(ctx.HEX().getText()) + "\n");
        names.put(ctx, name);
    }
    @Override public void exitExpId(CryptolangParser.ExpIdContext ctx) {

        String id = ctx.ID().getText();

        // Variável não declarada
        if (lookup(id) == null) {
            System.err.println("Variável não declarada");
            return;
        }

        Symbol symbol = lookup(id);

        // Tipo errado
        if (symbol.type == SymbolType.FUN) {
            System.err.println("Função em expressão");
            return;
        } else if (symbol.type == SymbolType.FORINT) {
            System.err.println("Forint em expressão");
            return;
        }

        VarSymbol var_symbol = (VarSymbol) symbol;

        if (!var_symbol.initialized) {
            System.err.println("Variável não inicializada");
            return;
        }

        Integer size = var_symbol.size;
        sizes.put(ctx, size);

        // Gera código
        String name = getVarName(var_symbol);
        if (!var_symbol.param) {
            name = IRUtils.newTempName();
            irs.put(ctx, name + " = load i" + size + ", i" + size + "* " + getVarName(var_symbol) + "\n");
        } else {
            irs.put(ctx, "");
        }
        names.put(ctx, name);
    }
    @Override public void exitExpCall(CryptolangParser.ExpCallContext ctx) {

        // Anota
        Integer size = sizes.get(ctx.call());
        sizes.put(ctx, size);

        // Gera código
        names.put(ctx, names.get(ctx.call()));
        irs.put(ctx, irs.get(ctx.call()));
    }
    @Override public void exitExpIntv(CryptolangParser.ExpIntvContext ctx) {

        CryptolangParser.Exp2Context exp2 = ctx.exp2();
        Integer size_exp = sizes.get(exp2);

        // Gera código
        String ir = "";
        String name = null;
        Integer size = null;
        if (ctx.intv() == null) {
            ir += irs.get(ctx.exp2());
            name = names.get(ctx.exp2());
            size = sizes.get(exp2);
        } else {

            int upperbound = upperbounds.get(ctx.intv());
            if ((size_exp - 1) < upperbound) {
                System.err.println("Índice maior que o limite");
                return;
            }

            CryptolangParser.Number_expContext number0 = ctx.intv().number_exp().get(0);
            CryptolangParser.Number_expContext number1 = ctx.intv().number_exp().size() == 2 ? ctx.intv().number_exp().get(1) : null;
            if (number1 == null) { // Indice
                ir += irs.get(exp2);
                ir += irs.get(number0);
                String name0 = names.get(number0);
                String name1 = IRUtils.newTempName();
                String name0_1 = name0;
                if (size_exp < NumberExpSize) {
                    name0_1 = IRUtils.newTempName();
                    ir += name0_1 + " = trunc i" + NumberExpSize + " " + name0 + " to i" + size_exp + "\n";
                    name0 = name0_1;
                } else if (size_exp > NumberExpSize) {
                    name0_1 = IRUtils.newTempName();
                    ir += name0_1 + " = zext i" + NumberExpSize + " " + name0 + " to i" + size_exp + "\n";
                    name0 = name0_1;
                }
                ir += name1 + " = shl i" + size_exp + " 1, " + name0_1 + "\n";
                String name2 = IRUtils.newTempName();
                ir += name2 + " = and i" + size_exp + " " + names.get(exp2) + ", " + name1 + "\n";
                String name3 = IRUtils.newTempName();
                ir += name3 + " = lshr i" + size_exp + " " + name2 + ", " + name0 + "\n";
                String name4 = IRUtils.newTempName();
                ir += name4 + " = trunc i" + size_exp + " " + name3 + " to i1\n";
                name = name4;
                size = 1;
            } else {
                // TODO: gerar código intervalo maior que 1
            }
        }
        irs.put(ctx, ir);
        names.put(ctx, name);
        sizes.put(ctx, size);

    }

    // Intervalos
    Integer NumberExpSize = 32;
    @Override public void exitIntv(CryptolangParser.IntvContext ctx) {

        if (ctx.number_exp().size() == 1) {

            // Índice

            int upperbound = max_vals.get(ctx.number_exp(0));

            if (upperbound < 0) {
                System.err.println("Índice negativo");
                return;
            }

            upperbounds.put(ctx, upperbound);
            sizes.put(ctx, 1);

        } else {

            // Intervalo

            int lowerbound = max_vals.get(ctx.number_exp().get(0));
            int upperbound = max_vals.get(ctx.number_exp().get(1));

            if (lowerbound < 0) {
                System.err.println("Intervalo com lowerbound negativo");
                return;
            }

            if (lowerbound > upperbound) {
                System.err.println("Lowerbound maior que upperbound");
                return;
            }

            upperbounds.put(ctx, upperbound);
            sizes.put(ctx, upperbound - lowerbound + 1);

        }
    }
    @Override public void exitNumberExpPlus(CryptolangParser.NumberExpPlusContext ctx) {

        // Anota
        CryptolangParser.Number_expContext number_exp0 = ctx.number_exp().get(0);
        CryptolangParser.Number_expContext number_exp1 = ctx.number_exp().get(1);
        Integer max_val0 = max_vals.get(number_exp0);
        Integer max_val1 = max_vals.get(number_exp1);
        Integer max_val = max_val0 + max_val1;
        max_vals.put(ctx, max_val);

        // Gera código
        // <result> = add <ty> <op1>, <op2>   ; yields ty:result
        String ir = "";
        ir += irs.get(number_exp0);
        String name0 = names.get(number_exp0);
        ir += irs.get(number_exp1);
        String name1 = names.get(number_exp1);
        String name = IRUtils.newTempName();
        ir += name + "= add i" + NumberExpSize + " " + name0 + ", " + name1 + "\n";
        irs.put(ctx, ir);
        names.put(ctx, name);
    }
    @Override public void exitNumberExpId(CryptolangParser.NumberExpIdContext ctx) {

        String id = ctx.ID().getText();

        // Não declarada?
        if (lookup(id) == null) {
            System.err.println("Variável não declarada");
            return;
        }

        Symbol symbol = lookup(id);

        // É uma ForInt?
        if (symbol.type == SymbolType.FUN) {
            System.err.println("Função dentro de intervalo");
            return;
        } else if (symbol.type == SymbolType.VAR) {
            System.err.println("Váriavel dentro de intervalo");
            return;
        }

        ForIntSymbol fi = (ForIntSymbol) symbol;

        // Anota
        max_vals.put(ctx, fi.max_val);

        // Gera código
        // TODO: gerar código para NumberExpId
    }
    @Override public void exitNumberExpNumber(CryptolangParser.NumberExpNumberContext ctx) {

        // Anota
        Integer max_val = Integer.parseInt(ctx.NUMBER().getText());
        max_vals.put(ctx, max_val);

        // Gera código
        String name = IRUtils.newTempName();
        names.put(ctx, name);
        irs.put(ctx, name + " = add i" + NumberExpSize + " 0, " + max_val + "\n");
    }
    @Override public void exitNumberExpMult(CryptolangParser.NumberExpMultContext ctx) {

        // Anota
        CryptolangParser.Number_expContext number_exp0 = ctx.number_exp().get(0);
        CryptolangParser.Number_expContext number_exp1 = ctx.number_exp().get(1);
        Integer max_val0 = max_vals.get(number_exp0);
        Integer max_val1 = max_vals.get(number_exp1);
        Integer max_val = max_val0 * max_val1;
        max_vals.put(ctx, max_val);

        // Gera código
        // <result> = add <ty> <op1>, <op2>   ; yields ty:result
        String ir = "";
        ir += irs.get(number_exp0);
        String name0 = names.get(number_exp0);
        ir += irs.get(number_exp1);
        String name1 = names.get(number_exp1);
        String name = IRUtils.newTempName();
        ir += name + "= mul i" + NumberExpSize + " " + name0 + ", " + name1 + "\n";
        irs.put(ctx, ir);
        names.put(ctx, name);
    }
    @Override public void exitNumberExpSub(CryptolangParser.NumberExpSubContext ctx) {

        // Anota
        CryptolangParser.Number_expContext number_exp0 = ctx.number_exp().get(0);
        CryptolangParser.Number_expContext number_exp1 = ctx.number_exp().get(1);
        Integer max_val0 = max_vals.get(number_exp0);
        Integer max_val1 = max_vals.get(number_exp1);
        Integer max_val = max_val0 - max_val1;
        max_vals.put(ctx, max_val);

        // Gera código
        // <result> = add <ty> <op1>, <op2>   ; yields ty:result
        String ir = "";
        ir += irs.get(number_exp0);
        String name0 = names.get(number_exp0);
        ir += irs.get(number_exp1);
        String name1 = names.get(number_exp1);
        String name = IRUtils.newTempName();
        ir += name + "= sub i" + NumberExpSize + " " + name0 + ", " + name1 + "\n";
        irs.put(ctx, ir);
        names.put(ctx, name);
    }

}