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
		CloseBracket=5, OpenParent=6, CloseParent=7, OpenBrace=8, CloseBrace=9, 
		SemiColon=10, Comma=11, Assign=12, QuestionMark=13, Colon=14, Dot=15, 
		PlusPlus=16, MinusMinus=17, Plus=18, Minus=19, Not=20, Multiply=21, Divide=22, 
		Modulus=23, LessThan=24, MoreThan=25, LessThanEquals=26, GreaterThanEquals=27, 
		EqualsSymbol=28, NotEquals=29, And=30, Or=31, MultiplyAssign=32, DivideAssign=33, 
		ModulusAssign=34, PlusAssign=35, MinusAssign=36, NullLiteral=37, BooleanLiteral=38, 
		DecimalLiteral=39, HexIntegerLiteral=40, Break=41, Case=42, Else=43, ElseIf=44, 
		New=45, Catch=46, Return=47, Void=48, Continue=49, For=50, Switch=51, 
		While=52, Function=53, This=54, Default=55, If=56, Throw=57, In=58, Try=59, 
		MainInit=60, MainFinish=61, Int=62, Float=63, Boolean=64, String=65, Array=66, 
		Print=67, Read=68, Class=69, Const=70, Import=71, Static=72, Identifier=73, 
		StringLiteral=74, TemplateStringLiteral=75, WhiteSpaces=76, LineTerminator=77, 
		UnexpectedCharacter=78;
	public static final int
		RULE_program = 0, RULE_importExpression = 1, RULE_initClass = 2, RULE_method = 3, 
		RULE_constructor = 4, RULE_begin = 5, RULE_command = 6, RULE_simpleCommand = 7, 
		RULE_function = 8, RULE_parameters = 9, RULE_declaration = 10, RULE_newObjectInit = 11, 
		RULE_type = 12, RULE_typeArray = 13, RULE_expression = 14, RULE_initArray = 15, 
		RULE_binary = 16, RULE_functionCall = 17, RULE_value = 18, RULE_whileExpression = 19, 
		RULE_forExpression = 20, RULE_switchExpression = 21, RULE_caseExpression = 22, 
		RULE_defaultExpression = 23, RULE_ifExpression = 24, RULE_print = 25, 
		RULE_read = 26, RULE_tryExpression = 27, RULE_catchExpression = 28, RULE_throwExpression = 29, 
		RULE_comment = 30;
	public static final String[] ruleNames = {
		"program", "importExpression", "initClass", "method", "constructor", "begin", 
		"command", "simpleCommand", "function", "parameters", "declaration", "newObjectInit", 
		"type", "typeArray", "expression", "initArray", "binary", "functionCall", 
		"value", "whileExpression", "forExpression", "switchExpression", "caseExpression", 
		"defaultExpression", "ifExpression", "print", "read", "tryExpression", 
		"catchExpression", "throwExpression", "comment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'['", "']'", "'('", "')'", "'{'", "'}'", "';'", 
		"','", "'='", "'?'", "':'", "'.'", "'++'", "'--'", "'+'", "'-'", "'!'", 
		"'*'", "'/'", "'%'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&&'", 
		"'||'", "'*='", "'/='", "'%='", "'+='", "'-='", "'casco vazio'", null, 
		null, null, "'quebrou o copo'", "'opcao'", "'ta nao patrao'", "'tem certeza'", 
		"'nova no mercado'", "'lei seca'", "'desce uma'", "'bar vazio'", "'traz mais uma'", 
		"'tomar todas'", "'cardapio'", "'encher a cara'", "'traz pra nois aquela'", 
		"'tu memo'", "'brahma'", "'ta gelada'", "'deu pt'", "'de'", "'to cagano de medo'", 
		"'taca-le pau'", "'fecha conta'", "'pilsen'", "'ipa'", "'bock'", "'ale'", 
		"'por\u00E7\u00E3o'", "'conta pra gente'", "'qual a boa'", "'cerva'", 
		"'trincando'", "'chega ai queridao'", "'da galera'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MultiLineComment", "SingleLineComment", "RegularExpressionLiteral", 
		"OpenBracket", "CloseBracket", "OpenParent", "CloseParent", "OpenBrace", 
		"CloseBrace", "SemiColon", "Comma", "Assign", "QuestionMark", "Colon", 
		"Dot", "PlusPlus", "MinusMinus", "Plus", "Minus", "Not", "Multiply", "Divide", 
		"Modulus", "LessThan", "MoreThan", "LessThanEquals", "GreaterThanEquals", 
		"EqualsSymbol", "NotEquals", "And", "Or", "MultiplyAssign", "DivideAssign", 
		"ModulusAssign", "PlusAssign", "MinusAssign", "NullLiteral", "BooleanLiteral", 
		"DecimalLiteral", "HexIntegerLiteral", "Break", "Case", "Else", "ElseIf", 
		"New", "Catch", "Return", "Void", "Continue", "For", "Switch", "While", 
		"Function", "This", "Default", "If", "Throw", "In", "Try", "MainInit", 
		"MainFinish", "Int", "Float", "Boolean", "String", "Array", "Print", "Read", 
		"Class", "Const", "Import", "Static", "Identifier", "StringLiteral", "TemplateStringLiteral", 
		"WhiteSpaces", "LineTerminator", "UnexpectedCharacter"
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
		public List<ImportExpressionContext> importExpression() {
			return getRuleContexts(ImportExpressionContext.class);
		}
		public ImportExpressionContext importExpression(int i) {
			return getRuleContext(ImportExpressionContext.class,i);
		}
		public InitClassContext initClass() {
			return getRuleContext(InitClassContext.class,0);
		}
		public BeginContext begin() {
			return getRuleContext(BeginContext.class,0);
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
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Import) {
				{
				{
				setState(62);
				importExpression();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
				{
				setState(68);
				initClass();
				}
				break;
			case MainInit:
				{
				setState(69);
				begin();
				}
				break;
			case EOF:
				break;
			default:
				break;
			}
			setState(72);
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

	public static class ImportExpressionContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(BeerParser.Import, 0); }
		public TerminalNode StringLiteral() { return getToken(BeerParser.StringLiteral, 0); }
		public TerminalNode SemiColon() { return getToken(BeerParser.SemiColon, 0); }
		public ImportExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).enterImportExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).exitImportExpression(this);
		}
	}

	public final ImportExpressionContext importExpression() throws RecognitionException {
		ImportExpressionContext _localctx = new ImportExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(Import);
			setState(75);
			match(StringLiteral);
			setState(76);
			match(SemiColon);
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

	public static class InitClassContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(BeerParser.Class, 0); }
		public TerminalNode Identifier() { return getToken(BeerParser.Identifier, 0); }
		public TerminalNode OpenBrace() { return getToken(BeerParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(BeerParser.CloseBrace, 0); }
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public InitClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).enterInitClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).exitInitClass(this);
		}
	}

	public final InitClassContext initClass() throws RecognitionException {
		InitClassContext _localctx = new InitClassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_initClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(Class);
			setState(79);
			match(Identifier);
			setState(80);
			match(OpenBrace);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (Function - 53)) | (1L << (Int - 53)) | (1L << (Float - 53)) | (1L << (Boolean - 53)) | (1L << (String - 53)) | (1L << (Identifier - 53)))) != 0)) {
				{
				{
				setState(81);
				method();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			match(CloseBrace);
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

	public static class MethodContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(BeerParser.Identifier, 0); }
		public TerminalNode SemiColon() { return getToken(BeerParser.SemiColon, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).exitMethod(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_method);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				type();
				setState(90);
				match(Identifier);
				setState(91);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				constructor();
				}
				break;
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

	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BeerParser.Identifier, 0); }
		public TerminalNode OpenParent() { return getToken(BeerParser.OpenParent, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode CloseParent() { return getToken(BeerParser.CloseParent, 0); }
		public TerminalNode OpenBrace() { return getToken(BeerParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(BeerParser.CloseBrace, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).exitConstructor(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(Identifier);
			setState(98);
			match(OpenParent);
			setState(99);
			parameters();
			setState(100);
			match(CloseParent);
			setState(101);
			match(OpenBrace);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << OpenBrace) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(102);
				command();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			match(CloseBrace);
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

	public static class BeginContext extends ParserRuleContext {
		public TerminalNode MainInit() { return getToken(BeerParser.MainInit, 0); }
		public TerminalNode MainFinish() { return getToken(BeerParser.MainFinish, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public BeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).enterBegin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).exitBegin(this);
		}
	}

	public final BeginContext begin() throws RecognitionException {
		BeginContext _localctx = new BeginContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_begin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(MainInit);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << OpenBrace) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(111);
				command();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(MainFinish);
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

	public static class CommandContext extends ParserRuleContext {
		public SimpleCommandContext simpleCommand() {
			return getRuleContext(SimpleCommandContext.class,0);
		}
		public WhileExpressionContext whileExpression() {
			return getRuleContext(WhileExpressionContext.class,0);
		}
		public IfExpressionContext ifExpression() {
			return getRuleContext(IfExpressionContext.class,0);
		}
		public ForExpressionContext forExpression() {
			return getRuleContext(ForExpressionContext.class,0);
		}
		public SwitchExpressionContext switchExpression() {
			return getRuleContext(SwitchExpressionContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public TryExpressionContext tryExpression() {
			return getRuleContext(TryExpressionContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ThrowExpressionContext throwExpression() {
			return getRuleContext(ThrowExpressionContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(BeerParser.SemiColon, 0); }
		public TerminalNode Break() { return getToken(BeerParser.Break, 0); }
		public TerminalNode Return() { return getToken(BeerParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_command);
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenParent:
			case OpenBrace:
			case Not:
			case BooleanLiteral:
			case DecimalLiteral:
			case New:
			case This:
			case Int:
			case Float:
			case Boolean:
			case String:
			case Array:
			case Identifier:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				simpleCommand();
				}
				break;
			case While:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				whileExpression();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				ifExpression();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				forExpression();
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				switchExpression();
				}
				break;
			case Print:
				enterOuterAlt(_localctx, 6);
				{
				setState(124);
				print();
				}
				break;
			case Read:
				enterOuterAlt(_localctx, 7);
				{
				setState(125);
				read();
				}
				break;
			case Try:
				enterOuterAlt(_localctx, 8);
				{
				setState(126);
				tryExpression();
				}
				break;
			case Function:
				enterOuterAlt(_localctx, 9);
				{
				setState(127);
				function();
				}
				break;
			case Throw:
				enterOuterAlt(_localctx, 10);
				{
				setState(128);
				throwExpression();
				}
				break;
			case Break:
			case Return:
				enterOuterAlt(_localctx, 11);
				{
				setState(132);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Break:
					{
					setState(129);
					match(Break);
					}
					break;
				case Return:
					{
					setState(130);
					match(Return);
					setState(131);
					expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(134);
				match(SemiColon);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SimpleCommandContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(BeerParser.SemiColon, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Assign() { return getToken(BeerParser.Assign, 0); }
		public TerminalNode Identifier() { return getToken(BeerParser.Identifier, 0); }
		public TerminalNode MultiplyAssign() { return getToken(BeerParser.MultiplyAssign, 0); }
		public TerminalNode DivideAssign() { return getToken(BeerParser.DivideAssign, 0); }
		public TerminalNode ModulusAssign() { return getToken(BeerParser.ModulusAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(BeerParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(BeerParser.MinusAssign, 0); }
		public TerminalNode This() { return getToken(BeerParser.This, 0); }
		public TerminalNode Dot() { return getToken(BeerParser.Dot, 0); }
		public SimpleCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).enterSimpleCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).exitSimpleCommand(this);
		}
	}

	public final SimpleCommandContext simpleCommand() throws RecognitionException {
		SimpleCommandContext _localctx = new SimpleCommandContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_simpleCommand);
		int _la;
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				expression(0);
				setState(138);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				declaration();
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(141);
					match(Assign);
					setState(142);
					expression(0);
					}
				}

				setState(145);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==This) {
					{
					setState(147);
					match(This);
					setState(148);
					match(Dot);
					}
				}

				setState(151);
				match(Identifier);
				setState(152);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Assign) | (1L << MultiplyAssign) | (1L << DivideAssign) | (1L << ModulusAssign) | (1L << PlusAssign) | (1L << MinusAssign))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(153);
				expression(0);
				setState(154);
				match(SemiColon);
				}
				break;
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(BeerParser.Function, 0); }
		public TerminalNode Identifier() { return getToken(BeerParser.Identifier, 0); }
		public TerminalNode OpenParent() { return getToken(BeerParser.OpenParent, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode CloseParent() { return getToken(BeerParser.CloseParent, 0); }
		public TerminalNode OpenBrace() { return getToken(BeerParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(BeerParser.CloseBrace, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeArrayContext typeArray() {
			return getRuleContext(TypeArrayContext.class,0);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(Function);
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Float:
			case Boolean:
			case String:
			case Identifier:
				{
				setState(159);
				type();
				}
				break;
			case Array:
				{
				setState(160);
				typeArray();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(163);
			match(Identifier);
			setState(164);
			match(OpenParent);
			setState(165);
			parameters();
			setState(166);
			match(CloseParent);
			setState(167);
			match(OpenBrace);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << OpenBrace) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(168);
				command();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			match(CloseBrace);
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

	public static class ParametersContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(BeerParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(BeerParser.Comma, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (Int - 62)) | (1L << (Float - 62)) | (1L << (Boolean - 62)) | (1L << (String - 62)) | (1L << (Array - 62)) | (1L << (Identifier - 62)))) != 0)) {
				{
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(176);
						declaration();
						setState(177);
						match(Comma);
						}
						} 
					}
					setState(183);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(184);
				declaration();
				}
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

	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(BeerParser.Identifier, 0); }
		public TypeArrayContext typeArray() {
			return getRuleContext(TypeArrayContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaration);
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Float:
			case Boolean:
			case String:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				type();
				setState(188);
				match(Identifier);
				}
				break;
			case Array:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				typeArray();
				setState(191);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class NewObjectInitContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(BeerParser.New, 0); }
		public List<TerminalNode> Identifier() { return getTokens(BeerParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(BeerParser.Identifier, i);
		}
		public TerminalNode OpenParent() { return getToken(BeerParser.OpenParent, 0); }
		public TerminalNode CloseParent() { return getToken(BeerParser.CloseParent, 0); }
		public List<TerminalNode> Comma() { return getTokens(BeerParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(BeerParser.Comma, i);
		}
		public NewObjectInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newObjectInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).enterNewObjectInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).exitNewObjectInit(this);
		}
	}

	public final NewObjectInitContext newObjectInit() throws RecognitionException {
		NewObjectInitContext _localctx = new NewObjectInitContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_newObjectInit);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(New);
			setState(196);
			match(Identifier);
			setState(197);
			match(OpenParent);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(198);
						match(Identifier);
						setState(199);
						match(Comma);
						}
						} 
					}
					setState(204);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(205);
				match(Identifier);
				}
			}

			setState(208);
			match(CloseParent);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(BeerParser.Int, 0); }
		public TerminalNode Float() { return getToken(BeerParser.Float, 0); }
		public TerminalNode Boolean() { return getToken(BeerParser.Boolean, 0); }
		public TerminalNode String() { return getToken(BeerParser.String, 0); }
		public TerminalNode Identifier() { return getToken(BeerParser.Identifier, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (Int - 62)) | (1L << (Float - 62)) | (1L << (Boolean - 62)) | (1L << (String - 62)) | (1L << (Identifier - 62)))) != 0)) ) {
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

	public static class TypeArrayContext extends ParserRuleContext {
		public TerminalNode Array() { return getToken(BeerParser.Array, 0); }
		public TerminalNode LessThan() { return getToken(BeerParser.LessThan, 0); }
		public TerminalNode Identifier() { return getToken(BeerParser.Identifier, 0); }
		public TerminalNode MoreThan() { return getToken(BeerParser.MoreThan, 0); }
		public TypeArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).enterTypeArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).exitTypeArray(this);
		}
	}

	public final TypeArrayContext typeArray() throws RecognitionException {
		TypeArrayContext _localctx = new TypeArrayContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(Array);
			setState(213);
			match(LessThan);
			setState(214);
			match(Identifier);
			setState(215);
			match(MoreThan);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode Not() { return getToken(BeerParser.Not, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OpenParent() { return getToken(BeerParser.OpenParent, 0); }
		public TerminalNode CloseParent() { return getToken(BeerParser.CloseParent, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(BeerParser.Identifier, 0); }
		public NewObjectInitContext newObjectInit() {
			return getRuleContext(NewObjectInitContext.class,0);
		}
		public InitArrayContext initArray() {
			return getRuleContext(InitArrayContext.class,0);
		}
		public BinaryContext binary() {
			return getRuleContext(BinaryContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(218);
				match(Not);
				setState(219);
				expression(8);
				}
				break;
			case 2:
				{
				setState(220);
				match(OpenParent);
				setState(221);
				expression(0);
				setState(222);
				match(CloseParent);
				}
				break;
			case 3:
				{
				setState(224);
				functionCall();
				}
				break;
			case 4:
				{
				setState(225);
				value();
				}
				break;
			case 5:
				{
				setState(226);
				match(Identifier);
				}
				break;
			case 6:
				{
				setState(227);
				newObjectInit();
				}
				break;
			case 7:
				{
				setState(228);
				initArray();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(231);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(232);
					binary();
					setState(233);
					expression(7);
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InitArrayContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(BeerParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(BeerParser.CloseBrace, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(BeerParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(BeerParser.Comma, i);
		}
		public InitArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).enterInitArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).exitInitArray(this);
		}
	}

	public final InitArrayContext initArray() throws RecognitionException {
		InitArrayContext _localctx = new InitArrayContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_initArray);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(OpenBrace);
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(241);
					value();
					setState(242);
					match(Comma);
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (BooleanLiteral - 38)) | (1L << (DecimalLiteral - 38)) | (1L << (StringLiteral - 38)))) != 0)) {
				{
				setState(249);
				value();
				}
			}

			setState(252);
			match(CloseBrace);
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

	public static class BinaryContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(BeerParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(BeerParser.Minus, 0); }
		public TerminalNode Multiply() { return getToken(BeerParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(BeerParser.Divide, 0); }
		public TerminalNode Modulus() { return getToken(BeerParser.Modulus, 0); }
		public TerminalNode MoreThan() { return getToken(BeerParser.MoreThan, 0); }
		public TerminalNode LessThan() { return getToken(BeerParser.LessThan, 0); }
		public TerminalNode GreaterThanEquals() { return getToken(BeerParser.GreaterThanEquals, 0); }
		public TerminalNode LessThanEquals() { return getToken(BeerParser.LessThanEquals, 0); }
		public TerminalNode EqualsSymbol() { return getToken(BeerParser.EqualsSymbol, 0); }
		public TerminalNode NotEquals() { return getToken(BeerParser.NotEquals, 0); }
		public TerminalNode And() { return getToken(BeerParser.And, 0); }
		public TerminalNode Or() { return getToken(BeerParser.Or, 0); }
		public BinaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).enterBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).exitBinary(this);
		}
	}

	public final BinaryContext binary() throws RecognitionException {
		BinaryContext _localctx = new BinaryContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_binary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Plus) | (1L << Minus) | (1L << Multiply) | (1L << Divide) | (1L << Modulus) | (1L << LessThan) | (1L << MoreThan) | (1L << LessThanEquals) | (1L << GreaterThanEquals) | (1L << EqualsSymbol) | (1L << NotEquals) | (1L << And) | (1L << Or))) != 0)) ) {
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

	public static class FunctionCallContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(BeerParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(BeerParser.Identifier, i);
		}
		public TerminalNode OpenParent() { return getToken(BeerParser.OpenParent, 0); }
		public TerminalNode CloseParent() { return getToken(BeerParser.CloseParent, 0); }
		public List<TerminalNode> Comma() { return getTokens(BeerParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(BeerParser.Comma, i);
		}
		public TerminalNode Dot() { return getToken(BeerParser.Dot, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionCall);
		int _la;
		try {
			int _alt;
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(Identifier);
				setState(257);
				match(OpenParent);
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(262);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(258);
							match(Identifier);
							setState(259);
							match(Comma);
							}
							} 
						}
						setState(264);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
					}
					setState(265);
					match(Identifier);
					}
				}

				setState(268);
				match(CloseParent);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(Identifier);
				setState(270);
				match(Dot);
				setState(271);
				match(Identifier);
				setState(272);
				match(OpenParent);
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(277);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(273);
							match(Identifier);
							setState(274);
							match(Comma);
							}
							} 
						}
						setState(279);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
					}
					setState(280);
					match(Identifier);
					}
				}

				setState(283);
				match(CloseParent);
				}
				break;
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode DecimalLiteral() { return getToken(BeerParser.DecimalLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(BeerParser.BooleanLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(BeerParser.StringLiteral, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_la = _input.LA(1);
			if ( !(((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (BooleanLiteral - 38)) | (1L << (DecimalLiteral - 38)) | (1L << (StringLiteral - 38)))) != 0)) ) {
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

	public static class WhileExpressionContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(BeerParser.While, 0); }
		public TerminalNode OpenParent() { return getToken(BeerParser.OpenParent, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseParent() { return getToken(BeerParser.CloseParent, 0); }
		public TerminalNode OpenBrace() { return getToken(BeerParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(BeerParser.CloseBrace, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public WhileExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).enterWhileExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).exitWhileExpression(this);
		}
	}

	public final WhileExpressionContext whileExpression() throws RecognitionException {
		WhileExpressionContext _localctx = new WhileExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_whileExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(While);
			setState(289);
			match(OpenParent);
			setState(290);
			expression(0);
			setState(291);
			match(CloseParent);
			setState(292);
			match(OpenBrace);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << OpenBrace) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(293);
				command();
				}
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(299);
			match(CloseBrace);
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

	public static class ForExpressionContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(BeerParser.For, 0); }
		public TerminalNode OpenParent() { return getToken(BeerParser.OpenParent, 0); }
		public TerminalNode SemiColon() { return getToken(BeerParser.SemiColon, 0); }
		public TerminalNode CloseParent() { return getToken(BeerParser.CloseParent, 0); }
		public TerminalNode OpenBrace() { return getToken(BeerParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(BeerParser.CloseBrace, 0); }
		public List<SimpleCommandContext> simpleCommand() {
			return getRuleContexts(SimpleCommandContext.class);
		}
		public SimpleCommandContext simpleCommand(int i) {
			return getRuleContext(SimpleCommandContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode In() { return getToken(BeerParser.In, 0); }
		public TerminalNode Identifier() { return getToken(BeerParser.Identifier, 0); }
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).enterForExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).exitForExpression(this);
		}
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_forExpression);
		int _la;
		try {
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				match(For);
				setState(302);
				match(OpenParent);
				setState(304);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(303);
					simpleCommand();
					}
					break;
				}
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << OpenBrace) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << New))) != 0) || _la==Identifier || _la==StringLiteral) {
					{
					setState(306);
					expression(0);
					}
				}

				setState(309);
				match(SemiColon);
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << OpenBrace) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << New) | (1L << This) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(310);
					simpleCommand();
					}
				}

				setState(313);
				match(CloseParent);
				setState(314);
				match(OpenBrace);
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << OpenBrace) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					{
					setState(315);
					command();
					}
					}
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(321);
				match(CloseBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(For);
				setState(323);
				match(OpenParent);
				setState(324);
				declaration();
				setState(325);
				match(In);
				setState(326);
				match(Identifier);
				setState(327);
				match(CloseParent);
				setState(328);
				match(OpenBrace);
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << OpenBrace) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					{
					setState(329);
					command();
					}
					}
					setState(334);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(335);
				match(CloseBrace);
				}
				break;
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

	public static class SwitchExpressionContext extends ParserRuleContext {
		public TerminalNode Switch() { return getToken(BeerParser.Switch, 0); }
		public TerminalNode OpenParent() { return getToken(BeerParser.OpenParent, 0); }
		public TerminalNode Identifier() { return getToken(BeerParser.Identifier, 0); }
		public TerminalNode CloseParent() { return getToken(BeerParser.CloseParent, 0); }
		public TerminalNode OpenBrace() { return getToken(BeerParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(BeerParser.CloseBrace, 0); }
		public List<CaseExpressionContext> caseExpression() {
			return getRuleContexts(CaseExpressionContext.class);
		}
		public CaseExpressionContext caseExpression(int i) {
			return getRuleContext(CaseExpressionContext.class,i);
		}
		public DefaultExpressionContext defaultExpression() {
			return getRuleContext(DefaultExpressionContext.class,0);
		}
		public SwitchExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).enterSwitchExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).exitSwitchExpression(this);
		}
	}

	public final SwitchExpressionContext switchExpression() throws RecognitionException {
		SwitchExpressionContext _localctx = new SwitchExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_switchExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(Switch);
			setState(340);
			match(OpenParent);
			setState(341);
			match(Identifier);
			setState(342);
			match(CloseParent);
			setState(343);
			match(OpenBrace);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Case) {
				{
				{
				setState(344);
				caseExpression();
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Default) {
				{
				setState(350);
				defaultExpression();
				}
			}

			setState(353);
			match(CloseBrace);
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

	public static class CaseExpressionContext extends ParserRuleContext {
		public TerminalNode Case() { return getToken(BeerParser.Case, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Colon() { return getToken(BeerParser.Colon, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public CaseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).enterCaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).exitCaseExpression(this);
		}
	}

	public final CaseExpressionContext caseExpression() throws RecognitionException {
		CaseExpressionContext _localctx = new CaseExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_caseExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(Case);
			setState(356);
			expression(0);
			setState(357);
			match(Colon);
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << OpenBrace) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(358);
				command();
				}
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class DefaultExpressionContext extends ParserRuleContext {
		public TerminalNode Default() { return getToken(BeerParser.Default, 0); }
		public TerminalNode OpenBrace() { return getToken(BeerParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(BeerParser.CloseBrace, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public DefaultExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).enterDefaultExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).exitDefaultExpression(this);
		}
	}

	public final DefaultExpressionContext defaultExpression() throws RecognitionException {
		DefaultExpressionContext _localctx = new DefaultExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_defaultExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(Default);
			setState(365);
			match(OpenBrace);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << OpenBrace) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(366);
				command();
				}
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(372);
			match(CloseBrace);
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

	public static class IfExpressionContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(BeerParser.If, 0); }
		public List<TerminalNode> OpenParent() { return getTokens(BeerParser.OpenParent); }
		public TerminalNode OpenParent(int i) {
			return getToken(BeerParser.OpenParent, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> CloseParent() { return getTokens(BeerParser.CloseParent); }
		public TerminalNode CloseParent(int i) {
			return getToken(BeerParser.CloseParent, i);
		}
		public List<TerminalNode> QuestionMark() { return getTokens(BeerParser.QuestionMark); }
		public TerminalNode QuestionMark(int i) {
			return getToken(BeerParser.QuestionMark, i);
		}
		public List<TerminalNode> OpenBrace() { return getTokens(BeerParser.OpenBrace); }
		public TerminalNode OpenBrace(int i) {
			return getToken(BeerParser.OpenBrace, i);
		}
		public List<TerminalNode> CloseBrace() { return getTokens(BeerParser.CloseBrace); }
		public TerminalNode CloseBrace(int i) {
			return getToken(BeerParser.CloseBrace, i);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public List<TerminalNode> ElseIf() { return getTokens(BeerParser.ElseIf); }
		public TerminalNode ElseIf(int i) {
			return getToken(BeerParser.ElseIf, i);
		}
		public TerminalNode Else() { return getToken(BeerParser.Else, 0); }
		public IfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).enterIfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).exitIfExpression(this);
		}
	}

	public final IfExpressionContext ifExpression() throws RecognitionException {
		IfExpressionContext _localctx = new IfExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ifExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(If);
			setState(375);
			match(OpenParent);
			setState(376);
			expression(0);
			setState(377);
			match(CloseParent);
			setState(378);
			match(QuestionMark);
			setState(379);
			match(OpenBrace);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << OpenBrace) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(380);
				command();
				}
				}
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(386);
			match(CloseBrace);
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ElseIf) {
				{
				{
				setState(387);
				match(ElseIf);
				setState(388);
				match(OpenParent);
				setState(389);
				expression(0);
				setState(390);
				match(CloseParent);
				setState(391);
				match(QuestionMark);
				setState(392);
				match(OpenBrace);
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << OpenBrace) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					{
					setState(393);
					command();
					}
					}
					setState(398);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(399);
				match(CloseBrace);
				}
				}
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(406);
				match(Else);
				setState(407);
				match(OpenBrace);
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << OpenBrace) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					{
					setState(408);
					command();
					}
					}
					setState(413);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(414);
				match(CloseBrace);
				}
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode Print() { return getToken(BeerParser.Print, 0); }
		public TerminalNode OpenParent() { return getToken(BeerParser.OpenParent, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseParent() { return getToken(BeerParser.CloseParent, 0); }
		public TerminalNode SemiColon() { return getToken(BeerParser.SemiColon, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(Print);
			setState(418);
			match(OpenParent);
			setState(419);
			expression(0);
			setState(420);
			match(CloseParent);
			setState(421);
			match(SemiColon);
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode Read() { return getToken(BeerParser.Read, 0); }
		public TerminalNode OpenParent() { return getToken(BeerParser.OpenParent, 0); }
		public TerminalNode Identifier() { return getToken(BeerParser.Identifier, 0); }
		public TerminalNode CloseParent() { return getToken(BeerParser.CloseParent, 0); }
		public TerminalNode SemiColon() { return getToken(BeerParser.SemiColon, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).exitRead(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(Read);
			setState(424);
			match(OpenParent);
			setState(425);
			match(Identifier);
			setState(426);
			match(CloseParent);
			setState(427);
			match(SemiColon);
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

	public static class TryExpressionContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(BeerParser.Try, 0); }
		public TerminalNode OpenBrace() { return getToken(BeerParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(BeerParser.CloseBrace, 0); }
		public CatchExpressionContext catchExpression() {
			return getRuleContext(CatchExpressionContext.class,0);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public TryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).enterTryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).exitTryExpression(this);
		}
	}

	public final TryExpressionContext tryExpression() throws RecognitionException {
		TryExpressionContext _localctx = new TryExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(Try);
			setState(430);
			match(OpenBrace);
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << OpenBrace) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(431);
				command();
				}
				}
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(437);
			match(CloseBrace);
			setState(438);
			catchExpression();
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

	public static class CatchExpressionContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(BeerParser.Catch, 0); }
		public TerminalNode OpenParent() { return getToken(BeerParser.OpenParent, 0); }
		public TerminalNode Identifier() { return getToken(BeerParser.Identifier, 0); }
		public TerminalNode CloseParent() { return getToken(BeerParser.CloseParent, 0); }
		public TerminalNode OpenBrace() { return getToken(BeerParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(BeerParser.CloseBrace, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public CatchExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).enterCatchExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).exitCatchExpression(this);
		}
	}

	public final CatchExpressionContext catchExpression() throws RecognitionException {
		CatchExpressionContext _localctx = new CatchExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_catchExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(Catch);
			setState(441);
			match(OpenParent);
			setState(442);
			match(Identifier);
			setState(443);
			match(CloseParent);
			setState(444);
			match(OpenBrace);
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << OpenBrace) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(445);
				command();
				}
				}
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(451);
			match(CloseBrace);
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

	public static class ThrowExpressionContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(BeerParser.Throw, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(BeerParser.SemiColon, 0); }
		public ThrowExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).enterThrowExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).exitThrowExpression(this);
		}
	}

	public final ThrowExpressionContext throwExpression() throws RecognitionException {
		ThrowExpressionContext _localctx = new ThrowExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_throwExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(Throw);
			setState(454);
			expression(0);
			setState(455);
			match(SemiColon);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode MultiLineComment() { return getToken(BeerParser.MultiLineComment, 0); }
		public TerminalNode SingleLineComment() { return getToken(BeerParser.SingleLineComment, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			_la = _input.LA(1);
			if ( !(_la==MultiLineComment || _la==SingleLineComment) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3P\u01ce\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\7\2B\n\2\f\2\16\2E\13\2\3\2\3\2\5\2I\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\7\4U\n\4\f\4\16\4X\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5b\n\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6j\n\6\f\6\16\6m\13\6\3\6\3\6\3\7\3"+
		"\7\7\7s\n\7\f\7\16\7v\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u0087\n\b\3\b\5\b\u008a\n\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u0092\n\t\3\t\3\t\3\t\3\t\5\t\u0098\n\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u009f\n\t\3\n\3\n\3\n\5\n\u00a4\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00ac"+
		"\n\n\f\n\16\n\u00af\13\n\3\n\3\n\3\13\3\13\3\13\7\13\u00b6\n\13\f\13\16"+
		"\13\u00b9\13\13\3\13\5\13\u00bc\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c4"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\7\r\u00cb\n\r\f\r\16\r\u00ce\13\r\3\r\5\r\u00d1"+
		"\n\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00e8\n\20\3\20\3\20\3\20"+
		"\3\20\7\20\u00ee\n\20\f\20\16\20\u00f1\13\20\3\21\3\21\3\21\3\21\7\21"+
		"\u00f7\n\21\f\21\16\21\u00fa\13\21\3\21\5\21\u00fd\n\21\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\7\23\u0107\n\23\f\23\16\23\u010a\13\23\3\23"+
		"\5\23\u010d\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0116\n\23\f"+
		"\23\16\23\u0119\13\23\3\23\5\23\u011c\n\23\3\23\5\23\u011f\n\23\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0129\n\25\f\25\16\25\u012c\13"+
		"\25\3\25\3\25\3\26\3\26\3\26\5\26\u0133\n\26\3\26\5\26\u0136\n\26\3\26"+
		"\3\26\5\26\u013a\n\26\3\26\3\26\3\26\7\26\u013f\n\26\f\26\16\26\u0142"+
		"\13\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u014d\n\26\f"+
		"\26\16\26\u0150\13\26\3\26\3\26\5\26\u0154\n\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\7\27\u015c\n\27\f\27\16\27\u015f\13\27\3\27\5\27\u0162\n\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\7\30\u016a\n\30\f\30\16\30\u016d\13\30\3"+
		"\31\3\31\3\31\7\31\u0172\n\31\f\31\16\31\u0175\13\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\7\32\u0180\n\32\f\32\16\32\u0183\13\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u018d\n\32\f\32\16\32\u0190"+
		"\13\32\3\32\3\32\7\32\u0194\n\32\f\32\16\32\u0197\13\32\3\32\3\32\3\32"+
		"\7\32\u019c\n\32\f\32\16\32\u019f\13\32\3\32\5\32\u01a2\n\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\7\35"+
		"\u01b3\n\35\f\35\16\35\u01b6\13\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\7\36\u01c1\n\36\f\36\16\36\u01c4\13\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \2\3\36!\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>\2\7\4\2\16\16\"&\4\2@CKK\4\2\24\25\27!\4\2()LL"+
		"\3\2\3\4\2\u01ec\2C\3\2\2\2\4L\3\2\2\2\6P\3\2\2\2\ba\3\2\2\2\nc\3\2\2"+
		"\2\fp\3\2\2\2\16\u0089\3\2\2\2\20\u009e\3\2\2\2\22\u00a0\3\2\2\2\24\u00bb"+
		"\3\2\2\2\26\u00c3\3\2\2\2\30\u00c5\3\2\2\2\32\u00d4\3\2\2\2\34\u00d6\3"+
		"\2\2\2\36\u00e7\3\2\2\2 \u00f2\3\2\2\2\"\u0100\3\2\2\2$\u011e\3\2\2\2"+
		"&\u0120\3\2\2\2(\u0122\3\2\2\2*\u0153\3\2\2\2,\u0155\3\2\2\2.\u0165\3"+
		"\2\2\2\60\u016e\3\2\2\2\62\u0178\3\2\2\2\64\u01a3\3\2\2\2\66\u01a9\3\2"+
		"\2\28\u01af\3\2\2\2:\u01ba\3\2\2\2<\u01c7\3\2\2\2>\u01cb\3\2\2\2@B\5\4"+
		"\3\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DH\3\2\2\2EC\3\2\2\2FI\5\6"+
		"\4\2GI\5\f\7\2HF\3\2\2\2HG\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7\2\2\3K\3\3"+
		"\2\2\2LM\7I\2\2MN\7L\2\2NO\7\f\2\2O\5\3\2\2\2PQ\7G\2\2QR\7K\2\2RV\7\n"+
		"\2\2SU\5\b\5\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2"+
		"\2\2YZ\7\13\2\2Z\7\3\2\2\2[\\\5\32\16\2\\]\7K\2\2]^\7\f\2\2^b\3\2\2\2"+
		"_b\5\22\n\2`b\5\n\6\2a[\3\2\2\2a_\3\2\2\2a`\3\2\2\2b\t\3\2\2\2cd\7K\2"+
		"\2de\7\b\2\2ef\5\24\13\2fg\7\t\2\2gk\7\n\2\2hj\5\16\b\2ih\3\2\2\2jm\3"+
		"\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7\13\2\2o\13\3\2\2\2"+
		"pt\7>\2\2qs\5\16\b\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2"+
		"vt\3\2\2\2wx\7?\2\2x\r\3\2\2\2y\u008a\5\20\t\2z\u008a\5(\25\2{\u008a\5"+
		"\62\32\2|\u008a\5*\26\2}\u008a\5,\27\2~\u008a\5\64\33\2\177\u008a\5\66"+
		"\34\2\u0080\u008a\58\35\2\u0081\u008a\5\22\n\2\u0082\u008a\5<\37\2\u0083"+
		"\u0087\7+\2\2\u0084\u0085\7\61\2\2\u0085\u0087\5\36\20\2\u0086\u0083\3"+
		"\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\7\f\2\2\u0089"+
		"y\3\2\2\2\u0089z\3\2\2\2\u0089{\3\2\2\2\u0089|\3\2\2\2\u0089}\3\2\2\2"+
		"\u0089~\3\2\2\2\u0089\177\3\2\2\2\u0089\u0080\3\2\2\2\u0089\u0081\3\2"+
		"\2\2\u0089\u0082\3\2\2\2\u0089\u0086\3\2\2\2\u008a\17\3\2\2\2\u008b\u008c"+
		"\5\36\20\2\u008c\u008d\7\f\2\2\u008d\u009f\3\2\2\2\u008e\u0091\5\26\f"+
		"\2\u008f\u0090\7\16\2\2\u0090\u0092\5\36\20\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\7\f\2\2\u0094\u009f\3\2"+
		"\2\2\u0095\u0096\78\2\2\u0096\u0098\7\21\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7K\2\2\u009a\u009b\t\2"+
		"\2\2\u009b\u009c\5\36\20\2\u009c\u009d\7\f\2\2\u009d\u009f\3\2\2\2\u009e"+
		"\u008b\3\2\2\2\u009e\u008e\3\2\2\2\u009e\u0097\3\2\2\2\u009f\21\3\2\2"+
		"\2\u00a0\u00a3\7\67\2\2\u00a1\u00a4\5\32\16\2\u00a2\u00a4\5\34\17\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\7K"+
		"\2\2\u00a6\u00a7\7\b\2\2\u00a7\u00a8\5\24\13\2\u00a8\u00a9\7\t\2\2\u00a9"+
		"\u00ad\7\n\2\2\u00aa\u00ac\5\16\b\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3"+
		"\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00b0\u00b1\7\13\2\2\u00b1\23\3\2\2\2\u00b2\u00b3\5\26"+
		"\f\2\u00b3\u00b4\7\r\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b6"+
		"\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2"+
		"\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bc\5\26\f\2\u00bb\u00b7\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\25\3\2\2\2\u00bd\u00be\5\32\16\2\u00be\u00bf\7K\2"+
		"\2\u00bf\u00c4\3\2\2\2\u00c0\u00c1\5\34\17\2\u00c1\u00c2\7K\2\2\u00c2"+
		"\u00c4\3\2\2\2\u00c3\u00bd\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c4\27\3\2\2"+
		"\2\u00c5\u00c6\7/\2\2\u00c6\u00c7\7K\2\2\u00c7\u00d0\7\b\2\2\u00c8\u00c9"+
		"\7K\2\2\u00c9\u00cb\7\r\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00cf\u00d1\7K\2\2\u00d0\u00cc\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d3\7\t\2\2\u00d3\31\3\2\2\2\u00d4\u00d5\t\3\2"+
		"\2\u00d5\33\3\2\2\2\u00d6\u00d7\7D\2\2\u00d7\u00d8\7\32\2\2\u00d8\u00d9"+
		"\7K\2\2\u00d9\u00da\7\33\2\2\u00da\35\3\2\2\2\u00db\u00dc\b\20\1\2\u00dc"+
		"\u00dd\7\26\2\2\u00dd\u00e8\5\36\20\n\u00de\u00df\7\b\2\2\u00df\u00e0"+
		"\5\36\20\2\u00e0\u00e1\7\t\2\2\u00e1\u00e8\3\2\2\2\u00e2\u00e8\5$\23\2"+
		"\u00e3\u00e8\5&\24\2\u00e4\u00e8\7K\2\2\u00e5\u00e8\5\30\r\2\u00e6\u00e8"+
		"\5 \21\2\u00e7\u00db\3\2\2\2\u00e7\u00de\3\2\2\2\u00e7\u00e2\3\2\2\2\u00e7"+
		"\u00e3\3\2\2\2\u00e7\u00e4\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2"+
		"\2\2\u00e8\u00ef\3\2\2\2\u00e9\u00ea\f\b\2\2\u00ea\u00eb\5\"\22\2\u00eb"+
		"\u00ec\5\36\20\t\u00ec\u00ee\3\2\2\2\u00ed\u00e9\3\2\2\2\u00ee\u00f1\3"+
		"\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\37\3\2\2\2\u00f1"+
		"\u00ef\3\2\2\2\u00f2\u00f8\7\n\2\2\u00f3\u00f4\5&\24\2\u00f4\u00f5\7\r"+
		"\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fb\u00fd\5&\24\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u00ff\7\13\2\2\u00ff!\3\2\2\2\u0100\u0101\t\4\2\2"+
		"\u0101#\3\2\2\2\u0102\u0103\7K\2\2\u0103\u010c\7\b\2\2\u0104\u0105\7K"+
		"\2\2\u0105\u0107\7\r\2\2\u0106\u0104\3\2\2\2\u0107\u010a\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0108\3\2"+
		"\2\2\u010b\u010d\7K\2\2\u010c\u0108\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u011f\7\t\2\2\u010f\u0110\7K\2\2\u0110\u0111\7\21"+
		"\2\2\u0111\u0112\7K\2\2\u0112\u011b\7\b\2\2\u0113\u0114\7K\2\2\u0114\u0116"+
		"\7\r\2\2\u0115\u0113\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011c\7K"+
		"\2\2\u011b\u0117\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011f\7\t\2\2\u011e\u0102\3\2\2\2\u011e\u010f\3\2\2\2\u011f%\3\2\2\2"+
		"\u0120\u0121\t\5\2\2\u0121\'\3\2\2\2\u0122\u0123\7\66\2\2\u0123\u0124"+
		"\7\b\2\2\u0124\u0125\5\36\20\2\u0125\u0126\7\t\2\2\u0126\u012a\7\n\2\2"+
		"\u0127\u0129\5\16\b\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128"+
		"\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d"+
		"\u012e\7\13\2\2\u012e)\3\2\2\2\u012f\u0130\7\64\2\2\u0130\u0132\7\b\2"+
		"\2\u0131\u0133\5\20\t\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0135\3\2\2\2\u0134\u0136\5\36\20\2\u0135\u0134\3\2\2\2\u0135\u0136\3"+
		"\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\7\f\2\2\u0138\u013a\5\20\t\2\u0139"+
		"\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\7\t"+
		"\2\2\u013c\u0140\7\n\2\2\u013d\u013f\5\16\b\2\u013e\u013d\3\2\2\2\u013f"+
		"\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2"+
		"\2\2\u0142\u0140\3\2\2\2\u0143\u0154\7\13\2\2\u0144\u0145\7\64\2\2\u0145"+
		"\u0146\7\b\2\2\u0146\u0147\5\26\f\2\u0147\u0148\7<\2\2\u0148\u0149\7K"+
		"\2\2\u0149\u014a\7\t\2\2\u014a\u014e\7\n\2\2\u014b\u014d\5\16\b\2\u014c"+
		"\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014f\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0152\7\13\2\2\u0152"+
		"\u0154\3\2\2\2\u0153\u012f\3\2\2\2\u0153\u0144\3\2\2\2\u0154+\3\2\2\2"+
		"\u0155\u0156\7\65\2\2\u0156\u0157\7\b\2\2\u0157\u0158\7K\2\2\u0158\u0159"+
		"\7\t\2\2\u0159\u015d\7\n\2\2\u015a\u015c\5.\30\2\u015b\u015a\3\2\2\2\u015c"+
		"\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0161\3\2"+
		"\2\2\u015f\u015d\3\2\2\2\u0160\u0162\5\60\31\2\u0161\u0160\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\7\13\2\2\u0164-\3\2\2\2"+
		"\u0165\u0166\7,\2\2\u0166\u0167\5\36\20\2\u0167\u016b\7\20\2\2\u0168\u016a"+
		"\5\16\b\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2"+
		"\u016b\u016c\3\2\2\2\u016c/\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u016f\7"+
		"9\2\2\u016f\u0173\7\n\2\2\u0170\u0172\5\16\b\2\u0171\u0170\3\2\2\2\u0172"+
		"\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2"+
		"\2\2\u0175\u0173\3\2\2\2\u0176\u0177\7\13\2\2\u0177\61\3\2\2\2\u0178\u0179"+
		"\7:\2\2\u0179\u017a\7\b\2\2\u017a\u017b\5\36\20\2\u017b\u017c\7\t\2\2"+
		"\u017c\u017d\7\17\2\2\u017d\u0181\7\n\2\2\u017e\u0180\5\16\b\2\u017f\u017e"+
		"\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"\u0184\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0195\7\13\2\2\u0185\u0186\7"+
		".\2\2\u0186\u0187\7\b\2\2\u0187\u0188\5\36\20\2\u0188\u0189\7\t\2\2\u0189"+
		"\u018a\7\17\2\2\u018a\u018e\7\n\2\2\u018b\u018d\5\16\b\2\u018c\u018b\3"+
		"\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\u0191\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0192\7\13\2\2\u0192\u0194\3"+
		"\2\2\2\u0193\u0185\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\u01a1\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u0199\7-"+
		"\2\2\u0199\u019d\7\n\2\2\u019a\u019c\5\16\b\2\u019b\u019a\3\2\2\2\u019c"+
		"\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a0\3\2"+
		"\2\2\u019f\u019d\3\2\2\2\u01a0\u01a2\7\13\2\2\u01a1\u0198\3\2\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2\63\3\2\2\2\u01a3\u01a4\7E\2\2\u01a4\u01a5\7\b\2\2"+
		"\u01a5\u01a6\5\36\20\2\u01a6\u01a7\7\t\2\2\u01a7\u01a8\7\f\2\2\u01a8\65"+
		"\3\2\2\2\u01a9\u01aa\7F\2\2\u01aa\u01ab\7\b\2\2\u01ab\u01ac\7K\2\2\u01ac"+
		"\u01ad\7\t\2\2\u01ad\u01ae\7\f\2\2\u01ae\67\3\2\2\2\u01af\u01b0\7=\2\2"+
		"\u01b0\u01b4\7\n\2\2\u01b1\u01b3\5\16\b\2\u01b2\u01b1\3\2\2\2\u01b3\u01b6"+
		"\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\3\2\2\2\u01b6"+
		"\u01b4\3\2\2\2\u01b7\u01b8\7\13\2\2\u01b8\u01b9\5:\36\2\u01b99\3\2\2\2"+
		"\u01ba\u01bb\7\60\2\2\u01bb\u01bc\7\b\2\2\u01bc\u01bd\7K\2\2\u01bd\u01be"+
		"\7\t\2\2\u01be\u01c2\7\n\2\2\u01bf\u01c1\5\16\b\2\u01c0\u01bf\3\2\2\2"+
		"\u01c1\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c5"+
		"\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c6\7\13\2\2\u01c6;\3\2\2\2\u01c7"+
		"\u01c8\7;\2\2\u01c8\u01c9\5\36\20\2\u01c9\u01ca\7\f\2\2\u01ca=\3\2\2\2"+
		"\u01cb\u01cc\t\6\2\2\u01cc?\3\2\2\2/CHVakt\u0086\u0089\u0091\u0097\u009e"+
		"\u00a3\u00ad\u00b7\u00bb\u00c3\u00cc\u00d0\u00e7\u00ef\u00f8\u00fc\u0108"+
		"\u010c\u0117\u011b\u011e\u012a\u0132\u0135\u0139\u0140\u014e\u0153\u015d"+
		"\u0161\u016b\u0173\u0181\u018e\u0195\u019d\u01a1\u01b4\u01c2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}