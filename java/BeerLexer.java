// Generated from BeerLexer.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BeerLexer extends BeerBaseLexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

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
		DecimalLiteral=39, HexIntegerLiteral=40, Break=41, Case=42, Else=43, ElseIf=44, 
		New=45, Catch=46, Return=47, Void=48, Continue=49, For=50, Switch=51, 
		While=52, Function=53, This=54, Default=55, If=56, Throw=57, In=58, Try=59, 
		MainInit=60, MainFinish=61, Int=62, Float=63, Boolean=64, String=65, Array=66, 
		Print=67, Read=68, Class=69, Const=70, Import=71, Static=72, Identifier=73, 
		StringLiteral=74, TemplateStringLiteral=75, WhiteSpaces=76, LineTerminator=77, 
		UnexpectedCharacter=78;
	public static final int
		ERROR=2;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"MultiLineComment", "SingleLineComment", "RegularExpressionLiteral", "OpenBracket", 
		"CloseBracket", "OpenParen", "CloseParen", "OpenBrace", "CloseBrace", 
		"SemiColon", "Comma", "Assign", "QuestionMark", "Colon", "Dot", "PlusPlus", 
		"MinusMinus", "Plus", "Minus", "Not", "Multiply", "Divide", "Modulus", 
		"LessThan", "MoreThan", "LessThanEquals", "GreaterThanEquals", "Equals_", 
		"NotEquals", "And", "Or", "MultiplyAssign", "DivideAssign", "ModulusAssign", 
		"PlusAssign", "MinusAssign", "NullLiteral", "BooleanLiteral", "DecimalLiteral", 
		"HexIntegerLiteral", "Break", "Case", "Else", "ElseIf", "New", "Catch", 
		"Return", "Void", "Continue", "For", "Switch", "While", "Function", "This", 
		"Default", "If", "Throw", "In", "Try", "MainInit", "MainFinish", "Int", 
		"Float", "Boolean", "String", "Array", "Print", "Read", "Class", "Const", 
		"Import", "Static", "Identifier", "StringLiteral", "TemplateStringLiteral", 
		"WhiteSpaces", "LineTerminator", "UnexpectedCharacter", "DoubleStringCharacter", 
		"SingleStringCharacter", "EscapeSequence", "CharacterEscapeSequence", 
		"UnicodeEscapeSequence", "ExtendedUnicodeEscapeSequence", "SingleEscapeCharacter", 
		"NonEscapeCharacter", "EscapeCharacter", "LineContinuation", "HexDigit", 
		"DecimalIntegerLiteral", "ExponentPart", "IdentifierPart", "IdentifierStart", 
		"UnicodeLetter", "UnicodeCombiningMark", "UnicodeDigit", "UnicodeConnectorPunctuation", 
		"RegularExpressionChar", "RegularExpressionClassChar", "RegularExpressionBackslashSequence"
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
		"'porção'", "'conta pra gente'", "'qual a boa'", "'cerva'", "'trincando'", 
		"'chega ai queridao'", "'da galera'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MultiLineComment", "SingleLineComment", "RegularExpressionLiteral", 
		"OpenBracket", "CloseBracket", "OpenParen", "CloseParen", "OpenBrace", 
		"CloseBrace", "SemiColon", "Comma", "Assign", "QuestionMark", "Colon", 
		"Dot", "PlusPlus", "MinusMinus", "Plus", "Minus", "Not", "Multiply", "Divide", 
		"Modulus", "LessThan", "MoreThan", "LessThanEquals", "GreaterThanEquals", 
		"Equals_", "NotEquals", "And", "Or", "MultiplyAssign", "DivideAssign", 
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


	public BeerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BeerLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2P\u0370\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\3\2\3\2\3\2\3\2\7\2\u00d0\n\2\f\2\16"+
		"\2\u00d3\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u00de\n\3\f\3\16"+
		"\3\u00e1\13\3\3\3\3\3\3\4\3\4\6\4\u00e7\n\4\r\4\16\4\u00e8\3\4\3\4\7\4"+
		"\u00ed\n\4\f\4\16\4\u00f0\13\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\""+
		"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0159\n\'\3(\3(\3(\7(\u015e"+
		"\n(\f(\16(\u0161\13(\3(\5(\u0164\n(\3(\3(\6(\u0168\n(\r(\16(\u0169\3("+
		"\5(\u016d\n(\3(\3(\5(\u0171\n(\5(\u0173\n(\3)\3)\3)\6)\u0178\n)\r)\16"+
		")\u0179\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3"+
		"+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\38\38\38\38\38\38\38\39\39\39\39\39\39\39\39\39\39\3:"+
		"\3:\3:\3:\3:\3:\3:\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<"+
		"\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>"+
		"\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3A\3A\3A\3A\3A\3B\3B"+
		"\3B\3B\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D"+
		"\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G"+
		"\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H"+
		"\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3J\3J\7J\u02cf\nJ\fJ\16J\u02d2\13J\3"+
		"K\3K\7K\u02d6\nK\fK\16K\u02d9\13K\3K\3K\3K\7K\u02de\nK\fK\16K\u02e1\13"+
		"K\3K\5K\u02e4\nK\3L\3L\3L\3L\7L\u02ea\nL\fL\16L\u02ed\13L\3L\3L\3M\6M"+
		"\u02f2\nM\rM\16M\u02f3\3M\3M\3N\3N\3N\3N\3O\3O\3O\3O\3P\3P\3P\3P\5P\u0304"+
		"\nP\3Q\3Q\3Q\3Q\5Q\u030a\nQ\3R\3R\3R\3R\5R\u0310\nR\3S\3S\5S\u0314\nS"+
		"\3T\3T\3T\3T\3T\3T\3U\3U\3U\6U\u031f\nU\rU\16U\u0320\3U\3U\3V\3V\3W\3"+
		"W\3X\3X\5X\u032b\nX\3Y\3Y\3Y\3Z\3Z\3[\3[\3[\7[\u0335\n[\f[\16[\u0338\13"+
		"[\5[\u033a\n[\3\\\3\\\5\\\u033e\n\\\3\\\6\\\u0341\n\\\r\\\16\\\u0342\3"+
		"]\3]\3]\3]\3]\5]\u034a\n]\3^\3^\3^\3^\5^\u0350\n^\3_\5_\u0353\n_\3`\5"+
		"`\u0356\n`\3a\5a\u0359\na\3b\5b\u035c\nb\3c\3c\3c\3c\7c\u0362\nc\fc\16"+
		"c\u0365\13c\3c\5c\u0368\nc\3d\3d\5d\u036c\nd\3e\3e\3e\3\u00d1\2f\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008f"+
		"I\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009f\2\u00a1\2\u00a3"+
		"\2\u00a5\2\u00a7\2\u00a9\2\u00ab\2\u00ad\2\u00af\2\u00b1\2\u00b3\2\u00b5"+
		"\2\u00b7\2\u00b9\2\u00bb\2\u00bd\2\u00bf\2\u00c1\2\u00c3\2\u00c5\2\u00c7"+
		"\2\u00c9\2\3\2\27\5\2\f\f\17\17\u202a\u202b\3\2\62;\4\2ZZzz\3\2bb\6\2"+
		"\13\13\r\16\"\"\u00a2\u00a2\6\2\f\f\17\17$$^^\6\2\f\f\17\17))^^\13\2$"+
		"$))^^ddhhppttvvxx\16\2\f\f\17\17$$))\62;^^ddhhppttvxzz\5\2\62;wwzz\5\2"+
		"\62;CHch\3\2\63;\4\2GGgg\4\2--//\4\2&&aa\u0104\2C\\c|\u00ac\u00ac\u00b7"+
		"\u00b7\u00bc\u00bc\u00c2\u00d8\u00da\u00f8\u00fa\u0221\u0224\u0235\u0252"+
		"\u02af\u02b2\u02ba\u02bd\u02c3\u02d2\u02d3\u02e2\u02e6\u02f0\u02f0\u037c"+
		"\u037c\u0388\u0388\u038a\u038c\u038e\u038e\u0390\u03a3\u03a5\u03d0\u03d2"+
		"\u03d9\u03dc\u03f5\u0402\u0483\u048e\u04c6\u04c9\u04ca\u04cd\u04ce\u04d2"+
		"\u04f7\u04fa\u04fb\u0533\u0558\u055b\u055b\u0563\u0589\u05d2\u05ec\u05f2"+
		"\u05f4\u0623\u063c\u0642\u064c\u0673\u06d5\u06d7\u06d7\u06e7\u06e8\u06fc"+
		"\u06fe\u0712\u0712\u0714\u072e\u0782\u07a7\u0907\u093b\u093f\u093f\u0952"+
		"\u0952\u095a\u0963\u0987\u098e\u0991\u0992\u0995\u09aa\u09ac\u09b2\u09b4"+
		"\u09b4\u09b8\u09bb\u09de\u09df\u09e1\u09e3\u09f2\u09f3\u0a07\u0a0c\u0a11"+
		"\u0a12\u0a15\u0a2a\u0a2c\u0a32\u0a34\u0a35\u0a37\u0a38\u0a3a\u0a3b\u0a5b"+
		"\u0a5e\u0a60\u0a60\u0a74\u0a76\u0a87\u0a8d\u0a8f\u0a8f\u0a91\u0a93\u0a95"+
		"\u0aaa\u0aac\u0ab2\u0ab4\u0ab5\u0ab7\u0abb\u0abf\u0abf\u0ad2\u0ad2\u0ae2"+
		"\u0ae2\u0b07\u0b0e\u0b11\u0b12\u0b15\u0b2a\u0b2c\u0b32\u0b34\u0b35\u0b38"+
		"\u0b3b\u0b3f\u0b3f\u0b5e\u0b5f\u0b61\u0b63\u0b87\u0b8c\u0b90\u0b92\u0b94"+
		"\u0b97\u0b9b\u0b9c\u0b9e\u0b9e\u0ba0\u0ba1\u0ba5\u0ba6\u0baa\u0bac\u0bb0"+
		"\u0bb7\u0bb9\u0bbb\u0c07\u0c0e\u0c10\u0c12\u0c14\u0c2a\u0c2c\u0c35\u0c37"+
		"\u0c3b\u0c62\u0c63\u0c87\u0c8e\u0c90\u0c92\u0c94\u0caa\u0cac\u0cb5\u0cb7"+
		"\u0cbb\u0ce0\u0ce0\u0ce2\u0ce3\u0d07\u0d0e\u0d10\u0d12\u0d14\u0d2a\u0d2c"+
		"\u0d3b\u0d62\u0d63\u0d87\u0d98\u0d9c\u0db3\u0db5\u0dbd\u0dbf\u0dbf\u0dc2"+
		"\u0dc8\u0e03\u0e32\u0e34\u0e35\u0e42\u0e48\u0e83\u0e84\u0e86\u0e86\u0e89"+
		"\u0e8a\u0e8c\u0e8c\u0e8f\u0e8f\u0e96\u0e99\u0e9b\u0ea1\u0ea3\u0ea5\u0ea7"+
		"\u0ea7\u0ea9\u0ea9\u0eac\u0ead\u0eaf\u0eb2\u0eb4\u0eb5\u0ebf\u0ec6\u0ec8"+
		"\u0ec8\u0ede\u0edf\u0f02\u0f02\u0f42\u0f6c\u0f8a\u0f8d\u1002\u1023\u1025"+
		"\u1029\u102b\u102c\u1052\u1057\u10a2\u10c7\u10d2\u10f8\u1102\u115b\u1161"+
		"\u11a4\u11aa\u11fb\u1202\u1208\u120a\u1248\u124a\u124a\u124c\u124f\u1252"+
		"\u1258\u125a\u125a\u125c\u125f\u1262\u1288\u128a\u128a\u128c\u128f\u1292"+
		"\u12b0\u12b2\u12b2\u12b4\u12b7\u12ba\u12c0\u12c2\u12c2\u12c4\u12c7\u12ca"+
		"\u12d0\u12d2\u12d8\u12da\u12f0\u12f2\u1310\u1312\u1312\u1314\u1317\u131a"+
		"\u1320\u1322\u1348\u134a\u135c\u13a2\u13f6\u1403\u1678\u1683\u169c\u16a2"+
		"\u16ec\u1782\u17b5\u1822\u1879\u1882\u18aa\u1e02\u1e9d\u1ea2\u1efb\u1f02"+
		"\u1f17\u1f1a\u1f1f\u1f22\u1f47\u1f4a\u1f4f\u1f52\u1f59\u1f5b\u1f5b\u1f5d"+
		"\u1f5d\u1f5f\u1f5f\u1f61\u1f7f\u1f82\u1fb6\u1fb8\u1fbe\u1fc0\u1fc0\u1fc4"+
		"\u1fc6\u1fc8\u1fce\u1fd2\u1fd5\u1fd8\u1fdd\u1fe2\u1fee\u1ff4\u1ff6\u1ff8"+
		"\u1ffe\u2081\u2081\u2104\u2104\u2109\u2109\u210c\u2115\u2117\u2117\u211b"+
		"\u211f\u2126\u2126\u2128\u2128\u212a\u212a\u212c\u212f\u2131\u2133\u2135"+
		"\u213b\u2162\u2185\u3007\u3009\u3023\u302b\u3033\u3037\u303a\u303c\u3043"+
		"\u3096\u309f\u30a0\u30a3\u30fc\u30fe\u3100\u3107\u312e\u3133\u3190\u31a2"+
		"\u31b9\u3402\u3402\u4db7\u4db7\u4e02\u4e02\u9fa7\u9fa7\ua002\ua48e\uac02"+
		"\uac02\ud7a5\ud7a5\uf902\ufa2f\ufb02\ufb08\ufb15\ufb19\ufb1f\ufb1f\ufb21"+
		"\ufb2a\ufb2c\ufb38\ufb3a\ufb3e\ufb40\ufb40\ufb42\ufb43\ufb45\ufb46\ufb48"+
		"\ufbb3\ufbd5\ufd3f\ufd52\ufd91\ufd94\ufdc9\ufdf2\ufdfd\ufe72\ufe74\ufe76"+
		"\ufe76\ufe78\ufefe\uff23\uff3c\uff43\uff5c\uff68\uffc0\uffc4\uffc9\uffcc"+
		"\uffd1\uffd4\uffd9\uffdc\uffdef\2\u0302\u0350\u0362\u0364\u0485\u0488"+
		"\u0593\u05a3\u05a5\u05bb\u05bd\u05bf\u05c1\u05c1\u05c3\u05c4\u05c6\u05c6"+
		"\u064d\u0657\u0672\u0672\u06d8\u06de\u06e1\u06e6\u06e9\u06ea\u06ec\u06ef"+
		"\u0713\u0713\u0732\u074c\u07a8\u07b2\u0903\u0905\u093e\u093e\u0940\u094f"+
		"\u0953\u0956\u0964\u0965\u0983\u0985\u09be\u09c6\u09c9\u09ca\u09cd\u09cf"+
		"\u09d9\u09d9\u09e4\u09e5\u0a04\u0a04\u0a3e\u0a3e\u0a40\u0a44\u0a49\u0a4a"+
		"\u0a4d\u0a4f\u0a72\u0a73\u0a83\u0a85\u0abe\u0abe\u0ac0\u0ac7\u0ac9\u0acb"+
		"\u0acd\u0acf\u0b03\u0b05\u0b3e\u0b3e\u0b40\u0b45\u0b49\u0b4a\u0b4d\u0b4f"+
		"\u0b58\u0b59\u0b84\u0b85\u0bc0\u0bc4\u0bc8\u0bca\u0bcc\u0bcf\u0bd9\u0bd9"+
		"\u0c03\u0c05\u0c40\u0c46\u0c48\u0c4a\u0c4c\u0c4f\u0c57\u0c58\u0c84\u0c85"+
		"\u0cc0\u0cc6\u0cc8\u0cca\u0ccc\u0ccf\u0cd7\u0cd8\u0d04\u0d05\u0d40\u0d45"+
		"\u0d48\u0d4a\u0d4c\u0d4f\u0d59\u0d59\u0d84\u0d85\u0dcc\u0dcc\u0dd1\u0dd6"+
		"\u0dd8\u0dd8\u0dda\u0de1\u0df4\u0df5\u0e33\u0e33\u0e36\u0e3c\u0e49\u0e50"+
		"\u0eb3\u0eb3\u0eb6\u0ebb\u0ebd\u0ebe\u0eca\u0ecf\u0f1a\u0f1b\u0f37\u0f37"+
		"\u0f39\u0f39\u0f3b\u0f3b\u0f40\u0f41\u0f73\u0f86\u0f88\u0f89\u0f92\u0f99"+
		"\u0f9b\u0fbe\u0fc8\u0fc8\u102e\u1034\u1038\u103b\u1058\u105b\u17b6\u17d5"+
		"\u18ab\u18ab\u20d2\u20de\u20e3\u20e3\u302c\u3031\u309b\u309c\ufb20\ufb20"+
		"\ufe22\ufe25\26\2\62;\u0662\u066b\u06f2\u06fb\u0968\u0971\u09e8\u09f1"+
		"\u0a68\u0a71\u0ae8\u0af1\u0b68\u0b71\u0be9\u0bf1\u0c68\u0c71\u0ce8\u0cf1"+
		"\u0d68\u0d71\u0e52\u0e5b\u0ed2\u0edb\u0f22\u0f2b\u1042\u104b\u136b\u1373"+
		"\u17e2\u17eb\u1812\u181b\uff12\uff1b\t\2aa\u2041\u2042\u30fd\u30fd\ufe35"+
		"\ufe36\ufe4f\ufe51\uff41\uff41\uff67\uff67\7\2\f\f\17\17\61\61]^\u202a"+
		"\u202b\6\2\f\f\17\17^_\u202a\u202b\u0385\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3"+
		"\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3"+
		"\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2"+
		"\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2"+
		"\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\3\u00cb\3\2\2\2\5\u00d9\3\2\2\2\7\u00e4"+
		"\3\2\2\2\t\u00f1\3\2\2\2\13\u00f3\3\2\2\2\r\u00f5\3\2\2\2\17\u00f7\3\2"+
		"\2\2\21\u00f9\3\2\2\2\23\u00fb\3\2\2\2\25\u00fd\3\2\2\2\27\u00ff\3\2\2"+
		"\2\31\u0101\3\2\2\2\33\u0103\3\2\2\2\35\u0105\3\2\2\2\37\u0107\3\2\2\2"+
		"!\u0109\3\2\2\2#\u010c\3\2\2\2%\u010f\3\2\2\2\'\u0111\3\2\2\2)\u0113\3"+
		"\2\2\2+\u0115\3\2\2\2-\u0117\3\2\2\2/\u0119\3\2\2\2\61\u011b\3\2\2\2\63"+
		"\u011d\3\2\2\2\65\u011f\3\2\2\2\67\u0122\3\2\2\29\u0125\3\2\2\2;\u0128"+
		"\3\2\2\2=\u012b\3\2\2\2?\u012e\3\2\2\2A\u0131\3\2\2\2C\u0134\3\2\2\2E"+
		"\u0137\3\2\2\2G\u013a\3\2\2\2I\u013d\3\2\2\2K\u0140\3\2\2\2M\u0158\3\2"+
		"\2\2O\u0172\3\2\2\2Q\u0174\3\2\2\2S\u017b\3\2\2\2U\u018a\3\2\2\2W\u0190"+
		"\3\2\2\2Y\u019e\3\2\2\2[\u01aa\3\2\2\2]\u01ba\3\2\2\2_\u01c3\3\2\2\2a"+
		"\u01cd\3\2\2\2c\u01d7\3\2\2\2e\u01e5\3\2\2\2g\u01f1\3\2\2\2i\u01fa\3\2"+
		"\2\2k\u0208\3\2\2\2m\u021d\3\2\2\2o\u0225\3\2\2\2q\u022c\3\2\2\2s\u0236"+
		"\3\2\2\2u\u023d\3\2\2\2w\u0240\3\2\2\2y\u0252\3\2\2\2{\u025e\3\2\2\2}"+
		"\u026a\3\2\2\2\177\u0271\3\2\2\2\u0081\u0275\3\2\2\2\u0083\u027a\3\2\2"+
		"\2\u0085\u027e\3\2\2\2\u0087\u0285\3\2\2\2\u0089\u0295\3\2\2\2\u008b\u02a0"+
		"\3\2\2\2\u008d\u02a6\3\2\2\2\u008f\u02b0\3\2\2\2\u0091\u02c2\3\2\2\2\u0093"+
		"\u02cc\3\2\2\2\u0095\u02e3\3\2\2\2\u0097\u02e5\3\2\2\2\u0099\u02f1\3\2"+
		"\2\2\u009b\u02f7\3\2\2\2\u009d\u02fb\3\2\2\2\u009f\u0303\3\2\2\2\u00a1"+
		"\u0309\3\2\2\2\u00a3\u030f\3\2\2\2\u00a5\u0313\3\2\2\2\u00a7\u0315\3\2"+
		"\2\2\u00a9\u031b\3\2\2\2\u00ab\u0324\3\2\2\2\u00ad\u0326\3\2\2\2\u00af"+
		"\u032a\3\2\2\2\u00b1\u032c\3\2\2\2\u00b3\u032f\3\2\2\2\u00b5\u0339\3\2"+
		"\2\2\u00b7\u033b\3\2\2\2\u00b9\u0349\3\2\2\2\u00bb\u034f\3\2\2\2\u00bd"+
		"\u0352\3\2\2\2\u00bf\u0355\3\2\2\2\u00c1\u0358\3\2\2\2\u00c3\u035b\3\2"+
		"\2\2\u00c5\u0367\3\2\2\2\u00c7\u036b\3\2\2\2\u00c9\u036d\3\2\2\2\u00cb"+
		"\u00cc\7\61\2\2\u00cc\u00cd\7,\2\2\u00cd\u00d1\3\2\2\2\u00ce\u00d0\13"+
		"\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7,"+
		"\2\2\u00d5\u00d6\7\61\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\b\2\2\2\u00d8"+
		"\4\3\2\2\2\u00d9\u00da\7\61\2\2\u00da\u00db\7\61\2\2\u00db\u00df\3\2\2"+
		"\2\u00dc\u00de\n\2\2\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd"+
		"\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2"+
		"\u00e3\b\3\2\2\u00e3\6\3\2\2\2\u00e4\u00e6\7\61\2\2\u00e5\u00e7\5\u00c5"+
		"c\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ee\7\61\2\2\u00eb\u00ed\5"+
		"\u00b9]\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2"+
		"\u00ee\u00ef\3\2\2\2\u00ef\b\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\7"+
		"]\2\2\u00f2\n\3\2\2\2\u00f3\u00f4\7_\2\2\u00f4\f\3\2\2\2\u00f5\u00f6\7"+
		"*\2\2\u00f6\16\3\2\2\2\u00f7\u00f8\7+\2\2\u00f8\20\3\2\2\2\u00f9\u00fa"+
		"\7}\2\2\u00fa\22\3\2\2\2\u00fb\u00fc\7\177\2\2\u00fc\24\3\2\2\2\u00fd"+
		"\u00fe\7=\2\2\u00fe\26\3\2\2\2\u00ff\u0100\7.\2\2\u0100\30\3\2\2\2\u0101"+
		"\u0102\7?\2\2\u0102\32\3\2\2\2\u0103\u0104\7A\2\2\u0104\34\3\2\2\2\u0105"+
		"\u0106\7<\2\2\u0106\36\3\2\2\2\u0107\u0108\7\60\2\2\u0108 \3\2\2\2\u0109"+
		"\u010a\7-\2\2\u010a\u010b\7-\2\2\u010b\"\3\2\2\2\u010c\u010d\7/\2\2\u010d"+
		"\u010e\7/\2\2\u010e$\3\2\2\2\u010f\u0110\7-\2\2\u0110&\3\2\2\2\u0111\u0112"+
		"\7/\2\2\u0112(\3\2\2\2\u0113\u0114\7#\2\2\u0114*\3\2\2\2\u0115\u0116\7"+
		",\2\2\u0116,\3\2\2\2\u0117\u0118\7\61\2\2\u0118.\3\2\2\2\u0119\u011a\7"+
		"\'\2\2\u011a\60\3\2\2\2\u011b\u011c\7>\2\2\u011c\62\3\2\2\2\u011d\u011e"+
		"\7@\2\2\u011e\64\3\2\2\2\u011f\u0120\7>\2\2\u0120\u0121\7?\2\2\u0121\66"+
		"\3\2\2\2\u0122\u0123\7@\2\2\u0123\u0124\7?\2\2\u01248\3\2\2\2\u0125\u0126"+
		"\7?\2\2\u0126\u0127\7?\2\2\u0127:\3\2\2\2\u0128\u0129\7#\2\2\u0129\u012a"+
		"\7?\2\2\u012a<\3\2\2\2\u012b\u012c\7(\2\2\u012c\u012d\7(\2\2\u012d>\3"+
		"\2\2\2\u012e\u012f\7~\2\2\u012f\u0130\7~\2\2\u0130@\3\2\2\2\u0131\u0132"+
		"\7,\2\2\u0132\u0133\7?\2\2\u0133B\3\2\2\2\u0134\u0135\7\61\2\2\u0135\u0136"+
		"\7?\2\2\u0136D\3\2\2\2\u0137\u0138\7\'\2\2\u0138\u0139\7?\2\2\u0139F\3"+
		"\2\2\2\u013a\u013b\7-\2\2\u013b\u013c\7?\2\2\u013cH\3\2\2\2\u013d\u013e"+
		"\7/\2\2\u013e\u013f\7?\2\2\u013fJ\3\2\2\2\u0140\u0141\7e\2\2\u0141\u0142"+
		"\7c\2\2\u0142\u0143\7u\2\2\u0143\u0144\7e\2\2\u0144\u0145\7q\2\2\u0145"+
		"\u0146\7\"\2\2\u0146\u0147\7x\2\2\u0147\u0148\7c\2\2\u0148\u0149\7|\2"+
		"\2\u0149\u014a\7k\2\2\u014a\u014b\7q\2\2\u014bL\3\2\2\2\u014c\u014d\7"+
		"i\2\2\u014d\u014e\7g\2\2\u014e\u014f\7n\2\2\u014f\u0150\7c\2\2\u0150\u0151"+
		"\7f\2\2\u0151\u0159\7c\2\2\u0152\u0153\7s\2\2\u0153\u0154\7w\2\2\u0154"+
		"\u0155\7g\2\2\u0155\u0156\7p\2\2\u0156\u0157\7v\2\2\u0157\u0159\7g\2\2"+
		"\u0158\u014c\3\2\2\2\u0158\u0152\3\2\2\2\u0159N\3\2\2\2\u015a\u015b\5"+
		"\u00b5[\2\u015b\u015f\7\60\2\2\u015c\u015e\t\3\2\2\u015d\u015c\3\2\2\2"+
		"\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0163"+
		"\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0164\5\u00b7\\\2\u0163\u0162\3\2\2"+
		"\2\u0163\u0164\3\2\2\2\u0164\u0173\3\2\2\2\u0165\u0167\7\60\2\2\u0166"+
		"\u0168\t\3\2\2\u0167\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u0167\3\2"+
		"\2\2\u0169\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u016d\5\u00b7\\\2\u016c"+
		"\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u0173\3\2\2\2\u016e\u0170\5\u00b5"+
		"[\2\u016f\u0171\5\u00b7\\\2\u0170\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171"+
		"\u0173\3\2\2\2\u0172\u015a\3\2\2\2\u0172\u0165\3\2\2\2\u0172\u016e\3\2"+
		"\2\2\u0173P\3\2\2\2\u0174\u0175\7\62\2\2\u0175\u0177\t\4\2\2\u0176\u0178"+
		"\5\u00b3Z\2\u0177\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u0177\3\2\2"+
		"\2\u0179\u017a\3\2\2\2\u017aR\3\2\2\2\u017b\u017c\7s\2\2\u017c\u017d\7"+
		"w\2\2\u017d\u017e\7g\2\2\u017e\u017f\7d\2\2\u017f\u0180\7t\2\2\u0180\u0181"+
		"\7q\2\2\u0181\u0182\7w\2\2\u0182\u0183\7\"\2\2\u0183\u0184\7q\2\2\u0184"+
		"\u0185\7\"\2\2\u0185\u0186\7e\2\2\u0186\u0187\7q\2\2\u0187\u0188\7r\2"+
		"\2\u0188\u0189\7q\2\2\u0189T\3\2\2\2\u018a\u018b\7q\2\2\u018b\u018c\7"+
		"r\2\2\u018c\u018d\7e\2\2\u018d\u018e\7c\2\2\u018e\u018f\7q\2\2\u018fV"+
		"\3\2\2\2\u0190\u0191\7v\2\2\u0191\u0192\7c\2\2\u0192\u0193\7\"\2\2\u0193"+
		"\u0194\7p\2\2\u0194\u0195\7c\2\2\u0195\u0196\7q\2\2\u0196\u0197\7\"\2"+
		"\2\u0197\u0198\7r\2\2\u0198\u0199\7c\2\2\u0199\u019a\7v\2\2\u019a\u019b"+
		"\7t\2\2\u019b\u019c\7c\2\2\u019c\u019d\7q\2\2\u019dX\3\2\2\2\u019e\u019f"+
		"\7v\2\2\u019f\u01a0\7g\2\2\u01a0\u01a1\7o\2\2\u01a1\u01a2\7\"\2\2\u01a2"+
		"\u01a3\7e\2\2\u01a3\u01a4\7g\2\2\u01a4\u01a5\7t\2\2\u01a5\u01a6\7v\2\2"+
		"\u01a6\u01a7\7g\2\2\u01a7\u01a8\7|\2\2\u01a8\u01a9\7c\2\2\u01a9Z\3\2\2"+
		"\2\u01aa\u01ab\7p\2\2\u01ab\u01ac\7q\2\2\u01ac\u01ad\7x\2\2\u01ad\u01ae"+
		"\7c\2\2\u01ae\u01af\7\"\2\2\u01af\u01b0\7p\2\2\u01b0\u01b1\7q\2\2\u01b1"+
		"\u01b2\7\"\2\2\u01b2\u01b3\7o\2\2\u01b3\u01b4\7g\2\2\u01b4\u01b5\7t\2"+
		"\2\u01b5\u01b6\7e\2\2\u01b6\u01b7\7c\2\2\u01b7\u01b8\7f\2\2\u01b8\u01b9"+
		"\7q\2\2\u01b9\\\3\2\2\2\u01ba\u01bb\7n\2\2\u01bb\u01bc\7g\2\2\u01bc\u01bd"+
		"\7k\2\2\u01bd\u01be\7\"\2\2\u01be\u01bf\7u\2\2\u01bf\u01c0\7g\2\2\u01c0"+
		"\u01c1\7e\2\2\u01c1\u01c2\7c\2\2\u01c2^\3\2\2\2\u01c3\u01c4\7f\2\2\u01c4"+
		"\u01c5\7g\2\2\u01c5\u01c6\7u\2\2\u01c6\u01c7\7e\2\2\u01c7\u01c8\7g\2\2"+
		"\u01c8\u01c9\7\"\2\2\u01c9\u01ca\7w\2\2\u01ca\u01cb\7o\2\2\u01cb\u01cc"+
		"\7c\2\2\u01cc`\3\2\2\2\u01cd\u01ce\7d\2\2\u01ce\u01cf\7c\2\2\u01cf\u01d0"+
		"\7t\2\2\u01d0\u01d1\7\"\2\2\u01d1\u01d2\7x\2\2\u01d2\u01d3\7c\2\2\u01d3"+
		"\u01d4\7|\2\2\u01d4\u01d5\7k\2\2\u01d5\u01d6\7q\2\2\u01d6b\3\2\2\2\u01d7"+
		"\u01d8\7v\2\2\u01d8\u01d9\7t\2\2\u01d9\u01da\7c\2\2\u01da\u01db\7|\2\2"+
		"\u01db\u01dc\7\"\2\2\u01dc\u01dd\7o\2\2\u01dd\u01de\7c\2\2\u01de\u01df"+
		"\7k\2\2\u01df\u01e0\7u\2\2\u01e0\u01e1\7\"\2\2\u01e1\u01e2\7w\2\2\u01e2"+
		"\u01e3\7o\2\2\u01e3\u01e4\7c\2\2\u01e4d\3\2\2\2\u01e5\u01e6\7v\2\2\u01e6"+
		"\u01e7\7q\2\2\u01e7\u01e8\7o\2\2\u01e8\u01e9\7c\2\2\u01e9\u01ea\7t\2\2"+
		"\u01ea\u01eb\7\"\2\2\u01eb\u01ec\7v\2\2\u01ec\u01ed\7q\2\2\u01ed\u01ee"+
		"\7f\2\2\u01ee\u01ef\7c\2\2\u01ef\u01f0\7u\2\2\u01f0f\3\2\2\2\u01f1\u01f2"+
		"\7e\2\2\u01f2\u01f3\7c\2\2\u01f3\u01f4\7t\2\2\u01f4\u01f5\7f\2\2\u01f5"+
		"\u01f6\7c\2\2\u01f6\u01f7\7r\2\2\u01f7\u01f8\7k\2\2\u01f8\u01f9\7q\2\2"+
		"\u01f9h\3\2\2\2\u01fa\u01fb\7g\2\2\u01fb\u01fc\7p\2\2\u01fc\u01fd\7e\2"+
		"\2\u01fd\u01fe\7j\2\2\u01fe\u01ff\7g\2\2\u01ff\u0200\7t\2\2\u0200\u0201"+
		"\7\"\2\2\u0201\u0202\7c\2\2\u0202\u0203\7\"\2\2\u0203\u0204\7e\2\2\u0204"+
		"\u0205\7c\2\2\u0205\u0206\7t\2\2\u0206\u0207\7c\2\2\u0207j\3\2\2\2\u0208"+
		"\u0209\7v\2\2\u0209\u020a\7t\2\2\u020a\u020b\7c\2\2\u020b\u020c\7|\2\2"+
		"\u020c\u020d\7\"\2\2\u020d\u020e\7r\2\2\u020e\u020f\7t\2\2\u020f\u0210"+
		"\7c\2\2\u0210\u0211\7\"\2\2\u0211\u0212\7p\2\2\u0212\u0213\7q\2\2\u0213"+
		"\u0214\7k\2\2\u0214\u0215\7u\2\2\u0215\u0216\7\"\2\2\u0216\u0217\7c\2"+
		"\2\u0217\u0218\7s\2\2\u0218\u0219\7w\2\2\u0219\u021a\7g\2\2\u021a\u021b"+
		"\7n\2\2\u021b\u021c\7c\2\2\u021cl\3\2\2\2\u021d\u021e\7v\2\2\u021e\u021f"+
		"\7w\2\2\u021f\u0220\7\"\2\2\u0220\u0221\7o\2\2\u0221\u0222\7g\2\2\u0222"+
		"\u0223\7o\2\2\u0223\u0224\7q\2\2\u0224n\3\2\2\2\u0225\u0226\7d\2\2\u0226"+
		"\u0227\7t\2\2\u0227\u0228\7c\2\2\u0228\u0229\7j\2\2\u0229\u022a\7o\2\2"+
		"\u022a\u022b\7c\2\2\u022bp\3\2\2\2\u022c\u022d\7v\2\2\u022d\u022e\7c\2"+
		"\2\u022e\u022f\7\"\2\2\u022f\u0230\7i\2\2\u0230\u0231\7g\2\2\u0231\u0232"+
		"\7n\2\2\u0232\u0233\7c\2\2\u0233\u0234\7f\2\2\u0234\u0235\7c\2\2\u0235"+
		"r\3\2\2\2\u0236\u0237\7f\2\2\u0237\u0238\7g\2\2\u0238\u0239\7w\2\2\u0239"+
		"\u023a\7\"\2\2\u023a\u023b\7r\2\2\u023b\u023c\7v\2\2\u023ct\3\2\2\2\u023d"+
		"\u023e\7f\2\2\u023e\u023f\7g\2\2\u023fv\3\2\2\2\u0240\u0241\7v\2\2\u0241"+
		"\u0242\7q\2\2\u0242\u0243\7\"\2\2\u0243\u0244\7e\2\2\u0244\u0245\7c\2"+
		"\2\u0245\u0246\7i\2\2\u0246\u0247\7c\2\2\u0247\u0248\7p\2\2\u0248\u0249"+
		"\7q\2\2\u0249\u024a\7\"\2\2\u024a\u024b\7f\2\2\u024b\u024c\7g\2\2\u024c"+
		"\u024d\7\"\2\2\u024d\u024e\7o\2\2\u024e\u024f\7g\2\2\u024f\u0250\7f\2"+
		"\2\u0250\u0251\7q\2\2\u0251x\3\2\2\2\u0252\u0253\7v\2\2\u0253\u0254\7"+
		"c\2\2\u0254\u0255\7e\2\2\u0255\u0256\7c\2\2\u0256\u0257\7/\2\2\u0257\u0258"+
		"\7n\2\2\u0258\u0259\7g\2\2\u0259\u025a\7\"\2\2\u025a\u025b\7r\2\2\u025b"+
		"\u025c\7c\2\2\u025c\u025d\7w\2\2\u025dz\3\2\2\2\u025e\u025f\7h\2\2\u025f"+
		"\u0260\7g\2\2\u0260\u0261\7e\2\2\u0261\u0262\7j\2\2\u0262\u0263\7c\2\2"+
		"\u0263\u0264\7\"\2\2\u0264\u0265\7e\2\2\u0265\u0266\7q\2\2\u0266\u0267"+
		"\7p\2\2\u0267\u0268\7v\2\2\u0268\u0269\7c\2\2\u0269|\3\2\2\2\u026a\u026b"+
		"\7r\2\2\u026b\u026c\7k\2\2\u026c\u026d\7n\2\2\u026d\u026e\7u\2\2\u026e"+
		"\u026f\7g\2\2\u026f\u0270\7p\2\2\u0270~\3\2\2\2\u0271\u0272\7k\2\2\u0272"+
		"\u0273\7r\2\2\u0273\u0274\7c\2\2\u0274\u0080\3\2\2\2\u0275\u0276\7d\2"+
		"\2\u0276\u0277\7q\2\2\u0277\u0278\7e\2\2\u0278\u0279\7m\2\2\u0279\u0082"+
		"\3\2\2\2\u027a\u027b\7c\2\2\u027b\u027c\7n\2\2\u027c\u027d\7g\2\2\u027d"+
		"\u0084\3\2\2\2\u027e\u027f\7r\2\2\u027f\u0280\7q\2\2\u0280\u0281\7t\2"+
		"\2\u0281\u0282\7\u00e9\2\2\u0282\u0283\7\u00e5\2\2\u0283\u0284\7q\2\2"+
		"\u0284\u0086\3\2\2\2\u0285\u0286\7e\2\2\u0286\u0287\7q\2\2\u0287\u0288"+
		"\7p\2\2\u0288\u0289\7v\2\2\u0289\u028a\7c\2\2\u028a\u028b\7\"\2\2\u028b"+
		"\u028c\7r\2\2\u028c\u028d\7t\2\2\u028d\u028e\7c\2\2\u028e\u028f\7\"\2"+
		"\2\u028f\u0290\7i\2\2\u0290\u0291\7g\2\2\u0291\u0292\7p\2\2\u0292\u0293"+
		"\7v\2\2\u0293\u0294\7g\2\2\u0294\u0088\3\2\2\2\u0295\u0296\7s\2\2\u0296"+
		"\u0297\7w\2\2\u0297\u0298\7c\2\2\u0298\u0299\7n\2\2\u0299\u029a\7\"\2"+
		"\2\u029a\u029b\7c\2\2\u029b\u029c\7\"\2\2\u029c\u029d\7d\2\2\u029d\u029e"+
		"\7q\2\2\u029e\u029f\7c\2\2\u029f\u008a\3\2\2\2\u02a0\u02a1\7e\2\2\u02a1"+
		"\u02a2\7g\2\2\u02a2\u02a3\7t\2\2\u02a3\u02a4\7x\2\2\u02a4\u02a5\7c\2\2"+
		"\u02a5\u008c\3\2\2\2\u02a6\u02a7\7v\2\2\u02a7\u02a8\7t\2\2\u02a8\u02a9"+
		"\7k\2\2\u02a9\u02aa\7p\2\2\u02aa\u02ab\7e\2\2\u02ab\u02ac\7c\2\2\u02ac"+
		"\u02ad\7p\2\2\u02ad\u02ae\7f\2\2\u02ae\u02af\7q\2\2\u02af\u008e\3\2\2"+
		"\2\u02b0\u02b1\7e\2\2\u02b1\u02b2\7j\2\2\u02b2\u02b3\7g\2\2\u02b3\u02b4"+
		"\7i\2\2\u02b4\u02b5\7c\2\2\u02b5\u02b6\7\"\2\2\u02b6\u02b7\7c\2\2\u02b7"+
		"\u02b8\7k\2\2\u02b8\u02b9\7\"\2\2\u02b9\u02ba\7s\2\2\u02ba\u02bb\7w\2"+
		"\2\u02bb\u02bc\7g\2\2\u02bc\u02bd\7t\2\2\u02bd\u02be\7k\2\2\u02be\u02bf"+
		"\7f\2\2\u02bf\u02c0\7c\2\2\u02c0\u02c1\7q\2\2\u02c1\u0090\3\2\2\2\u02c2"+
		"\u02c3\7f\2\2\u02c3\u02c4\7c\2\2\u02c4\u02c5\7\"\2\2\u02c5\u02c6\7i\2"+
		"\2\u02c6\u02c7\7c\2\2\u02c7\u02c8\7n\2\2\u02c8\u02c9\7g\2\2\u02c9\u02ca"+
		"\7t\2\2\u02ca\u02cb\7c\2\2\u02cb\u0092\3\2\2\2\u02cc\u02d0\5\u00bb^\2"+
		"\u02cd\u02cf\5\u00b9]\2\u02ce\u02cd\3\2\2\2\u02cf\u02d2\3\2\2\2\u02d0"+
		"\u02ce\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u0094\3\2\2\2\u02d2\u02d0\3\2"+
		"\2\2\u02d3\u02d7\7$\2\2\u02d4\u02d6\5\u009fP\2\u02d5\u02d4\3\2\2\2\u02d6"+
		"\u02d9\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02da\3\2"+
		"\2\2\u02d9\u02d7\3\2\2\2\u02da\u02e4\7$\2\2\u02db\u02df\7)\2\2\u02dc\u02de"+
		"\5\u00a1Q\2\u02dd\u02dc\3\2\2\2\u02de\u02e1\3\2\2\2\u02df\u02dd\3\2\2"+
		"\2\u02df\u02e0\3\2\2\2\u02e0\u02e2\3\2\2\2\u02e1\u02df\3\2\2\2\u02e2\u02e4"+
		"\7)\2\2\u02e3\u02d3\3\2\2\2\u02e3\u02db\3\2\2\2\u02e4\u0096\3\2\2\2\u02e5"+
		"\u02eb\7b\2\2\u02e6\u02e7\7^\2\2\u02e7\u02ea\7b\2\2\u02e8\u02ea\n\5\2"+
		"\2\u02e9\u02e6\3\2\2\2\u02e9\u02e8\3\2\2\2\u02ea\u02ed\3\2\2\2\u02eb\u02e9"+
		"\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ee\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ee"+
		"\u02ef\7b\2\2\u02ef\u0098\3\2\2\2\u02f0\u02f2\t\6\2\2\u02f1\u02f0\3\2"+
		"\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4"+
		"\u02f5\3\2\2\2\u02f5\u02f6\bM\2\2\u02f6\u009a\3\2\2\2\u02f7\u02f8\t\2"+
		"\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fa\bN\2\2\u02fa\u009c\3\2\2\2\u02fb"+
		"\u02fc\13\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02fe\bO\3\2\u02fe\u009e\3\2"+
		"\2\2\u02ff\u0304\n\7\2\2\u0300\u0301\7^\2\2\u0301\u0304\5\u00a3R\2\u0302"+
		"\u0304\5\u00b1Y\2\u0303\u02ff\3\2\2\2\u0303\u0300\3\2\2\2\u0303\u0302"+
		"\3\2\2\2\u0304\u00a0\3\2\2\2\u0305\u030a\n\b\2\2\u0306\u0307\7^\2\2\u0307"+
		"\u030a\5\u00a3R\2\u0308\u030a\5\u00b1Y\2\u0309\u0305\3\2\2\2\u0309\u0306"+
		"\3\2\2\2\u0309\u0308\3\2\2\2\u030a\u00a2\3\2\2\2\u030b\u0310\5\u00a5S"+
		"\2\u030c\u0310\7\62\2\2\u030d\u0310\5\u00a7T\2\u030e\u0310\5\u00a9U\2"+
		"\u030f\u030b\3\2\2\2\u030f\u030c\3\2\2\2\u030f\u030d\3\2\2\2\u030f\u030e"+
		"\3\2\2\2\u0310\u00a4\3\2\2\2\u0311\u0314\5\u00abV\2\u0312\u0314\5\u00ad"+
		"W\2\u0313\u0311\3\2\2\2\u0313\u0312\3\2\2\2\u0314\u00a6\3\2\2\2\u0315"+
		"\u0316\7w\2\2\u0316\u0317\5\u00b3Z\2\u0317\u0318\5\u00b3Z\2\u0318\u0319"+
		"\5\u00b3Z\2\u0319\u031a\5\u00b3Z\2\u031a\u00a8\3\2\2\2\u031b\u031c\7w"+
		"\2\2\u031c\u031e\7}\2\2\u031d\u031f\5\u00b3Z\2\u031e\u031d\3\2\2\2\u031f"+
		"\u0320\3\2\2\2\u0320\u031e\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0322\3\2"+
		"\2\2\u0322\u0323\7\177\2\2\u0323\u00aa\3\2\2\2\u0324\u0325\t\t\2\2\u0325"+
		"\u00ac\3\2\2\2\u0326\u0327\n\n\2\2\u0327\u00ae\3\2\2\2\u0328\u032b\5\u00ab"+
		"V\2\u0329\u032b\t\13\2\2\u032a\u0328\3\2\2\2\u032a\u0329\3\2\2\2\u032b"+
		"\u00b0\3\2\2\2\u032c\u032d\7^\2\2\u032d\u032e\t\2\2\2\u032e\u00b2\3\2"+
		"\2\2\u032f\u0330\t\f\2\2\u0330\u00b4\3\2\2\2\u0331\u033a\7\62\2\2\u0332"+
		"\u0336\t\r\2\2\u0333\u0335\t\3\2\2\u0334\u0333\3\2\2\2\u0335\u0338\3\2"+
		"\2\2\u0336\u0334\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u033a\3\2\2\2\u0338"+
		"\u0336\3\2\2\2\u0339\u0331\3\2\2\2\u0339\u0332\3\2\2\2\u033a\u00b6\3\2"+
		"\2\2\u033b\u033d\t\16\2\2\u033c\u033e\t\17\2\2\u033d\u033c\3\2\2\2\u033d"+
		"\u033e\3\2\2\2\u033e\u0340\3\2\2\2\u033f\u0341\t\3\2\2\u0340\u033f\3\2"+
		"\2\2\u0341\u0342\3\2\2\2\u0342\u0340\3\2\2\2\u0342\u0343\3\2\2\2\u0343"+
		"\u00b8\3\2\2\2\u0344\u034a\5\u00bb^\2\u0345\u034a\5\u00bf`\2\u0346\u034a"+
		"\5\u00c1a\2\u0347\u034a\5\u00c3b\2\u0348\u034a\4\u200e\u200f\2\u0349\u0344"+
		"\3\2\2\2\u0349\u0345\3\2\2\2\u0349\u0346\3\2\2\2\u0349\u0347\3\2\2\2\u0349"+
		"\u0348\3\2\2\2\u034a\u00ba\3\2\2\2\u034b\u0350\5\u00bd_\2\u034c\u0350"+
		"\t\20\2\2\u034d\u034e\7^\2\2\u034e\u0350\5\u00a7T\2\u034f\u034b\3\2\2"+
		"\2\u034f\u034c\3\2\2\2\u034f\u034d\3\2\2\2\u0350\u00bc\3\2\2\2\u0351\u0353"+
		"\t\21\2\2\u0352\u0351\3\2\2\2\u0353\u00be\3\2\2\2\u0354\u0356\t\22\2\2"+
		"\u0355\u0354\3\2\2\2\u0356\u00c0\3\2\2\2\u0357\u0359\t\23\2\2\u0358\u0357"+
		"\3\2\2\2\u0359\u00c2\3\2\2\2\u035a\u035c\t\24\2\2\u035b\u035a\3\2\2\2"+
		"\u035c\u00c4\3\2\2\2\u035d\u0368\n\25\2\2\u035e\u0368\5\u00c9e\2\u035f"+
		"\u0363\7]\2\2\u0360\u0362\5\u00c7d\2\u0361\u0360\3\2\2\2\u0362\u0365\3"+
		"\2\2\2\u0363\u0361\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0366\3\2\2\2\u0365"+
		"\u0363\3\2\2\2\u0366\u0368\7_\2\2\u0367\u035d\3\2\2\2\u0367\u035e\3\2"+
		"\2\2\u0367\u035f\3\2\2\2\u0368\u00c6\3\2\2\2\u0369\u036c\n\26\2\2\u036a"+
		"\u036c\5\u00c9e\2\u036b\u0369\3\2\2\2\u036b\u036a\3\2\2\2\u036c\u00c8"+
		"\3\2\2\2\u036d\u036e\7^\2\2\u036e\u036f\n\2\2\2\u036f\u00ca\3\2\2\2)\2"+
		"\u00d1\u00df\u00e8\u00ee\u0158\u015f\u0163\u0169\u016c\u0170\u0172\u0179"+
		"\u02d0\u02d7\u02df\u02e3\u02e9\u02eb\u02f3\u0303\u0309\u030f\u0313\u0320"+
		"\u032a\u0336\u0339\u033d\u0342\u0349\u034f\u0352\u0355\u0358\u035b\u0363"+
		"\u0367\u036b\4\2\3\2\2\4\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}