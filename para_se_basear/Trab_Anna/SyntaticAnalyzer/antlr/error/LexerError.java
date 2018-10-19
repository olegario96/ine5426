package error;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;

public class LexerError extends BaseErrorListener {

    @Override
    public void syntaxError(final Recognizer<?,?> recognizer, final Object offendingSymbol, final int line,
                            final int charPositionInLine, final String msg, final RecognitionException e) {

    	Object tokenError = offendingSymbol;
	    if ( offendingSymbol== null ) {
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
			t.setCharPositionInLine(charPositionInLine);
			tokenError = t;
		}

		System.err.println ("Erro de reconhecimento do token "+ ((Token)tokenError).getText() + " na linha " + line +
	    				   ", coluna " + charPositionInLine);

    }

}
