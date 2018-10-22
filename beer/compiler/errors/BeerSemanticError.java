package beer.compiler.errors;

import org.antlr.v4.runtime.ParserRuleContext;

public class BeerSemanticError {
    protected String message;
    protected ParserRuleContext ctx;
    protected int line;
    public BeerSemanticError(String message, ParserRuleContext ctx) {
        this.message = message;
        this.ctx = ctx;

        if (ctx.start != null) {
            this.line = ctx.start.getLine();
        }
    }

    public String getMessage() {
        return message;
    }

    public int getLine() {
        return line;
    }

    public ParserRuleContext getContext() {
        return ctx;
    }
}
