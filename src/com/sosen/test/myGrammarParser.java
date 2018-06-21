// Generated from D:/STUDIA/6 SEMESTR/Kompilatory/JLoL\myGrammar.g4 by ANTLR 4.7
package com.sosen.test;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class myGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		XD=1, BlockOpenBracket=2, BlockCloseBracket=3, Integer=4, Double=5, String=6, 
		MathOperator=7, BooleanOperator=8, LogicalOperator=9, Boolean=10, If=11, 
		Elsif=12, Else=13, Then=14, IntegerType=15, DoubleType=16, StringType=17, 
		BooleanType=18, VarName=19, EqualMark=20, Dot=21, QuoteMark=22, Semicolon=23, 
		OpenBracket=24, CloseBracket=25, SquareOpenBracket=26, SquareCloseBracket=27, 
		Text=28, Whitespace=29, Newline=30, BlockComment=31, LineComment=32;
	public static final int
		RULE_startq = 0, RULE_instructionsBlock = 1, RULE_declaration = 2, RULE_variableDec = 3, 
		RULE_stringDec = 4, RULE_arrayDec = 5, RULE_arrayVal = 6, RULE_varType = 7, 
		RULE_value = 8, RULE_variableType = 9, RULE_ifStatement = 10, RULE_logicalStatement = 11, 
		RULE_assignment = 12, RULE_equalMarkTok = 13, RULE_varNameTok = 14, RULE_squareOpenBracketTok = 15, 
		RULE_squareCloseBracketTok = 16, RULE_openBracketTok = 17, RULE_closeBracketTok = 18, 
		RULE_blockCloseBracketTok = 19, RULE_blockOpenBracketTok = 20, RULE_mathOperatorTok = 21, 
		RULE_integerTok = 22, RULE_doubleTok = 23, RULE_stringTok = 24, RULE_booleanTok = 25, 
		RULE_booleanOperatorTok = 26, RULE_integerTypeTok = 27, RULE_doubleTypeTok = 28, 
		RULE_stringTypeTok = 29, RULE_booleanTypeTok = 30, RULE_ifTok = 31, RULE_elsifTok = 32, 
		RULE_elseTok = 33, RULE_thenTok = 34, RULE_xdTok = 35;
	public static final String[] ruleNames = {
		"startq", "instructionsBlock", "declaration", "variableDec", "stringDec", 
		"arrayDec", "arrayVal", "varType", "value", "variableType", "ifStatement", 
		"logicalStatement", "assignment", "equalMarkTok", "varNameTok", "squareOpenBracketTok", 
		"squareCloseBracketTok", "openBracketTok", "closeBracketTok", "blockCloseBracketTok", 
		"blockOpenBracketTok", "mathOperatorTok", "integerTok", "doubleTok", "stringTok", 
		"booleanTok", "booleanOperatorTok", "integerTypeTok", "doubleTypeTok", 
		"stringTypeTok", "booleanTypeTok", "ifTok", "elsifTok", "elseTok", "thenTok", 
		"xdTok"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'XD'", "'{'", "'}'", null, null, null, null, null, null, null, 
		"'if'", "'elsif'", "'else'", "'then'", "'int'", "'double'", "'String'", 
		"'boolean'", null, "'='", "'.'", "'\"'", "';'", "'('", "')'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "XD", "BlockOpenBracket", "BlockCloseBracket", "Integer", "Double", 
		"String", "MathOperator", "BooleanOperator", "LogicalOperator", "Boolean", 
		"If", "Elsif", "Else", "Then", "IntegerType", "DoubleType", "StringType", 
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

	@Override
	public String getGrammarFileName() { return "myGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public myGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartqContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(myGrammarParser.EOF, 0); }
		public List<InstructionsBlockContext> instructionsBlock() {
			return getRuleContexts(InstructionsBlockContext.class);
		}
		public InstructionsBlockContext instructionsBlock(int i) {
			return getRuleContext(InstructionsBlockContext.class,i);
		}
		public StartqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterStartq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitStartq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitStartq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartqContext startq() throws RecognitionException {
		StartqContext _localctx = new StartqContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				instructionsBlock();
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << IntegerType) | (1L << DoubleType) | (1L << StringType) | (1L << BooleanType) | (1L << VarName))) != 0) );
			setState(77);
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

	public static class InstructionsBlockContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public InstructionsBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructionsBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterInstructionsBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitInstructionsBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitInstructionsBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionsBlockContext instructionsBlock() throws RecognitionException {
		InstructionsBlockContext _localctx = new InstructionsBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instructionsBlock);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				assignment();
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

	public static class DeclarationContext extends ParserRuleContext {
		public XdTokContext xdTok() {
			return getRuleContext(XdTokContext.class,0);
		}
		public VariableDecContext variableDec() {
			return getRuleContext(VariableDecContext.class,0);
		}
		public ArrayDecContext arrayDec() {
			return getRuleContext(ArrayDecContext.class,0);
		}
		public StringDecContext stringDec() {
			return getRuleContext(StringDecContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(84);
				variableDec();
				}
				break;
			case 2:
				{
				setState(85);
				arrayDec();
				}
				break;
			case 3:
				{
				setState(86);
				stringDec();
				}
				break;
			}
			setState(89);
			xdTok();
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

	public static class VariableDecContext extends ParserRuleContext {
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public VarNameTokContext varNameTok() {
			return getRuleContext(VarNameTokContext.class,0);
		}
		public EqualMarkTokContext equalMarkTok() {
			return getRuleContext(EqualMarkTokContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public VariableDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterVariableDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitVariableDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitVariableDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDecContext variableDec() throws RecognitionException {
		VariableDecContext _localctx = new VariableDecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			varType();
			setState(92);
			varNameTok();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EqualMark) {
				{
				setState(93);
				equalMarkTok();
				setState(94);
				value(0);
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

	public static class StringDecContext extends ParserRuleContext {
		public StringTypeTokContext stringTypeTok() {
			return getRuleContext(StringTypeTokContext.class,0);
		}
		public VarNameTokContext varNameTok() {
			return getRuleContext(VarNameTokContext.class,0);
		}
		public EqualMarkTokContext equalMarkTok() {
			return getRuleContext(EqualMarkTokContext.class,0);
		}
		public StringTokContext stringTok() {
			return getRuleContext(StringTokContext.class,0);
		}
		public StringDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterStringDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitStringDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitStringDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringDecContext stringDec() throws RecognitionException {
		StringDecContext _localctx = new StringDecContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stringDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			stringTypeTok();
			setState(99);
			varNameTok();
			{
			setState(100);
			equalMarkTok();
			setState(101);
			stringTok();
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

	public static class ArrayDecContext extends ParserRuleContext {
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public VarNameTokContext varNameTok() {
			return getRuleContext(VarNameTokContext.class,0);
		}
		public List<SquareOpenBracketTokContext> squareOpenBracketTok() {
			return getRuleContexts(SquareOpenBracketTokContext.class);
		}
		public SquareOpenBracketTokContext squareOpenBracketTok(int i) {
			return getRuleContext(SquareOpenBracketTokContext.class,i);
		}
		public List<SquareCloseBracketTokContext> squareCloseBracketTok() {
			return getRuleContexts(SquareCloseBracketTokContext.class);
		}
		public SquareCloseBracketTokContext squareCloseBracketTok(int i) {
			return getRuleContext(SquareCloseBracketTokContext.class,i);
		}
		public EqualMarkTokContext equalMarkTok() {
			return getRuleContext(EqualMarkTokContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ArrayDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterArrayDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitArrayDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitArrayDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDecContext arrayDec() throws RecognitionException {
		ArrayDecContext _localctx = new ArrayDecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arrayDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			varType();
			setState(104);
			varNameTok();
			setState(105);
			squareOpenBracketTok();
			setState(106);
			squareCloseBracketTok();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SquareOpenBracket) {
				{
				{
				setState(107);
				squareOpenBracketTok();
				setState(108);
				squareCloseBracketTok();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EqualMark) {
				{
				setState(115);
				equalMarkTok();
				setState(116);
				value(0);
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

	public static class ArrayValContext extends ParserRuleContext {
		public VarNameTokContext varNameTok() {
			return getRuleContext(VarNameTokContext.class,0);
		}
		public List<SquareOpenBracketTokContext> squareOpenBracketTok() {
			return getRuleContexts(SquareOpenBracketTokContext.class);
		}
		public SquareOpenBracketTokContext squareOpenBracketTok(int i) {
			return getRuleContext(SquareOpenBracketTokContext.class,i);
		}
		public List<IntegerTokContext> integerTok() {
			return getRuleContexts(IntegerTokContext.class);
		}
		public IntegerTokContext integerTok(int i) {
			return getRuleContext(IntegerTokContext.class,i);
		}
		public List<SquareCloseBracketTokContext> squareCloseBracketTok() {
			return getRuleContexts(SquareCloseBracketTokContext.class);
		}
		public SquareCloseBracketTokContext squareCloseBracketTok(int i) {
			return getRuleContext(SquareCloseBracketTokContext.class,i);
		}
		public ArrayValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterArrayVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitArrayVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitArrayVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayValContext arrayVal() throws RecognitionException {
		ArrayValContext _localctx = new ArrayValContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arrayVal);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			varNameTok();
			setState(121);
			squareOpenBracketTok();
			setState(122);
			integerTok();
			setState(123);
			squareCloseBracketTok();
			{
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(124);
					squareOpenBracketTok();
					setState(125);
					integerTok();
					setState(126);
					squareCloseBracketTok();
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class VarTypeContext extends ParserRuleContext {
		public IntegerTypeTokContext integerTypeTok() {
			return getRuleContext(IntegerTypeTokContext.class,0);
		}
		public DoubleTypeTokContext doubleTypeTok() {
			return getRuleContext(DoubleTypeTokContext.class,0);
		}
		public BooleanTypeTokContext booleanTypeTok() {
			return getRuleContext(BooleanTypeTokContext.class,0);
		}
		public VarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterVarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitVarType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitVarType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varType);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerType:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				integerTypeTok();
				}
				break;
			case DoubleType:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				doubleTypeTok();
				}
				break;
			case BooleanType:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				booleanTypeTok();
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

	public static class ValueContext extends ParserRuleContext {
		public OpenBracketTokContext openBracketTok() {
			return getRuleContext(OpenBracketTokContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public CloseBracketTokContext closeBracketTok() {
			return getRuleContext(CloseBracketTokContext.class,0);
		}
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public ArrayValContext arrayVal() {
			return getRuleContext(ArrayValContext.class,0);
		}
		public VarNameTokContext varNameTok() {
			return getRuleContext(VarNameTokContext.class,0);
		}
		public MathOperatorTokContext mathOperatorTok() {
			return getRuleContext(MathOperatorTokContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		return value(0);
	}

	private ValueContext value(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueContext _localctx = new ValueContext(_ctx, _parentState);
		ValueContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_value, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(139);
				openBracketTok();
				setState(140);
				value(0);
				setState(141);
				closeBracketTok();
				}
				break;
			case 2:
				{
				setState(143);
				variableType();
				}
				break;
			case 3:
				{
				setState(144);
				arrayVal();
				}
				break;
			case 4:
				{
				setState(145);
				varNameTok();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ValueContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_value);
					setState(148);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(149);
					mathOperatorTok();
					setState(150);
					value(6);
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class VariableTypeContext extends ParserRuleContext {
		public IntegerTokContext integerTok() {
			return getRuleContext(IntegerTokContext.class,0);
		}
		public DoubleTokContext doubleTok() {
			return getRuleContext(DoubleTokContext.class,0);
		}
		public StringTokContext stringTok() {
			return getRuleContext(StringTokContext.class,0);
		}
		public VariableTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterVariableType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitVariableType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitVariableType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableTypeContext variableType() throws RecognitionException {
		VariableTypeContext _localctx = new VariableTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableType);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				integerTok();
				}
				break;
			case Double:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				doubleTok();
				}
				break;
			case String:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				stringTok();
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

	public static class IfStatementContext extends ParserRuleContext {
		public IfTokContext ifTok() {
			return getRuleContext(IfTokContext.class,0);
		}
		public List<OpenBracketTokContext> openBracketTok() {
			return getRuleContexts(OpenBracketTokContext.class);
		}
		public OpenBracketTokContext openBracketTok(int i) {
			return getRuleContext(OpenBracketTokContext.class,i);
		}
		public List<LogicalStatementContext> logicalStatement() {
			return getRuleContexts(LogicalStatementContext.class);
		}
		public LogicalStatementContext logicalStatement(int i) {
			return getRuleContext(LogicalStatementContext.class,i);
		}
		public List<CloseBracketTokContext> closeBracketTok() {
			return getRuleContexts(CloseBracketTokContext.class);
		}
		public CloseBracketTokContext closeBracketTok(int i) {
			return getRuleContext(CloseBracketTokContext.class,i);
		}
		public ThenTokContext thenTok() {
			return getRuleContext(ThenTokContext.class,0);
		}
		public BlockOpenBracketTokContext blockOpenBracketTok() {
			return getRuleContext(BlockOpenBracketTokContext.class,0);
		}
		public List<InstructionsBlockContext> instructionsBlock() {
			return getRuleContexts(InstructionsBlockContext.class);
		}
		public InstructionsBlockContext instructionsBlock(int i) {
			return getRuleContext(InstructionsBlockContext.class,i);
		}
		public BlockCloseBracketTokContext blockCloseBracketTok() {
			return getRuleContext(BlockCloseBracketTokContext.class,0);
		}
		public ElseTokContext elseTok() {
			return getRuleContext(ElseTokContext.class,0);
		}
		public List<ElsifTokContext> elsifTok() {
			return getRuleContexts(ElsifTokContext.class);
		}
		public ElsifTokContext elsifTok(int i) {
			return getRuleContext(ElsifTokContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			ifTok();
			setState(163);
			openBracketTok();
			setState(164);
			logicalStatement();
			setState(165);
			closeBracketTok();
			setState(166);
			thenTok();
			setState(167);
			blockOpenBracketTok();
			setState(168);
			instructionsBlock();
			setState(169);
			blockCloseBracketTok();
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Elsif) {
					{
					{
					setState(170);
					elsifTok();
					setState(171);
					openBracketTok();
					setState(172);
					logicalStatement();
					setState(173);
					closeBracketTok();
					setState(174);
					instructionsBlock();
					}
					}
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(181);
				elseTok();
				setState(182);
				instructionsBlock();
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

	public static class LogicalStatementContext extends ParserRuleContext {
		public LogicalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalStatement; }
	 
		public LogicalStatementContext() { }
		public void copyFrom(LogicalStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalStatementBooleanExprContext extends LogicalStatementContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public BooleanOperatorTokContext booleanOperatorTok() {
			return getRuleContext(BooleanOperatorTokContext.class,0);
		}
		public LogicalStatementBooleanExprContext(LogicalStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterLogicalStatementBooleanExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitLogicalStatementBooleanExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitLogicalStatementBooleanExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalStatementBooleanContext extends LogicalStatementContext {
		public BooleanTokContext booleanTok() {
			return getRuleContext(BooleanTokContext.class,0);
		}
		public LogicalStatementBooleanContext(LogicalStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterLogicalStatementBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitLogicalStatementBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitLogicalStatementBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalStatementContext logicalStatement() throws RecognitionException {
		LogicalStatementContext _localctx = new LogicalStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_logicalStatement);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
			case Double:
			case String:
			case VarName:
			case OpenBracket:
				_localctx = new LogicalStatementBooleanExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				value(0);
				setState(187);
				booleanOperatorTok();
				setState(188);
				value(0);
				}
				break;
			case Boolean:
				_localctx = new LogicalStatementBooleanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				booleanTok();
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

	public static class AssignmentContext extends ParserRuleContext {
		public EqualMarkTokContext equalMarkTok() {
			return getRuleContext(EqualMarkTokContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public XdTokContext xdTok() {
			return getRuleContext(XdTokContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public VarNameTokContext varNameTok() {
			return getRuleContext(VarNameTokContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerType:
			case DoubleType:
			case StringType:
			case BooleanType:
				{
				setState(193);
				declaration();
				}
				break;
			case VarName:
				{
				setState(194);
				varNameTok();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(197);
			equalMarkTok();
			setState(198);
			value(0);
			setState(199);
			xdTok();
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

	public static class EqualMarkTokContext extends ParserRuleContext {
		public TerminalNode EqualMark() { return getToken(myGrammarParser.EqualMark, 0); }
		public EqualMarkTokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalMarkTok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterEqualMarkTok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitEqualMarkTok(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitEqualMarkTok(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualMarkTokContext equalMarkTok() throws RecognitionException {
		EqualMarkTokContext _localctx = new EqualMarkTokContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_equalMarkTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(EqualMark);
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

	public static class VarNameTokContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(myGrammarParser.VarName, 0); }
		public VarNameTokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varNameTok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterVarNameTok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitVarNameTok(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitVarNameTok(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarNameTokContext varNameTok() throws RecognitionException {
		VarNameTokContext _localctx = new VarNameTokContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_varNameTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(VarName);
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

	public static class SquareOpenBracketTokContext extends ParserRuleContext {
		public TerminalNode SquareOpenBracket() { return getToken(myGrammarParser.SquareOpenBracket, 0); }
		public SquareOpenBracketTokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_squareOpenBracketTok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterSquareOpenBracketTok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitSquareOpenBracketTok(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitSquareOpenBracketTok(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SquareOpenBracketTokContext squareOpenBracketTok() throws RecognitionException {
		SquareOpenBracketTokContext _localctx = new SquareOpenBracketTokContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_squareOpenBracketTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(SquareOpenBracket);
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

	public static class SquareCloseBracketTokContext extends ParserRuleContext {
		public TerminalNode SquareCloseBracket() { return getToken(myGrammarParser.SquareCloseBracket, 0); }
		public SquareCloseBracketTokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_squareCloseBracketTok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterSquareCloseBracketTok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitSquareCloseBracketTok(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitSquareCloseBracketTok(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SquareCloseBracketTokContext squareCloseBracketTok() throws RecognitionException {
		SquareCloseBracketTokContext _localctx = new SquareCloseBracketTokContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_squareCloseBracketTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(SquareCloseBracket);
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

	public static class OpenBracketTokContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(myGrammarParser.OpenBracket, 0); }
		public OpenBracketTokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openBracketTok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterOpenBracketTok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitOpenBracketTok(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitOpenBracketTok(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenBracketTokContext openBracketTok() throws RecognitionException {
		OpenBracketTokContext _localctx = new OpenBracketTokContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_openBracketTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(OpenBracket);
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

	public static class CloseBracketTokContext extends ParserRuleContext {
		public TerminalNode CloseBracket() { return getToken(myGrammarParser.CloseBracket, 0); }
		public CloseBracketTokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeBracketTok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterCloseBracketTok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitCloseBracketTok(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitCloseBracketTok(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseBracketTokContext closeBracketTok() throws RecognitionException {
		CloseBracketTokContext _localctx = new CloseBracketTokContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_closeBracketTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(CloseBracket);
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

	public static class BlockCloseBracketTokContext extends ParserRuleContext {
		public TerminalNode BlockCloseBracket() { return getToken(myGrammarParser.BlockCloseBracket, 0); }
		public BlockCloseBracketTokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockCloseBracketTok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterBlockCloseBracketTok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitBlockCloseBracketTok(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitBlockCloseBracketTok(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockCloseBracketTokContext blockCloseBracketTok() throws RecognitionException {
		BlockCloseBracketTokContext _localctx = new BlockCloseBracketTokContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_blockCloseBracketTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(BlockCloseBracket);
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

	public static class BlockOpenBracketTokContext extends ParserRuleContext {
		public TerminalNode BlockOpenBracket() { return getToken(myGrammarParser.BlockOpenBracket, 0); }
		public BlockOpenBracketTokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockOpenBracketTok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterBlockOpenBracketTok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitBlockOpenBracketTok(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitBlockOpenBracketTok(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockOpenBracketTokContext blockOpenBracketTok() throws RecognitionException {
		BlockOpenBracketTokContext _localctx = new BlockOpenBracketTokContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_blockOpenBracketTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(BlockOpenBracket);
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

	public static class MathOperatorTokContext extends ParserRuleContext {
		public TerminalNode MathOperator() { return getToken(myGrammarParser.MathOperator, 0); }
		public MathOperatorTokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathOperatorTok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterMathOperatorTok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitMathOperatorTok(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitMathOperatorTok(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathOperatorTokContext mathOperatorTok() throws RecognitionException {
		MathOperatorTokContext _localctx = new MathOperatorTokContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_mathOperatorTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(MathOperator);
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

	public static class IntegerTokContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(myGrammarParser.Integer, 0); }
		public IntegerTokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerTok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterIntegerTok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitIntegerTok(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitIntegerTok(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerTokContext integerTok() throws RecognitionException {
		IntegerTokContext _localctx = new IntegerTokContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_integerTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(Integer);
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

	public static class DoubleTokContext extends ParserRuleContext {
		public TerminalNode Double() { return getToken(myGrammarParser.Double, 0); }
		public DoubleTokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleTok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterDoubleTok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitDoubleTok(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitDoubleTok(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleTokContext doubleTok() throws RecognitionException {
		DoubleTokContext _localctx = new DoubleTokContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_doubleTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(Double);
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

	public static class StringTokContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(myGrammarParser.String, 0); }
		public StringTokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringTok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterStringTok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitStringTok(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitStringTok(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringTokContext stringTok() throws RecognitionException {
		StringTokContext _localctx = new StringTokContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_stringTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(String);
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

	public static class BooleanTokContext extends ParserRuleContext {
		public TerminalNode Boolean() { return getToken(myGrammarParser.Boolean, 0); }
		public BooleanTokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanTok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterBooleanTok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitBooleanTok(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitBooleanTok(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanTokContext booleanTok() throws RecognitionException {
		BooleanTokContext _localctx = new BooleanTokContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_booleanTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(Boolean);
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

	public static class BooleanOperatorTokContext extends ParserRuleContext {
		public TerminalNode BooleanOperator() { return getToken(myGrammarParser.BooleanOperator, 0); }
		public BooleanOperatorTokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanOperatorTok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterBooleanOperatorTok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitBooleanOperatorTok(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitBooleanOperatorTok(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanOperatorTokContext booleanOperatorTok() throws RecognitionException {
		BooleanOperatorTokContext _localctx = new BooleanOperatorTokContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_booleanOperatorTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(BooleanOperator);
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

	public static class IntegerTypeTokContext extends ParserRuleContext {
		public TerminalNode IntegerType() { return getToken(myGrammarParser.IntegerType, 0); }
		public IntegerTypeTokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerTypeTok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterIntegerTypeTok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitIntegerTypeTok(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitIntegerTypeTok(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerTypeTokContext integerTypeTok() throws RecognitionException {
		IntegerTypeTokContext _localctx = new IntegerTypeTokContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_integerTypeTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(IntegerType);
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

	public static class DoubleTypeTokContext extends ParserRuleContext {
		public TerminalNode DoubleType() { return getToken(myGrammarParser.DoubleType, 0); }
		public DoubleTypeTokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleTypeTok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterDoubleTypeTok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitDoubleTypeTok(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitDoubleTypeTok(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleTypeTokContext doubleTypeTok() throws RecognitionException {
		DoubleTypeTokContext _localctx = new DoubleTypeTokContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_doubleTypeTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(DoubleType);
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

	public static class StringTypeTokContext extends ParserRuleContext {
		public TerminalNode StringType() { return getToken(myGrammarParser.StringType, 0); }
		public StringTypeTokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringTypeTok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterStringTypeTok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitStringTypeTok(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitStringTypeTok(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringTypeTokContext stringTypeTok() throws RecognitionException {
		StringTypeTokContext _localctx = new StringTypeTokContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_stringTypeTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(StringType);
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

	public static class BooleanTypeTokContext extends ParserRuleContext {
		public TerminalNode BooleanType() { return getToken(myGrammarParser.BooleanType, 0); }
		public BooleanTypeTokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanTypeTok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterBooleanTypeTok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitBooleanTypeTok(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitBooleanTypeTok(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanTypeTokContext booleanTypeTok() throws RecognitionException {
		BooleanTypeTokContext _localctx = new BooleanTypeTokContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_booleanTypeTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(BooleanType);
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

	public static class IfTokContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(myGrammarParser.If, 0); }
		public IfTokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifTok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterIfTok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitIfTok(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitIfTok(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfTokContext ifTok() throws RecognitionException {
		IfTokContext _localctx = new IfTokContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ifTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(If);
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

	public static class ElsifTokContext extends ParserRuleContext {
		public TerminalNode Elsif() { return getToken(myGrammarParser.Elsif, 0); }
		public ElsifTokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsifTok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterElsifTok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitElsifTok(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitElsifTok(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsifTokContext elsifTok() throws RecognitionException {
		ElsifTokContext _localctx = new ElsifTokContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_elsifTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(Elsif);
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

	public static class ElseTokContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(myGrammarParser.Else, 0); }
		public ElseTokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseTok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterElseTok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitElseTok(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitElseTok(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseTokContext elseTok() throws RecognitionException {
		ElseTokContext _localctx = new ElseTokContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_elseTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(Else);
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

	public static class ThenTokContext extends ParserRuleContext {
		public TerminalNode Then() { return getToken(myGrammarParser.Then, 0); }
		public ThenTokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thenTok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterThenTok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitThenTok(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitThenTok(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThenTokContext thenTok() throws RecognitionException {
		ThenTokContext _localctx = new ThenTokContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_thenTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(Then);
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

	public static class XdTokContext extends ParserRuleContext {
		public TerminalNode XD() { return getToken(myGrammarParser.XD, 0); }
		public XdTokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xdTok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterXdTok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitXdTok(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitXdTok(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XdTokContext xdTok() throws RecognitionException {
		XdTokContext _localctx = new XdTokContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_xdTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(XD);
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
		case 8:
			return value_sempred((ValueContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean value_sempred(ValueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00fa\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\6\2L\n\2\r\2\16\2M\3\2\3\2\3\3\3\3\3"+
		"\3\5\3U\n\3\3\4\3\4\3\4\5\4Z\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5c\n\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7q\n\7\f\7\16\7t\13"+
		"\7\3\7\3\7\3\7\5\7y\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0083\n\b"+
		"\f\b\16\b\u0086\13\b\3\t\3\t\3\t\5\t\u008b\n\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u0095\n\n\3\n\3\n\3\n\3\n\7\n\u009b\n\n\f\n\16\n\u009e\13"+
		"\n\3\13\3\13\3\13\5\13\u00a3\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\7\f\u00b3\n\f\f\f\16\f\u00b6\13\f\3\f\3\f\3\f\5\f"+
		"\u00bb\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u00c2\n\r\3\16\3\16\5\16\u00c6\n\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\""+
		"\3#\3#\3$\3$\3%\3%\3%\2\3\22&\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668:<>@BDFH\2\2\2\u00ea\2K\3\2\2\2\4T\3\2\2\2\6Y\3\2"+
		"\2\2\b]\3\2\2\2\nd\3\2\2\2\fi\3\2\2\2\16z\3\2\2\2\20\u008a\3\2\2\2\22"+
		"\u0094\3\2\2\2\24\u00a2\3\2\2\2\26\u00a4\3\2\2\2\30\u00c1\3\2\2\2\32\u00c5"+
		"\3\2\2\2\34\u00cb\3\2\2\2\36\u00cd\3\2\2\2 \u00cf\3\2\2\2\"\u00d1\3\2"+
		"\2\2$\u00d3\3\2\2\2&\u00d5\3\2\2\2(\u00d7\3\2\2\2*\u00d9\3\2\2\2,\u00db"+
		"\3\2\2\2.\u00dd\3\2\2\2\60\u00df\3\2\2\2\62\u00e1\3\2\2\2\64\u00e3\3\2"+
		"\2\2\66\u00e5\3\2\2\28\u00e7\3\2\2\2:\u00e9\3\2\2\2<\u00eb\3\2\2\2>\u00ed"+
		"\3\2\2\2@\u00ef\3\2\2\2B\u00f1\3\2\2\2D\u00f3\3\2\2\2F\u00f5\3\2\2\2H"+
		"\u00f7\3\2\2\2JL\5\4\3\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2NO\3\2"+
		"\2\2OP\7\2\2\3P\3\3\2\2\2QU\5\6\4\2RU\5\26\f\2SU\5\32\16\2TQ\3\2\2\2T"+
		"R\3\2\2\2TS\3\2\2\2U\5\3\2\2\2VZ\5\b\5\2WZ\5\f\7\2XZ\5\n\6\2YV\3\2\2\2"+
		"YW\3\2\2\2YX\3\2\2\2Z[\3\2\2\2[\\\5H%\2\\\7\3\2\2\2]^\5\20\t\2^b\5\36"+
		"\20\2_`\5\34\17\2`a\5\22\n\2ac\3\2\2\2b_\3\2\2\2bc\3\2\2\2c\t\3\2\2\2"+
		"de\5<\37\2ef\5\36\20\2fg\5\34\17\2gh\5\62\32\2h\13\3\2\2\2ij\5\20\t\2"+
		"jk\5\36\20\2kl\5 \21\2lr\5\"\22\2mn\5 \21\2no\5\"\22\2oq\3\2\2\2pm\3\2"+
		"\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2sx\3\2\2\2tr\3\2\2\2uv\5\34\17\2vw\5"+
		"\22\n\2wy\3\2\2\2xu\3\2\2\2xy\3\2\2\2y\r\3\2\2\2z{\5\36\20\2{|\5 \21\2"+
		"|}\5.\30\2}\u0084\5\"\22\2~\177\5 \21\2\177\u0080\5.\30\2\u0080\u0081"+
		"\5\"\22\2\u0081\u0083\3\2\2\2\u0082~\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\17\3\2\2\2\u0086\u0084\3\2\2"+
		"\2\u0087\u008b\58\35\2\u0088\u008b\5:\36\2\u0089\u008b\5> \2\u008a\u0087"+
		"\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\21\3\2\2\2\u008c"+
		"\u008d\b\n\1\2\u008d\u008e\5$\23\2\u008e\u008f\5\22\n\2\u008f\u0090\5"+
		"&\24\2\u0090\u0095\3\2\2\2\u0091\u0095\5\24\13\2\u0092\u0095\5\16\b\2"+
		"\u0093\u0095\5\36\20\2\u0094\u008c\3\2\2\2\u0094\u0091\3\2\2\2\u0094\u0092"+
		"\3\2\2\2\u0094\u0093\3\2\2\2\u0095\u009c\3\2\2\2\u0096\u0097\f\7\2\2\u0097"+
		"\u0098\5,\27\2\u0098\u0099\5\22\n\b\u0099\u009b\3\2\2\2\u009a\u0096\3"+
		"\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\23\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a3\5.\30\2\u00a0\u00a3\5\60\31"+
		"\2\u00a1\u00a3\5\62\32\2\u00a2\u009f\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a1\3\2\2\2\u00a3\25\3\2\2\2\u00a4\u00a5\5@!\2\u00a5\u00a6\5$\23\2"+
		"\u00a6\u00a7\5\30\r\2\u00a7\u00a8\5&\24\2\u00a8\u00a9\5F$\2\u00a9\u00aa"+
		"\5*\26\2\u00aa\u00ab\5\4\3\2\u00ab\u00ba\5(\25\2\u00ac\u00ad\5B\"\2\u00ad"+
		"\u00ae\5$\23\2\u00ae\u00af\5\30\r\2\u00af\u00b0\5&\24\2\u00b0\u00b1\5"+
		"\4\3\2\u00b1\u00b3\3\2\2\2\u00b2\u00ac\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b7\u00b8\5D#\2\u00b8\u00b9\5\4\3\2\u00b9\u00bb\3\2\2\2\u00ba\u00b4"+
		"\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\27\3\2\2\2\u00bc\u00bd\5\22\n\2\u00bd"+
		"\u00be\5\66\34\2\u00be\u00bf\5\22\n\2\u00bf\u00c2\3\2\2\2\u00c0\u00c2"+
		"\5\64\33\2\u00c1\u00bc\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\31\3\2\2\2\u00c3"+
		"\u00c6\5\6\4\2\u00c4\u00c6\5\36\20\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3"+
		"\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\5\34\17\2\u00c8\u00c9\5\22\n\2"+
		"\u00c9\u00ca\5H%\2\u00ca\33\3\2\2\2\u00cb\u00cc\7\26\2\2\u00cc\35\3\2"+
		"\2\2\u00cd\u00ce\7\25\2\2\u00ce\37\3\2\2\2\u00cf\u00d0\7\34\2\2\u00d0"+
		"!\3\2\2\2\u00d1\u00d2\7\35\2\2\u00d2#\3\2\2\2\u00d3\u00d4\7\32\2\2\u00d4"+
		"%\3\2\2\2\u00d5\u00d6\7\33\2\2\u00d6\'\3\2\2\2\u00d7\u00d8\7\5\2\2\u00d8"+
		")\3\2\2\2\u00d9\u00da\7\4\2\2\u00da+\3\2\2\2\u00db\u00dc\7\t\2\2\u00dc"+
		"-\3\2\2\2\u00dd\u00de\7\6\2\2\u00de/\3\2\2\2\u00df\u00e0\7\7\2\2\u00e0"+
		"\61\3\2\2\2\u00e1\u00e2\7\b\2\2\u00e2\63\3\2\2\2\u00e3\u00e4\7\f\2\2\u00e4"+
		"\65\3\2\2\2\u00e5\u00e6\7\n\2\2\u00e6\67\3\2\2\2\u00e7\u00e8\7\21\2\2"+
		"\u00e89\3\2\2\2\u00e9\u00ea\7\22\2\2\u00ea;\3\2\2\2\u00eb\u00ec\7\23\2"+
		"\2\u00ec=\3\2\2\2\u00ed\u00ee\7\24\2\2\u00ee?\3\2\2\2\u00ef\u00f0\7\r"+
		"\2\2\u00f0A\3\2\2\2\u00f1\u00f2\7\16\2\2\u00f2C\3\2\2\2\u00f3\u00f4\7"+
		"\17\2\2\u00f4E\3\2\2\2\u00f5\u00f6\7\20\2\2\u00f6G\3\2\2\2\u00f7\u00f8"+
		"\7\3\2\2\u00f8I\3\2\2\2\21MTYbrx\u0084\u008a\u0094\u009c\u00a2\u00b4\u00ba"+
		"\u00c1\u00c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}