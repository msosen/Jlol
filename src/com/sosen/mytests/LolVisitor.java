package com.sosen.mytests;


import com.sosen.test.myGrammarBaseVisitor;
import com.sosen.test.myGrammarParser;
import javafx.beans.binding.ListExpression;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.FileWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static java.lang.System.exit;
import static com.sosen.test.myGrammarParser.*;

public class LolVisitor extends myGrammarBaseVisitor<String> {

    int tabs = 0;

    LinkedList<String> VARIABLES = new LinkedList<String>();

    private FileWriter out;

    private void startPrinting() {
        try {

            //output definition
            out = new FileWriter("D:\\STUDIA\\6 SEMESTR\\Kompilatory\\Jlol\\src\\com\\sosen\\results\\JLolXD.java");
            out.write("package com.sosen.results; \n");
            out.write("public class JLolXD { \n public static void main(String [] args){ \n");

            //out.write("#include \"Variable.java\"\n\n");

        } catch (Exception e) {
            System.out.println("Problem with file to write to.");
            exit(1);
            e.printStackTrace();
        }
    }


    private void print(String s) {

        try {
            out.write(s);
        } catch (Exception e) {
            System.out.println("Problem with printing to file.");
            e.printStackTrace();
        }
    }

    private void stopPrinting() {
        try {
            out.write(" } \n }");
            out.close();
        } catch (Exception e) {
            System.out.println("Problem with closing file.");
            e.printStackTrace();
        }
    }


    /*
    VISITOR METHODS
    */


    @Override
    public String visitStartq(myGrammarParser.StartqContext ctx) {
        startPrinting();
        visitChildren(ctx);
        stopPrinting();
        return "OK";

    }

    @Override
    public String visitInstructionsBlock(myGrammarParser.InstructionsBlockContext ctx) {
        visitChildren(ctx);
        return "OK";

    }

    @Override
    public String visitDeclaration(myGrammarParser.DeclarationContext ctx) {
        visitChildren(ctx);
        return "OK";

    }

    @Override
    public String visitVariableDec(myGrammarParser.VariableDecContext ctx) {
        visitChildren(ctx);
        return "OK";
    }

    @Override
    public String visitArrayDec(myGrammarParser.ArrayDecContext ctx) {
        visitChildren(ctx);
        return "OK";
    }

    @Override
    public String visitArrayVal(myGrammarParser.ArrayValContext ctx) {
        visitChildren(ctx);
        return "OK";
    }

    @Override
    public String visitVarType(myGrammarParser.VarTypeContext ctx) {
        visitChildren(ctx);
        return "OK";
    }

    @Override
    public String visitVariableType(myGrammarParser.VariableTypeContext ctx) {
        visitChildren(ctx);
        return "OK";
    }

    @Override
    public String visitIfStatement(myGrammarParser.IfStatementContext ctx) {
        visitChildren(ctx);
        return "OK";
    }

    @Override
    public String visitLogicalStatementBooleanExpr(myGrammarParser.LogicalStatementBooleanExprContext ctx) {
        visitChildren(ctx);
        return "OK";
    }

    @Override
    public String visitLogicalStatementBoolean(myGrammarParser.LogicalStatementBooleanContext ctx) {
        visitChildren(ctx);
        return "OK";
    }

    @Override
    public String visitAssignment(myGrammarParser.AssignmentContext ctx) {
    visitChildren(ctx);
        return "OK";
    }

    @Override
    public String visitEqualMarkTok(myGrammarParser.EqualMarkTokContext ctx) {
        print(ctx.EqualMark().getSymbol().getText());
        return super.visitEqualMarkTok(ctx);
    }

    @Override
    public String visitVarNameTok(myGrammarParser.VarNameTokContext ctx) {
        print(ctx.VarName().getSymbol().getText() + " ");
        return super.visitVarNameTok(ctx);
    }

    @Override
    public String visitSquareOpenBracketTok(myGrammarParser.SquareOpenBracketTokContext ctx) {
        print(ctx.SquareOpenBracket().getSymbol().getText());
        return super.visitSquareOpenBracketTok(ctx);
    }

    @Override
    public String visitSquareCloseBracketTok(myGrammarParser.SquareCloseBracketTokContext ctx) {
        print(ctx.SquareCloseBracket().getSymbol().getText());
        return super.visitSquareCloseBracketTok(ctx);
    }

    @Override
    public String visitOpenBracketTok(myGrammarParser.OpenBracketTokContext ctx) {
        print(ctx.OpenBracket().getSymbol().getText());
        return super.visitOpenBracketTok(ctx);
    }

    @Override
    public String visitCloseBracketTok(myGrammarParser.CloseBracketTokContext ctx) {
        print(ctx.CloseBracket().getSymbol().getText());
        return super.visitCloseBracketTok(ctx);
    }

    @Override
    public String visitMathOperatorTok(myGrammarParser.MathOperatorTokContext ctx) {
        print(ctx.MathOperator().getSymbol().getText()  + " ");
        return super.visitMathOperatorTok(ctx);
    }

    @Override
    public String visitIntegerTok(myGrammarParser.IntegerTokContext ctx) {
        print(ctx.Integer().getSymbol().getText()  + " ");
        return super.visitIntegerTok(ctx);
    }

    @Override
    public String visitDoubleTok(myGrammarParser.DoubleTokContext ctx) {
        print(ctx.Double().getSymbol().getText() + " ");
        return super.visitDoubleTok(ctx);
    }

    @Override
    public String visitStringTok(myGrammarParser.StringTokContext ctx) {
        print("\"");
        print(ctx.String().getSymbol().getText() + " ");
        print("\"");
        return super.visitStringTok(ctx);
    }

    @Override
    public String visitBooleanTok(myGrammarParser.BooleanTokContext ctx) {
        print(ctx.Boolean().getSymbol().getText() + " ");
        return super.visitBooleanTok(ctx);
    }

    @Override
    public String visitBooleanOperatorTok(myGrammarParser.BooleanOperatorTokContext ctx) {
        print(ctx.BooleanOperator().getSymbol().getText() + " ");
        return super.visitBooleanOperatorTok(ctx);
    }

    @Override
    public String visitIntegerTypeTok(myGrammarParser.IntegerTypeTokContext ctx) {
        print(ctx.IntegerType().getSymbol().getText() +" ");
        return super.visitIntegerTypeTok(ctx);
    }

    @Override
    public String visitDoubleTypeTok(myGrammarParser.DoubleTypeTokContext ctx) {
        print(ctx.DoubleType().getSymbol().getText() + " ");
        return super.visitDoubleTypeTok(ctx);
    }

    @Override
    public String visitStringTypeTok(myGrammarParser.StringTypeTokContext ctx) {
        System.out.print(" visiting str type tok " + ctx.StringType().getSymbol().getText());
        print(ctx.StringType().getSymbol().getText() + "  ");
        return super.visitStringTypeTok(ctx);
    }

    @Override
    public String visitBooleanTypeTok(myGrammarParser.BooleanTypeTokContext ctx) {
        print(ctx.BooleanType().getSymbol().getText() + " ");
        return super.visitBooleanTypeTok(ctx);
    }

    @Override
    public String visitIfTok(myGrammarParser.IfTokContext ctx) {
        print(ctx.If().getSymbol().getText() + " ");
        return super.visitIfTok(ctx);
    }

    @Override
    public String visitElsifTok(myGrammarParser.ElsifTokContext ctx) {
        print("else if ");
        return super.visitElsifTok(ctx);
    }

    @Override
    public String visitElseTok(myGrammarParser.ElseTokContext ctx) {
        print(ctx.Else().getSymbol().getText() + " ");
        return super.visitElseTok(ctx);
    }

    @Override
    public String visitThenTok(myGrammarParser.ThenTokContext ctx) {
        print(" ");
        return super.visitThenTok(ctx);
    }

    @Override
    public String visitBlockOpenBracketTok(myGrammarParser.BlockOpenBracketTokContext ctx){
        print(ctx.BlockOpenBracket().getSymbol().getText());
        print("\n");
        return super.visitBlockOpenBracketTok(ctx);
    }

    @Override
    public String visitBlockCloseBracketTok(myGrammarParser.BlockCloseBracketTokContext ctx){
        print(ctx.BlockCloseBracket().getSymbol().getText());
        print("\n");
        return super.visitBlockCloseBracketTok(ctx);
    }

    @Override
    public String visitXdTok(myGrammarParser.XdTokContext ctx){
        print(";\n");
        return super.visitXdTok(ctx);

    }

    @Override
    public String visitStringDec(myGrammarParser.StringDecContext ctx){
        visitChildren(ctx);
        return "OK";
    }
}