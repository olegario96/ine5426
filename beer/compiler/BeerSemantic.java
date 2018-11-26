package beer.compiler;

import beer.compiler.errors.BeerErrors;
import beer.compiler.errors.BeerSemanticError;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.File;
import java.util.HashMap;

import beer.Main;

public class BeerSemantic extends BeerParserBaseListener {

    //Conjuntos auxiliares
    private ParseTreeProperty<SymbolType> types = new ParseTreeProperty<>();
    private ParseTreeProperty<String> ctxNames = new ParseTreeProperty<>();
    private ParseTreeProperty<Integer> sizes = new ParseTreeProperty<>();

    private ParseTreeProperty<Integer> auxGenerationValues = new ParseTreeProperty<>();
    private HashMap<String, Integer> auxGenerationIds = new HashMap<>();

    public String code = "";
    private int counterIdGen = 0;

    protected BeerErrors errorHandler;

    //Construtor
    public BeerSemantic() {}
    public BeerSemantic(BeerErrors errorHandler) {
        this.errorHandler = errorHandler;
    }

    //Declarando a tabela de simbolos
    public SymbolTable table = new SymbolTable(null);
    public String[] nameRules;

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

    public void loadRules(BeerParser parser) {
        this.nameRules = parser.getRuleNames();
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

    @Override public void enterImportExpression(BeerParser.ImportExpressionContext ctx) {
        table = new SymbolTable(table);
    }

    @Override public void exitImportExpression(BeerParser.ImportExpressionContext ctx) {
        String path = Main.basePath + ctx.StringLiteral().getText().replaceAll("\"", "");
        File importFile = new File(path);
        boolean fileExists = importFile.getAbsoluteFile().exists();
        if (fileExists) {
            try {
                table = new SymbolTable(Main.parse(null, path));
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

        //Anotando código
        code += ".class public " + ctx.Identifier().getText() + "\n";
        code += ".super java/lang/Object \n";
    }

    @Override public void exitInitClass(BeerParser.InitClassContext ctx) {
        //Adicionando nome da classe a tabela de simbolos
        String id = ctx.Identifier().getText();
        //System.out.println(ctx.toStringTree());
        table.add(id, new Symbol(SymbolType.CLASS, true, false));
        table = table.parent;
    }

    @Override public void enterMethod(BeerParser.MethodContext ctx) {

        //Gambiarra
        if (ctx.function() != null) {
            String id = ctx.function().Identifier().getText();
            table.add(id, new Symbol(SymbolType.FUNCTION, true, true));

            //Anotando código
            code += ".method public " + id + "()V \n";
            code += ".limit stack 100 \n" + ".limit locals 100 \n";
            code += "getstatic java/lang/System/out Ljava/io/PrintStream; \n";
        }
    }

    @Override public void exitMethod(BeerParser.MethodContext ctx) {
        code += "return \n";
        code += ".end method \n";

        String id;
        if (ctx.constructor() != null) {
            id = ctx.constructor().Identifier().getText();
            table.add(id, new Symbol(SymbolType.CONSTRUCTOR, true, true));
        } else if (ctx.function() != null) {
            id = ctx.function().Identifier().getText();
            //table.add(id, new Symbol(SymbolType.FUNCTION, true, true));
            //Logica do return
            if (!ctx.function().typeFunction().getText().equals("bar vazio")) {
                ParserRuleContext ultimoComando = ctx.function().command(ctx.function().command().size()-1);
                if (ctx.function().command(ctx.function().command().size()-1).Return() == null) {
                    if (errorHandler != null) errorHandler.push(new BeerSemanticError("A funcao " + id + " nao possui retorno ou nao eh o ultimo comando!", ctx));
                    return;
                } else if (ctx.function().typeFunction().getText() != String.valueOf(types.get(ctx.function().command(ctx.function().command().size()-1).expression()))) {
                    if (errorHandler != null) errorHandler.push(new BeerSemanticError("O tipo da expressao de retorno da funcao "+id+" nao equivale com o especificado!", ctx));
                    return;
                }
            } else {
                if (ctx.function().command(ctx.function().command().size()-1).Return() != null) {
                    if (errorHandler != null) errorHandler.push(new BeerSemanticError("A funcao " + id + " possui retorno mas o tipo especificado eh VOID!", ctx));
                    return;
                }
            }
        } else {
            id = ctx.Identifier().toString();
            if (ctx.type().Boolean() != null) {
                table.add(id, new Symbol(SymbolType.BOCK, false, false));
            } else if (ctx.type().Float() != null) {
                table.add(id, new Symbol(SymbolType.IPA, false, false));
            } else if (ctx.type().Int() != null) {
                table.add(id, new Symbol(SymbolType.PILSEN, false, false));
            } else if (ctx.type().String() != null) {
                table.add(id, new Symbol(SymbolType.ALE, false, false));
                table.add(id, new Symbol(SymbolType.VARIABLE, false, false));
            }
        }
    }

    @Override public void enterConstructor(BeerParser.ConstructorContext ctx) {
        //Controlando escopo
        table = new SymbolTable(table);
        //ctxNames.put(ctx, "constructor_block");
    }

    @Override public void exitConstructor(BeerParser.ConstructorContext ctx) {
        table = table.parent;
    }

    //Entrando no begin
    @Override public void enterBegin(BeerParser.BeginContext ctx) {
        //super.enterBegin(ctx);
        //System.out.println("enterBegin");

        //Controlando escopo
        table = new SymbolTable(table);
        //ctxNames.put(ctx, "begin_block");

        //Anotando código
        code += ".class public MainTest \n";
        code += ".super java/lang/Object \n";
        code += ".method public static main([Ljava/lang/String;)V \n";
        code += ".limit stack 100 \n" + ".limit locals 100 \n";
        code += "getstatic java/lang/System/out Ljava/io/PrintStream; \n";
    }

    @Override public void exitBegin(BeerParser.BeginContext ctx) {
        //Controlando escopo
        table = table.parent;

        code += "return \n";
        code += ".end method \n";
    }

    @Override public void enterCommand(BeerParser.CommandContext ctx) {

        if(ctx.ifExpression() != null) {
            ctxNames.put(ctx.ifExpression().expression(0),"command_if");
        } else if (ctx.whileExpression() != null) {
            ctxNames.put(ctx.whileExpression().expression(),"command_while");
        }

        if(ctxNames.get(ctx) != null) {
            if (ctxNames.get(ctx).equals("second_command")) {
                code += "else: \n";
            }
        } 

    }

    @Override public void exitCommand(BeerParser.CommandContext ctx) {

        if(ctxNames.get(ctx) != null) {
            if (ctxNames.get(ctx).equals("first_command")) {
                code += "goto end \n";
            }
        }
    }

    //Entrando em um simple command
    @Override public void enterSimpleCommand(BeerParser.SimpleCommandContext ctx) {

        //Declarando contextos

        //Declaracao com atribuicao
        if (ctxNames.get(ctx) == "command_for") {
            ctxNames.put(ctx.declaration(), "cmd_decAssign");
            ctxNames.put(ctx, "command_for");
        } else {
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
    }

    @Override public void exitSimpleCommand(BeerParser.SimpleCommandContext ctx) {
        
        String rule = ctxNames.get(ctx);

        if (rule == null) {
            return;
        }

        if (rule.equals("command_for")) {
            String id = ctx.declaration().Identifier().getText();
            Symbol symbol = lookup(id);

            SymbolType type_var = symbol.type;
            SymbolType type_exp = types.get(ctx.expression());

            if (type_var != type_exp) {
                if (errorHandler != null) errorHandler.push(new BeerSemanticError("Valor inesperado para a variavel " + "'" + id + "'" + "!", ctx));
                return;
            }

            if (type_var == SymbolType.PILSEN) {
                code += "istore " + counterIdGen + "\n";
                auxGenerationIds.put(id,counterIdGen);
                counterIdGen++;
            } else if (type_var == SymbolType.ALE) {
                code += "astore " + counterIdGen + "\n";
                auxGenerationIds.put(id,counterIdGen);
                counterIdGen++;
            }

            code += "for: \n";
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

            if (type_var == SymbolType.PILSEN) {
                code += "istore " + counterIdGen + "\n";
                auxGenerationIds.put(id,counterIdGen);
                counterIdGen++;
            } else if (type_var == SymbolType.ALE) {
                code += "astore " + counterIdGen + "\n";
                auxGenerationIds.put(id,counterIdGen);
                counterIdGen++;
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

            //Anotando código
            int name = auxGenerationIds.get(id);
            if (symbol.type == SymbolType.PILSEN) {
                code += "istore " + name + "\n";
                auxGenerationIds.put(id, name);
            } else if (symbol.type == SymbolType.ALE) {
                code += "astore " + name + "\n";
                auxGenerationIds.put(id, name);
            }
        }
    }

    //Entrando em uma funcao
    @Override public void enterFunction(BeerParser.FunctionContext ctx) {
        //Controlando escopo
        table = new SymbolTable(table);
    }

    @Override public void exitFunction(BeerParser.FunctionContext ctx) {
        //Controlando escopo
        table = table.parent;

        String id = ctx.Identifier().getText();
        Symbol symbol = lookup(id);

        //Definindo quantidade de parametros
        if (ctx.parameters().declaration() != null) {
            if (ctx.parameters().declaration().size() > 0) {
                symbol.sizeParameters = ctx.parameters().declaration().size();
            }
        }


        for(BeerParser.DeclarationContext declaration: ctx.parameters().declaration()) {
            String type = declaration.type().getText();
            String id_ = declaration.Identifier().getText();

            if (this.lookup(id) == null) {
                if (errorHandler != null) errorHandler.push(new BeerSemanticError("Parametro "+id+" ja foi declarado!", ctx));
                return;
            }

            switch (type) {
                case "ale":
                    table.add(id_, new Symbol(SymbolType.ALE, false, false));
                    break;
                case "pilsen":
                    table.add(id_, new Symbol(SymbolType.PILSEN, false, false));
                    break;
                case "ipa":
                    table.add(id_, new Symbol(SymbolType.IPA, false, false));
                    break;
                case "bock":
                    table.add(id_, new Symbol(SymbolType.BOCK, false, false));
                    break;
                default:
                    table.add(id_, new Symbol(SymbolType.CLASS, false, false));
                    break;
            }
            symbol.typesParameters.add(type.toUpperCase());
        }
        //Definindo os tipos dos parametros

    }

    @Override public void enterParameters(BeerParser.ParametersContext ctx) {
        table = new SymbolTable(table);
    }

    @Override public void exitParameters(BeerParser.ParametersContext ctx) {
        table = table.parent;
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
            default:
                table.add(id, new Symbol(SymbolType.CLASS, false, init));
        }
    }

    @Override public void exitDeclaration(BeerParser.DeclarationContext ctx) {
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
        String type = ctx.Identifier().getText();
        if (type != null) {
            if (errorHandler != null) errorHandler.push(new BeerSemanticError("Tipo "+type+" nao declarado!", ctx));
            return;
        }
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

                //Anotando código
                int name = auxGenerationIds.get(id1);
                code += "iload " + name + "\n";

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

                //Anotando código
                int name = auxGenerationIds.get(id2);
                code += "iload " + name + "\n";

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

            //Anotando código
            if(ctx.binary().Plus() != null) {
                code += "iadd " + "\n";
            } else if (ctx.binary().EqualsSymbol() != null) {
                code += "if_icmpne else \n";
            } else if (ctx.binary().LessThanEquals() != null) {
                code += "if_icmple else \n";
            }
            
        //Quando for chamada de funcao
        } else if (rule.equals("exp_functionCall")) {
            if (ctx.functionCall().Dot() == null) {
                String id = ctx.functionCall().Identifier(0).getText();
                Symbol symbol = lookup(id);

                if (symbol == null) {
                    if (errorHandler != null) errorHandler.push(new BeerSemanticError("Funcao " + id + " nao foi declarada!", ctx));
                    return;
                }

                if (symbol.sizeParameters != ctx.functionCall().Identifier().size()-1) {
                    if (errorHandler != null) errorHandler.push(new BeerSemanticError("Numero de parametros da funcao " + id + " eh " + symbol.sizeParameters + "!", ctx));
                    return;
                }

                for (int i = 1; i < ctx.functionCall().Identifier().size(); ++i) {
                     String id_ = ctx.functionCall().Identifier(i).getText();
                     Symbol symbol_ = lookup(id_);
                     if (symbol_ == null) {
                         if (errorHandler != null) errorHandler.push(new BeerSemanticError("Variavel " + id + " nao foi declarada!", ctx));
                         return;
                     }

                     if (!String.valueOf(symbol_.type).equals(symbol.typesParameters.get(i-1))) {
                         if (errorHandler != null) errorHandler.push(new BeerSemanticError("Variavel " + id_ + " nao eh do tipo " + symbol.typesParameters.get(i-1), ctx));
                         return;
                     }
                }
            }
            
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

                //Anotando código
                code += "ldc " + valor + "\n";
            }
        } else if (ctx.BooleanLiteral() != null) {
            types.put(ctx, SymbolType.BOCK);
        } else if (ctx.StringLiteral() != null) {
            types.put(ctx, SymbolType.ALE);

            //Anotando código
            code += "ldc " + ctx.StringLiteral().toString() + "\n";
        }
    }

    @Override public void enterWhileExpression(BeerParser.WhileExpressionContext ctx) {
        //Controlando escopo
        table = new SymbolTable(table);

        code += "while: \n";

        // TODO
    }

    @Override public void exitWhileExpression(BeerParser.WhileExpressionContext ctx) {
        //Controlando escopo
        table = table.parent;

        code += "goto while \n";
        code += "else: \n";

        // TODO
    }

    @Override public void enterForExpression(BeerParser.ForExpressionContext ctx) {
        //Controlando escopo
        table = new SymbolTable(table);
        ctxNames.put(ctx.simpleCommand(0), "command_for");
        // TODO
    }

    @Override public void exitForExpression(BeerParser.ForExpressionContext ctx) {
        //Controlando escopo
        table = table.parent;
        code += "goto for \nelse: \n";
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

        ctxNames.put(ctx.command(0), "first_command");
        ctxNames.put(ctx.command(1), "second_command");
    }

    @Override public void exitIfExpression(BeerParser.IfExpressionContext ctx) {
        //Controlando escopo
        table = table.parent;
    }

    @Override public void enterPrint(BeerParser.PrintContext ctx) {
        // TODO
    }

    @Override public void exitPrint(BeerParser.PrintContext ctx) {

        //Anotando código
        if (ctxNames.get(ctx.getParent()) != null) {
            if (ctxNames.get(ctx.getParent()).equals("first_command")) {
            //pass
            } else if (ctxNames.get(ctx.getParent()).equals("second_command")) {
                code += "end: \n";
                code += "invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V \n";
            }
        } else if(ctx.expression().Identifier() != null) {
            String id = ctx.expression().Identifier().getText();
            Symbol symbol = lookup(id);

            int name = auxGenerationIds.get(id);

            if (symbol.type == SymbolType.ALE) {
                code += "aload " + name + "\n";
                code += "invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V \n";
            } else if (symbol.type == SymbolType.PILSEN) {
                code += "iload " + name + "\n";
                code += "invokevirtual java/io/PrintStream/println(I)V \n";
            }
        } else {
            SymbolType tipo = types.get(ctx.expression().value());
            if (tipo == SymbolType.PILSEN) {
                code += "invokevirtual java/io/PrintStream/println(I)V \n";
            } else if (tipo == SymbolType.ALE) {
                code += "invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V \n";
            }
        }

        /*if (ctx.expression() != null) {
            if (ctx.expression().value().StringLiteral() != null) {
                System.out.println(ctx.expression().value().getText());
            } else {
                if (errorHandler != null) errorHandler.push(new BeerSemanticError("O valor utilizado deve ser do tipo ale!", ctx));                 
            }
        } else {
            //System.out.print("");
        }*/
    }

    @Override public void enterRead(BeerParser.ReadContext ctx) {
        // TODO
        table = new SymbolTable(table);
    }

    @Override public void exitRead(BeerParser.ReadContext ctx) {
        // TODO
        String id = ctx.Identifier().getText();
        Symbol symbol = lookup(id);
        if (symbol != null) {
            //Nao ta funcionando
            /*SymbolType type_var = symbol.type;
            if (type_var.toString() == SymbolType.ALE) {
                Scanner sc = new Scanner(System.in);
                String read = sc.nextLine();
            } else {
                if (errorHandler != null) errorHandler.push(new BeerSemanticError("Variavel declarada deve ser do tipo string!", ctx));    
            }*/
        } else {
            if (errorHandler != null) errorHandler.push(new BeerSemanticError("Variavel nao declarada!", ctx));
        }
        table = table.parent;
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
        return;
    }

    @Override public void exitComment(BeerParser.CommentContext ctx) {
        return;
    }
}


