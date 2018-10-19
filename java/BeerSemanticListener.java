import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.HashMap;
import java.util.Map;

import java.util.ArrayList;
import java.util.List;

import compiler.BeerParser;

import compiler.BeerParserBaseListener;

public class BeerSemanticListener extends BeerParserBaseListener {

    //Conjuntos auxiliares
    private ParseTreeProperty<SymbolType> types = new ParseTreeProperty<>();
    private ParseTreeProperty<String> ctxNames = new ParseTreeProperty<>();
    private ParseTreeProperty<Integer> sizes = new ParseTreeProperty<>();

    //Constructor
	public BeerSemanticListener() {}

	//Declarando a tabela de simbolos
	public SymbolTable table;
    
    //Metodo lookup
    //Procura na tabela de simbolos
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

    //Comecando a analise
    //Primeira regra de BeerParser.g4
    @Override public void enterProgram(BeerParser.ProgramContext ctx) {
        table = new SymbolTable(null);
    }

    //Entrando no begin
    @Override public void enterBegin(BeerParser.BeginContext ctx) { 
    	//System.out.println("Entrou no begin!");
    	//Controlando escopo
        table = new SymbolTable(table);
        ctxNames.put(ctx, "begin_block");
    }

    //Entrando em uma classe
    @Override public void enterInitClass(BeerParser.InitClassContext ctx) {         
        //Controlando escopo
        table = new SymbolTable(table);
        ctxNames.put(ctx, "initClass_block");

        //Adicionando nome da classe a tabela de simbolos
        String id = ctx.Identifier().getText();
        table.add(id, new Symbol(SymbolType.CLASS, true, false));
    }

    //Entrando em um comando de uma classe
    //Pode ser declaracao de atributo, funcao ou construtor
    @Override public void enterMethod(BeerParser.MethodContext ctx) { 
        if (ctx.type() != null) {
            String type = ctx.type().getText();
            String id = ctx.Identifier().getText();
            Symbol symbol = lookup(id);

            if (symbol != null) {
                System.err.println("Variavel ja declarada!");
                return;
            }

            boolean init = false;

            ParserRuleContext c = ctx;
            String rule = ctxNames.get(c);

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
            }
        }
    }

/*function
    :  Function (type | typeArray) Identifier OpenParent parameters CloseParent OpenBrace command* CloseBrace
    ;*/

    //Entrando em uma funcao
    @Override public void enterFunction(BeerParser.FunctionContext ctx) { 
        //RAUL: parei aqui
    }

    //Entrando em uma declaracao de variavel
    @Override public void enterDeclaration(BeerParser.DeclarationContext ctx) { 
    	//System.out.println("Entrou na declaracao!");
    	String type = ctx.type().getText();
        String id = ctx.Identifier().getText();
        Symbol symbol = lookup(id);

        if (symbol != null) {
            System.err.println("Variavel ja declarada!");
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
                System.err.println("Variavel "+ id + " nao foi declarada!");
                return;
            //Verificando tipos entre variavel e expressao
            } else if (symbol.type != types.get(ctx.expression())) {
                System.err.println("Nao eh possivel atribuir esta expressao a variavel " + id + "!");
                System.err.println("Tipos incompativeis!");
                return;
            }
        }
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
                System.err.println("Variavel " + id1 + " nao foi declarada!");
                return;
            } else if (symbol2 == null) {
                System.err.println("Variavel " + id2 + " nao foi declarada!");
                return;
            }

            //Verificando se alguma delas nao foi inicializada
            if (symbol1.initialized == false) {
                System.err.println("Variavel " + id1 + " nao foi inicializada!");
                return;
            } else if (symbol2.initialized == false) {
                System.err.println("Variavel " + id2 + " nao foi inicializada!");
                return;
            }

            //Verificando mesmo tipo
            if (symbol1.type != symbol2.type) {
                System.err.println("Tipos incompativeis!");
                return;
            } else if (symbol1.type != SymbolType.PILSEN && symbol1.type != SymbolType.IPA && symbol1.type != SymbolType.BOCK) {
                System.err.println("Nao eh possivel realizar operacoes com " + symbol1.type + "!");
                return;
            }

            //Setando o tipo da expressao
            types.put(ctx, symbol1.type); 
        }
    }


}