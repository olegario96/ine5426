// Generated from /Users/joao/Dropbox/ufsc/17.1/compiladores/Cryptolang/src/com/joao/Cryptolang.g4 by ANTLR 4.7
package com.joao;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CryptolangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, IF=24, ELIF=25, 
		ELSE=26, FUNC=27, FOR=28, WHILE=29, VAR=30, RETURN=31, BREAK=32, PRINT=33, 
		BIN=34, HEX=35, NUMBER=36, ID=37, NEWLINE=38, SKIP_=39;
	public static final int
		RULE_file = 0, RULE_stat = 1, RULE_block = 2, RULE_if_stat = 3, RULE_func_stat = 4, 
		RULE_func_block = 5, RULE_param = 6, RULE_while_stat = 7, RULE_for_stat = 8, 
		RULE_for_block = 9, RULE_for_header = 10, RULE_var_stat = 11, RULE_assign_stat = 12, 
		RULE_return_stat = 13, RULE_call = 14, RULE_call_stat = 15, RULE_print_stat = 16, 
		RULE_exp = 17, RULE_exp2 = 18, RULE_size = 19, RULE_intv = 20, RULE_number_exp = 21;
	public static final String[] ruleNames = {
		"file", "stat", "block", "if_stat", "func_stat", "func_block", "param", 
		"while_stat", "for_stat", "for_block", "for_header", "var_stat", "assign_stat", 
		"return_stat", "call", "call_stat", "print_stat", "exp", "exp2", "size", 
		"intv", "number_exp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'('", "','", "')'", "'in'", "'='", "'!'", "'^'", 
		"'<<'", "'>>'", "'.'", "'x'", "'&'", "'|'", "'['", "']'", "'<'", "':'", 
		"'>'", "'*'", "'+'", "'-'", "'if'", "'else if'", "'else'", "'fun'", "'for'", 
		"'while'", "'var'", "'return'", "'break'", "'print'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"IF", "ELIF", "ELSE", "FUNC", "FOR", "WHILE", "VAR", "RETURN", "BREAK", 
		"PRINT", "BIN", "HEX", "NUMBER", "ID", "NEWLINE", "SKIP_"
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
	public String getGrammarFileName() { return "Cryptolang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CryptolangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CryptolangParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CryptolangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CryptolangParser.NEWLINE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FUNC) | (1L << FOR) | (1L << WHILE) | (1L << VAR) | (1L << RETURN) | (1L << PRINT) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				setState(46);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(44);
					match(NEWLINE);
					}
					break;
				case IF:
				case FUNC:
				case FOR:
				case WHILE:
				case VAR:
				case RETURN:
				case PRINT:
				case ID:
					{
					setState(45);
					stat();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
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

	public static class StatContext extends ParserRuleContext {
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public Func_statContext func_stat() {
			return getRuleContext(Func_statContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public For_statContext for_stat() {
			return getRuleContext(For_statContext.class,0);
		}
		public Var_statContext var_stat() {
			return getRuleContext(Var_statContext.class,0);
		}
		public Assign_statContext assign_stat() {
			return getRuleContext(Assign_statContext.class,0);
		}
		public Call_statContext call_stat() {
			return getRuleContext(Call_statContext.class,0);
		}
		public Return_statContext return_stat() {
			return getRuleContext(Return_statContext.class,0);
		}
		public Print_statContext print_stat() {
			return getRuleContext(Print_statContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				if_stat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				func_stat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				while_stat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				for_stat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
				var_stat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(58);
				assign_stat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(59);
				call_stat();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(60);
				return_stat();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(61);
				print_stat();
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

	public static class BlockContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(CryptolangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CryptolangParser.NEWLINE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(64);
				match(NEWLINE);
				}
			}

			setState(67);
			match(T__0);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FUNC) | (1L << FOR) | (1L << WHILE) | (1L << VAR) | (1L << RETURN) | (1L << PRINT) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				setState(70);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(68);
					match(NEWLINE);
					}
					break;
				case IF:
				case FUNC:
				case FOR:
				case WHILE:
				case VAR:
				case RETURN:
				case PRINT:
				case ID:
					{
					setState(69);
					stat();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			match(T__1);
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

	public static class If_statContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CryptolangParser.IF, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(CryptolangParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(CryptolangParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(CryptolangParser.ELSE, 0); }
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterIf_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitIf_stat(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_if_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(IF);
			setState(78);
			exp(0);
			setState(79);
			block();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(80);
				match(ELIF);
				setState(81);
				exp(0);
				setState(82);
				block();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(89);
				match(ELSE);
				setState(90);
				block();
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

	public static class Func_statContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(CryptolangParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(CryptolangParser.ID, 0); }
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public Func_blockContext func_block() {
			return getRuleContext(Func_blockContext.class,0);
		}
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public Func_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterFunc_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitFunc_stat(this);
		}
	}

	public final Func_statContext func_stat() throws RecognitionException {
		Func_statContext _localctx = new Func_statContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_func_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(FUNC);
			setState(94);
			match(ID);
			setState(95);
			match(T__2);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(96);
				param();
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(97);
					match(T__3);
					setState(98);
					param();
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(106);
			match(T__4);
			setState(107);
			size();
			setState(108);
			func_block();
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

	public static class Func_blockContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(CryptolangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CryptolangParser.NEWLINE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public Func_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterFunc_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitFunc_block(this);
		}
	}

	public final Func_blockContext func_block() throws RecognitionException {
		Func_blockContext _localctx = new Func_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_func_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(110);
				match(NEWLINE);
				}
			}

			setState(113);
			match(T__0);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FUNC) | (1L << FOR) | (1L << WHILE) | (1L << VAR) | (1L << RETURN) | (1L << PRINT) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				setState(116);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(114);
					match(NEWLINE);
					}
					break;
				case IF:
				case FUNC:
				case FOR:
				case WHILE:
				case VAR:
				case RETURN:
				case PRINT:
				case ID:
					{
					setState(115);
					stat();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			match(T__1);
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CryptolangParser.ID, 0); }
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(ID);
			setState(124);
			size();
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

	public static class While_statContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CryptolangParser.WHILE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterWhile_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitWhile_stat(this);
		}
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(WHILE);
			setState(127);
			exp(0);
			setState(128);
			block();
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

	public static class For_statContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(CryptolangParser.FOR, 0); }
		public For_headerContext for_header() {
			return getRuleContext(For_headerContext.class,0);
		}
		public For_blockContext for_block() {
			return getRuleContext(For_blockContext.class,0);
		}
		public For_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterFor_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitFor_stat(this);
		}
	}

	public final For_statContext for_stat() throws RecognitionException {
		For_statContext _localctx = new For_statContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_for_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(FOR);
			setState(131);
			for_header();
			setState(132);
			for_block();
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

	public static class For_blockContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(CryptolangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CryptolangParser.NEWLINE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public For_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterFor_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitFor_block(this);
		}
	}

	public final For_blockContext for_block() throws RecognitionException {
		For_blockContext _localctx = new For_blockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_for_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(134);
				match(NEWLINE);
				}
			}

			setState(137);
			match(T__0);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FUNC) | (1L << FOR) | (1L << WHILE) | (1L << VAR) | (1L << RETURN) | (1L << PRINT) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				setState(140);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(138);
					match(NEWLINE);
					}
					break;
				case IF:
				case FUNC:
				case FOR:
				case WHILE:
				case VAR:
				case RETURN:
				case PRINT:
				case ID:
					{
					setState(139);
					stat();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			match(T__1);
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

	public static class For_headerContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CryptolangParser.ID, 0); }
		public IntvContext intv() {
			return getRuleContext(IntvContext.class,0);
		}
		public For_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterFor_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitFor_header(this);
		}
	}

	public final For_headerContext for_header() throws RecognitionException {
		For_headerContext _localctx = new For_headerContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_for_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(ID);
			setState(148);
			match(T__5);
			setState(149);
			intv();
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

	public static class Var_statContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(CryptolangParser.VAR, 0); }
		public TerminalNode ID() { return getToken(CryptolangParser.ID, 0); }
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Var_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterVar_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitVar_stat(this);
		}
	}

	public final Var_statContext var_stat() throws RecognitionException {
		Var_statContext _localctx = new Var_statContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_var_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(VAR);
			setState(152);
			match(ID);
			setState(153);
			size();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(154);
				match(T__6);
				setState(155);
				exp(0);
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

	public static class Assign_statContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CryptolangParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public IntvContext intv() {
			return getRuleContext(IntvContext.class,0);
		}
		public Assign_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterAssign_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitAssign_stat(this);
		}
	}

	public final Assign_statContext assign_stat() throws RecognitionException {
		Assign_statContext _localctx = new Assign_statContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assign_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(ID);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(159);
				intv();
				}
			}

			setState(162);
			match(T__6);
			setState(163);
			exp(0);
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

	public static class Return_statContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CryptolangParser.RETURN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Return_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterReturn_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitReturn_stat(this);
		}
	}

	public final Return_statContext return_stat() throws RecognitionException {
		Return_statContext _localctx = new Return_statContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_return_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(RETURN);
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(166);
				exp(0);
				}
				break;
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

	public static class CallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CryptolangParser.ID, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitCall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(ID);
			setState(170);
			match(T__2);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__7) | (1L << BIN) | (1L << HEX) | (1L << ID))) != 0)) {
				{
				setState(171);
				exp(0);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(172);
					match(T__3);
					setState(173);
					exp(0);
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(181);
			match(T__4);
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

	public static class Call_statContext extends ParserRuleContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public Call_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterCall_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitCall_stat(this);
		}
	}

	public final Call_statContext call_stat() throws RecognitionException {
		Call_statContext _localctx = new Call_statContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_call_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			call();
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

	public static class Print_statContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(CryptolangParser.PRINT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Print_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterPrint_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitPrint_stat(this);
		}
	}

	public final Print_statContext print_stat() throws RecognitionException {
		Print_statContext _localctx = new Print_statContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_print_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(PRINT);
			setState(186);
			exp(0);
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

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpXorContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExpXorContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterExpXor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitExpXor(this);
		}
	}
	public static class ExpIntvContext extends ExpContext {
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public IntvContext intv() {
			return getRuleContext(IntvContext.class,0);
		}
		public ExpIntvContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterExpIntv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitExpIntv(this);
		}
	}
	public static class ExpOrContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExpOrContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterExpOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitExpOr(this);
		}
	}
	public static class ExpAndContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExpAndContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterExpAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitExpAnd(this);
		}
	}
	public static class ExpShiftLeftContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(CryptolangParser.NUMBER, 0); }
		public ExpShiftLeftContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterExpShiftLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitExpShiftLeft(this);
		}
	}
	public static class ExpShiftRightContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(CryptolangParser.NUMBER, 0); }
		public ExpShiftRightContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterExpShiftRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitExpShiftRight(this);
		}
	}
	public static class ExpNotContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpNotContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterExpNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitExpNot(this);
		}
	}
	public static class ExpConcatContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExpConcatContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterExpConcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitExpConcat(this);
		}
	}
	public static class ExpPowerContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(CryptolangParser.NUMBER, 0); }
		public ExpPowerContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterExpPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitExpPower(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				_localctx = new ExpNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(189);
				match(T__7);
				setState(190);
				exp(9);
				}
				break;
			case T__2:
			case BIN:
			case HEX:
			case ID:
				{
				_localctx = new ExpIntvContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				exp2();
				setState(193);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(192);
					intv();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(218);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExpConcatContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(197);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(198);
						match(T__11);
						setState(199);
						exp(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpXorContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(200);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(201);
						match(T__12);
						setState(202);
						exp(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpAndContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(203);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(204);
						match(T__13);
						setState(205);
						exp(4);
						}
						break;
					case 4:
						{
						_localctx = new ExpOrContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(206);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(207);
						match(T__14);
						setState(208);
						exp(3);
						}
						break;
					case 5:
						{
						_localctx = new ExpPowerContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(209);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(210);
						match(T__8);
						setState(211);
						match(NUMBER);
						}
						break;
					case 6:
						{
						_localctx = new ExpShiftLeftContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(212);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(213);
						match(T__9);
						setState(214);
						match(NUMBER);
						}
						break;
					case 7:
						{
						_localctx = new ExpShiftRightContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(215);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(216);
						match(T__10);
						setState(217);
						match(NUMBER);
						}
						break;
					}
					} 
				}
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class Exp2Context extends ParserRuleContext {
		public Exp2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp2; }
	 
		public Exp2Context() { }
		public void copyFrom(Exp2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpHexContext extends Exp2Context {
		public TerminalNode HEX() { return getToken(CryptolangParser.HEX, 0); }
		public ExpHexContext(Exp2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterExpHex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitExpHex(this);
		}
	}
	public static class ExpCallContext extends Exp2Context {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public ExpCallContext(Exp2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterExpCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitExpCall(this);
		}
	}
	public static class ExpBinContext extends Exp2Context {
		public TerminalNode BIN() { return getToken(CryptolangParser.BIN, 0); }
		public ExpBinContext(Exp2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterExpBin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitExpBin(this);
		}
	}
	public static class ExpIdContext extends Exp2Context {
		public TerminalNode ID() { return getToken(CryptolangParser.ID, 0); }
		public ExpIdContext(Exp2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterExpId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitExpId(this);
		}
	}
	public static class ExpParenContext extends Exp2Context {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpParenContext(Exp2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterExpParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitExpParen(this);
		}
	}

	public final Exp2Context exp2() throws RecognitionException {
		Exp2Context _localctx = new Exp2Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_exp2);
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new ExpParenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(T__2);
				setState(224);
				exp(0);
				setState(225);
				match(T__4);
				}
				break;
			case 2:
				_localctx = new ExpBinContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(BIN);
				}
				break;
			case 3:
				_localctx = new ExpHexContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				match(HEX);
				}
				break;
			case 4:
				_localctx = new ExpIdContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				match(ID);
				}
				break;
			case 5:
				_localctx = new ExpCallContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(230);
				call();
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

	public static class SizeContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(CryptolangParser.NUMBER, 0); }
		public SizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitSize(this);
		}
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(T__15);
			setState(234);
			match(NUMBER);
			setState(235);
			match(T__16);
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

	public static class IntvContext extends ParserRuleContext {
		public List<Number_expContext> number_exp() {
			return getRuleContexts(Number_expContext.class);
		}
		public Number_expContext number_exp(int i) {
			return getRuleContext(Number_expContext.class,i);
		}
		public IntvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterIntv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitIntv(this);
		}
	}

	public final IntvContext intv() throws RecognitionException {
		IntvContext _localctx = new IntvContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_intv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__17);
			setState(238);
			number_exp(0);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(239);
				match(T__18);
				setState(240);
				number_exp(0);
				}
			}

			setState(243);
			match(T__19);
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

	public static class Number_expContext extends ParserRuleContext {
		public Number_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_exp; }
	 
		public Number_expContext() { }
		public void copyFrom(Number_expContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumberExpSubContext extends Number_expContext {
		public List<Number_expContext> number_exp() {
			return getRuleContexts(Number_expContext.class);
		}
		public Number_expContext number_exp(int i) {
			return getRuleContext(Number_expContext.class,i);
		}
		public NumberExpSubContext(Number_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterNumberExpSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitNumberExpSub(this);
		}
	}
	public static class NumberExpNumberContext extends Number_expContext {
		public TerminalNode NUMBER() { return getToken(CryptolangParser.NUMBER, 0); }
		public NumberExpNumberContext(Number_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterNumberExpNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitNumberExpNumber(this);
		}
	}
	public static class NumberExpMultContext extends Number_expContext {
		public List<Number_expContext> number_exp() {
			return getRuleContexts(Number_expContext.class);
		}
		public Number_expContext number_exp(int i) {
			return getRuleContext(Number_expContext.class,i);
		}
		public NumberExpMultContext(Number_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterNumberExpMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitNumberExpMult(this);
		}
	}
	public static class NumberExpIdContext extends Number_expContext {
		public TerminalNode ID() { return getToken(CryptolangParser.ID, 0); }
		public NumberExpIdContext(Number_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterNumberExpId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitNumberExpId(this);
		}
	}
	public static class NumberExpPlusContext extends Number_expContext {
		public List<Number_expContext> number_exp() {
			return getRuleContexts(Number_expContext.class);
		}
		public Number_expContext number_exp(int i) {
			return getRuleContext(Number_expContext.class,i);
		}
		public NumberExpPlusContext(Number_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).enterNumberExpPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CryptolangListener ) ((CryptolangListener)listener).exitNumberExpPlus(this);
		}
	}

	public final Number_expContext number_exp() throws RecognitionException {
		return number_exp(0);
	}

	private Number_expContext number_exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Number_expContext _localctx = new Number_expContext(_ctx, _parentState);
		Number_expContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_number_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				_localctx = new NumberExpNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(246);
				match(NUMBER);
				}
				break;
			case ID:
				{
				_localctx = new NumberExpIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(247);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(259);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new NumberExpMultContext(new Number_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_number_exp);
						setState(250);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(251);
						match(T__20);
						setState(252);
						number_exp(6);
						}
						break;
					case 2:
						{
						_localctx = new NumberExpPlusContext(new Number_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_number_exp);
						setState(253);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(254);
						match(T__21);
						setState(255);
						number_exp(5);
						}
						break;
					case 3:
						{
						_localctx = new NumberExpSubContext(new Number_expContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_number_exp);
						setState(256);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(257);
						match(T__22);
						setState(258);
						number_exp(4);
						}
						break;
					}
					} 
				}
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 21:
			return number_exp_sempred((Number_expContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean number_exp_sempred(Number_expContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u010b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\7\2\61\n\2"+
		"\f\2\16\2\64\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3A\n\3"+
		"\3\4\5\4D\n\4\3\4\3\4\3\4\7\4I\n\4\f\4\16\4L\13\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\7\5W\n\5\f\5\16\5Z\13\5\3\5\3\5\5\5^\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\7\6f\n\6\f\6\16\6i\13\6\5\6k\n\6\3\6\3\6\3\6\3\6\3\7\5\7"+
		"r\n\7\3\7\3\7\3\7\7\7w\n\7\f\7\16\7z\13\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\13\5\13\u008a\n\13\3\13\3\13\3\13\7\13\u008f"+
		"\n\13\f\13\16\13\u0092\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u009f\n\r\3\16\3\16\5\16\u00a3\n\16\3\16\3\16\3\16\3\17\3\17"+
		"\5\17\u00aa\n\17\3\20\3\20\3\20\3\20\3\20\7\20\u00b1\n\20\f\20\16\20\u00b4"+
		"\13\20\5\20\u00b6\n\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\5\23\u00c4\n\23\5\23\u00c6\n\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\7\23\u00dd\n\23\f\23\16\23\u00e0\13\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u00ea\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\5\26\u00f4\n\26\3\26\3\26\3\27\3\27\3\27\5\27\u00fb\n\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0106\n\27\f\27\16\27\u0109"+
		"\13\27\3\27\2\4$,\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2"+
		"\2\2\u0122\2\62\3\2\2\2\4@\3\2\2\2\6C\3\2\2\2\bO\3\2\2\2\n_\3\2\2\2\f"+
		"q\3\2\2\2\16}\3\2\2\2\20\u0080\3\2\2\2\22\u0084\3\2\2\2\24\u0089\3\2\2"+
		"\2\26\u0095\3\2\2\2\30\u0099\3\2\2\2\32\u00a0\3\2\2\2\34\u00a7\3\2\2\2"+
		"\36\u00ab\3\2\2\2 \u00b9\3\2\2\2\"\u00bb\3\2\2\2$\u00c5\3\2\2\2&\u00e9"+
		"\3\2\2\2(\u00eb\3\2\2\2*\u00ef\3\2\2\2,\u00fa\3\2\2\2.\61\7(\2\2/\61\5"+
		"\4\3\2\60.\3\2\2\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2"+
		"\2\63\65\3\2\2\2\64\62\3\2\2\2\65\66\7\2\2\3\66\3\3\2\2\2\67A\5\b\5\2"+
		"8A\5\n\6\29A\5\20\t\2:A\5\22\n\2;A\5\30\r\2<A\5\32\16\2=A\5 \21\2>A\5"+
		"\34\17\2?A\5\"\22\2@\67\3\2\2\2@8\3\2\2\2@9\3\2\2\2@:\3\2\2\2@;\3\2\2"+
		"\2@<\3\2\2\2@=\3\2\2\2@>\3\2\2\2@?\3\2\2\2A\5\3\2\2\2BD\7(\2\2CB\3\2\2"+
		"\2CD\3\2\2\2DE\3\2\2\2EJ\7\3\2\2FI\7(\2\2GI\5\4\3\2HF\3\2\2\2HG\3\2\2"+
		"\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\7\4\2\2N\7\3\2"+
		"\2\2OP\7\32\2\2PQ\5$\23\2QX\5\6\4\2RS\7\33\2\2ST\5$\23\2TU\5\6\4\2UW\3"+
		"\2\2\2VR\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y]\3\2\2\2ZX\3\2\2\2[\\"+
		"\7\34\2\2\\^\5\6\4\2][\3\2\2\2]^\3\2\2\2^\t\3\2\2\2_`\7\35\2\2`a\7\'\2"+
		"\2aj\7\5\2\2bg\5\16\b\2cd\7\6\2\2df\5\16\b\2ec\3\2\2\2fi\3\2\2\2ge\3\2"+
		"\2\2gh\3\2\2\2hk\3\2\2\2ig\3\2\2\2jb\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\7\7"+
		"\2\2mn\5(\25\2no\5\f\7\2o\13\3\2\2\2pr\7(\2\2qp\3\2\2\2qr\3\2\2\2rs\3"+
		"\2\2\2sx\7\3\2\2tw\7(\2\2uw\5\4\3\2vt\3\2\2\2vu\3\2\2\2wz\3\2\2\2xv\3"+
		"\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7\4\2\2|\r\3\2\2\2}~\7\'\2\2~\177"+
		"\5(\25\2\177\17\3\2\2\2\u0080\u0081\7\37\2\2\u0081\u0082\5$\23\2\u0082"+
		"\u0083\5\6\4\2\u0083\21\3\2\2\2\u0084\u0085\7\36\2\2\u0085\u0086\5\26"+
		"\f\2\u0086\u0087\5\24\13\2\u0087\23\3\2\2\2\u0088\u008a\7(\2\2\u0089\u0088"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0090\7\3\2\2\u008c"+
		"\u008f\7(\2\2\u008d\u008f\5\4\3\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2"+
		"\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7\4\2\2\u0094\25\3\2\2"+
		"\2\u0095\u0096\7\'\2\2\u0096\u0097\7\b\2\2\u0097\u0098\5*\26\2\u0098\27"+
		"\3\2\2\2\u0099\u009a\7 \2\2\u009a\u009b\7\'\2\2\u009b\u009e\5(\25\2\u009c"+
		"\u009d\7\t\2\2\u009d\u009f\5$\23\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\31\3\2\2\2\u00a0\u00a2\7\'\2\2\u00a1\u00a3\5*\26\2\u00a2\u00a1"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\7\t\2\2\u00a5"+
		"\u00a6\5$\23\2\u00a6\33\3\2\2\2\u00a7\u00a9\7!\2\2\u00a8\u00aa\5$\23\2"+
		"\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\35\3\2\2\2\u00ab\u00ac"+
		"\7\'\2\2\u00ac\u00b5\7\5\2\2\u00ad\u00b2\5$\23\2\u00ae\u00af\7\6\2\2\u00af"+
		"\u00b1\5$\23\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2"+
		"\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5"+
		"\u00ad\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\7\7"+
		"\2\2\u00b8\37\3\2\2\2\u00b9\u00ba\5\36\20\2\u00ba!\3\2\2\2\u00bb\u00bc"+
		"\7#\2\2\u00bc\u00bd\5$\23\2\u00bd#\3\2\2\2\u00be\u00bf\b\23\1\2\u00bf"+
		"\u00c0\7\n\2\2\u00c0\u00c6\5$\23\13\u00c1\u00c3\5&\24\2\u00c2\u00c4\5"+
		"*\26\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5"+
		"\u00be\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c6\u00de\3\2\2\2\u00c7\u00c8\f\7"+
		"\2\2\u00c8\u00c9\7\16\2\2\u00c9\u00dd\5$\23\b\u00ca\u00cb\f\6\2\2\u00cb"+
		"\u00cc\7\17\2\2\u00cc\u00dd\5$\23\7\u00cd\u00ce\f\5\2\2\u00ce\u00cf\7"+
		"\20\2\2\u00cf\u00dd\5$\23\6\u00d0\u00d1\f\4\2\2\u00d1\u00d2\7\21\2\2\u00d2"+
		"\u00dd\5$\23\5\u00d3\u00d4\f\n\2\2\u00d4\u00d5\7\13\2\2\u00d5\u00dd\7"+
		"&\2\2\u00d6\u00d7\f\t\2\2\u00d7\u00d8\7\f\2\2\u00d8\u00dd\7&\2\2\u00d9"+
		"\u00da\f\b\2\2\u00da\u00db\7\r\2\2\u00db\u00dd\7&\2\2\u00dc\u00c7\3\2"+
		"\2\2\u00dc\u00ca\3\2\2\2\u00dc\u00cd\3\2\2\2\u00dc\u00d0\3\2\2\2\u00dc"+
		"\u00d3\3\2\2\2\u00dc\u00d6\3\2\2\2\u00dc\u00d9\3\2\2\2\u00dd\u00e0\3\2"+
		"\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df%\3\2\2\2\u00e0\u00de"+
		"\3\2\2\2\u00e1\u00e2\7\5\2\2\u00e2\u00e3\5$\23\2\u00e3\u00e4\7\7\2\2\u00e4"+
		"\u00ea\3\2\2\2\u00e5\u00ea\7$\2\2\u00e6\u00ea\7%\2\2\u00e7\u00ea\7\'\2"+
		"\2\u00e8\u00ea\5\36\20\2\u00e9\u00e1\3\2\2\2\u00e9\u00e5\3\2\2\2\u00e9"+
		"\u00e6\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\'\3\2\2\2"+
		"\u00eb\u00ec\7\22\2\2\u00ec\u00ed\7&\2\2\u00ed\u00ee\7\23\2\2\u00ee)\3"+
		"\2\2\2\u00ef\u00f0\7\24\2\2\u00f0\u00f3\5,\27\2\u00f1\u00f2\7\25\2\2\u00f2"+
		"\u00f4\5,\27\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\u00f6\7\26\2\2\u00f6+\3\2\2\2\u00f7\u00f8\b\27\1\2\u00f8\u00fb"+
		"\7&\2\2\u00f9\u00fb\7\'\2\2\u00fa\u00f7\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb"+
		"\u0107\3\2\2\2\u00fc\u00fd\f\7\2\2\u00fd\u00fe\7\27\2\2\u00fe\u0106\5"+
		",\27\b\u00ff\u0100\f\6\2\2\u0100\u0101\7\30\2\2\u0101\u0106\5,\27\7\u0102"+
		"\u0103\f\5\2\2\u0103\u0104\7\31\2\2\u0104\u0106\5,\27\6\u0105\u00fc\3"+
		"\2\2\2\u0105\u00ff\3\2\2\2\u0105\u0102\3\2\2\2\u0106\u0109\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108-\3\2\2\2\u0109\u0107\3\2\2\2"+
		" \60\62@CHJX]gjqvx\u0089\u008e\u0090\u009e\u00a2\u00a9\u00b2\u00b5\u00c3"+
		"\u00c5\u00dc\u00de\u00e9\u00f3\u00fa\u0105\u0107";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}