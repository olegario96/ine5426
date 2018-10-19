package error;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.IntervalSet;

public class ErrorStrategy extends DefaultErrorStrategy {
	@Override
	public void reportMissingToken(Parser recognizer) {

		if (inErrorRecoveryMode(recognizer)) {
			return;
		}

		beginErrorCondition(recognizer);
		Token t = recognizer.getCurrentToken();
		IntervalSet expecting = getExpectedTokens(recognizer);
		String msg = "Faltando "+expecting.toString(recognizer.getVocabulary())+
			" em "+getTokenErrorDisplay(t);

		recognizer.notifyErrorListeners(t, msg, null);
	}

	@Override
	protected void reportInputMismatch(Parser recognizer,
									   InputMismatchException e) {
		String msg = "entrada inesperada "+getTokenErrorDisplay(e.getOffendingToken())+
		" esperava-se "+e.getExpectedTokens().toString(recognizer.getVocabulary());
		recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
	}

	@Override
	protected void reportUnwantedToken(Parser recognizer) {
		if (inErrorRecoveryMode(recognizer)) {
			return;
		}

		beginErrorCondition(recognizer);

		Token t = recognizer.getCurrentToken();
		String tokenName = getTokenErrorDisplay(t);
		IntervalSet expecting = getExpectedTokens(recognizer);
		String msg = "entrada não esperada "+tokenName+" esperava-se "+
			expecting.toString(recognizer.getVocabulary());
		recognizer.notifyErrorListeners(t, msg, null);
	}

	@Override
	protected void reportNoViableAlternative(Parser recognizer,
											 NoViableAltException e) {
		TokenStream tokens = recognizer.getInputStream();
		String input;
		if ( tokens!=null ) {
			if ( e.getStartToken().getType()==Token.EOF ) input = "<EOF>";
			else input = tokens.getText(e.getStartToken(), e.getOffendingToken());
		}
		else {
			input = "<entrada desconhecida>";
		}
		String msg = "sem alternativa viável na entrada "+escapeWSAndQuote(input);
		recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
	}


}
