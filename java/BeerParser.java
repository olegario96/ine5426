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
		RULE_type = 12, RULE_typeArray = 13, RULE_expression = 14, RULE_binary = 15, 
		RULE_functionCall = 16, RULE_value = 17, RULE_whileExpression = 18, RULE_forExpression = 19, 
		RULE_switchExpression = 20, RULE_caseExpression = 21, RULE_defaultExpression = 22, 
		RULE_ifExpression = 23, RULE_print = 24, RULE_read = 25, RULE_tryExpression = 26, 
		RULE_catchExpression = 27, RULE_throwExpression = 28, RULE_comment = 29;
	public static final String[] ruleNames = {
		"program", "importExpression", "initClass", "method", "constructor", "begin", 
		"command", "simpleCommand", "function", "parameters", "declaration", "newObjectInit", 
		"type", "typeArray", "expression", "binary", "functionCall", "value", 
		"whileExpression", "forExpression", "switchExpression", "caseExpression", 
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
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Import) {
				{
				{
				setState(60);
				importExpression();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
				{
				setState(66);
				initClass();
				}
				break;
			case MainInit:
				{
				setState(67);
				begin();
				}
				break;
			case EOF:
				break;
			default:
				break;
			}
			setState(70);
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
			setState(72);
			match(Import);
			setState(73);
			match(StringLiteral);
			setState(74);
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
			setState(76);
			match(Class);
			setState(77);
			match(Identifier);
			setState(78);
			match(OpenBrace);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (Function - 53)) | (1L << (Int - 53)) | (1L << (Float - 53)) | (1L << (Boolean - 53)) | (1L << (String - 53)) | (1L << (Identifier - 53)))) != 0)) {
				{
				{
				setState(79);
				method();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
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
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				type();
				setState(88);
				match(Identifier);
				setState(89);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
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
			setState(95);
			match(Identifier);
			setState(96);
			match(OpenParent);
			setState(97);
			parameters();
			setState(98);
			match(CloseParent);
			setState(99);
			match(OpenBrace);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(100);
				command();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
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
			setState(108);
			match(MainInit);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(109);
				command();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
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
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenParent:
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
				setState(117);
				simpleCommand();
				}
				break;
			case While:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				whileExpression();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				ifExpression();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				forExpression();
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 5);
				{
				setState(121);
				switchExpression();
				}
				break;
			case Print:
				enterOuterAlt(_localctx, 6);
				{
				setState(122);
				print();
				}
				break;
			case Read:
				enterOuterAlt(_localctx, 7);
				{
				setState(123);
				read();
				}
				break;
			case Try:
				enterOuterAlt(_localctx, 8);
				{
				setState(124);
				tryExpression();
				}
				break;
			case Function:
				enterOuterAlt(_localctx, 9);
				{
				setState(125);
				function();
				}
				break;
			case Throw:
				enterOuterAlt(_localctx, 10);
				{
				setState(126);
				throwExpression();
				}
				break;
			case Break:
			case Return:
				enterOuterAlt(_localctx, 11);
				{
				setState(130);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Break:
					{
					setState(127);
					match(Break);
					}
					break;
				case Return:
					{
					setState(128);
					match(Return);
					setState(129);
					expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(132);
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
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				expression(0);
				setState(136);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				declaration();
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(139);
					match(Assign);
					setState(140);
					expression(0);
					}
				}

				setState(143);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==This) {
					{
					setState(145);
					match(This);
					setState(146);
					match(Dot);
					}
				}

				setState(149);
				match(Identifier);
				setState(150);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Assign) | (1L << MultiplyAssign) | (1L << DivideAssign) | (1L << ModulusAssign) | (1L << PlusAssign) | (1L << MinusAssign))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(151);
				expression(0);
				setState(152);
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
			setState(156);
			match(Function);
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Float:
			case Boolean:
			case String:
			case Identifier:
				{
				setState(157);
				type();
				}
				break;
			case Array:
				{
				setState(158);
				typeArray();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(161);
			match(Identifier);
			setState(162);
			match(OpenParent);
			setState(163);
			parameters();
			setState(164);
			match(CloseParent);
			setState(165);
			match(OpenBrace);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(166);
				command();
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
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
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (Int - 62)) | (1L << (Float - 62)) | (1L << (Boolean - 62)) | (1L << (String - 62)) | (1L << (Array - 62)) | (1L << (Identifier - 62)))) != 0)) {
				{
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(174);
						declaration();
						setState(175);
						match(Comma);
						}
						} 
					}
					setState(181);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(182);
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
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Float:
			case Boolean:
			case String:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				type();
				setState(186);
				match(Identifier);
				}
				break;
			case Array:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				typeArray();
				setState(189);
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
		public TerminalNode Array() { return getToken(BeerParser.Array, 0); }
		public TerminalNode LessThan() { return getToken(BeerParser.LessThan, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode MoreThan() { return getToken(BeerParser.MoreThan, 0); }
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
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(New);
				setState(194);
				match(Identifier);
				setState(195);
				match(OpenParent);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(200);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(196);
							match(Identifier);
							setState(197);
							match(Comma);
							}
							} 
						}
						setState(202);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
					}
					setState(203);
					match(Identifier);
					}
				}

				setState(206);
				match(CloseParent);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(New);
				setState(208);
				match(Array);
				setState(209);
				match(LessThan);
				setState(210);
				type();
				setState(211);
				match(MoreThan);
				setState(212);
				match(OpenParent);
				setState(213);
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
			setState(217);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
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
			setState(219);
			match(Array);
			setState(220);
			match(LessThan);
			setState(221);
			type();
			setState(222);
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
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(225);
				match(Not);
				setState(226);
				expression(7);
				}
				break;
			case 2:
				{
				setState(227);
				match(OpenParent);
				setState(228);
				expression(0);
				setState(229);
				match(CloseParent);
				}
				break;
			case 3:
				{
				setState(231);
				functionCall();
				}
				break;
			case 4:
				{
				setState(232);
				value();
				}
				break;
			case 5:
				{
				setState(233);
				match(Identifier);
				}
				break;
			case 6:
				{
				setState(234);
				newObjectInit();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(237);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(238);
					binary();
					setState(239);
					expression(6);
					}
					} 
				}
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		enterRule(_localctx, 30, RULE_binary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
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
		enterRule(_localctx, 32, RULE_functionCall);
		int _la;
		try {
			int _alt;
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(Identifier);
				setState(249);
				match(OpenParent);
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(254);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(250);
							match(Identifier);
							setState(251);
							match(Comma);
							}
							} 
						}
						setState(256);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
					}
					setState(257);
					match(Identifier);
					}
				}

				setState(260);
				match(CloseParent);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				match(Identifier);
				setState(262);
				match(Dot);
				setState(263);
				match(Identifier);
				setState(264);
				match(OpenParent);
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(269);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(265);
							match(Identifier);
							setState(266);
							match(Comma);
							}
							} 
						}
						setState(271);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
					}
					setState(272);
					match(Identifier);
					}
				}

				setState(275);
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
		enterRule(_localctx, 34, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
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
		enterRule(_localctx, 36, RULE_whileExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(While);
			setState(281);
			match(OpenParent);
			setState(282);
			expression(0);
			setState(283);
			match(CloseParent);
			setState(284);
			match(OpenBrace);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(285);
				command();
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(291);
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
		public List<TerminalNode> SemiColon() { return getTokens(BeerParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(BeerParser.SemiColon, i);
		}
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
		enterRule(_localctx, 38, RULE_forExpression);
		int _la;
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				match(For);
				setState(294);
				match(OpenParent);
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << New) | (1L << This) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(295);
					simpleCommand();
					}
				}

				setState(298);
				match(SemiColon);
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << New))) != 0) || _la==Identifier || _la==StringLiteral) {
					{
					setState(299);
					expression(0);
					}
				}

				setState(302);
				match(SemiColon);
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << New) | (1L << This) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(303);
					simpleCommand();
					}
				}

				setState(306);
				match(CloseParent);
				setState(307);
				match(OpenBrace);
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					{
					setState(308);
					command();
					}
					}
					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(314);
				match(CloseBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				match(For);
				setState(316);
				match(OpenParent);
				setState(317);
				declaration();
				setState(318);
				match(In);
				setState(319);
				match(Identifier);
				setState(320);
				match(CloseParent);
				setState(321);
				match(OpenBrace);
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					{
					setState(322);
					command();
					}
					}
					setState(327);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(328);
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
		enterRule(_localctx, 40, RULE_switchExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(Switch);
			setState(333);
			match(OpenParent);
			setState(334);
			match(Identifier);
			setState(335);
			match(CloseParent);
			setState(336);
			match(OpenBrace);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Case) {
				{
				{
				setState(337);
				caseExpression();
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Default) {
				{
				setState(343);
				defaultExpression();
				}
			}

			setState(346);
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
		enterRule(_localctx, 42, RULE_caseExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(Case);
			setState(349);
			expression(0);
			setState(350);
			match(Colon);
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(351);
				command();
				}
				}
				setState(356);
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
		enterRule(_localctx, 44, RULE_defaultExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(Default);
			setState(358);
			match(OpenBrace);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(359);
				command();
				}
				}
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(365);
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
		enterRule(_localctx, 46, RULE_ifExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(If);
			setState(368);
			match(OpenParent);
			setState(369);
			expression(0);
			setState(370);
			match(CloseParent);
			setState(371);
			match(QuestionMark);
			setState(372);
			match(OpenBrace);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(373);
				command();
				}
				}
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(379);
			match(CloseBrace);
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ElseIf) {
				{
				{
				setState(380);
				match(ElseIf);
				setState(381);
				match(OpenParent);
				setState(382);
				expression(0);
				setState(383);
				match(CloseParent);
				setState(384);
				match(QuestionMark);
				setState(385);
				match(OpenBrace);
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					{
					setState(386);
					command();
					}
					}
					setState(391);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(392);
				match(CloseBrace);
				}
				}
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(399);
				match(Else);
				setState(400);
				match(OpenBrace);
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					{
					setState(401);
					command();
					}
					}
					setState(406);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(407);
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
		enterRule(_localctx, 48, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(Print);
			setState(411);
			match(OpenParent);
			setState(412);
			expression(0);
			setState(413);
			match(CloseParent);
			setState(414);
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
		enterRule(_localctx, 50, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(Read);
			setState(417);
			match(OpenParent);
			setState(418);
			match(Identifier);
			setState(419);
			match(CloseParent);
			setState(420);
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
		enterRule(_localctx, 52, RULE_tryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(Try);
			setState(423);
			match(OpenBrace);
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(424);
				command();
				}
				}
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(430);
			match(CloseBrace);
			setState(431);
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
		enterRule(_localctx, 54, RULE_catchExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(Catch);
			setState(434);
			match(OpenParent);
			setState(435);
			match(Identifier);
			setState(436);
			match(CloseParent);
			setState(437);
			match(OpenBrace);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(438);
				command();
				}
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(444);
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
		enterRule(_localctx, 56, RULE_throwExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(Throw);
			setState(447);
			expression(0);
			setState(448);
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
		enterRule(_localctx, 58, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
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
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3P\u01c7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\2\3\2\5\2G\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\7\4S\n\4\f\4\16\4V\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5`\n"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6h\n\6\f\6\16\6k\13\6\3\6\3\6\3\7\3\7\7\7"+
		"q\n\7\f\7\16\7t\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u0085\n\b\3\b\5\b\u0088\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u0090\n\t\3\t\3\t\3\t\3\t\5\t\u0096\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u009d"+
		"\n\t\3\n\3\n\3\n\5\n\u00a2\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00aa\n\n\f"+
		"\n\16\n\u00ad\13\n\3\n\3\n\3\13\3\13\3\13\7\13\u00b4\n\13\f\13\16\13\u00b7"+
		"\13\13\3\13\5\13\u00ba\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c2\n\f\3\r"+
		"\3\r\3\r\3\r\3\r\7\r\u00c9\n\r\f\r\16\r\u00cc\13\r\3\r\5\r\u00cf\n\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00da\n\r\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5"+
		"\20\u00ee\n\20\3\20\3\20\3\20\3\20\7\20\u00f4\n\20\f\20\16\20\u00f7\13"+
		"\20\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u00ff\n\22\f\22\16\22\u0102\13"+
		"\22\3\22\5\22\u0105\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u010e"+
		"\n\22\f\22\16\22\u0111\13\22\3\22\5\22\u0114\n\22\3\22\5\22\u0117\n\22"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0121\n\24\f\24\16\24\u0124"+
		"\13\24\3\24\3\24\3\25\3\25\3\25\5\25\u012b\n\25\3\25\3\25\5\25\u012f\n"+
		"\25\3\25\3\25\5\25\u0133\n\25\3\25\3\25\3\25\7\25\u0138\n\25\f\25\16\25"+
		"\u013b\13\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0146\n"+
		"\25\f\25\16\25\u0149\13\25\3\25\3\25\5\25\u014d\n\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\7\26\u0155\n\26\f\26\16\26\u0158\13\26\3\26\5\26\u015b\n"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u0163\n\27\f\27\16\27\u0166\13"+
		"\27\3\30\3\30\3\30\7\30\u016b\n\30\f\30\16\30\u016e\13\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0179\n\31\f\31\16\31\u017c\13"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0186\n\31\f\31\16\31"+
		"\u0189\13\31\3\31\3\31\7\31\u018d\n\31\f\31\16\31\u0190\13\31\3\31\3\31"+
		"\3\31\7\31\u0195\n\31\f\31\16\31\u0198\13\31\3\31\5\31\u019b\n\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\7\34\u01ac\n\34\f\34\16\34\u01af\13\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\7\35\u01ba\n\35\f\35\16\35\u01bd\13\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\2\3\36 \2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<\2\7\4\2\16\16\"&\4\2@CKK\4\2\24\25\27!"+
		"\4\2()LL\3\2\3\4\2\u01e4\2A\3\2\2\2\4J\3\2\2\2\6N\3\2\2\2\b_\3\2\2\2\n"+
		"a\3\2\2\2\fn\3\2\2\2\16\u0087\3\2\2\2\20\u009c\3\2\2\2\22\u009e\3\2\2"+
		"\2\24\u00b9\3\2\2\2\26\u00c1\3\2\2\2\30\u00d9\3\2\2\2\32\u00db\3\2\2\2"+
		"\34\u00dd\3\2\2\2\36\u00ed\3\2\2\2 \u00f8\3\2\2\2\"\u0116\3\2\2\2$\u0118"+
		"\3\2\2\2&\u011a\3\2\2\2(\u014c\3\2\2\2*\u014e\3\2\2\2,\u015e\3\2\2\2."+
		"\u0167\3\2\2\2\60\u0171\3\2\2\2\62\u019c\3\2\2\2\64\u01a2\3\2\2\2\66\u01a8"+
		"\3\2\2\28\u01b3\3\2\2\2:\u01c0\3\2\2\2<\u01c4\3\2\2\2>@\5\4\3\2?>\3\2"+
		"\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BF\3\2\2\2CA\3\2\2\2DG\5\6\4\2EG\5\f"+
		"\7\2FD\3\2\2\2FE\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\7\2\2\3I\3\3\2\2\2JK\7"+
		"I\2\2KL\7L\2\2LM\7\f\2\2M\5\3\2\2\2NO\7G\2\2OP\7K\2\2PT\7\n\2\2QS\5\b"+
		"\5\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7\13"+
		"\2\2X\7\3\2\2\2YZ\5\32\16\2Z[\7K\2\2[\\\7\f\2\2\\`\3\2\2\2]`\5\22\n\2"+
		"^`\5\n\6\2_Y\3\2\2\2_]\3\2\2\2_^\3\2\2\2`\t\3\2\2\2ab\7K\2\2bc\7\b\2\2"+
		"cd\5\24\13\2de\7\t\2\2ei\7\n\2\2fh\5\16\b\2gf\3\2\2\2hk\3\2\2\2ig\3\2"+
		"\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7\13\2\2m\13\3\2\2\2nr\7>\2\2oq\5"+
		"\16\b\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv"+
		"\7?\2\2v\r\3\2\2\2w\u0088\5\20\t\2x\u0088\5&\24\2y\u0088\5\60\31\2z\u0088"+
		"\5(\25\2{\u0088\5*\26\2|\u0088\5\62\32\2}\u0088\5\64\33\2~\u0088\5\66"+
		"\34\2\177\u0088\5\22\n\2\u0080\u0088\5:\36\2\u0081\u0085\7+\2\2\u0082"+
		"\u0083\7\61\2\2\u0083\u0085\5\36\20\2\u0084\u0081\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\7\f\2\2\u0087w\3\2\2\2\u0087"+
		"x\3\2\2\2\u0087y\3\2\2\2\u0087z\3\2\2\2\u0087{\3\2\2\2\u0087|\3\2\2\2"+
		"\u0087}\3\2\2\2\u0087~\3\2\2\2\u0087\177\3\2\2\2\u0087\u0080\3\2\2\2\u0087"+
		"\u0084\3\2\2\2\u0088\17\3\2\2\2\u0089\u008a\5\36\20\2\u008a\u008b\7\f"+
		"\2\2\u008b\u009d\3\2\2\2\u008c\u008f\5\26\f\2\u008d\u008e\7\16\2\2\u008e"+
		"\u0090\5\36\20\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3"+
		"\2\2\2\u0091\u0092\7\f\2\2\u0092\u009d\3\2\2\2\u0093\u0094\78\2\2\u0094"+
		"\u0096\7\21\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3"+
		"\2\2\2\u0097\u0098\7K\2\2\u0098\u0099\t\2\2\2\u0099\u009a\5\36\20\2\u009a"+
		"\u009b\7\f\2\2\u009b\u009d\3\2\2\2\u009c\u0089\3\2\2\2\u009c\u008c\3\2"+
		"\2\2\u009c\u0095\3\2\2\2\u009d\21\3\2\2\2\u009e\u00a1\7\67\2\2\u009f\u00a2"+
		"\5\32\16\2\u00a0\u00a2\5\34\17\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2"+
		"\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7K\2\2\u00a4\u00a5\7\b\2\2\u00a5\u00a6"+
		"\5\24\13\2\u00a6\u00a7\7\t\2\2\u00a7\u00ab\7\n\2\2\u00a8\u00aa\5\16\b"+
		"\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\7\13\2\2"+
		"\u00af\23\3\2\2\2\u00b0\u00b1\5\26\f\2\u00b1\u00b2\7\r\2\2\u00b2\u00b4"+
		"\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00ba\5\26"+
		"\f\2\u00b9\u00b5\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\25\3\2\2\2\u00bb\u00bc"+
		"\5\32\16\2\u00bc\u00bd\7K\2\2\u00bd\u00c2\3\2\2\2\u00be\u00bf\5\34\17"+
		"\2\u00bf\u00c0\7K\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bb\3\2\2\2\u00c1\u00be"+
		"\3\2\2\2\u00c2\27\3\2\2\2\u00c3\u00c4\7/\2\2\u00c4\u00c5\7K\2\2\u00c5"+
		"\u00ce\7\b\2\2\u00c6\u00c7\7K\2\2\u00c7\u00c9\7\r\2\2\u00c8\u00c6\3\2"+
		"\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00cf\7K\2\2\u00ce\u00ca\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00da\7\t\2\2\u00d1"+
		"\u00d2\7/\2\2\u00d2\u00d3\7D\2\2\u00d3\u00d4\7\32\2\2\u00d4\u00d5\5\32"+
		"\16\2\u00d5\u00d6\7\33\2\2\u00d6\u00d7\7\b\2\2\u00d7\u00d8\7\t\2\2\u00d8"+
		"\u00da\3\2\2\2\u00d9\u00c3\3\2\2\2\u00d9\u00d1\3\2\2\2\u00da\31\3\2\2"+
		"\2\u00db\u00dc\t\3\2\2\u00dc\33\3\2\2\2\u00dd\u00de\7D\2\2\u00de\u00df"+
		"\7\32\2\2\u00df\u00e0\5\32\16\2\u00e0\u00e1\7\33\2\2\u00e1\35\3\2\2\2"+
		"\u00e2\u00e3\b\20\1\2\u00e3\u00e4\7\26\2\2\u00e4\u00ee\5\36\20\t\u00e5"+
		"\u00e6\7\b\2\2\u00e6\u00e7\5\36\20\2\u00e7\u00e8\7\t\2\2\u00e8\u00ee\3"+
		"\2\2\2\u00e9\u00ee\5\"\22\2\u00ea\u00ee\5$\23\2\u00eb\u00ee\7K\2\2\u00ec"+
		"\u00ee\5\30\r\2\u00ed\u00e2\3\2\2\2\u00ed\u00e5\3\2\2\2\u00ed\u00e9\3"+
		"\2\2\2\u00ed\u00ea\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee"+
		"\u00f5\3\2\2\2\u00ef\u00f0\f\7\2\2\u00f0\u00f1\5 \21\2\u00f1\u00f2\5\36"+
		"\20\b\u00f2\u00f4\3\2\2\2\u00f3\u00ef\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\37\3\2\2\2\u00f7\u00f5\3\2\2"+
		"\2\u00f8\u00f9\t\4\2\2\u00f9!\3\2\2\2\u00fa\u00fb\7K\2\2\u00fb\u0104\7"+
		"\b\2\2\u00fc\u00fd\7K\2\2\u00fd\u00ff\7\r\2\2\u00fe\u00fc\3\2\2\2\u00ff"+
		"\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2"+
		"\2\2\u0102\u0100\3\2\2\2\u0103\u0105\7K\2\2\u0104\u0100\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0117\7\t\2\2\u0107\u0108\7K"+
		"\2\2\u0108\u0109\7\21\2\2\u0109\u010a\7K\2\2\u010a\u0113\7\b\2\2\u010b"+
		"\u010c\7K\2\2\u010c\u010e\7\r\2\2\u010d\u010b\3\2\2\2\u010e\u0111\3\2"+
		"\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0112\u0114\7K\2\2\u0113\u010f\3\2\2\2\u0113\u0114\3\2"+
		"\2\2\u0114\u0115\3\2\2\2\u0115\u0117\7\t\2\2\u0116\u00fa\3\2\2\2\u0116"+
		"\u0107\3\2\2\2\u0117#\3\2\2\2\u0118\u0119\t\5\2\2\u0119%\3\2\2\2\u011a"+
		"\u011b\7\66\2\2\u011b\u011c\7\b\2\2\u011c\u011d\5\36\20\2\u011d\u011e"+
		"\7\t\2\2\u011e\u0122\7\n\2\2\u011f\u0121\5\16\b\2\u0120\u011f\3\2\2\2"+
		"\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125"+
		"\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\7\13\2\2\u0126\'\3\2\2\2\u0127"+
		"\u0128\7\64\2\2\u0128\u012a\7\b\2\2\u0129\u012b\5\20\t\2\u012a\u0129\3"+
		"\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\7\f\2\2\u012d"+
		"\u012f\5\36\20\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3"+
		"\2\2\2\u0130\u0132\7\f\2\2\u0131\u0133\5\20\t\2\u0132\u0131\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\7\t\2\2\u0135\u0139\7\n"+
		"\2\2\u0136\u0138\5\16\b\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2"+
		"\2\2\u013c\u014d\7\13\2\2\u013d\u013e\7\64\2\2\u013e\u013f\7\b\2\2\u013f"+
		"\u0140\5\26\f\2\u0140\u0141\7<\2\2\u0141\u0142\7K\2\2\u0142\u0143\7\t"+
		"\2\2\u0143\u0147\7\n\2\2\u0144\u0146\5\16\b\2\u0145\u0144\3\2\2\2\u0146"+
		"\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2"+
		"\2\2\u0149\u0147\3\2\2\2\u014a\u014b\7\13\2\2\u014b\u014d\3\2\2\2\u014c"+
		"\u0127\3\2\2\2\u014c\u013d\3\2\2\2\u014d)\3\2\2\2\u014e\u014f\7\65\2\2"+
		"\u014f\u0150\7\b\2\2\u0150\u0151\7K\2\2\u0151\u0152\7\t\2\2\u0152\u0156"+
		"\7\n\2\2\u0153\u0155\5,\27\2\u0154\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2"+
		"\2\2\u0159\u015b\5.\30\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u015c\3\2\2\2\u015c\u015d\7\13\2\2\u015d+\3\2\2\2\u015e\u015f\7,\2\2"+
		"\u015f\u0160\5\36\20\2\u0160\u0164\7\20\2\2\u0161\u0163\5\16\b\2\u0162"+
		"\u0161\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2"+
		"\2\2\u0165-\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0168\79\2\2\u0168\u016c"+
		"\7\n\2\2\u0169\u016b\5\16\b\2\u016a\u0169\3\2\2\2\u016b\u016e\3\2\2\2"+
		"\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f\3\2\2\2\u016e\u016c"+
		"\3\2\2\2\u016f\u0170\7\13\2\2\u0170/\3\2\2\2\u0171\u0172\7:\2\2\u0172"+
		"\u0173\7\b\2\2\u0173\u0174\5\36\20\2\u0174\u0175\7\t\2\2\u0175\u0176\7"+
		"\17\2\2\u0176\u017a\7\n\2\2\u0177\u0179\5\16\b\2\u0178\u0177\3\2\2\2\u0179"+
		"\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3\2"+
		"\2\2\u017c\u017a\3\2\2\2\u017d\u018e\7\13\2\2\u017e\u017f\7.\2\2\u017f"+
		"\u0180\7\b\2\2\u0180\u0181\5\36\20\2\u0181\u0182\7\t\2\2\u0182\u0183\7"+
		"\17\2\2\u0183\u0187\7\n\2\2\u0184\u0186\5\16\b\2\u0185\u0184\3\2\2\2\u0186"+
		"\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a\3\2"+
		"\2\2\u0189\u0187\3\2\2\2\u018a\u018b\7\13\2\2\u018b\u018d\3\2\2\2\u018c"+
		"\u017e\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2"+
		"\2\2\u018f\u019a\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0192\7-\2\2\u0192"+
		"\u0196\7\n\2\2\u0193\u0195\5\16\b\2\u0194\u0193\3\2\2\2\u0195\u0198\3"+
		"\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0199\3\2\2\2\u0198"+
		"\u0196\3\2\2\2\u0199\u019b\7\13\2\2\u019a\u0191\3\2\2\2\u019a\u019b\3"+
		"\2\2\2\u019b\61\3\2\2\2\u019c\u019d\7E\2\2\u019d\u019e\7\b\2\2\u019e\u019f"+
		"\5\36\20\2\u019f\u01a0\7\t\2\2\u01a0\u01a1\7\f\2\2\u01a1\63\3\2\2\2\u01a2"+
		"\u01a3\7F\2\2\u01a3\u01a4\7\b\2\2\u01a4\u01a5\7K\2\2\u01a5\u01a6\7\t\2"+
		"\2\u01a6\u01a7\7\f\2\2\u01a7\65\3\2\2\2\u01a8\u01a9\7=\2\2\u01a9\u01ad"+
		"\7\n\2\2\u01aa\u01ac\5\16\b\2\u01ab\u01aa\3\2\2\2\u01ac\u01af\3\2\2\2"+
		"\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b0\3\2\2\2\u01af\u01ad"+
		"\3\2\2\2\u01b0\u01b1\7\13\2\2\u01b1\u01b2\58\35\2\u01b2\67\3\2\2\2\u01b3"+
		"\u01b4\7\60\2\2\u01b4\u01b5\7\b\2\2\u01b5\u01b6\7K\2\2\u01b6\u01b7\7\t"+
		"\2\2\u01b7\u01bb\7\n\2\2\u01b8\u01ba\5\16\b\2\u01b9\u01b8\3\2\2\2\u01ba"+
		"\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01be\3\2"+
		"\2\2\u01bd\u01bb\3\2\2\2\u01be\u01bf\7\13\2\2\u01bf9\3\2\2\2\u01c0\u01c1"+
		"\7;\2\2\u01c1\u01c2\5\36\20\2\u01c2\u01c3\7\f\2\2\u01c3;\3\2\2\2\u01c4"+
		"\u01c5\t\6\2\2\u01c5=\3\2\2\2.AFT_ir\u0084\u0087\u008f\u0095\u009c\u00a1"+
		"\u00ab\u00b5\u00b9\u00c1\u00ca\u00ce\u00d9\u00ed\u00f5\u0100\u0104\u010f"+
		"\u0113\u0116\u0122\u012a\u012e\u0132\u0139\u0147\u014c\u0156\u015a\u0164"+
		"\u016c\u017a\u0187\u018e\u0196\u019a\u01ad\u01bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}