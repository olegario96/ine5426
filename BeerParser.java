// Generated from BeerParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BeerParser extends BeerBaseParser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MultiLineComment=1, SingleLineComment=2, RegularExpressionLiteral=3, OpenBracket=4, 
		CloseBracket=5, OpenParen=6, CloseParen=7, OpenBrace=8, CloseBrace=9, 
		SemiColon=10, Comma=11, Assign=12, QuestionMark=13, Colon=14, Dot=15, 
		PlusPlus=16, MinusMinus=17, Plus=18, Minus=19, Not=20, Multiply=21, Divide=22, 
		Modulus=23, LessThan=24, MoreThan=25, LessThanEquals=26, GreaterThanEquals=27, 
		Equals_=28, NotEquals=29, And=30, Or=31, MultiplyAssign=32, DivideAssign=33, 
		ModulusAssign=34, PlusAssign=35, MinusAssign=36, NullLiteral=37, BooleanLiteral=38, 
		DecimalLiteral=39, HexIntegerLiteral=40, Break=41, Case=42, Else=43, New=44, 
		Catch=45, Return=46, Void=47, Continue=48, For=49, Switch=50, While=51, 
		Function=52, This=53, Default=54, If=55, Throw=56, In=57, Try=58, Class=59, 
		Const=60, Import=61, Static=62, Identifier=63, StringLiteral=64, TemplateStringLiteral=65, 
		WhiteSpaces=66, LineTerminator=67, UnexpectedCharacter=68;
	public static final int
		RULE_program = 0, RULE_sourceElements = 1;
	public static final String[] ruleNames = {
		"program", "sourceElements"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'['", "']'", "'('", "')'", "'{'", "'}'", "';'", 
		"','", "'='", "'?'", "':'", "'.'", "'++'", "'--'", "'+'", "'-'", "'!'", 
		"'*'", "'/'", "'%'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&&'", 
		"'||'", "'*='", "'/='", "'%='", "'+='", "'-='", "'casco vazio'", null, 
		null, null, "'quebrou o copo'", "'opcao'", "'ta nao patrao'", "'nova no mercado'", 
		"'lei seca'", "'desce uma'", "'bar vazio'", "'traz mais uma'", "'tomar todas'", 
		"'cardapio'", "'encher a cara'", "'traz pra nois aquela'", "'tu memo'", 
		"'brahma'", "'ta gelada'", "'deu pt'", "'de'", "'to cagano de medo'", 
		"'cerva'", "'trincando'", "'chega ai queridao'", "'da galera'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MultiLineComment", "SingleLineComment", "RegularExpressionLiteral", 
		"OpenBracket", "CloseBracket", "OpenParen", "CloseParen", "OpenBrace", 
		"CloseBrace", "SemiColon", "Comma", "Assign", "QuestionMark", "Colon", 
		"Dot", "PlusPlus", "MinusMinus", "Plus", "Minus", "Not", "Multiply", "Divide", 
		"Modulus", "LessThan", "MoreThan", "LessThanEquals", "GreaterThanEquals", 
		"Equals_", "NotEquals", "And", "Or", "MultiplyAssign", "DivideAssign", 
		"ModulusAssign", "PlusAssign", "MinusAssign", "NullLiteral", "BooleanLiteral", 
		"DecimalLiteral", "HexIntegerLiteral", "Break", "Case", "Else", "New", 
		"Catch", "Return", "Void", "Continue", "For", "Switch", "While", "Function", 
		"This", "Default", "If", "Throw", "In", "Try", "Class", "Const", "Import", 
		"Static", "Identifier", "StringLiteral", "TemplateStringLiteral", "WhiteSpaces", 
		"LineTerminator", "UnexpectedCharacter"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "BeerParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BeerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(BeerParser.EOF, 0); }
		public List<SourceElementsContext> sourceElements() {
			return getRuleContexts(SourceElementsContext.class);
		}
		public SourceElementsContext sourceElements(int i) {
			return getRuleContext(SourceElementsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4);
				sourceElements();
				}
				}
				setState(7); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MultiLineComment) | (1L << SingleLineComment) | (1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << CloseBracket) | (1L << OpenParen) | (1L << CloseParen) | (1L << OpenBrace) | (1L << CloseBrace) | (1L << SemiColon) | (1L << Comma) | (1L << Assign) | (1L << QuestionMark) | (1L << Colon) | (1L << Dot) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << Not) | (1L << Multiply) | (1L << Divide) | (1L << Modulus) | (1L << LessThan) | (1L << MoreThan) | (1L << LessThanEquals) | (1L << GreaterThanEquals) | (1L << Equals_) | (1L << NotEquals) | (1L << And) | (1L << Or) | (1L << MultiplyAssign) | (1L << DivideAssign) | (1L << ModulusAssign) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << Break) | (1L << Case) | (1L << Else) | (1L << New) | (1L << Catch) | (1L << Return) | (1L << Void) | (1L << Continue) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << This) | (1L << Default) | (1L << If) | (1L << Throw) | (1L << In) | (1L << Try) | (1L << Class) | (1L << Const) | (1L << Import) | (1L << Static))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (WhiteSpaces - 66)) | (1L << (LineTerminator - 66)) | (1L << (UnexpectedCharacter - 66)))) != 0) );
			setState(9);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceElementsContext extends ParserRuleContext {
		public TerminalNode MultiLineComment() { return getToken(BeerParser.MultiLineComment, 0); }
		public TerminalNode SingleLineComment() { return getToken(BeerParser.SingleLineComment, 0); }
		public TerminalNode RegularExpressionLiteral() { return getToken(BeerParser.RegularExpressionLiteral, 0); }
		public TerminalNode OpenBracket() { return getToken(BeerParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(BeerParser.CloseBracket, 0); }
		public TerminalNode OpenParen() { return getToken(BeerParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(BeerParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(BeerParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(BeerParser.CloseBrace, 0); }
		public TerminalNode SemiColon() { return getToken(BeerParser.SemiColon, 0); }
		public TerminalNode Comma() { return getToken(BeerParser.Comma, 0); }
		public TerminalNode Assign() { return getToken(BeerParser.Assign, 0); }
		public TerminalNode QuestionMark() { return getToken(BeerParser.QuestionMark, 0); }
		public TerminalNode Colon() { return getToken(BeerParser.Colon, 0); }
		public TerminalNode Dot() { return getToken(BeerParser.Dot, 0); }
		public TerminalNode PlusPlus() { return getToken(BeerParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(BeerParser.MinusMinus, 0); }
		public TerminalNode Plus() { return getToken(BeerParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(BeerParser.Minus, 0); }
		public TerminalNode Not() { return getToken(BeerParser.Not, 0); }
		public TerminalNode Multiply() { return getToken(BeerParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(BeerParser.Divide, 0); }
		public TerminalNode Modulus() { return getToken(BeerParser.Modulus, 0); }
		public TerminalNode LessThan() { return getToken(BeerParser.LessThan, 0); }
		public TerminalNode MoreThan() { return getToken(BeerParser.MoreThan, 0); }
		public TerminalNode LessThanEquals() { return getToken(BeerParser.LessThanEquals, 0); }
		public TerminalNode GreaterThanEquals() { return getToken(BeerParser.GreaterThanEquals, 0); }
		public TerminalNode Equals_() { return getToken(BeerParser.Equals_, 0); }
		public TerminalNode NotEquals() { return getToken(BeerParser.NotEquals, 0); }
		public TerminalNode And() { return getToken(BeerParser.And, 0); }
		public TerminalNode Or() { return getToken(BeerParser.Or, 0); }
		public TerminalNode MultiplyAssign() { return getToken(BeerParser.MultiplyAssign, 0); }
		public TerminalNode DivideAssign() { return getToken(BeerParser.DivideAssign, 0); }
		public TerminalNode ModulusAssign() { return getToken(BeerParser.ModulusAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(BeerParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(BeerParser.MinusAssign, 0); }
		public TerminalNode NullLiteral() { return getToken(BeerParser.NullLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(BeerParser.BooleanLiteral, 0); }
		public TerminalNode DecimalLiteral() { return getToken(BeerParser.DecimalLiteral, 0); }
		public TerminalNode HexIntegerLiteral() { return getToken(BeerParser.HexIntegerLiteral, 0); }
		public TerminalNode Break() { return getToken(BeerParser.Break, 0); }
		public TerminalNode Case() { return getToken(BeerParser.Case, 0); }
		public TerminalNode Else() { return getToken(BeerParser.Else, 0); }
		public TerminalNode New() { return getToken(BeerParser.New, 0); }
		public TerminalNode Catch() { return getToken(BeerParser.Catch, 0); }
		public TerminalNode Return() { return getToken(BeerParser.Return, 0); }
		public TerminalNode Void() { return getToken(BeerParser.Void, 0); }
		public TerminalNode Continue() { return getToken(BeerParser.Continue, 0); }
		public TerminalNode For() { return getToken(BeerParser.For, 0); }
		public TerminalNode Switch() { return getToken(BeerParser.Switch, 0); }
		public TerminalNode While() { return getToken(BeerParser.While, 0); }
		public TerminalNode Function() { return getToken(BeerParser.Function, 0); }
		public TerminalNode This() { return getToken(BeerParser.This, 0); }
		public TerminalNode Default() { return getToken(BeerParser.Default, 0); }
		public TerminalNode If() { return getToken(BeerParser.If, 0); }
		public TerminalNode Throw() { return getToken(BeerParser.Throw, 0); }
		public TerminalNode In() { return getToken(BeerParser.In, 0); }
		public TerminalNode Try() { return getToken(BeerParser.Try, 0); }
		public TerminalNode Class() { return getToken(BeerParser.Class, 0); }
		public TerminalNode Const() { return getToken(BeerParser.Const, 0); }
		public TerminalNode Import() { return getToken(BeerParser.Import, 0); }
		public TerminalNode Static() { return getToken(BeerParser.Static, 0); }
		public TerminalNode WhiteSpaces() { return getToken(BeerParser.WhiteSpaces, 0); }
		public TerminalNode LineTerminator() { return getToken(BeerParser.LineTerminator, 0); }
		public TerminalNode UnexpectedCharacter() { return getToken(BeerParser.UnexpectedCharacter, 0); }
		public SourceElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).enterSourceElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).exitSourceElements(this);
		}
	}

	public final SourceElementsContext sourceElements() throws RecognitionException {
		SourceElementsContext _localctx = new SourceElementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sourceElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MultiLineComment) | (1L << SingleLineComment) | (1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << CloseBracket) | (1L << OpenParen) | (1L << CloseParen) | (1L << OpenBrace) | (1L << CloseBrace) | (1L << SemiColon) | (1L << Comma) | (1L << Assign) | (1L << QuestionMark) | (1L << Colon) | (1L << Dot) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << Not) | (1L << Multiply) | (1L << Divide) | (1L << Modulus) | (1L << LessThan) | (1L << MoreThan) | (1L << LessThanEquals) | (1L << GreaterThanEquals) | (1L << Equals_) | (1L << NotEquals) | (1L << And) | (1L << Or) | (1L << MultiplyAssign) | (1L << DivideAssign) | (1L << ModulusAssign) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << Break) | (1L << Case) | (1L << Else) | (1L << New) | (1L << Catch) | (1L << Return) | (1L << Void) | (1L << Continue) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << This) | (1L << Default) | (1L << If) | (1L << Throw) | (1L << In) | (1L << Try) | (1L << Class) | (1L << Const) | (1L << Import) | (1L << Static))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (WhiteSpaces - 66)) | (1L << (LineTerminator - 66)) | (1L << (UnexpectedCharacter - 66)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3F\20\4\2\t\2\4\3\t"+
		"\3\3\2\6\2\b\n\2\r\2\16\2\t\3\2\3\2\3\3\3\3\3\3\2\2\4\2\4\2\3\4\2\3@D"+
		"F\2\16\2\7\3\2\2\2\4\r\3\2\2\2\6\b\5\4\3\2\7\6\3\2\2\2\b\t\3\2\2\2\t\7"+
		"\3\2\2\2\t\n\3\2\2\2\n\13\3\2\2\2\13\f\7\2\2\3\f\3\3\2\2\2\r\16\t\2\2"+
		"\2\16\5\3\2\2\2\3\t";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}