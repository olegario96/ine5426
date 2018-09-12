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
		RULE_program = 0, RULE_importExpression = 1, RULE_initClass = 2, RULE_begin = 3, 
		RULE_command = 4, RULE_simpleCommand = 5, RULE_function = 6, RULE_parameters = 7, 
		RULE_declaration = 8, RULE_newObjectInit = 9, RULE_type = 10, RULE_typeArray = 11, 
		RULE_expression = 12, RULE_binary = 13, RULE_functionCall = 14, RULE_value = 15, 
		RULE_whileExpression = 16, RULE_forExpression = 17, RULE_switchExpression = 18, 
		RULE_caseExpression = 19, RULE_defaultExpression = 20, RULE_ifExpression = 21, 
		RULE_print = 22, RULE_read = 23, RULE_tryExpression = 24, RULE_catchExpression = 25, 
		RULE_throwExpression = 26, RULE_comment = 27;
	public static final String[] ruleNames = {
		"program", "importExpression", "initClass", "begin", "command", "simpleCommand", 
		"function", "parameters", "declaration", "newObjectInit", "type", "typeArray", 
		"expression", "binary", "functionCall", "value", "whileExpression", "forExpression", 
		"switchExpression", "caseExpression", "defaultExpression", "ifExpression", 
		"print", "read", "tryExpression", "catchExpression", "throwExpression", 
		"comment"
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
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Import) {
				{
				{
				setState(56);
				importExpression();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
				{
				setState(62);
				initClass();
				}
				break;
			case MainInit:
				{
				setState(63);
				begin();
				}
				break;
			case EOF:
				break;
			default:
				break;
			}
			setState(66);
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
			setState(68);
			match(Import);
			setState(69);
			match(StringLiteral);
			setState(70);
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
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
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
			setState(72);
			match(Class);
			setState(73);
			match(Identifier);
			setState(74);
			match(OpenBrace);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(75);
				command();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
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
		enterRule(_localctx, 6, RULE_begin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(MainInit);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(84);
				command();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
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
		enterRule(_localctx, 8, RULE_command);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenParent:
			case Not:
			case BooleanLiteral:
			case DecimalLiteral:
			case New:
			case Int:
			case Float:
			case Boolean:
			case String:
			case Array:
			case Identifier:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				simpleCommand();
				}
				break;
			case While:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				whileExpression();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				ifExpression();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				forExpression();
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				switchExpression();
				}
				break;
			case Print:
				enterOuterAlt(_localctx, 6);
				{
				setState(97);
				print();
				}
				break;
			case Read:
				enterOuterAlt(_localctx, 7);
				{
				setState(98);
				read();
				}
				break;
			case Try:
				enterOuterAlt(_localctx, 8);
				{
				setState(99);
				tryExpression();
				}
				break;
			case Function:
				enterOuterAlt(_localctx, 9);
				{
				setState(100);
				function();
				}
				break;
			case Throw:
				enterOuterAlt(_localctx, 10);
				{
				setState(101);
				throwExpression();
				}
				break;
			case Break:
			case Return:
				enterOuterAlt(_localctx, 11);
				{
				setState(105);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Break:
					{
					setState(102);
					match(Break);
					}
					break;
				case Return:
					{
					setState(103);
					match(Return);
					setState(104);
					expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(107);
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
		enterRule(_localctx, 10, RULE_simpleCommand);
		int _la;
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				expression(0);
				setState(111);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				declaration();
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(114);
					match(Assign);
					setState(115);
					expression(0);
					}
				}

				setState(118);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(Identifier);
				setState(121);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Assign) | (1L << MultiplyAssign) | (1L << DivideAssign) | (1L << ModulusAssign) | (1L << PlusAssign) | (1L << MinusAssign))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(122);
				expression(0);
				setState(123);
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
		enterRule(_localctx, 12, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(Function);
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Float:
			case Boolean:
			case String:
			case Identifier:
				{
				setState(128);
				type();
				}
				break;
			case Array:
				{
				setState(129);
				typeArray();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(132);
			match(Identifier);
			setState(133);
			match(OpenParent);
			setState(134);
			parameters();
			setState(135);
			match(CloseParent);
			setState(136);
			match(OpenBrace);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(137);
				command();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
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
		enterRule(_localctx, 14, RULE_parameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (Int - 62)) | (1L << (Float - 62)) | (1L << (Boolean - 62)) | (1L << (String - 62)) | (1L << (Array - 62)) | (1L << (Identifier - 62)))) != 0)) {
				{
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(145);
						declaration();
						setState(146);
						match(Comma);
						}
						} 
					}
					setState(152);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(153);
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
		enterRule(_localctx, 16, RULE_declaration);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Float:
			case Boolean:
			case String:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				type();
				setState(157);
				match(Identifier);
				}
				break;
			case Array:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				typeArray();
				setState(160);
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
		enterRule(_localctx, 18, RULE_newObjectInit);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(New);
			setState(165);
			match(Identifier);
			setState(166);
			match(OpenParent);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(167);
						match(Identifier);
						setState(168);
						match(Comma);
						}
						} 
					}
					setState(173);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(174);
				match(Identifier);
				}
			}

			setState(177);
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
		enterRule(_localctx, 20, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
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
		enterRule(_localctx, 22, RULE_typeArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(Array);
			setState(182);
			match(LessThan);
			setState(183);
			type();
			setState(184);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(187);
				match(Not);
				setState(188);
				expression(7);
				}
				break;
			case 2:
				{
				setState(189);
				match(OpenParent);
				setState(190);
				expression(0);
				setState(191);
				match(CloseParent);
				}
				break;
			case 3:
				{
				setState(193);
				functionCall();
				}
				break;
			case 4:
				{
				setState(194);
				value();
				}
				break;
			case 5:
				{
				setState(195);
				match(Identifier);
				}
				break;
			case 6:
				{
				setState(196);
				newObjectInit();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(199);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(200);
					binary();
					setState(201);
					expression(6);
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		enterRule(_localctx, 26, RULE_binary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
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
		enterRule(_localctx, 28, RULE_functionCall);
		int _la;
		try {
			int _alt;
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(Identifier);
				setState(211);
				match(OpenParent);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(216);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(212);
							match(Identifier);
							setState(213);
							match(Comma);
							}
							} 
						}
						setState(218);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
					}
					setState(219);
					match(Identifier);
					}
				}

				setState(222);
				match(CloseParent);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(Identifier);
				setState(224);
				match(Dot);
				setState(225);
				match(Identifier);
				setState(226);
				match(OpenParent);
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(231);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(227);
							match(Identifier);
							setState(228);
							match(Comma);
							}
							} 
						}
						setState(233);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
					}
					setState(234);
					match(Identifier);
					}
				}

				setState(237);
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
		enterRule(_localctx, 30, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
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
		enterRule(_localctx, 32, RULE_whileExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(While);
			setState(243);
			match(OpenParent);
			setState(244);
			expression(0);
			setState(245);
			match(CloseParent);
			setState(246);
			match(OpenBrace);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(247);
				command();
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253);
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
		enterRule(_localctx, 34, RULE_forExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(For);
			setState(256);
			match(OpenParent);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << New) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				setState(257);
				simpleCommand();
				}
			}

			setState(260);
			match(SemiColon);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << New))) != 0) || _la==Identifier || _la==StringLiteral) {
				{
				setState(261);
				expression(0);
				}
			}

			setState(264);
			match(SemiColon);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << New) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				setState(265);
				simpleCommand();
				}
			}

			setState(268);
			match(CloseParent);
			setState(269);
			match(OpenBrace);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(270);
				command();
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276);
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

	public static class SwitchExpressionContext extends ParserRuleContext {
		public TerminalNode Switch() { return getToken(BeerParser.Switch, 0); }
		public TerminalNode OpenParent() { return getToken(BeerParser.OpenParent, 0); }
		public TerminalNode Identifier() { return getToken(BeerParser.Identifier, 0); }
		public TerminalNode CloseParent() { return getToken(BeerParser.CloseParent, 0); }
		public TerminalNode OpenBrace() { return getToken(BeerParser.OpenBrace, 0); }
		public TerminalNode Default() { return getToken(BeerParser.Default, 0); }
		public TerminalNode CloseBrace() { return getToken(BeerParser.CloseBrace, 0); }
		public List<TerminalNode> Case() { return getTokens(BeerParser.Case); }
		public TerminalNode Case(int i) {
			return getToken(BeerParser.Case, i);
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
		enterRule(_localctx, 36, RULE_switchExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(Switch);
			setState(279);
			match(OpenParent);
			setState(280);
			match(Identifier);
			setState(281);
			match(CloseParent);
			setState(282);
			match(OpenBrace);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Case) {
				{
				{
				setState(283);
				match(Case);
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289);
			match(Default);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Case) {
				{
				{
				setState(290);
				match(Case);
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296);
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
		enterRule(_localctx, 38, RULE_caseExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(Case);
			setState(299);
			expression(0);
			setState(300);
			match(Colon);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(301);
				command();
				}
				}
				setState(306);
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
		enterRule(_localctx, 40, RULE_defaultExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(Default);
			setState(308);
			match(OpenBrace);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(309);
				command();
				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(315);
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
		enterRule(_localctx, 42, RULE_ifExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(If);
			setState(318);
			match(OpenParent);
			setState(319);
			expression(0);
			setState(320);
			match(CloseParent);
			setState(321);
			match(QuestionMark);
			setState(322);
			match(OpenBrace);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(323);
				command();
				}
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(329);
			match(CloseBrace);
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ElseIf) {
				{
				{
				setState(330);
				match(ElseIf);
				setState(331);
				match(OpenParent);
				setState(332);
				expression(0);
				setState(333);
				match(CloseParent);
				setState(334);
				match(QuestionMark);
				setState(335);
				match(OpenBrace);
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					{
					setState(336);
					command();
					}
					}
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(342);
				match(CloseBrace);
				}
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(349);
				match(Else);
				setState(350);
				match(OpenBrace);
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
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
				setState(357);
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
		enterRule(_localctx, 44, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(Print);
			setState(361);
			match(OpenParent);
			setState(362);
			expression(0);
			setState(363);
			match(CloseParent);
			setState(364);
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
		enterRule(_localctx, 46, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(Read);
			setState(367);
			match(OpenParent);
			setState(368);
			match(Identifier);
			setState(369);
			match(CloseParent);
			setState(370);
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
		enterRule(_localctx, 48, RULE_tryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(Try);
			setState(373);
			match(OpenBrace);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(374);
				command();
				}
				}
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(380);
			match(CloseBrace);
			setState(381);
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
		enterRule(_localctx, 50, RULE_catchExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(Catch);
			setState(384);
			match(OpenParent);
			setState(385);
			match(Identifier);
			setState(386);
			match(CloseParent);
			setState(387);
			match(OpenBrace);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << Function) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(388);
				command();
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(394);
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
		enterRule(_localctx, 52, RULE_throwExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(Throw);
			setState(397);
			expression(0);
			setState(398);
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
		enterRule(_localctx, 54, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
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
		case 12:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3P\u0195\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\7\2<\n\2\f\2\16\2?\13\2\3"+
		"\2\3\2\5\2C\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4O\n\4\f\4\16"+
		"\4R\13\4\3\4\3\4\3\5\3\5\7\5X\n\5\f\5\16\5[\13\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6l\n\6\3\6\5\6o\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7w\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0080\n\7\3\b"+
		"\3\b\3\b\5\b\u0085\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u008d\n\b\f\b\16\b"+
		"\u0090\13\b\3\b\3\b\3\t\3\t\3\t\7\t\u0097\n\t\f\t\16\t\u009a\13\t\3\t"+
		"\5\t\u009d\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a5\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\7\13\u00ac\n\13\f\13\16\13\u00af\13\13\3\13\5\13\u00b2\n\13\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00c8\n\16\3\16\3\16\3\16\3\16\7\16\u00ce\n"+
		"\16\f\16\16\16\u00d1\13\16\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u00d9\n"+
		"\20\f\20\16\20\u00dc\13\20\3\20\5\20\u00df\n\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\7\20\u00e8\n\20\f\20\16\20\u00eb\13\20\3\20\5\20\u00ee\n"+
		"\20\3\20\5\20\u00f1\n\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22"+
		"\u00fb\n\22\f\22\16\22\u00fe\13\22\3\22\3\22\3\23\3\23\3\23\5\23\u0105"+
		"\n\23\3\23\3\23\5\23\u0109\n\23\3\23\3\23\5\23\u010d\n\23\3\23\3\23\3"+
		"\23\7\23\u0112\n\23\f\23\16\23\u0115\13\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\7\24\u011f\n\24\f\24\16\24\u0122\13\24\3\24\3\24\7\24\u0126"+
		"\n\24\f\24\16\24\u0129\13\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u0131"+
		"\n\25\f\25\16\25\u0134\13\25\3\26\3\26\3\26\7\26\u0139\n\26\f\26\16\26"+
		"\u013c\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0147\n"+
		"\27\f\27\16\27\u014a\13\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27"+
		"\u0154\n\27\f\27\16\27\u0157\13\27\3\27\3\27\7\27\u015b\n\27\f\27\16\27"+
		"\u015e\13\27\3\27\3\27\3\27\7\27\u0163\n\27\f\27\16\27\u0166\13\27\3\27"+
		"\5\27\u0169\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\7\32\u017a\n\32\f\32\16\32\u017d\13\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0188\n\33\f\33\16\33\u018b\13"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\2\3\32\36\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\7\4\2\16\16\"&\4\2"+
		"@CKK\4\2\24\25\27!\4\2()LL\3\2\3\4\2\u01ad\2=\3\2\2\2\4F\3\2\2\2\6J\3"+
		"\2\2\2\bU\3\2\2\2\nn\3\2\2\2\f\177\3\2\2\2\16\u0081\3\2\2\2\20\u009c\3"+
		"\2\2\2\22\u00a4\3\2\2\2\24\u00a6\3\2\2\2\26\u00b5\3\2\2\2\30\u00b7\3\2"+
		"\2\2\32\u00c7\3\2\2\2\34\u00d2\3\2\2\2\36\u00f0\3\2\2\2 \u00f2\3\2\2\2"+
		"\"\u00f4\3\2\2\2$\u0101\3\2\2\2&\u0118\3\2\2\2(\u012c\3\2\2\2*\u0135\3"+
		"\2\2\2,\u013f\3\2\2\2.\u016a\3\2\2\2\60\u0170\3\2\2\2\62\u0176\3\2\2\2"+
		"\64\u0181\3\2\2\2\66\u018e\3\2\2\28\u0192\3\2\2\2:<\5\4\3\2;:\3\2\2\2"+
		"<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>B\3\2\2\2?=\3\2\2\2@C\5\6\4\2AC\5\b\5\2"+
		"B@\3\2\2\2BA\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\7\2\2\3E\3\3\2\2\2FG\7I\2\2"+
		"GH\7L\2\2HI\7\f\2\2I\5\3\2\2\2JK\7G\2\2KL\7K\2\2LP\7\n\2\2MO\5\n\6\2N"+
		"M\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\7\13\2\2"+
		"T\7\3\2\2\2UY\7>\2\2VX\5\n\6\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2"+
		"Z\\\3\2\2\2[Y\3\2\2\2\\]\7?\2\2]\t\3\2\2\2^o\5\f\7\2_o\5\"\22\2`o\5,\27"+
		"\2ao\5$\23\2bo\5&\24\2co\5.\30\2do\5\60\31\2eo\5\62\32\2fo\5\16\b\2go"+
		"\5\66\34\2hl\7+\2\2ij\7\61\2\2jl\5\32\16\2kh\3\2\2\2ki\3\2\2\2lm\3\2\2"+
		"\2mo\7\f\2\2n^\3\2\2\2n_\3\2\2\2n`\3\2\2\2na\3\2\2\2nb\3\2\2\2nc\3\2\2"+
		"\2nd\3\2\2\2ne\3\2\2\2nf\3\2\2\2ng\3\2\2\2nk\3\2\2\2o\13\3\2\2\2pq\5\32"+
		"\16\2qr\7\f\2\2r\u0080\3\2\2\2sv\5\22\n\2tu\7\16\2\2uw\5\32\16\2vt\3\2"+
		"\2\2vw\3\2\2\2wx\3\2\2\2xy\7\f\2\2y\u0080\3\2\2\2z{\7K\2\2{|\t\2\2\2|"+
		"}\5\32\16\2}~\7\f\2\2~\u0080\3\2\2\2\177p\3\2\2\2\177s\3\2\2\2\177z\3"+
		"\2\2\2\u0080\r\3\2\2\2\u0081\u0084\7\67\2\2\u0082\u0085\5\26\f\2\u0083"+
		"\u0085\5\30\r\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3"+
		"\2\2\2\u0086\u0087\7K\2\2\u0087\u0088\7\b\2\2\u0088\u0089\5\20\t\2\u0089"+
		"\u008a\7\t\2\2\u008a\u008e\7\n\2\2\u008b\u008d\5\n\6\2\u008c\u008b\3\2"+
		"\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\13\2\2\u0092\17\3\2\2"+
		"\2\u0093\u0094\5\22\n\2\u0094\u0095\7\r\2\2\u0095\u0097\3\2\2\2\u0096"+
		"\u0093\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009d\5\22\n\2\u009c"+
		"\u0098\3\2\2\2\u009c\u009d\3\2\2\2\u009d\21\3\2\2\2\u009e\u009f\5\26\f"+
		"\2\u009f\u00a0\7K\2\2\u00a0\u00a5\3\2\2\2\u00a1\u00a2\5\30\r\2\u00a2\u00a3"+
		"\7K\2\2\u00a3\u00a5\3\2\2\2\u00a4\u009e\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a5"+
		"\23\3\2\2\2\u00a6\u00a7\7/\2\2\u00a7\u00a8\7K\2\2\u00a8\u00b1\7\b\2\2"+
		"\u00a9\u00aa\7K\2\2\u00aa\u00ac\7\r\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00af"+
		"\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00b0\u00b2\7K\2\2\u00b1\u00ad\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7\t\2\2\u00b4\25\3\2\2\2\u00b5\u00b6"+
		"\t\3\2\2\u00b6\27\3\2\2\2\u00b7\u00b8\7D\2\2\u00b8\u00b9\7\32\2\2\u00b9"+
		"\u00ba\5\26\f\2\u00ba\u00bb\7\33\2\2\u00bb\31\3\2\2\2\u00bc\u00bd\b\16"+
		"\1\2\u00bd\u00be\7\26\2\2\u00be\u00c8\5\32\16\t\u00bf\u00c0\7\b\2\2\u00c0"+
		"\u00c1\5\32\16\2\u00c1\u00c2\7\t\2\2\u00c2\u00c8\3\2\2\2\u00c3\u00c8\5"+
		"\36\20\2\u00c4\u00c8\5 \21\2\u00c5\u00c8\7K\2\2\u00c6\u00c8\5\24\13\2"+
		"\u00c7\u00bc\3\2\2\2\u00c7\u00bf\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c7\u00c4"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cf\3\2\2\2\u00c9"+
		"\u00ca\f\7\2\2\u00ca\u00cb\5\34\17\2\u00cb\u00cc\5\32\16\b\u00cc\u00ce"+
		"\3\2\2\2\u00cd\u00c9\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\33\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\t\4\2"+
		"\2\u00d3\35\3\2\2\2\u00d4\u00d5\7K\2\2\u00d5\u00de\7\b\2\2\u00d6\u00d7"+
		"\7K\2\2\u00d7\u00d9\7\r\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dd\u00df\7K\2\2\u00de\u00da\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00f1\7\t\2\2\u00e1\u00e2\7K\2\2\u00e2\u00e3\7\21"+
		"\2\2\u00e3\u00e4\7K\2\2\u00e4\u00ed\7\b\2\2\u00e5\u00e6\7K\2\2\u00e6\u00e8"+
		"\7\r\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ee\7K"+
		"\2\2\u00ed\u00e9\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00f1\7\t\2\2\u00f0\u00d4\3\2\2\2\u00f0\u00e1\3\2\2\2\u00f1\37\3\2\2"+
		"\2\u00f2\u00f3\t\5\2\2\u00f3!\3\2\2\2\u00f4\u00f5\7\66\2\2\u00f5\u00f6"+
		"\7\b\2\2\u00f6\u00f7\5\32\16\2\u00f7\u00f8\7\t\2\2\u00f8\u00fc\7\n\2\2"+
		"\u00f9\u00fb\5\n\6\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa"+
		"\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff"+
		"\u0100\7\13\2\2\u0100#\3\2\2\2\u0101\u0102\7\64\2\2\u0102\u0104\7\b\2"+
		"\2\u0103\u0105\5\f\7\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106\u0108\7\f\2\2\u0107\u0109\5\32\16\2\u0108\u0107\3\2\2\2"+
		"\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\7\f\2\2\u010b\u010d"+
		"\5\f\7\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u010f\7\t\2\2\u010f\u0113\7\n\2\2\u0110\u0112\5\n\6\2\u0111\u0110\3\2"+
		"\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\7\13\2\2\u0117%\3\2\2\2"+
		"\u0118\u0119\7\65\2\2\u0119\u011a\7\b\2\2\u011a\u011b\7K\2\2\u011b\u011c"+
		"\7\t\2\2\u011c\u0120\7\n\2\2\u011d\u011f\7,\2\2\u011e\u011d\3\2\2\2\u011f"+
		"\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2"+
		"\2\2\u0122\u0120\3\2\2\2\u0123\u0127\79\2\2\u0124\u0126\7,\2\2\u0125\u0124"+
		"\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u012a\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b\7\13\2\2\u012b\'\3\2\2"+
		"\2\u012c\u012d\7,\2\2\u012d\u012e\5\32\16\2\u012e\u0132\7\20\2\2\u012f"+
		"\u0131\5\n\6\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2"+
		"\2\2\u0132\u0133\3\2\2\2\u0133)\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0136"+
		"\79\2\2\u0136\u013a\7\n\2\2\u0137\u0139\5\n\6\2\u0138\u0137\3\2\2\2\u0139"+
		"\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2"+
		"\2\2\u013c\u013a\3\2\2\2\u013d\u013e\7\13\2\2\u013e+\3\2\2\2\u013f\u0140"+
		"\7:\2\2\u0140\u0141\7\b\2\2\u0141\u0142\5\32\16\2\u0142\u0143\7\t\2\2"+
		"\u0143\u0144\7\17\2\2\u0144\u0148\7\n\2\2\u0145\u0147\5\n\6\2\u0146\u0145"+
		"\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u015c\7\13\2\2\u014c\u014d\7"+
		".\2\2\u014d\u014e\7\b\2\2\u014e\u014f\5\32\16\2\u014f\u0150\7\t\2\2\u0150"+
		"\u0151\7\17\2\2\u0151\u0155\7\n\2\2\u0152\u0154\5\n\6\2\u0153\u0152\3"+
		"\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0159\7\13\2\2\u0159\u015b\3"+
		"\2\2\2\u015a\u014c\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c"+
		"\u015d\3\2\2\2\u015d\u0168\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0160\7-"+
		"\2\2\u0160\u0164\7\n\2\2\u0161\u0163\5\n\6\2\u0162\u0161\3\2\2\2\u0163"+
		"\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167\3\2"+
		"\2\2\u0166\u0164\3\2\2\2\u0167\u0169\7\13\2\2\u0168\u015f\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169-\3\2\2\2\u016a\u016b\7E\2\2\u016b\u016c\7\b\2\2\u016c"+
		"\u016d\5\32\16\2\u016d\u016e\7\t\2\2\u016e\u016f\7\f\2\2\u016f/\3\2\2"+
		"\2\u0170\u0171\7F\2\2\u0171\u0172\7\b\2\2\u0172\u0173\7K\2\2\u0173\u0174"+
		"\7\t\2\2\u0174\u0175\7\f\2\2\u0175\61\3\2\2\2\u0176\u0177\7=\2\2\u0177"+
		"\u017b\7\n\2\2\u0178\u017a\5\n\6\2\u0179\u0178\3\2\2\2\u017a\u017d\3\2"+
		"\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\3\2\2\2\u017d"+
		"\u017b\3\2\2\2\u017e\u017f\7\13\2\2\u017f\u0180\5\64\33\2\u0180\63\3\2"+
		"\2\2\u0181\u0182\7\60\2\2\u0182\u0183\7\b\2\2\u0183\u0184\7K\2\2\u0184"+
		"\u0185\7\t\2\2\u0185\u0189\7\n\2\2\u0186\u0188\5\n\6\2\u0187\u0186\3\2"+
		"\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018d\7\13\2\2\u018d\65\3\2\2"+
		"\2\u018e\u018f\7;\2\2\u018f\u0190\5\32\16\2\u0190\u0191\7\f\2\2\u0191"+
		"\67\3\2\2\2\u0192\u0193\t\6\2\2\u01939\3\2\2\2(=BPYknv\177\u0084\u008e"+
		"\u0098\u009c\u00a4\u00ad\u00b1\u00c7\u00cf\u00da\u00de\u00e9\u00ed\u00f0"+
		"\u00fc\u0104\u0108\u010c\u0113\u0120\u0127\u0132\u013a\u0148\u0155\u015c"+
		"\u0164\u0168\u017b\u0189";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}