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
		XD=1, BlockOpenBracket=2, BlockCloseBracket=3, Integer=4, Float=5, String=6, 
		MathOperator=7, BooleanOperator=8, LogicalOperator=9, Boolean=10, If=11, 
		Elsif=12, Else=13, Then=14, IntegerType=15, FloatType=16, StringType=17, 
		BooleanType=18, VarName=19, EqualMark=20, Dot=21, QuoteMark=22, Semicolon=23, 
		OpenBracket=24, CloseBracket=25, SquareOpenBracket=26, SquareCloseBracket=27, 
		Text=28, Whitespace=29, Newline=30, BlockComment=31, LineComment=32;
	public static final int
		RULE_startq = 0, RULE_instructionsBlock = 1, RULE_declaration = 2, RULE_variableDec = 3, 
		RULE_arrayDec = 4, RULE_arrayVal = 5, RULE_varType = 6, RULE_value = 7, 
		RULE_variableType = 8, RULE_ifStatement = 9, RULE_logicalStatement = 10, 
		RULE_assignment = 11, RULE_equalMarkTok = 12, RULE_varNameTok = 13, RULE_squareOpenBracketTok = 14, 
		RULE_squareCloseBracketTok = 15, RULE_openBracketTok = 16, RULE_closeBracketTok = 17, 
		RULE_blockCloseBracketTok = 18, RULE_blockOpenBracketTok = 19, RULE_mathOperatorTok = 20, 
		RULE_integerTok = 21, RULE_floatTok = 22, RULE_stringTok = 23, RULE_booleanTok = 24, 
		RULE_booleanOperatorTok = 25, RULE_integerTypeTok = 26, RULE_floatTypeTok = 27, 
		RULE_stringTypeTok = 28, RULE_booleanTypeTok = 29, RULE_ifTok = 30, RULE_elsifTok = 31, 
		RULE_elseTok = 32, RULE_thenTok = 33, RULE_xdTok = 34;
	public static final String[] ruleNames = {
		"startq", "instructionsBlock", "declaration", "variableDec", "arrayDec", 
		"arrayVal", "varType", "value", "variableType", "ifStatement", "logicalStatement", 
		"assignment", "equalMarkTok", "varNameTok", "squareOpenBracketTok", "squareCloseBracketTok", 
		"openBracketTok", "closeBracketTok", "blockCloseBracketTok", "blockOpenBracketTok", 
		"mathOperatorTok", "integerTok", "floatTok", "stringTok", "booleanTok", 
		"booleanOperatorTok", "integerTypeTok", "floatTypeTok", "stringTypeTok", 
		"booleanTypeTok", "ifTok", "elsifTok", "elseTok", "thenTok", "xdTok"
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
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				instructionsBlock();
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << IntegerType) | (1L << FloatType) | (1L << StringType) | (1L << BooleanType) | (1L << VarName))) != 0) );
			setState(75);
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
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
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
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(82);
				variableDec();
				}
				break;
			case 2:
				{
				setState(83);
				arrayDec();
				}
				break;
			}
			setState(86);
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
			setState(88);
			varType();
			setState(89);
			varNameTok();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EqualMark) {
				{
				setState(90);
				equalMarkTok();
				setState(91);
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
		enterRule(_localctx, 8, RULE_arrayDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			varType();
			setState(96);
			varNameTok();
			setState(97);
			squareOpenBracketTok();
			setState(98);
			squareCloseBracketTok();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SquareOpenBracket) {
				{
				{
				setState(99);
				squareOpenBracketTok();
				setState(100);
				squareCloseBracketTok();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EqualMark) {
				{
				setState(107);
				equalMarkTok();
				setState(108);
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
		enterRule(_localctx, 10, RULE_arrayVal);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			varNameTok();
			setState(113);
			squareOpenBracketTok();
			setState(114);
			integerTok();
			setState(115);
			squareCloseBracketTok();
			{
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(116);
					squareOpenBracketTok();
					setState(117);
					integerTok();
					setState(118);
					squareCloseBracketTok();
					}
					} 
				}
				setState(124);
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
		public FloatTypeTokContext floatTypeTok() {
			return getRuleContext(FloatTypeTokContext.class,0);
		}
		public StringTypeTokContext stringTypeTok() {
			return getRuleContext(StringTypeTokContext.class,0);
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
		enterRule(_localctx, 12, RULE_varType);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerType:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				integerTypeTok();
				}
				break;
			case FloatType:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				floatTypeTok();
				}
				break;
			case StringType:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				stringTypeTok();
				}
				break;
			case BooleanType:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_value, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(132);
				openBracketTok();
				setState(133);
				value(0);
				setState(134);
				closeBracketTok();
				}
				break;
			case 2:
				{
				setState(136);
				variableType();
				}
				break;
			case 3:
				{
				setState(137);
				arrayVal();
				}
				break;
			case 4:
				{
				setState(138);
				varNameTok();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(147);
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
					setState(141);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(142);
					mathOperatorTok();
					setState(143);
					value(6);
					}
					} 
				}
				setState(149);
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
		public FloatTokContext floatTok() {
			return getRuleContext(FloatTokContext.class,0);
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
		enterRule(_localctx, 16, RULE_variableType);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				integerTok();
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				floatTok();
				}
				break;
			case String:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
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
		enterRule(_localctx, 18, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			ifTok();
			setState(156);
			openBracketTok();
			setState(157);
			logicalStatement();
			setState(158);
			closeBracketTok();
			setState(159);
			thenTok();
			setState(160);
			blockOpenBracketTok();
			setState(161);
			instructionsBlock();
			setState(162);
			blockCloseBracketTok();
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Elsif) {
					{
					{
					setState(163);
					elsifTok();
					setState(164);
					openBracketTok();
					setState(165);
					logicalStatement();
					setState(166);
					closeBracketTok();
					setState(167);
					instructionsBlock();
					}
					}
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(174);
				elseTok();
				setState(175);
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
		enterRule(_localctx, 20, RULE_logicalStatement);
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
			case Float:
			case String:
			case VarName:
			case OpenBracket:
				_localctx = new LogicalStatementBooleanExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				value(0);
				setState(180);
				booleanOperatorTok();
				setState(181);
				value(0);
				}
				break;
			case Boolean:
				_localctx = new LogicalStatementBooleanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
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
		enterRule(_localctx, 22, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerType:
			case FloatType:
			case StringType:
			case BooleanType:
				{
				setState(186);
				declaration();
				}
				break;
			case VarName:
				{
				setState(187);
				varNameTok();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(190);
			equalMarkTok();
			setState(191);
			value(0);
			setState(192);
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
		enterRule(_localctx, 24, RULE_equalMarkTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
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
		enterRule(_localctx, 26, RULE_varNameTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
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
		enterRule(_localctx, 28, RULE_squareOpenBracketTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
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
		enterRule(_localctx, 30, RULE_squareCloseBracketTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
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
		enterRule(_localctx, 32, RULE_openBracketTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
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
		enterRule(_localctx, 34, RULE_closeBracketTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
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
		enterRule(_localctx, 36, RULE_blockCloseBracketTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
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
		enterRule(_localctx, 38, RULE_blockOpenBracketTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
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
		enterRule(_localctx, 40, RULE_mathOperatorTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
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
		enterRule(_localctx, 42, RULE_integerTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
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

	public static class FloatTokContext extends ParserRuleContext {
		public TerminalNode Float() { return getToken(myGrammarParser.Float, 0); }
		public FloatTokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatTok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterFloatTok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitFloatTok(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitFloatTok(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatTokContext floatTok() throws RecognitionException {
		FloatTokContext _localctx = new FloatTokContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_floatTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(Float);
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
		enterRule(_localctx, 46, RULE_stringTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
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
		enterRule(_localctx, 48, RULE_booleanTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
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
		enterRule(_localctx, 50, RULE_booleanOperatorTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
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
		enterRule(_localctx, 52, RULE_integerTypeTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
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

	public static class FloatTypeTokContext extends ParserRuleContext {
		public TerminalNode FloatType() { return getToken(myGrammarParser.FloatType, 0); }
		public FloatTypeTokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatTypeTok; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterFloatTypeTok(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitFloatTypeTok(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myGrammarVisitor ) return ((myGrammarVisitor<? extends T>)visitor).visitFloatTypeTok(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatTypeTokContext floatTypeTok() throws RecognitionException {
		FloatTypeTokContext _localctx = new FloatTypeTokContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_floatTypeTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(FloatType);
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
		enterRule(_localctx, 56, RULE_stringTypeTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
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
		enterRule(_localctx, 58, RULE_booleanTypeTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
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
		enterRule(_localctx, 60, RULE_ifTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
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
		enterRule(_localctx, 62, RULE_elsifTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
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
		enterRule(_localctx, 64, RULE_elseTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
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
		enterRule(_localctx, 66, RULE_thenTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
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
		enterRule(_localctx, 68, RULE_xdTok);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
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
		case 7:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00f3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\6\2J\n\2\r\2\16\2K\3\2\3\2\3\3\3\3\3\3\5\3"+
		"S\n\3\3\4\3\4\5\4W\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5`\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\7\6i\n\6\f\6\16\6l\13\6\3\6\3\6\3\6\5\6q\n\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7{\n\7\f\7\16\7~\13\7\3\b\3\b\3\b\3\b\5\b"+
		"\u0084\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008e\n\t\3\t\3\t\3\t\3"+
		"\t\7\t\u0094\n\t\f\t\16\t\u0097\13\t\3\n\3\n\3\n\5\n\u009c\n\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00ac"+
		"\n\13\f\13\16\13\u00af\13\13\3\13\3\13\3\13\5\13\u00b4\n\13\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u00bb\n\f\3\r\3\r\5\r\u00bf\n\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\2"+
		"\3\20%\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDF\2\2\2\u00e4\2I\3\2\2\2\4R\3\2\2\2\6V\3\2\2\2\bZ\3\2\2\2\na\3\2\2"+
		"\2\fr\3\2\2\2\16\u0083\3\2\2\2\20\u008d\3\2\2\2\22\u009b\3\2\2\2\24\u009d"+
		"\3\2\2\2\26\u00ba\3\2\2\2\30\u00be\3\2\2\2\32\u00c4\3\2\2\2\34\u00c6\3"+
		"\2\2\2\36\u00c8\3\2\2\2 \u00ca\3\2\2\2\"\u00cc\3\2\2\2$\u00ce\3\2\2\2"+
		"&\u00d0\3\2\2\2(\u00d2\3\2\2\2*\u00d4\3\2\2\2,\u00d6\3\2\2\2.\u00d8\3"+
		"\2\2\2\60\u00da\3\2\2\2\62\u00dc\3\2\2\2\64\u00de\3\2\2\2\66\u00e0\3\2"+
		"\2\28\u00e2\3\2\2\2:\u00e4\3\2\2\2<\u00e6\3\2\2\2>\u00e8\3\2\2\2@\u00ea"+
		"\3\2\2\2B\u00ec\3\2\2\2D\u00ee\3\2\2\2F\u00f0\3\2\2\2HJ\5\4\3\2IH\3\2"+
		"\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\7\2\2\3N\3\3\2\2\2OS\5"+
		"\6\4\2PS\5\24\13\2QS\5\30\r\2RO\3\2\2\2RP\3\2\2\2RQ\3\2\2\2S\5\3\2\2\2"+
		"TW\5\b\5\2UW\5\n\6\2VT\3\2\2\2VU\3\2\2\2WX\3\2\2\2XY\5F$\2Y\7\3\2\2\2"+
		"Z[\5\16\b\2[_\5\34\17\2\\]\5\32\16\2]^\5\20\t\2^`\3\2\2\2_\\\3\2\2\2_"+
		"`\3\2\2\2`\t\3\2\2\2ab\5\16\b\2bc\5\34\17\2cd\5\36\20\2dj\5 \21\2ef\5"+
		"\36\20\2fg\5 \21\2gi\3\2\2\2he\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k"+
		"p\3\2\2\2lj\3\2\2\2mn\5\32\16\2no\5\20\t\2oq\3\2\2\2pm\3\2\2\2pq\3\2\2"+
		"\2q\13\3\2\2\2rs\5\34\17\2st\5\36\20\2tu\5,\27\2u|\5 \21\2vw\5\36\20\2"+
		"wx\5,\27\2xy\5 \21\2y{\3\2\2\2zv\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2"+
		"}\r\3\2\2\2~|\3\2\2\2\177\u0084\5\66\34\2\u0080\u0084\58\35\2\u0081\u0084"+
		"\5:\36\2\u0082\u0084\5<\37\2\u0083\177\3\2\2\2\u0083\u0080\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\17\3\2\2\2\u0085\u0086\b\t\1"+
		"\2\u0086\u0087\5\"\22\2\u0087\u0088\5\20\t\2\u0088\u0089\5$\23\2\u0089"+
		"\u008e\3\2\2\2\u008a\u008e\5\22\n\2\u008b\u008e\5\f\7\2\u008c\u008e\5"+
		"\34\17\2\u008d\u0085\3\2\2\2\u008d\u008a\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008c\3\2\2\2\u008e\u0095\3\2\2\2\u008f\u0090\f\7\2\2\u0090\u0091\5*"+
		"\26\2\u0091\u0092\5\20\t\b\u0092\u0094\3\2\2\2\u0093\u008f\3\2\2\2\u0094"+
		"\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\21\3\2\2"+
		"\2\u0097\u0095\3\2\2\2\u0098\u009c\5,\27\2\u0099\u009c\5.\30\2\u009a\u009c"+
		"\5\60\31\2\u009b\u0098\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2"+
		"\u009c\23\3\2\2\2\u009d\u009e\5> \2\u009e\u009f\5\"\22\2\u009f\u00a0\5"+
		"\26\f\2\u00a0\u00a1\5$\23\2\u00a1\u00a2\5D#\2\u00a2\u00a3\5(\25\2\u00a3"+
		"\u00a4\5\4\3\2\u00a4\u00b3\5&\24\2\u00a5\u00a6\5@!\2\u00a6\u00a7\5\"\22"+
		"\2\u00a7\u00a8\5\26\f\2\u00a8\u00a9\5$\23\2\u00a9\u00aa\5\4\3\2\u00aa"+
		"\u00ac\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0"+
		"\u00b1\5B\"\2\u00b1\u00b2\5\4\3\2\u00b2\u00b4\3\2\2\2\u00b3\u00ad\3\2"+
		"\2\2\u00b3\u00b4\3\2\2\2\u00b4\25\3\2\2\2\u00b5\u00b6\5\20\t\2\u00b6\u00b7"+
		"\5\64\33\2\u00b7\u00b8\5\20\t\2\u00b8\u00bb\3\2\2\2\u00b9\u00bb\5\62\32"+
		"\2\u00ba\u00b5\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\27\3\2\2\2\u00bc\u00bf"+
		"\5\6\4\2\u00bd\u00bf\5\34\17\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2"+
		"\u00bf\u00c0\3\2\2\2\u00c0\u00c1\5\32\16\2\u00c1\u00c2\5\20\t\2\u00c2"+
		"\u00c3\5F$\2\u00c3\31\3\2\2\2\u00c4\u00c5\7\26\2\2\u00c5\33\3\2\2\2\u00c6"+
		"\u00c7\7\25\2\2\u00c7\35\3\2\2\2\u00c8\u00c9\7\34\2\2\u00c9\37\3\2\2\2"+
		"\u00ca\u00cb\7\35\2\2\u00cb!\3\2\2\2\u00cc\u00cd\7\32\2\2\u00cd#\3\2\2"+
		"\2\u00ce\u00cf\7\33\2\2\u00cf%\3\2\2\2\u00d0\u00d1\7\5\2\2\u00d1\'\3\2"+
		"\2\2\u00d2\u00d3\7\4\2\2\u00d3)\3\2\2\2\u00d4\u00d5\7\t\2\2\u00d5+\3\2"+
		"\2\2\u00d6\u00d7\7\6\2\2\u00d7-\3\2\2\2\u00d8\u00d9\7\7\2\2\u00d9/\3\2"+
		"\2\2\u00da\u00db\7\b\2\2\u00db\61\3\2\2\2\u00dc\u00dd\7\f\2\2\u00dd\63"+
		"\3\2\2\2\u00de\u00df\7\n\2\2\u00df\65\3\2\2\2\u00e0\u00e1\7\21\2\2\u00e1"+
		"\67\3\2\2\2\u00e2\u00e3\7\22\2\2\u00e39\3\2\2\2\u00e4\u00e5\7\23\2\2\u00e5"+
		";\3\2\2\2\u00e6\u00e7\7\24\2\2\u00e7=\3\2\2\2\u00e8\u00e9\7\r\2\2\u00e9"+
		"?\3\2\2\2\u00ea\u00eb\7\16\2\2\u00ebA\3\2\2\2\u00ec\u00ed\7\17\2\2\u00ed"+
		"C\3\2\2\2\u00ee\u00ef\7\20\2\2\u00efE\3\2\2\2\u00f0\u00f1\7\3\2\2\u00f1"+
		"G\3\2\2\2\21KRV_jp|\u0083\u008d\u0095\u009b\u00ad\u00b3\u00ba\u00be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}