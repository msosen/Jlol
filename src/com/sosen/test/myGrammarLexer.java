// Generated from D:/STUDIA/6 SEMESTR/Kompilatory/JLoL\myGrammar.g4 by ANTLR 4.7
package com.sosen.test;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class myGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		XD=1, BlockOpenBracket=2, BlockCloseBracket=3, Integer=4, Float=5, String=6, 
		MathOperator=7, BooleanOperator=8, LogicalOperator=9, Boolean=10, If=11, 
		Elsif=12, Else=13, Then=14, IntegerType=15, FloatType=16, StringType=17, 
		BooleanType=18, VarName=19, EqualMark=20, Dot=21, QuoteMark=22, Semicolon=23, 
		OpenBracket=24, CloseBracket=25, SquareOpenBracket=26, SquareCloseBracket=27, 
		Text=28, Whitespace=29, Newline=30, BlockComment=31, LineComment=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Digit", "Char", "CharSequence", "XD", "BlockOpenBracket", "BlockCloseBracket", 
		"Integer", "Float", "String", "MathOperator", "BooleanOperator", "LogicalOperator", 
		"Boolean", "If", "Elsif", "Else", "Then", "IntegerType", "FloatType", 
		"StringType", "BooleanType", "VarName", "EqualMark", "Dot", "QuoteMark", 
		"Semicolon", "OpenBracket", "CloseBracket", "SquareOpenBracket", "SquareCloseBracket", 
		"Text", "Whitespace", "Newline", "BlockComment", "LineComment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'XD'", "'{'", "'}'", null, null, null, null, null, null, null, 
		"'if'", "'elsif'", "'else'", "'then'", "'int'", "'float'", "'string'", 
		"'boolean'", null, "'='", "'.'", "'\"'", "';'", "'('", "')'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "XD", "BlockOpenBracket", "BlockCloseBracket", "Integer", "Float", 
		"String", "MathOperator", "BooleanOperator", "LogicalOperator", "Boolean", 
		"If", "Elsif", "Else", "Then", "IntegerType", "FloatType", "StringType", 
		"BooleanType", "VarName", "EqualMark", "Dot", "QuoteMark", "Semicolon", 
		"OpenBracket", "CloseBracket", "SquareOpenBracket", "SquareCloseBracket", 
		"Text", "Whitespace", "Newline", "BlockComment", "LineComment"
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


	public myGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "myGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u00f9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\6\4O\n\4\r\4\16\4P\3\5\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\6\b[\n\b\r\b\16\b\\\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fs\n\f\3\r"+
		"\3\r\3\r\3\r\3\r\5\rz\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\7\27\u00b6\n\27\f\27\16\27\u00b9\13"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3 \7 \u00cc\n \f \16 \u00cf\13 \3!\6!\u00d2\n!\r!\16!\u00d3"+
		"\3!\3!\3\"\3\"\5\"\u00da\n\"\3\"\5\"\u00dd\n\"\3\"\3\"\3#\3#\3#\3#\7#"+
		"\u00e5\n#\f#\16#\u00e8\13#\3#\3#\3#\3#\3#\3$\3$\3$\3$\7$\u00f3\n$\f$\16"+
		"$\u00f6\13$\3$\3$\3\u00e6\2%\3\2\5\2\7\2\t\3\13\4\r\5\17\6\21\7\23\b\25"+
		"\t\27\n\31\13\33\f\35\r\37\16!\17#\20%\21\'\22)\23+\24-\25/\26\61\27\63"+
		"\30\65\31\67\329\33;\34=\35?\36A\37C E!G\"\3\2\7\3\2\62;\3\2c|\5\2,-/"+
		"/\61\61\4\2\13\13\"\"\4\2\f\f\17\17\2\u0105\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\3I\3\2\2\2\5K\3\2\2\2\7N\3\2\2\2\tR\3\2\2\2\13U\3\2\2\2\rW\3"+
		"\2\2\2\17Z\3\2\2\2\21^\3\2\2\2\23b\3\2\2\2\25f\3\2\2\2\27r\3\2\2\2\31"+
		"y\3\2\2\2\33{\3\2\2\2\35\u0086\3\2\2\2\37\u0089\3\2\2\2!\u008f\3\2\2\2"+
		"#\u0094\3\2\2\2%\u0099\3\2\2\2\'\u009d\3\2\2\2)\u00a3\3\2\2\2+\u00aa\3"+
		"\2\2\2-\u00b2\3\2\2\2/\u00ba\3\2\2\2\61\u00bc\3\2\2\2\63\u00be\3\2\2\2"+
		"\65\u00c0\3\2\2\2\67\u00c2\3\2\2\29\u00c4\3\2\2\2;\u00c6\3\2\2\2=\u00c8"+
		"\3\2\2\2?\u00cd\3\2\2\2A\u00d1\3\2\2\2C\u00dc\3\2\2\2E\u00e0\3\2\2\2G"+
		"\u00ee\3\2\2\2IJ\t\2\2\2J\4\3\2\2\2KL\t\3\2\2L\6\3\2\2\2MO\5\5\3\2NM\3"+
		"\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\b\3\2\2\2RS\7Z\2\2ST\7F\2\2T\n\3"+
		"\2\2\2UV\7}\2\2V\f\3\2\2\2WX\7\177\2\2X\16\3\2\2\2Y[\5\3\2\2ZY\3\2\2\2"+
		"[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\20\3\2\2\2^_\5\17\b\2_`\5\61\31\2`"+
		"a\5\17\b\2a\22\3\2\2\2bc\5\63\32\2cd\5\7\4\2de\5\63\32\2e\24\3\2\2\2f"+
		"g\t\4\2\2g\26\3\2\2\2hs\7>\2\2ij\7>\2\2js\7?\2\2ks\7@\2\2lm\7@\2\2ms\7"+
		"?\2\2no\7?\2\2os\7?\2\2pq\7#\2\2qs\7?\2\2rh\3\2\2\2ri\3\2\2\2rk\3\2\2"+
		"\2rl\3\2\2\2rn\3\2\2\2rp\3\2\2\2s\30\3\2\2\2tu\7c\2\2uv\7p\2\2vz\7f\2"+
		"\2wx\7q\2\2xz\7t\2\2yt\3\2\2\2yw\3\2\2\2z\32\3\2\2\2{|\7v\2\2|}\7t\2\2"+
		"}~\7w\2\2~\177\7g\2\2\177\u0080\3\2\2\2\u0080\u0081\7h\2\2\u0081\u0082"+
		"\7c\2\2\u0082\u0083\7n\2\2\u0083\u0084\7u\2\2\u0084\u0085\7g\2\2\u0085"+
		"\34\3\2\2\2\u0086\u0087\7k\2\2\u0087\u0088\7h\2\2\u0088\36\3\2\2\2\u0089"+
		"\u008a\7g\2\2\u008a\u008b\7n\2\2\u008b\u008c\7u\2\2\u008c\u008d\7k\2\2"+
		"\u008d\u008e\7h\2\2\u008e \3\2\2\2\u008f\u0090\7g\2\2\u0090\u0091\7n\2"+
		"\2\u0091\u0092\7u\2\2\u0092\u0093\7g\2\2\u0093\"\3\2\2\2\u0094\u0095\7"+
		"v\2\2\u0095\u0096\7j\2\2\u0096\u0097\7g\2\2\u0097\u0098\7p\2\2\u0098$"+
		"\3\2\2\2\u0099\u009a\7k\2\2\u009a\u009b\7p\2\2\u009b\u009c\7v\2\2\u009c"+
		"&\3\2\2\2\u009d\u009e\7h\2\2\u009e\u009f\7n\2\2\u009f\u00a0\7q\2\2\u00a0"+
		"\u00a1\7c\2\2\u00a1\u00a2\7v\2\2\u00a2(\3\2\2\2\u00a3\u00a4\7u\2\2\u00a4"+
		"\u00a5\7v\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7p\2\2"+
		"\u00a8\u00a9\7i\2\2\u00a9*\3\2\2\2\u00aa\u00ab\7d\2\2\u00ab\u00ac\7q\2"+
		"\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7g\2\2\u00af\u00b0"+
		"\7c\2\2\u00b0\u00b1\7p\2\2\u00b1,\3\2\2\2\u00b2\u00b7\5\5\3\2\u00b3\u00b6"+
		"\5\5\3\2\u00b4\u00b6\5\3\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6"+
		"\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8.\3\2\2\2"+
		"\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7?\2\2\u00bb\60\3\2\2\2\u00bc\u00bd\7"+
		"\60\2\2\u00bd\62\3\2\2\2\u00be\u00bf\7$\2\2\u00bf\64\3\2\2\2\u00c0\u00c1"+
		"\7=\2\2\u00c1\66\3\2\2\2\u00c2\u00c3\7*\2\2\u00c38\3\2\2\2\u00c4\u00c5"+
		"\7+\2\2\u00c5:\3\2\2\2\u00c6\u00c7\7]\2\2\u00c7<\3\2\2\2\u00c8\u00c9\7"+
		"_\2\2\u00c9>\3\2\2\2\u00ca\u00cc\5\5\3\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf"+
		"\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce@\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00d0\u00d2\t\5\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d6\b!\2\2\u00d6B\3\2\2\2\u00d7\u00d9\7\17\2\2\u00d8\u00da\7\f\2\2"+
		"\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00dd"+
		"\7\f\2\2\u00dc\u00d7\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00df\b\"\2\2\u00dfD\3\2\2\2\u00e0\u00e1\7\61\2\2\u00e1\u00e2\7,\2\2"+
		"\u00e2\u00e6\3\2\2\2\u00e3\u00e5\13\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8"+
		"\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e9\u00ea\7,\2\2\u00ea\u00eb\7\61\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00ed\b#\2\2\u00edF\3\2\2\2\u00ee\u00ef\7\61\2\2\u00ef\u00f0"+
		"\7\61\2\2\u00f0\u00f4\3\2\2\2\u00f1\u00f3\n\6\2\2\u00f2\u00f1\3\2\2\2"+
		"\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7"+
		"\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\b$\2\2\u00f8H\3\2\2\2\17\2P\\"+
		"ry\u00b5\u00b7\u00cd\u00d3\u00d9\u00dc\u00e6\u00f4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}