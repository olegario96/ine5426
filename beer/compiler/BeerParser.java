// Generated from BeerParser.g4 by ANTLR 4.7.1
package beer.compiler;
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
		RULE_type = 12, RULE_typeFunction = 13, RULE_typeArray = 14, RULE_expression = 15, 
		RULE_initArray = 16, RULE_binary = 17, RULE_functionCall = 18, RULE_value = 19, 
		RULE_whileExpression = 20, RULE_forExpression = 21, RULE_switchExpression = 22, 
		RULE_caseExpression = 23, RULE_defaultExpression = 24, RULE_ifExpression = 25, 
		RULE_print = 26, RULE_read = 27, RULE_tryExpression = 28, RULE_catchExpression = 29, 
		RULE_throwExpression = 30, RULE_comment = 31;
	public static final String[] ruleNames = {
		"program", "importExpression", "initClass", "method", "constructor", "begin", 
		"command", "simpleCommand", "function", "parameters", "declaration", "newObjectInit", 
		"type", "typeFunction", "typeArray", "expression", "initArray", "binary", 
		"functionCall", "value", "whileExpression", "forExpression", "switchExpression", 
		"caseExpression", "defaultExpression", "ifExpression", "print", "read", 
		"tryExpression", "catchExpression", "throwExpression", "comment"
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
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Import) {
				{
				{
				setState(64);
				importExpression();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
				{
				setState(70);
				initClass();
				}
				break;
			case MainInit:
				{
				setState(71);
				begin();
				}
				break;
			case EOF:
				break;
			default:
				break;
			}
			setState(74);
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
			setState(76);
			match(Import);
			setState(77);
			match(StringLiteral);
			setState(78);
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
			setState(80);
			match(Class);
			setState(81);
			match(Identifier);
			setState(82);
			match(OpenBrace);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (Function - 53)) | (1L << (Int - 53)) | (1L << (Float - 53)) | (1L << (Boolean - 53)) | (1L << (String - 53)) | (1L << (Identifier - 53)))) != 0)) {
				{
				{
				setState(83);
				method();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
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
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				type();
				setState(92);
				match(Identifier);
				setState(93);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
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
			setState(99);
			match(Identifier);
			setState(100);
			match(OpenParent);
			setState(101);
			parameters();
			setState(102);
			match(CloseParent);
			setState(103);
			match(OpenBrace);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << OpenBrace) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(104);
				command();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
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
			setState(112);
			match(MainInit);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << OpenBrace) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(113);
				command();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
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
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
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
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				simpleCommand();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				whileExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				ifExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				forExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(125);
				switchExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(126);
				print();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(127);
				read();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(128);
				tryExpression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(129);
				functionCall();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(130);
				throwExpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(134);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Break:
					{
					setState(131);
					match(Break);
					}
					break;
				case Return:
					{
					setState(132);
					match(Return);
					setState(133);
					expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(136);
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
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				expression(0);
				setState(140);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				declaration();
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(143);
					match(Assign);
					setState(144);
					expression(0);
					}
				}

				setState(147);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==This) {
					{
					setState(149);
					match(This);
					setState(150);
					match(Dot);
					}
				}

				setState(153);
				match(Identifier);
				setState(154);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Assign) | (1L << MultiplyAssign) | (1L << DivideAssign) | (1L << ModulusAssign) | (1L << PlusAssign) | (1L << MinusAssign))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(155);
				expression(0);
				setState(156);
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
		public TypeFunctionContext typeFunction() {
			return getRuleContext(TypeFunctionContext.class,0);
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
			setState(160);
			match(Function);
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Void:
			case Int:
			case Float:
			case Boolean:
			case String:
			case Identifier:
				{
				setState(161);
				typeFunction();
				}
				break;
			case Array:
				{
				setState(162);
				typeArray();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(165);
			match(Identifier);
			setState(166);
			match(OpenParent);
			setState(167);
			parameters();
			setState(168);
			match(CloseParent);
			setState(169);
			match(OpenBrace);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << OpenBrace) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(170);
				command();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
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
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (Int - 62)) | (1L << (Float - 62)) | (1L << (Boolean - 62)) | (1L << (String - 62)) | (1L << (Array - 62)) | (1L << (Identifier - 62)))) != 0)) {
				{
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(178);
						declaration();
						setState(179);
						match(Comma);
						}
						} 
					}
					setState(185);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(186);
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
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Float:
			case Boolean:
			case String:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				type();
				setState(190);
				match(Identifier);
				}
				break;
			case Array:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				typeArray();
				setState(193);
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
			setState(197);
			match(New);
			setState(198);
			match(Identifier);
			setState(199);
			match(OpenParent);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(200);
						match(Identifier);
						setState(201);
						match(Comma);
						}
						} 
					}
					setState(206);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(207);
				match(Identifier);
				}
			}

			setState(210);
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
			setState(212);
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

	public static class TypeFunctionContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(BeerParser.Int, 0); }
		public TerminalNode Float() { return getToken(BeerParser.Float, 0); }
		public TerminalNode Boolean() { return getToken(BeerParser.Boolean, 0); }
		public TerminalNode String() { return getToken(BeerParser.String, 0); }
		public TerminalNode Void() { return getToken(BeerParser.Void, 0); }
		public TerminalNode Identifier() { return getToken(BeerParser.Identifier, 0); }
		public TypeFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).enterTypeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeerParserListener ) ((BeerParserListener)listener).exitTypeFunction(this);
		}
	}

	public final TypeFunctionContext typeFunction() throws RecognitionException {
		TypeFunctionContext _localctx = new TypeFunctionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_la = _input.LA(1);
			if ( !(((((_la - 48)) & ~0x3f) == 0 && ((1L << (_la - 48)) & ((1L << (Void - 48)) | (1L << (Int - 48)) | (1L << (Float - 48)) | (1L << (Boolean - 48)) | (1L << (String - 48)) | (1L << (Identifier - 48)))) != 0)) ) {
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
		enterRule(_localctx, 28, RULE_typeArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(Array);
			setState(217);
			match(LessThan);
			setState(218);
			match(Identifier);
			setState(219);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(222);
				match(Not);
				setState(223);
				expression(8);
				}
				break;
			case 2:
				{
				setState(224);
				match(OpenParent);
				setState(225);
				expression(0);
				setState(226);
				match(CloseParent);
				}
				break;
			case 3:
				{
				setState(228);
				functionCall();
				}
				break;
			case 4:
				{
				setState(229);
				value();
				}
				break;
			case 5:
				{
				setState(230);
				match(Identifier);
				}
				break;
			case 6:
				{
				setState(231);
				newObjectInit();
				}
				break;
			case 7:
				{
				setState(232);
				initArray();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(241);
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
					setState(235);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(236);
					binary();
					setState(237);
					expression(7);
					}
					} 
				}
				setState(243);
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
		enterRule(_localctx, 32, RULE_initArray);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(OpenBrace);
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(245);
					value();
					setState(246);
					match(Comma);
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (BooleanLiteral - 38)) | (1L << (DecimalLiteral - 38)) | (1L << (StringLiteral - 38)))) != 0)) {
				{
				setState(253);
				value();
				}
			}

			setState(256);
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
		enterRule(_localctx, 34, RULE_binary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
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
		enterRule(_localctx, 36, RULE_functionCall);
		int _la;
		try {
			int _alt;
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(Identifier);
				setState(261);
				match(OpenParent);
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(266);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(262);
							match(Identifier);
							setState(263);
							match(Comma);
							}
							} 
						}
						setState(268);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
					}
					setState(269);
					match(Identifier);
					}
				}

				setState(272);
				match(CloseParent);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(Identifier);
				setState(274);
				match(Dot);
				setState(275);
				match(Identifier);
				setState(276);
				match(OpenParent);
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(281);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(277);
							match(Identifier);
							setState(278);
							match(Comma);
							}
							} 
						}
						setState(283);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
					}
					setState(284);
					match(Identifier);
					}
				}

				setState(287);
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
		enterRule(_localctx, 38, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
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
		enterRule(_localctx, 40, RULE_whileExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(While);
			setState(293);
			match(OpenParent);
			setState(294);
			expression(0);
			setState(295);
			match(CloseParent);
			setState(296);
			match(OpenBrace);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << OpenBrace) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(297);
				command();
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(303);
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
		enterRule(_localctx, 42, RULE_forExpression);
		int _la;
		try {
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(For);
				setState(306);
				match(OpenParent);
				setState(308);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(307);
					simpleCommand();
					}
					break;
				}
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << OpenBrace) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << New))) != 0) || _la==Identifier || _la==StringLiteral) {
					{
					setState(310);
					expression(0);
					}
				}

				setState(313);
				match(SemiColon);
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << OpenBrace) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << New) | (1L << This) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(314);
					simpleCommand();
					}
				}

				setState(317);
				match(CloseParent);
				setState(318);
				match(OpenBrace);
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << OpenBrace) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					{
					setState(319);
					command();
					}
					}
					setState(324);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(325);
				match(CloseBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				match(For);
				setState(327);
				match(OpenParent);
				setState(328);
				declaration();
				setState(329);
				match(In);
				setState(330);
				match(Identifier);
				setState(331);
				match(CloseParent);
				setState(332);
				match(OpenBrace);
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << OpenBrace) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					{
					setState(333);
					command();
					}
					}
					setState(338);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(339);
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
		enterRule(_localctx, 44, RULE_switchExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(Switch);
			setState(344);
			match(OpenParent);
			setState(345);
			match(Identifier);
			setState(346);
			match(CloseParent);
			setState(347);
			match(OpenBrace);
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Case) {
				{
				{
				setState(348);
				caseExpression();
				}
				}
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Default) {
				{
				setState(354);
				defaultExpression();
				}
			}

			setState(357);
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
		enterRule(_localctx, 46, RULE_caseExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(Case);
			setState(360);
			expression(0);
			setState(361);
			match(Colon);
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << OpenBrace) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(362);
				command();
				}
				}
				setState(367);
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
		enterRule(_localctx, 48, RULE_defaultExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(Default);
			setState(369);
			match(OpenBrace);
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << OpenBrace) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(370);
				command();
				}
				}
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(376);
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
		enterRule(_localctx, 50, RULE_ifExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(If);
			setState(379);
			match(OpenParent);
			setState(380);
			expression(0);
			setState(381);
			match(CloseParent);
			setState(382);
			match(QuestionMark);
			setState(383);
			match(OpenBrace);
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << OpenBrace) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(384);
				command();
				}
				}
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(390);
			match(CloseBrace);
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ElseIf) {
				{
				{
				setState(391);
				match(ElseIf);
				setState(392);
				match(OpenParent);
				setState(393);
				expression(0);
				setState(394);
				match(CloseParent);
				setState(395);
				match(QuestionMark);
				setState(396);
				match(OpenBrace);
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << OpenBrace) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					{
					setState(397);
					command();
					}
					}
					setState(402);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(403);
				match(CloseBrace);
				}
				}
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(410);
				match(Else);
				setState(411);
				match(OpenBrace);
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << OpenBrace) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					{
					setState(412);
					command();
					}
					}
					setState(417);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(418);
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
		enterRule(_localctx, 52, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(Print);
			setState(422);
			match(OpenParent);
			setState(423);
			expression(0);
			setState(424);
			match(CloseParent);
			setState(425);
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
		enterRule(_localctx, 54, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(Read);
			setState(428);
			match(OpenParent);
			setState(429);
			match(Identifier);
			setState(430);
			match(CloseParent);
			setState(431);
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
		enterRule(_localctx, 56, RULE_tryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(Try);
			setState(434);
			match(OpenBrace);
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << OpenBrace) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(435);
				command();
				}
				}
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(441);
			match(CloseBrace);
			setState(442);
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
		enterRule(_localctx, 58, RULE_catchExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(Catch);
			setState(445);
			match(OpenParent);
			setState(446);
			match(Identifier);
			setState(447);
			match(CloseParent);
			setState(448);
			match(OpenBrace);
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenParent) | (1L << OpenBrace) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << Break) | (1L << New) | (1L << Return) | (1L << For) | (1L << Switch) | (1L << While) | (1L << This) | (1L << If) | (1L << Throw) | (1L << Try) | (1L << Int) | (1L << Float))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Boolean - 64)) | (1L << (String - 64)) | (1L << (Array - 64)) | (1L << (Print - 64)) | (1L << (Read - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(449);
				command();
				}
				}
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(455);
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
		enterRule(_localctx, 60, RULE_throwExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(Throw);
			setState(458);
			expression(0);
			setState(459);
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
		enterRule(_localctx, 62, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
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
		case 15:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3P\u01d2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\3\2\5\2K\n\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\7\4W\n\4\f\4\16\4Z\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5d\n\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6l\n\6\f\6\16\6o\13\6\3\6\3\6"+
		"\3\7\3\7\7\7u\n\7\f\7\16\7x\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u0089\n\b\3\b\5\b\u008c\n\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\t\u0094\n\t\3\t\3\t\3\t\3\t\5\t\u009a\n\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u00a1\n\t\3\n\3\n\3\n\5\n\u00a6\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n"+
		"\u00ae\n\n\f\n\16\n\u00b1\13\n\3\n\3\n\3\13\3\13\3\13\7\13\u00b8\n\13"+
		"\f\13\16\13\u00bb\13\13\3\13\5\13\u00be\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u00c6\n\f\3\r\3\r\3\r\3\r\3\r\7\r\u00cd\n\r\f\r\16\r\u00d0\13\r\3\r"+
		"\5\r\u00d3\n\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00ec"+
		"\n\21\3\21\3\21\3\21\3\21\7\21\u00f2\n\21\f\21\16\21\u00f5\13\21\3\22"+
		"\3\22\3\22\3\22\7\22\u00fb\n\22\f\22\16\22\u00fe\13\22\3\22\5\22\u0101"+
		"\n\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u010b\n\24\f\24\16"+
		"\24\u010e\13\24\3\24\5\24\u0111\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\7\24\u011a\n\24\f\24\16\24\u011d\13\24\3\24\5\24\u0120\n\24\3\24\5\24"+
		"\u0123\n\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u012d\n\26\f"+
		"\26\16\26\u0130\13\26\3\26\3\26\3\27\3\27\3\27\5\27\u0137\n\27\3\27\5"+
		"\27\u013a\n\27\3\27\3\27\5\27\u013e\n\27\3\27\3\27\3\27\7\27\u0143\n\27"+
		"\f\27\16\27\u0146\13\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7"+
		"\27\u0151\n\27\f\27\16\27\u0154\13\27\3\27\3\27\5\27\u0158\n\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\7\30\u0160\n\30\f\30\16\30\u0163\13\30\3\30\5"+
		"\30\u0166\n\30\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u016e\n\31\f\31\16\31"+
		"\u0171\13\31\3\32\3\32\3\32\7\32\u0176\n\32\f\32\16\32\u0179\13\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0184\n\33\f\33\16\33\u0187"+
		"\13\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0191\n\33\f\33\16"+
		"\33\u0194\13\33\3\33\3\33\7\33\u0198\n\33\f\33\16\33\u019b\13\33\3\33"+
		"\3\33\3\33\7\33\u01a0\n\33\f\33\16\33\u01a3\13\33\3\33\5\33\u01a6\n\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\7\36\u01b7\n\36\f\36\16\36\u01ba\13\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\7\37\u01c5\n\37\f\37\16\37\u01c8\13\37\3\37\3\37"+
		"\3 \3 \3 \3 \3!\3!\3!\2\3 \"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@\2\b\4\2\16\16\"&\4\2@CKK\5\2\62\62@CKK\4\2\24"+
		"\25\27!\4\2()LL\3\2\3\4\2\u01ef\2E\3\2\2\2\4N\3\2\2\2\6R\3\2\2\2\bc\3"+
		"\2\2\2\ne\3\2\2\2\fr\3\2\2\2\16\u008b\3\2\2\2\20\u00a0\3\2\2\2\22\u00a2"+
		"\3\2\2\2\24\u00bd\3\2\2\2\26\u00c5\3\2\2\2\30\u00c7\3\2\2\2\32\u00d6\3"+
		"\2\2\2\34\u00d8\3\2\2\2\36\u00da\3\2\2\2 \u00eb\3\2\2\2\"\u00f6\3\2\2"+
		"\2$\u0104\3\2\2\2&\u0122\3\2\2\2(\u0124\3\2\2\2*\u0126\3\2\2\2,\u0157"+
		"\3\2\2\2.\u0159\3\2\2\2\60\u0169\3\2\2\2\62\u0172\3\2\2\2\64\u017c\3\2"+
		"\2\2\66\u01a7\3\2\2\28\u01ad\3\2\2\2:\u01b3\3\2\2\2<\u01be\3\2\2\2>\u01cb"+
		"\3\2\2\2@\u01cf\3\2\2\2BD\5\4\3\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2"+
		"\2\2FJ\3\2\2\2GE\3\2\2\2HK\5\6\4\2IK\5\f\7\2JH\3\2\2\2JI\3\2\2\2JK\3\2"+
		"\2\2KL\3\2\2\2LM\7\2\2\3M\3\3\2\2\2NO\7I\2\2OP\7L\2\2PQ\7\f\2\2Q\5\3\2"+
		"\2\2RS\7G\2\2ST\7K\2\2TX\7\n\2\2UW\5\b\5\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2"+
		"\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7\13\2\2\\\7\3\2\2\2]^\5\32\16\2^"+
		"_\7K\2\2_`\7\f\2\2`d\3\2\2\2ad\5\22\n\2bd\5\n\6\2c]\3\2\2\2ca\3\2\2\2"+
		"cb\3\2\2\2d\t\3\2\2\2ef\7K\2\2fg\7\b\2\2gh\5\24\13\2hi\7\t\2\2im\7\n\2"+
		"\2jl\5\16\b\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2"+
		"\2\2pq\7\13\2\2q\13\3\2\2\2rv\7>\2\2su\5\16\b\2ts\3\2\2\2ux\3\2\2\2vt"+
		"\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\7?\2\2z\r\3\2\2\2{\u008c\5\20"+
		"\t\2|\u008c\5*\26\2}\u008c\5\64\33\2~\u008c\5,\27\2\177\u008c\5.\30\2"+
		"\u0080\u008c\5\66\34\2\u0081\u008c\58\35\2\u0082\u008c\5:\36\2\u0083\u008c"+
		"\5&\24\2\u0084\u008c\5> \2\u0085\u0089\7+\2\2\u0086\u0087\7\61\2\2\u0087"+
		"\u0089\5 \21\2\u0088\u0085\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u008c\7\f\2\2\u008b{\3\2\2\2\u008b|\3\2\2\2\u008b}\3\2\2\2"+
		"\u008b~\3\2\2\2\u008b\177\3\2\2\2\u008b\u0080\3\2\2\2\u008b\u0081\3\2"+
		"\2\2\u008b\u0082\3\2\2\2\u008b\u0083\3\2\2\2\u008b\u0084\3\2\2\2\u008b"+
		"\u0088\3\2\2\2\u008c\17\3\2\2\2\u008d\u008e\5 \21\2\u008e\u008f\7\f\2"+
		"\2\u008f\u00a1\3\2\2\2\u0090\u0093\5\26\f\2\u0091\u0092\7\16\2\2\u0092"+
		"\u0094\5 \21\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u0096\7\f\2\2\u0096\u00a1\3\2\2\2\u0097\u0098\78\2\2\u0098"+
		"\u009a\7\21\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3"+
		"\2\2\2\u009b\u009c\7K\2\2\u009c\u009d\t\2\2\2\u009d\u009e\5 \21\2\u009e"+
		"\u009f\7\f\2\2\u009f\u00a1\3\2\2\2\u00a0\u008d\3\2\2\2\u00a0\u0090\3\2"+
		"\2\2\u00a0\u0099\3\2\2\2\u00a1\21\3\2\2\2\u00a2\u00a5\7\67\2\2\u00a3\u00a6"+
		"\5\34\17\2\u00a4\u00a6\5\36\20\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2"+
		"\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7K\2\2\u00a8\u00a9\7\b\2\2\u00a9\u00aa"+
		"\5\24\13\2\u00aa\u00ab\7\t\2\2\u00ab\u00af\7\n\2\2\u00ac\u00ae\5\16\b"+
		"\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7\13\2\2"+
		"\u00b3\23\3\2\2\2\u00b4\u00b5\5\26\f\2\u00b5\u00b6\7\r\2\2\u00b6\u00b8"+
		"\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00be\5\26"+
		"\f\2\u00bd\u00b9\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\25\3\2\2\2\u00bf\u00c0"+
		"\5\32\16\2\u00c0\u00c1\7K\2\2\u00c1\u00c6\3\2\2\2\u00c2\u00c3\5\36\20"+
		"\2\u00c3\u00c4\7K\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00bf\3\2\2\2\u00c5\u00c2"+
		"\3\2\2\2\u00c6\27\3\2\2\2\u00c7\u00c8\7/\2\2\u00c8\u00c9\7K\2\2\u00c9"+
		"\u00d2\7\b\2\2\u00ca\u00cb\7K\2\2\u00cb\u00cd\7\r\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d3\7K\2\2\u00d2\u00ce\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\7\t\2\2\u00d5"+
		"\31\3\2\2\2\u00d6\u00d7\t\3\2\2\u00d7\33\3\2\2\2\u00d8\u00d9\t\4\2\2\u00d9"+
		"\35\3\2\2\2\u00da\u00db\7D\2\2\u00db\u00dc\7\32\2\2\u00dc\u00dd\7K\2\2"+
		"\u00dd\u00de\7\33\2\2\u00de\37\3\2\2\2\u00df\u00e0\b\21\1\2\u00e0\u00e1"+
		"\7\26\2\2\u00e1\u00ec\5 \21\n\u00e2\u00e3\7\b\2\2\u00e3\u00e4\5 \21\2"+
		"\u00e4\u00e5\7\t\2\2\u00e5\u00ec\3\2\2\2\u00e6\u00ec\5&\24\2\u00e7\u00ec"+
		"\5(\25\2\u00e8\u00ec\7K\2\2\u00e9\u00ec\5\30\r\2\u00ea\u00ec\5\"\22\2"+
		"\u00eb\u00df\3\2\2\2\u00eb\u00e2\3\2\2\2\u00eb\u00e6\3\2\2\2\u00eb\u00e7"+
		"\3\2\2\2\u00eb\u00e8\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec"+
		"\u00f3\3\2\2\2\u00ed\u00ee\f\b\2\2\u00ee\u00ef\5$\23\2\u00ef\u00f0\5 "+
		"\21\t\u00f0\u00f2\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4!\3\2\2\2\u00f5\u00f3\3\2\2\2"+
		"\u00f6\u00fc\7\n\2\2\u00f7\u00f8\5(\25\2\u00f8\u00f9\7\r\2\2\u00f9\u00fb"+
		"\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0101\5("+
		"\25\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0103\7\13\2\2\u0103#\3\2\2\2\u0104\u0105\t\5\2\2\u0105%\3\2\2\2\u0106"+
		"\u0107\7K\2\2\u0107\u0110\7\b\2\2\u0108\u0109\7K\2\2\u0109\u010b\7\r\2"+
		"\2\u010a\u0108\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d"+
		"\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0111\7K\2\2\u0110"+
		"\u010c\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0123\7\t"+
		"\2\2\u0113\u0114\7K\2\2\u0114\u0115\7\21\2\2\u0115\u0116\7K\2\2\u0116"+
		"\u011f\7\b\2\2\u0117\u0118\7K\2\2\u0118\u011a\7\r\2\2\u0119\u0117\3\2"+
		"\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011e\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0120\7K\2\2\u011f\u011b\3\2"+
		"\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\7\t\2\2\u0122"+
		"\u0106\3\2\2\2\u0122\u0113\3\2\2\2\u0123\'\3\2\2\2\u0124\u0125\t\6\2\2"+
		"\u0125)\3\2\2\2\u0126\u0127\7\66\2\2\u0127\u0128\7\b\2\2\u0128\u0129\5"+
		" \21\2\u0129\u012a\7\t\2\2\u012a\u012e\7\n\2\2\u012b\u012d\5\16\b\2\u012c"+
		"\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\7\13\2\2\u0132"+
		"+\3\2\2\2\u0133\u0134\7\64\2\2\u0134\u0136\7\b\2\2\u0135\u0137\5\20\t"+
		"\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u013a"+
		"\5 \21\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013d\7\f\2\2\u013c\u013e\5\20\t\2\u013d\u013c\3\2\2\2\u013d\u013e\3"+
		"\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\7\t\2\2\u0140\u0144\7\n\2\2\u0141"+
		"\u0143\5\16\b\2\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3"+
		"\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147"+
		"\u0158\7\13\2\2\u0148\u0149\7\64\2\2\u0149\u014a\7\b\2\2\u014a\u014b\5"+
		"\26\f\2\u014b\u014c\7<\2\2\u014c\u014d\7K\2\2\u014d\u014e\7\t\2\2\u014e"+
		"\u0152\7\n\2\2\u014f\u0151\5\16\b\2\u0150\u014f\3\2\2\2\u0151\u0154\3"+
		"\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0155\u0156\7\13\2\2\u0156\u0158\3\2\2\2\u0157\u0133\3"+
		"\2\2\2\u0157\u0148\3\2\2\2\u0158-\3\2\2\2\u0159\u015a\7\65\2\2\u015a\u015b"+
		"\7\b\2\2\u015b\u015c\7K\2\2\u015c\u015d\7\t\2\2\u015d\u0161\7\n\2\2\u015e"+
		"\u0160\5\60\31\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3"+
		"\2\2\2\u0161\u0162\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0164"+
		"\u0166\5\62\32\2\u0165\u0164\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3"+
		"\2\2\2\u0167\u0168\7\13\2\2\u0168/\3\2\2\2\u0169\u016a\7,\2\2\u016a\u016b"+
		"\5 \21\2\u016b\u016f\7\20\2\2\u016c\u016e\5\16\b\2\u016d\u016c\3\2\2\2"+
		"\u016e\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\61"+
		"\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0173\79\2\2\u0173\u0177\7\n\2\2\u0174"+
		"\u0176\5\16\b\2\u0175\u0174\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3"+
		"\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a"+
		"\u017b\7\13\2\2\u017b\63\3\2\2\2\u017c\u017d\7:\2\2\u017d\u017e\7\b\2"+
		"\2\u017e\u017f\5 \21\2\u017f\u0180\7\t\2\2\u0180\u0181\7\17\2\2\u0181"+
		"\u0185\7\n\2\2\u0182\u0184\5\16\b\2\u0183\u0182\3\2\2\2\u0184\u0187\3"+
		"\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188\3\2\2\2\u0187"+
		"\u0185\3\2\2\2\u0188\u0199\7\13\2\2\u0189\u018a\7.\2\2\u018a\u018b\7\b"+
		"\2\2\u018b\u018c\5 \21\2\u018c\u018d\7\t\2\2\u018d\u018e\7\17\2\2\u018e"+
		"\u0192\7\n\2\2\u018f\u0191\5\16\b\2\u0190\u018f\3\2\2\2\u0191\u0194\3"+
		"\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195\3\2\2\2\u0194"+
		"\u0192\3\2\2\2\u0195\u0196\7\13\2\2\u0196\u0198\3\2\2\2\u0197\u0189\3"+
		"\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u01a5\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019d\7-\2\2\u019d\u01a1\7\n"+
		"\2\2\u019e\u01a0\5\16\b\2\u019f\u019e\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1"+
		"\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u01a1\3\2"+
		"\2\2\u01a4\u01a6\7\13\2\2\u01a5\u019c\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"\65\3\2\2\2\u01a7\u01a8\7E\2\2\u01a8\u01a9\7\b\2\2\u01a9\u01aa\5 \21\2"+
		"\u01aa\u01ab\7\t\2\2\u01ab\u01ac\7\f\2\2\u01ac\67\3\2\2\2\u01ad\u01ae"+
		"\7F\2\2\u01ae\u01af\7\b\2\2\u01af\u01b0\7K\2\2\u01b0\u01b1\7\t\2\2\u01b1"+
		"\u01b2\7\f\2\2\u01b29\3\2\2\2\u01b3\u01b4\7=\2\2\u01b4\u01b8\7\n\2\2\u01b5"+
		"\u01b7\5\16\b\2\u01b6\u01b5\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3"+
		"\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb"+
		"\u01bc\7\13\2\2\u01bc\u01bd\5<\37\2\u01bd;\3\2\2\2\u01be\u01bf\7\60\2"+
		"\2\u01bf\u01c0\7\b\2\2\u01c0\u01c1\7K\2\2\u01c1\u01c2\7\t\2\2\u01c2\u01c6"+
		"\7\n\2\2\u01c3\u01c5\5\16\b\2\u01c4\u01c3\3\2\2\2\u01c5\u01c8\3\2\2\2"+
		"\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01c6"+
		"\3\2\2\2\u01c9\u01ca\7\13\2\2\u01ca=\3\2\2\2\u01cb\u01cc\7;\2\2\u01cc"+
		"\u01cd\5 \21\2\u01cd\u01ce\7\f\2\2\u01ce?\3\2\2\2\u01cf\u01d0\t\7\2\2"+
		"\u01d0A\3\2\2\2/EJXcmv\u0088\u008b\u0093\u0099\u00a0\u00a5\u00af\u00b9"+
		"\u00bd\u00c5\u00ce\u00d2\u00eb\u00f3\u00fc\u0100\u010c\u0110\u011b\u011f"+
		"\u0122\u012e\u0136\u0139\u013d\u0144\u0152\u0157\u0161\u0165\u016f\u0177"+
		"\u0185\u0192\u0199\u01a1\u01a5\u01b8\u01c6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}