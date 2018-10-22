package beer.compiler;

import beer.compiler.errors.BeerErrors;
import beer.compiler.errors.BeerSemanticError;
import beer.compiler.errors.BeerSemanticException;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

import beer.compiler.BeerParser;
import beer.compiler.BeerParserBaseListener;
import beer.Main;

public class BeerSemantic extends BeerParserBaseListener {

    //Conjuntos auxiliares
    private ParseTreeProperty<SymbolType> types = new ParseTreeProperty<>();
    private ParseTreeProperty<String> ctxNames = new ParseTreeProperty<>();
    private ParseTreeProperty<Integer> sizes = new ParseTreeProperty<>();

    protected BeerErrors errorHandler;

    //Constructor
    public BeerSemantic() {}
    public BeerSemantic(BeerErrors errorHandler) {
        this.errorHandler = errorHandler;
    }

    //Declarando a tabela de simbolos
    public SymbolTable table = new SymbolTable(null);

    //Metodo lookup
    //Procura na tabela de simbolos
    public Symbol lookup(String id) {
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

    //Comecando a analise
    //Primeira regra de BeerParser.g4
    @Override public void enterProgram(BeerParser.ProgramContext ctx) {
        table = new SymbolTable(table);
        ctxNames.put(ctx, "enterProgram_block");
    }

    @Override public void exitProgram(BeerParser.ProgramContext ctx) {
        // TODO
    }

    @Override public void enterImportExpression(BeerParser.ImportExpressionContext ctx) {
        table = new SymbolTable(table);
        ctxNames.put(ctx, "import_block");
    }

    @Override public void exitImportExpression(BeerParser.ImportExpressionContext ctx) {
        String path = Main.basePath + ctx.StringLiteral().getText().replaceAll("\"", "");
        File importFile = new File(path);
        boolean fileExists = importFile.getAbsoluteFile().exists();
        if (fileExists) {
            try {
                String[] args = new String[5];
                table = new SymbolTable(Main.parse(args, path));
                return;
            } catch(Exception e) {
                if (errorHandler != null) errorHandler.push(new BeerSemanticError(e.toString(), ctx));
                return;
            }
        } else {
            if (errorHandler != null) errorHandler.push(new BeerSemanticError("O arquivo importado não existe!", ctx));
            return;
        }
    }

    //Entrando em uma classe
    @Override public void enterInitClass(BeerParser.InitClassContext ctx) {
        //Controlando escopo
        table = new SymbolTable(table);
        ctxNames.put(ctx, "initClass_block");
    }

    @Override public void exitInitClass(BeerParser.InitClassContext ctx) {
        //Adicionando nome da classe a tabela de simbolos
        String id = ctx.Identifier().getText();
        table.add(id, new Symbol(SymbolType.CLASS, true, false));
    }

    //Entrando em um comando de uma classe
    //Pode ser declaracao de atributo, funcao ou construtor
    @Override public void enterMethod(BeerParser.MethodContext ctx) {
        table = new SymbolTable(table);
        ctxNames.put(ctx, "method_block");
    }

    @Override public void exitMethod(BeerParser.MethodContext ctx) {
        if (ctx.type() != null) {
            String type = ctx.type().getText();
            String id = ctx.Identifier().getText();
            Symbol symbol = lookup(id);

            if (symbol != null) {
                if (errorHandler != null) errorHandler.push(new BeerSemanticError("Variavel "+id+" ja foi declarada!", ctx));
                return;
            }

            // ParserRuleContext c = ctx;
            // String rule = ctxNames.getText(c);

            // System.out.println(">>>>");
            // System.out.println(rule);
            // switch (type) {
            //     case "pilsen":
            //         table.add(id, new Symbol(SymbolType.PILSEN, false, false));
            //         break;
            //     case "ipa":
            //         table.add(id, new Symbol(SymbolType.IPA, false, false));
            //         break;
            //     case "bock":
            //         table.add(id, new Symbol(SymbolType.BOCK, false, false));
            //         break;
            //     case "ale":
            //         table.add(id, new Symbol(SymbolType.ALE, false, false));
            //         break;
            // }
        }
    }

    @Override public void enterConstructor(BeerParser.ConstructorContext ctx) {
        table = new SymbolTable(table);
        ctxNames.put(ctx, "constructor_block");
    }

    @Override public void exitConstructor(BeerParser.ConstructorContext ctx) {
        // TODO
    }

    //Entrando no begin
    @Override public void enterBegin(BeerParser.BeginContext ctx) {
        table = new SymbolTable(table);
        ctxNames.put(ctx, "begin_block");
    }

    @Override public void exitBegin(BeerParser.BeginContext ctx) {
        // pass
        return;
    }

    @Override public void enterCommand(BeerParser.CommandContext ctx) {
        // TODO
    }

    @Override public void exitCommand(BeerParser.CommandContext ctx) {
        // TODO
    }

    //Entrando em um simple command
    @Override public void enterSimpleCommand(BeerParser.SimpleCommandContext ctx) {

        //Declarando contexto (nem todos podem ser uteis)

        //Apenas uma expressao
        if (ctx.declaration() != null && ctx.Assign() != null ) {
            ctxNames.put(ctx.declaration(), "cmd_decAssign");
        //Declaracao com atribuicao
        } else if (ctx.expression() != null && ctx.Identifier() == null) {
            ctxNames.put(ctx.expression(), "cmd_expression");
        //Apenas declaracao
        } else if (ctx.declaration() != null && ctx.Assign() == null)  {
            ctxNames.put(ctx.declaration(), "cmd_declaration");
        //Atribuicao de varias maneiras
        } else if (ctx.Identifier() != null && ctx.expression() != null) {
            if (ctx.Assign() != null) {
                ctxNames.put(ctx.declaration(), "cmd_assign");
            } else if (ctx.MultiplyAssign() != null) {
                ctxNames.put(ctx.declaration(), "cmd_multiplyAssign");
            } else if (ctx.DivideAssign() != null) {
                ctxNames.put(ctx.declaration(), "cmd_divideAssign");
            } else if (ctx.ModulusAssign() != null) {
                ctxNames.put(ctx.declaration(), "cmd_modulusAssign");
            } else if (ctx.PlusAssign() != null) {
                ctxNames.put(ctx.declaration(), "cmd_plusAssign");
            } else if (ctx.MinusAssign() != null) {
                ctxNames.put(ctx.declaration(), "cmd_minusAssign");
            }

            //Gambiarra
            //Executando forcado a expressao da atribuicao
            enterExpression(ctx.expression());

            String id = ctx.Identifier().getText();
            Symbol symbol = lookup(id);

            //Verificando variavel da atribuicao
            if (symbol == null) {
                if (errorHandler != null) errorHandler.push(new BeerSemanticError("Variavel "+id+" não foi declarada!", ctx));
                return;
            //Verificando tipos entre variavel e expressao
            } else if (symbol.type != types.get(ctx.expression())) {
                if (errorHandler != null) errorHandler.push(new BeerSemanticError("Nao eh possivel atribuir esta expressao a variavel " + id + "! Os tipos são incompativeis", ctx));
                return;
            }
        }
    }

    @Override public void exitSimpleCommand(BeerParser.SimpleCommandContext ctx) {
        // TODO
    }

    //Entrando em uma funcao
    @Override public void enterFunction(BeerParser.FunctionContext ctx) {
        //TODO
    }

    @Override public void exitFunction(BeerParser.FunctionContext ctx) {
        //TODO
    }

    @Override public void enterParameters(BeerParser.ParametersContext ctx) {
        // TODO
    }

    @Override public void exitParameters(BeerParser.ParametersContext ctx) {
        // TODO
    }

    //Entrando em uma declaracao de variavel
    @Override public void enterDeclaration(BeerParser.DeclarationContext ctx) {
        //System.out.println("Entrou na declaracao!");
        String type = ctx.type().getText();
        String id = ctx.Identifier().getText();
        Symbol symbol = lookup(id);

        if (symbol != null) {
            if (errorHandler != null) errorHandler.push(new BeerSemanticError("Variavel "+id+" ja foi declarada!", ctx));
            return;
        }

        boolean init = false;

        ParserRuleContext c = ctx;
        String rule = ctxNames.get(c);

        //Verifica se veio de uma declaraco com atribuicao
        if (rule.equals("cmd_decAssign")) {
            init = true;
        }

        switch (type) {
            case "pilsen":
                table.add(id, new Symbol(SymbolType.PILSEN, false, init));
                break;
            case "ipa":
                table.add(id, new Symbol(SymbolType.IPA, false, init));
                break;
            case "bock":
                table.add(id, new Symbol(SymbolType.BOCK, false, init));
                break;
            case "ale":
                table.add(id, new Symbol(SymbolType.ALE, false, init));
                break;
        }

    }

    @Override public void exitDeclaration(BeerParser.DeclarationContext ctx) {
        // TODO
    }

    @Override public void enterNewObjectInit(BeerParser.NewObjectInitContext ctx) {
        // TODO
    }

    @Override public void exitNewObjectInit(BeerParser.NewObjectInitContext ctx) {
        // TODO
    }

    @Override public void enterType(BeerParser.TypeContext ctx) {
        // TODO
    }

    @Override public void exitType(BeerParser.TypeContext ctx) {
        // TODO
    }

    @Override public void enterTypeArray(BeerParser.TypeArrayContext ctx) {

    }

    @Override public void exitTypeArray(BeerParser.TypeArrayContext ctx) {

    }

    //Entrando em uma expressao
    @Override public void enterExpression(BeerParser.ExpressionContext ctx) {
        //Expressao binaria
        //Soh considera expressao com duas variaveis
        //TODO: considerar expressoes com mais variaveis
        if (ctx.expression(0) != null && ctx.binary() != null) {
            String id1 = ctx.expression(0).Identifier().getText();
            String id2 = ctx.expression(1).Identifier().getText();
            Symbol symbol1 = lookup(id1);
            Symbol symbol2 = lookup(id2);

            //Verificando se alguma das variaveis nao foi declarada
            if (symbol1 == null) {
                if (errorHandler != null) errorHandler.push(new BeerSemanticError("Variavel "+id1+" nao foi declarada!", ctx));
                return;
            } else if (symbol2 == null) {
                if (errorHandler != null) errorHandler.push(new BeerSemanticError("Variavel "+id2+" nao foi declarada!", ctx));
                return;
            }

            //Verificando se alguma delas nao foi inicializada
            if (symbol1.initialized == false) {
                if (errorHandler != null) errorHandler.push(new BeerSemanticError("Variavel "+id1+" não foi inicializada!", ctx));
                return;
            } else if (symbol2.initialized == false) {
                if (errorHandler != null) errorHandler.push(new BeerSemanticError("Variavel "+id2+" não foi inicializada!", ctx));
                return;
            }

            //Verificando mesmo tipo
            if (symbol1.type != symbol2.type) {
                if (errorHandler != null) errorHandler.push(new BeerSemanticError("Tipos das variaveis "+id1+" e "+id2+" são incompativeis!", ctx));
                return;
            } else if (symbol1.type != SymbolType.PILSEN && symbol1.type != SymbolType.IPA && symbol1.type != SymbolType.BOCK) {
                if (errorHandler != null) errorHandler.push(new BeerSemanticError("Nao eh possivel realizar operacoes no tipo "+symbol1.type+" envolvendo as variaveis "+id1+" e "+id2+"!", ctx));
                return;
            }

            //Setando o tipo da expressao
            types.put(ctx, symbol1.type);
        }
    }

    @Override public void exitExpression(BeerParser.ExpressionContext ctx) {
        // TODO
    }

    @Override public void enterInitArray(BeerParser.InitArrayContext ctx) {
        // TODO
    }

    @Override public void exitInitArray(BeerParser.InitArrayContext ctx) {
        // TODO
    }

    @Override public void enterBinary(BeerParser.BinaryContext ctx) {
        // TODO
    }

    @Override public void exitBinary(BeerParser.BinaryContext ctx) {
        // TODO
    }

    @Override public void enterFunctionCall(BeerParser.FunctionCallContext ctx) {
        // TODO
    }

    @Override public void exitFunctionCall(BeerParser.FunctionCallContext ctx) {
        // TODO
    }

    @Override public void enterValue(BeerParser.ValueContext ctx) {
        // TODO
    }

    //Saindo de um value
    //Declarando os tipos de acordo com o value
    @Override public void exitValue(BeerParser.ValueContext ctx) {
        if (ctx.DecimalLiteral() != null) {
            //TODO: ver se eh int ou float(pilsen ou ipa)
            //Soh verificar se na String tem um ponto
            types.put(ctx, SymbolType.PILSEN);
        } else if (ctx.BooleanLiteral() != null) {
            types.put(ctx, SymbolType.BOCK);
        } else if (ctx.StringLiteral() != null) {
            types.put(ctx, SymbolType.ALE);
        }
    }

    @Override public void enterWhileExpression(BeerParser.WhileExpressionContext ctx) {
        // TODO
    }

    @Override public void exitWhileExpression(BeerParser.WhileExpressionContext ctx) {
        // TODO
    }

    @Override public void enterForExpression(BeerParser.ForExpressionContext ctx) {
        // TODO
    }

    @Override public void exitForExpression(BeerParser.ForExpressionContext ctx) {
        // TODO
    }

    @Override public void enterSwitchExpression(BeerParser.SwitchExpressionContext ctx) {
        // TODO
    }

    @Override public void exitSwitchExpression(BeerParser.SwitchExpressionContext ctx) {
        // TODO
    }

    @Override public void enterCaseExpression(BeerParser.CaseExpressionContext ctx) {
        // TODO
    }

    @Override public void exitCaseExpression(BeerParser.CaseExpressionContext ctx) {
        // TODO
    }

    @Override public void enterDefaultExpression(BeerParser.DefaultExpressionContext ctx) {
        // TODO
    }

    @Override public void exitDefaultExpression(BeerParser.DefaultExpressionContext ctx) {
        // TODO
    }

    @Override public void enterIfExpression(BeerParser.IfExpressionContext ctx) {
        // TODO
    }

    @Override public void exitIfExpression(BeerParser.IfExpressionContext ctx) {
        // TODO
    }

    @Override public void enterPrint(BeerParser.PrintContext ctx) {
        // TODO
    }

    @Override public void exitPrint(BeerParser.PrintContext ctx) {
        // TODO
    }

    @Override public void enterRead(BeerParser.ReadContext ctx) {
        // TODO
    }

    @Override public void exitRead(BeerParser.ReadContext ctx) {
        // TODO
    }

    @Override public void enterTryExpression(BeerParser.TryExpressionContext ctx) {
        // TODO
    }

    @Override public void exitTryExpression(BeerParser.TryExpressionContext ctx) {
        // TODO
    }

    @Override public void enterCatchExpression(BeerParser.CatchExpressionContext ctx) {
        // TODO
    }

    @Override public void exitCatchExpression(BeerParser.CatchExpressionContext ctx) {
        // TODO
    }

    @Override public void enterThrowExpression(BeerParser.ThrowExpressionContext ctx) {
        // TODO
    }

    @Override public void exitThrowExpression(BeerParser.ThrowExpressionContext ctx) {
        // TODO
    }

    @Override public void enterComment(BeerParser.CommentContext ctx) {
        System.out.println(">>>>>");
        return;
    }

    @Override public void exitComment(BeerParser.CommentContext ctx) {
        System.out.println("<<<<<");
        return;
    }
}
