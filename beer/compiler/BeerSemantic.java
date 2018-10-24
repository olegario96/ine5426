package beer.compiler;

import beer.compiler.errors.BeerErrors;
import beer.compiler.errors.BeerSemanticError;
import beer.compiler.errors.BeerSemanticException;
import org.antlr.v4.runtime.tree.ErrorNode;
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
import org.antlr.v4.runtime.tree.TerminalNode;

public class BeerSemantic extends BeerParserBaseListener {

    //Conjuntos auxiliares
    private ParseTreeProperty<SymbolType> types = new ParseTreeProperty<>();
    private ParseTreeProperty<String> ctxNames = new ParseTreeProperty<>();
    private ParseTreeProperty<Integer> sizes = new ParseTreeProperty<>();

    protected BeerErrors errorHandler;

    //Construtor
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
        do {
            Symbol symbol = table.lookup(id);
            if (symbol != null)
                return symbol;

            table = table.parent;
        } while (table.parent != null);

        return null;
    }

    //Comecando a analise
    //Primeira regra de BeerParser.g4
    @Override public void enterProgram(BeerParser.ProgramContext ctx) {
        //Controlando escopo
        table = new SymbolTable(table);
    }

    @Override public void exitProgram(BeerParser.ProgramContext ctx) {
        //Controlando escopo
        table = table.parent;
    }

    @Override public void enterImportExpression(BeerParser.ImportExpressionContext ctx) {}

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

    @Override public void enterInitClass(BeerParser.InitClassContext ctx) {
        //Controlando escopo
        table = new SymbolTable(table);
    }

    @Override public void exitInitClass(BeerParser.InitClassContext ctx) {
        //Adicionando nome da classe a tabela de simbolos
        String id = ctx.Identifier().getText();
        table.add(id, new Symbol(SymbolType.CLASS, true, false));
        table = table.parent;
    }

    @Override public void enterMethod(BeerParser.MethodContext ctx) {
        //Controlando escopo
        table = new SymbolTable(table);
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

             /*ParserRuleContext c = ctx;
             String rule = ctxNames.getText(c);

             System.out.println(">>>>");
             System.out.println(rule);
             switch (type) {
                 case "pilsen":
                     table.add(id, new Symbol(SymbolType.PILSEN, false, false));
                     break;
                 case "ipa":
                     table.add(id, new Symbol(SymbolType.IPA, false, false));
                     break;
                 case "bock":
                     table.add(id, new Symbol(SymbolType.BOCK, false, false));
                     break;
                 case "ale":
                     table.add(id, new Symbol(SymbolType.ALE, false, false));
                     break;
             }*/
        }

        //Controlando escopo
        table = table.parent;
    }

    @Override public void enterConstructor(BeerParser.ConstructorContext ctx) {
        //Controlando escopo
        table = new SymbolTable(table);
        //ctxNames.put(ctx, "constructor_block");
    }

    @Override public void exitConstructor(BeerParser.ConstructorContext ctx) {
        //Controlando escopo
        table = table.parent;
    }

    //Entrando no begin
    @Override public void enterBegin(BeerParser.BeginContext ctx) {
        //super.enterBegin(ctx);
        //System.out.println("enterBegin");

        //Controlando escopo
        table = new SymbolTable(table);
        //ctxNames.put(ctx, "begin_block");
    }

    @Override public void exitBegin(BeerParser.BeginContext ctx) {
        //Controlando escopo
        table = table.parent;
    }

    @Override public void enterCommand(BeerParser.CommandContext ctx) {
        // TODO
    }

    @Override public void exitCommand(BeerParser.CommandContext ctx) {
        // TODO
    }

    //Entrando em um simple command
    @Override public void enterSimpleCommand(BeerParser.SimpleCommandContext ctx) {

        //Declarando contextos

        //Declaracao com atribuicao
        if (ctx.declaration() != null && ctx.Assign() != null ) {
            ctxNames.put(ctx.declaration(), "cmd_decAssign");
            ctxNames.put(ctx, "cmd_decAssign");
        //Apenas uma expressao
        } else if (ctx.expression() != null && ctx.Identifier() == null) {
            ctxNames.put(ctx.expression(), "cmd_expression");
        //Apenas declaracao
        } else if (ctx.declaration() != null && ctx.Assign() == null)  {
            ctxNames.put(ctx.declaration(), "cmd_declaration");
        //Atribuicao de varias maneiras
        } else if (ctx.Identifier() != null && ctx.expression() != null) {
            if (ctx.Assign() != null) {
                ctxNames.put(ctx, "cmd_assign");
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
        }
    }

    @Override public void exitSimpleCommand(BeerParser.SimpleCommandContext ctx) {
        
        String rule = ctxNames.get(ctx);

        if (rule == null) {
            return;
        }

        if (rule.equals("cmd_decAssign")) {

            String id = ctx.declaration().Identifier().getText();
            Symbol symbol = lookup(id);

            SymbolType type_var = symbol.type;
            SymbolType type_exp = types.get(ctx.expression());

            if (type_var != type_exp) {
                if (errorHandler != null) errorHandler.push(new BeerSemanticError("Valor inesperado para a variavel " + "'" + id + "'" + "!", ctx));
                return;
            }
        } else if (rule.equals("cmd_declaration")) {
            String id = ctx.declaration().Identifier().getText();
            Symbol symbol = lookup(id);

            //Verificando variavel da atribuicao
            if (symbol == null) {
                if (errorHandler != null) errorHandler.push(new BeerSemanticError("Variavel "+id+" não foi declarada!", ctx));
                return;
            //Verificando tipos entre variavel e expressao
            //Isso nao vai ficar aqui
            } else if (symbol.type != types.get(ctx.expression())) {
                if (errorHandler != null) errorHandler.push(new BeerSemanticError("Nao eh possivel atribuir esta expressao a variavel " + id + "! Os tipos são incompativeis", ctx));
                return;
            }
        } else if (rule.equals("cmd_assign")) {
            String id = ctx.Identifier().getText();
            Symbol symbol = lookup(id);

            if (symbol == null) {
                if (errorHandler != null) errorHandler.push(new BeerSemanticError("Variavel "+id+" não foi declarada!", ctx));
                return;
            }

            symbol.initialized = true;

        }
    }

    //Entrando em uma funcao
    @Override public void enterFunction(BeerParser.FunctionContext ctx) {
        //Controlando escopo
        table = new SymbolTable(table);

        //TODO
    }

    @Override public void exitFunction(BeerParser.FunctionContext ctx) {
        //Controlando escopo
        table = table.parent;

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
        if (rule != null) {
            if (rule.equals("cmd_decAssign")) {
                init = true; 
            }
        }
        
        //Adicionando na tabela de simbolos
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
        // TODO
    }

    @Override public void exitTypeArray(BeerParser.TypeArrayContext ctx) {
        // TODO
    }

    //Entrando em uma expressao
    @Override public void enterExpression(BeerParser.ExpressionContext ctx) {
        
        if (ctx.Not() != null) {
            ctxNames.put(ctx, "exp_not");
        //Declaracao com atribuicao
        } else if (ctx.OpenParent() != null) {
            ctxNames.put(ctx, "exp_parents");
        //Apenas declaracao
        } else if (ctx.binary() != null)  {
            ctxNames.put(ctx, "exp_binary");
        } else if (ctx.functionCall() != null) {
            ctxNames.put(ctx, "exp_functionCall");
        } else if (ctx.value() != null) {
            ctxNames.put(ctx, "exp_value");
        } else if (ctx.Identifier() != null) {
            ctxNames.put(ctx, "exp_id");
        } else if (ctx.newObjectInit() != null) {
            ctxNames.put(ctx, "exp_newObjectInit");
        } else if (ctx.initArray() != null) {
            ctxNames.put(ctx, "exp_initArray");
        }
    }

    @Override public void exitExpression(BeerParser.ExpressionContext ctx) {
        
        ParserRuleContext c = ctx;
        String rule = ctxNames.get(c);

        //Verifica se veio de uma declaraco com atribuicao
        if (rule == null) {
            return;
        }

        if (rule.equals("exp_value")) {
            SymbolType type_value = types.get(ctx.value());
            types.put(ctx, type_value);
        //Soh considera expressao com dois valores
        } else if (rule.equals("exp_binary")) {

            SymbolType type1, type2;
            String id1, id2;

            //Se o primeiro eh uma variavel
            if (ctx.expression(0).Identifier() != null) {
                id1 = ctx.expression(0).Identifier().getText();
                Symbol symbol1 = lookup(id1);
                type1 = symbol1.type;

                //Declarada?
                if (symbol1 == null) {
                    if (errorHandler != null) errorHandler.push(new BeerSemanticError("Variavel "+id1+" nao foi declarada!", ctx));
                    return;
                }

                //Incializada?
                if (symbol1.initialized == false) {
                    if (errorHandler != null) errorHandler.push(new BeerSemanticError("Variavel "+id1+" não foi inicializada!", ctx));
                    return;
                }

            } else {
                //Detalhe que apenas funciona para decimais!!
                id1 = "" + ctx.expression(0).value().DecimalLiteral();
                type1 = types.get(ctx.expression(0).value());
            }

            //Se o segundo eh uma variavel
            if (ctx.expression(1).Identifier() != null) {
                id2 = ctx.expression(1).Identifier().getText();
                Symbol symbol2 = lookup(id2);
                type2 = symbol2.type;

                //Declarada?
                if (symbol2 == null) {
                    if (errorHandler != null) errorHandler.push(new BeerSemanticError("Variavel "+id2+" nao foi declarada!", ctx));
                    return;
                }

                //Inicializada?
                if (symbol2.initialized == false) {
                    if (errorHandler != null) errorHandler.push(new BeerSemanticError("Variavel "+id2+" não foi inicializada!", ctx));
                    return;
                }

            } else {
                //Detalhe que apenas funciona para decimais!!
                id2 = "" + ctx.expression(1).value().DecimalLiteral();
                type2 = types.get(ctx.expression(1).value());
            }

            //Verificando mesmo tipo
            if (type1 != type2) {
                if (errorHandler != null) errorHandler.push(new BeerSemanticError("Tipos das variaveis "+id1+" e "+id2+" são incompativeis!", ctx));
                return;
            } else if (type1 != SymbolType.PILSEN && type1 != SymbolType.IPA && type1 != SymbolType.BOCK) {
                if (errorHandler != null) errorHandler.push(new BeerSemanticError("Nao eh possivel realizar operacoes no tipo "+type1+" envolvendo as variaveis "+id1+" e "+id2+"!", ctx));
                return;
            }

            //Setando o tipo da expressao
            types.put(ctx, type1);
        }
                
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
            String valor = ctx.DecimalLiteral().toString();
            if (valor.contains(".")) {
                types.put(ctx, SymbolType.IPA);
            } else {
                types.put(ctx, SymbolType.PILSEN);
            }
        } else if (ctx.BooleanLiteral() != null) {
            types.put(ctx, SymbolType.BOCK);
        } else if (ctx.StringLiteral() != null) {
            types.put(ctx, SymbolType.ALE);
        }
    }

    @Override public void enterWhileExpression(BeerParser.WhileExpressionContext ctx) {
        //Controlando escopo
        table = new SymbolTable(table);

        // TODO
    }

    @Override public void exitWhileExpression(BeerParser.WhileExpressionContext ctx) {
        //Controlando escopo
        table = table.parent;

        // TODO
    }

    @Override public void enterForExpression(BeerParser.ForExpressionContext ctx) {
        //Controlando escopo
        table = new SymbolTable(table);

        // TODO
    }

    @Override public void exitForExpression(BeerParser.ForExpressionContext ctx) {
        //Controlando escopo
        table = table.parent;

        // TODO
    }

    @Override public void enterSwitchExpression(BeerParser.SwitchExpressionContext ctx) {
        // TODO
    }

    @Override public void exitSwitchExpression(BeerParser.SwitchExpressionContext ctx) {
        // TODO
    }

    @Override public void enterCaseExpression(BeerParser.CaseExpressionContext ctx) {
        //Controlando escopo
        table = new SymbolTable(table);

        // TODO
    }

    @Override public void exitCaseExpression(BeerParser.CaseExpressionContext ctx) {
        //Controlando escopo
        table = table.parent;

        // TODO
    }

    @Override public void enterDefaultExpression(BeerParser.DefaultExpressionContext ctx) {
        //Controlando escopo
        table = new SymbolTable(table);

        // TODO
    }

    @Override public void exitDefaultExpression(BeerParser.DefaultExpressionContext ctx) {
        //Controlando escopo
        table = table.parent;

        // TODO
    }

    @Override public void enterIfExpression(BeerParser.IfExpressionContext ctx) {
        //Controlando escopo
        table = new SymbolTable(table);
    }

    @Override public void exitIfExpression(BeerParser.IfExpressionContext ctx) {
        //Controlando escopo
        table = table.parent;
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
        //Controlando escopo
        table = new SymbolTable(table);

        // TODO
    }

    @Override public void exitTryExpression(BeerParser.TryExpressionContext ctx) {
        // TODO
    }

    @Override public void enterCatchExpression(BeerParser.CatchExpressionContext ctx) {
        //Controlando escopo
        table = new SymbolTable(table);

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


