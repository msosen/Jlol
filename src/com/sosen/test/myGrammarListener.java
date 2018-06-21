// Generated from D:/STUDIA/6 SEMESTR/Kompilatory/JLoL\myGrammar.g4 by ANTLR 4.7
package com.sosen.test;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link myGrammarParser}.
 */
public interface myGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#startq}.
	 * @param ctx the parse tree
	 */
	void enterStartq(myGrammarParser.StartqContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#startq}.
	 * @param ctx the parse tree
	 */
	void exitStartq(myGrammarParser.StartqContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#instructionsBlock}.
	 * @param ctx the parse tree
	 */
	void enterInstructionsBlock(myGrammarParser.InstructionsBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#instructionsBlock}.
	 * @param ctx the parse tree
	 */
	void exitInstructionsBlock(myGrammarParser.InstructionsBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(myGrammarParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(myGrammarParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#variableDec}.
	 * @param ctx the parse tree
	 */
	void enterVariableDec(myGrammarParser.VariableDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#variableDec}.
	 * @param ctx the parse tree
	 */
	void exitVariableDec(myGrammarParser.VariableDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#stringDec}.
	 * @param ctx the parse tree
	 */
	void enterStringDec(myGrammarParser.StringDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#stringDec}.
	 * @param ctx the parse tree
	 */
	void exitStringDec(myGrammarParser.StringDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#arrayDec}.
	 * @param ctx the parse tree
	 */
	void enterArrayDec(myGrammarParser.ArrayDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#arrayDec}.
	 * @param ctx the parse tree
	 */
	void exitArrayDec(myGrammarParser.ArrayDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#arrayVal}.
	 * @param ctx the parse tree
	 */
	void enterArrayVal(myGrammarParser.ArrayValContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#arrayVal}.
	 * @param ctx the parse tree
	 */
	void exitArrayVal(myGrammarParser.ArrayValContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarType(myGrammarParser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarType(myGrammarParser.VarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(myGrammarParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(myGrammarParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterVariableType(myGrammarParser.VariableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitVariableType(myGrammarParser.VariableTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(myGrammarParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(myGrammarParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalStatementBooleanExpr}
	 * labeled alternative in {@link myGrammarParser#logicalStatement}.
	 * @param ctx the parse tree
	 */
	void enterLogicalStatementBooleanExpr(myGrammarParser.LogicalStatementBooleanExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalStatementBooleanExpr}
	 * labeled alternative in {@link myGrammarParser#logicalStatement}.
	 * @param ctx the parse tree
	 */
	void exitLogicalStatementBooleanExpr(myGrammarParser.LogicalStatementBooleanExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalStatementBoolean}
	 * labeled alternative in {@link myGrammarParser#logicalStatement}.
	 * @param ctx the parse tree
	 */
	void enterLogicalStatementBoolean(myGrammarParser.LogicalStatementBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalStatementBoolean}
	 * labeled alternative in {@link myGrammarParser#logicalStatement}.
	 * @param ctx the parse tree
	 */
	void exitLogicalStatementBoolean(myGrammarParser.LogicalStatementBooleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(myGrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(myGrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#equalMarkTok}.
	 * @param ctx the parse tree
	 */
	void enterEqualMarkTok(myGrammarParser.EqualMarkTokContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#equalMarkTok}.
	 * @param ctx the parse tree
	 */
	void exitEqualMarkTok(myGrammarParser.EqualMarkTokContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#varNameTok}.
	 * @param ctx the parse tree
	 */
	void enterVarNameTok(myGrammarParser.VarNameTokContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#varNameTok}.
	 * @param ctx the parse tree
	 */
	void exitVarNameTok(myGrammarParser.VarNameTokContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#squareOpenBracketTok}.
	 * @param ctx the parse tree
	 */
	void enterSquareOpenBracketTok(myGrammarParser.SquareOpenBracketTokContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#squareOpenBracketTok}.
	 * @param ctx the parse tree
	 */
	void exitSquareOpenBracketTok(myGrammarParser.SquareOpenBracketTokContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#squareCloseBracketTok}.
	 * @param ctx the parse tree
	 */
	void enterSquareCloseBracketTok(myGrammarParser.SquareCloseBracketTokContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#squareCloseBracketTok}.
	 * @param ctx the parse tree
	 */
	void exitSquareCloseBracketTok(myGrammarParser.SquareCloseBracketTokContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#openBracketTok}.
	 * @param ctx the parse tree
	 */
	void enterOpenBracketTok(myGrammarParser.OpenBracketTokContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#openBracketTok}.
	 * @param ctx the parse tree
	 */
	void exitOpenBracketTok(myGrammarParser.OpenBracketTokContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#closeBracketTok}.
	 * @param ctx the parse tree
	 */
	void enterCloseBracketTok(myGrammarParser.CloseBracketTokContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#closeBracketTok}.
	 * @param ctx the parse tree
	 */
	void exitCloseBracketTok(myGrammarParser.CloseBracketTokContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#blockCloseBracketTok}.
	 * @param ctx the parse tree
	 */
	void enterBlockCloseBracketTok(myGrammarParser.BlockCloseBracketTokContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#blockCloseBracketTok}.
	 * @param ctx the parse tree
	 */
	void exitBlockCloseBracketTok(myGrammarParser.BlockCloseBracketTokContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#blockOpenBracketTok}.
	 * @param ctx the parse tree
	 */
	void enterBlockOpenBracketTok(myGrammarParser.BlockOpenBracketTokContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#blockOpenBracketTok}.
	 * @param ctx the parse tree
	 */
	void exitBlockOpenBracketTok(myGrammarParser.BlockOpenBracketTokContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#mathOperatorTok}.
	 * @param ctx the parse tree
	 */
	void enterMathOperatorTok(myGrammarParser.MathOperatorTokContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#mathOperatorTok}.
	 * @param ctx the parse tree
	 */
	void exitMathOperatorTok(myGrammarParser.MathOperatorTokContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#integerTok}.
	 * @param ctx the parse tree
	 */
	void enterIntegerTok(myGrammarParser.IntegerTokContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#integerTok}.
	 * @param ctx the parse tree
	 */
	void exitIntegerTok(myGrammarParser.IntegerTokContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#doubleTok}.
	 * @param ctx the parse tree
	 */
	void enterDoubleTok(myGrammarParser.DoubleTokContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#doubleTok}.
	 * @param ctx the parse tree
	 */
	void exitDoubleTok(myGrammarParser.DoubleTokContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#stringTok}.
	 * @param ctx the parse tree
	 */
	void enterStringTok(myGrammarParser.StringTokContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#stringTok}.
	 * @param ctx the parse tree
	 */
	void exitStringTok(myGrammarParser.StringTokContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#booleanTok}.
	 * @param ctx the parse tree
	 */
	void enterBooleanTok(myGrammarParser.BooleanTokContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#booleanTok}.
	 * @param ctx the parse tree
	 */
	void exitBooleanTok(myGrammarParser.BooleanTokContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#booleanOperatorTok}.
	 * @param ctx the parse tree
	 */
	void enterBooleanOperatorTok(myGrammarParser.BooleanOperatorTokContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#booleanOperatorTok}.
	 * @param ctx the parse tree
	 */
	void exitBooleanOperatorTok(myGrammarParser.BooleanOperatorTokContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#integerTypeTok}.
	 * @param ctx the parse tree
	 */
	void enterIntegerTypeTok(myGrammarParser.IntegerTypeTokContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#integerTypeTok}.
	 * @param ctx the parse tree
	 */
	void exitIntegerTypeTok(myGrammarParser.IntegerTypeTokContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#doubleTypeTok}.
	 * @param ctx the parse tree
	 */
	void enterDoubleTypeTok(myGrammarParser.DoubleTypeTokContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#doubleTypeTok}.
	 * @param ctx the parse tree
	 */
	void exitDoubleTypeTok(myGrammarParser.DoubleTypeTokContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#stringTypeTok}.
	 * @param ctx the parse tree
	 */
	void enterStringTypeTok(myGrammarParser.StringTypeTokContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#stringTypeTok}.
	 * @param ctx the parse tree
	 */
	void exitStringTypeTok(myGrammarParser.StringTypeTokContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#booleanTypeTok}.
	 * @param ctx the parse tree
	 */
	void enterBooleanTypeTok(myGrammarParser.BooleanTypeTokContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#booleanTypeTok}.
	 * @param ctx the parse tree
	 */
	void exitBooleanTypeTok(myGrammarParser.BooleanTypeTokContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#ifTok}.
	 * @param ctx the parse tree
	 */
	void enterIfTok(myGrammarParser.IfTokContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#ifTok}.
	 * @param ctx the parse tree
	 */
	void exitIfTok(myGrammarParser.IfTokContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#elsifTok}.
	 * @param ctx the parse tree
	 */
	void enterElsifTok(myGrammarParser.ElsifTokContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#elsifTok}.
	 * @param ctx the parse tree
	 */
	void exitElsifTok(myGrammarParser.ElsifTokContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#elseTok}.
	 * @param ctx the parse tree
	 */
	void enterElseTok(myGrammarParser.ElseTokContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#elseTok}.
	 * @param ctx the parse tree
	 */
	void exitElseTok(myGrammarParser.ElseTokContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#thenTok}.
	 * @param ctx the parse tree
	 */
	void enterThenTok(myGrammarParser.ThenTokContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#thenTok}.
	 * @param ctx the parse tree
	 */
	void exitThenTok(myGrammarParser.ThenTokContext ctx);
	/**
	 * Enter a parse tree produced by {@link myGrammarParser#xdTok}.
	 * @param ctx the parse tree
	 */
	void enterXdTok(myGrammarParser.XdTokContext ctx);
	/**
	 * Exit a parse tree produced by {@link myGrammarParser#xdTok}.
	 * @param ctx the parse tree
	 */
	void exitXdTok(myGrammarParser.XdTokContext ctx);
}