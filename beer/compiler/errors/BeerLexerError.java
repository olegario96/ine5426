package beer.compiler.errors;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;

public class BeerLexerError extends BaseErrorListener {
    @Override
    public void syntaxError(final Recognizer<?,?> recognizer, final Object offendingSymbol,
                            final int line, final int charPositionLine, final String msg,
                            final RecognitionException e) {

        Object tokenError = offendingSymbol;
        if (offendingSymbol == null) {
            final Lexer lexer = (Lexer) recognizer;
            int i = lexer.getCharIndex();
            final int n = lexer.getInputStream().size();
            if (i >= n) {
                i = n - 1;
            }

            final String text = lexer.getInputStream().getText(new Interval(i, i));
            CommonToken t = (CommonToken) lexer.getTokenFactory().create(Token.INVALID_TYPE, text);
            t.setStartIndex(i);
            t.setStopIndex(i);
            t.setLine(line);
            t.setCharPositionInLine(charPositionLine);
            tokenError = t;
        }

        System.err.println("Opa, fion esse aqui" + ((Token)tokenError).getText() + "\n\tlinha:" + line +
                           "\n\tcoluna:" + charPositionLine + " não conheço não.");
    }
}
