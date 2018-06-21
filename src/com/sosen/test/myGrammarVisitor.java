// Generated from D:/STUDIA/6 SEMESTR/Kompilatory/JLoL\myGrammar.g4 by ANTLR 4.7
package com.sosen.test;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link myGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface myGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#startq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartq(myGrammarParser.StartqContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#instructionsBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructionsBlock(myGrammarParser.InstructionsBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(myGrammarParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#variableDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDec(myGrammarParser.VariableDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#stringDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringDec(myGrammarParser.StringDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#arrayDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDec(myGrammarParser.ArrayDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#arrayVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayVal(myGrammarParser.ArrayValContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarType(myGrammarParser.VarTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(myGrammarParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#variableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableType(myGrammarParser.VariableTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(myGrammarParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalStatementBooleanExpr}
	 * labeled alternative in {@link myGrammarParser#logicalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalStatementBooleanExpr(myGrammarParser.LogicalStatementBooleanExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalStatementBoolean}
	 * labeled alternative in {@link myGrammarParser#logicalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalStatementBoolean(myGrammarParser.LogicalStatementBooleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(myGrammarParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#equalMarkTok}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualMarkTok(myGrammarParser.EqualMarkTokContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#varNameTok}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarNameTok(myGrammarParser.VarNameTokContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#squareOpenBracketTok}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSquareOpenBracketTok(myGrammarParser.SquareOpenBracketTokContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#squareCloseBracketTok}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSquareCloseBracketTok(myGrammarParser.SquareCloseBracketTokContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#openBracketTok}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenBracketTok(myGrammarParser.OpenBracketTokContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#closeBracketTok}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseBracketTok(myGrammarParser.CloseBracketTokContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#blockCloseBracketTok}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockCloseBracketTok(myGrammarParser.BlockCloseBracketTokContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#blockOpenBracketTok}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockOpenBracketTok(myGrammarParser.BlockOpenBracketTokContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#mathOperatorTok}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathOperatorTok(myGrammarParser.MathOperatorTokContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#integerTok}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerTok(myGrammarParser.IntegerTokContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#doubleTok}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleTok(myGrammarParser.DoubleTokContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#stringTok}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringTok(myGrammarParser.StringTokContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#booleanTok}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanTok(myGrammarParser.BooleanTokContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#booleanOperatorTok}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanOperatorTok(myGrammarParser.BooleanOperatorTokContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#integerTypeTok}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerTypeTok(myGrammarParser.IntegerTypeTokContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#doubleTypeTok}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleTypeTok(myGrammarParser.DoubleTypeTokContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#stringTypeTok}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringTypeTok(myGrammarParser.StringTypeTokContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#booleanTypeTok}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanTypeTok(myGrammarParser.BooleanTypeTokContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#ifTok}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfTok(myGrammarParser.IfTokContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#elsifTok}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsifTok(myGrammarParser.ElsifTokContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#elseTok}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseTok(myGrammarParser.ElseTokContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#thenTok}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThenTok(myGrammarParser.ThenTokContext ctx);
	/**
	 * Visit a parse tree produced by {@link myGrammarParser#xdTok}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXdTok(myGrammarParser.XdTokContext ctx);
}