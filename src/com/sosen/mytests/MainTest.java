package com.sosen.mytests;
import static com.sosen.test.myGrammarParser.*;
import static com.sosen.test.myGrammarLexer.*;
import static com.sosen.test.myGrammarParser.*;
import static com.sosen.test.myGrammarParser.*;
import static com.sosen.test.myGrammarParser.*;
import static com.sosen.test.myGrammarParser.*;


import com.sosen.test.myGrammarLexer;
import com.sosen.test.myGrammarParser;
import com.sosen.test.myGrammarVisitor;
import org.antlr.runtime.ANTLRInputStream;
        import org.antlr.runtime.ANTLRReaderStream;
        import org.antlr.v4.runtime.ANTLRFileStream;
        import org.antlr.v4.runtime.CommonTokenStream;
        import org.antlr.v4.runtime.tree.ParseTreeWalker;

        import java.io.*;
public class MainTest {

    public static void main(String [] args) {
        myGrammarLexer lexer = null;
        /*try {*/
        try {
            lexer = new myGrammarLexer(new ANTLRFileStream("D:\\STUDIA\\6 SEMESTR\\Kompilatory\\Jlol\\j.lol"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Pass the tokens to the parser
        myGrammarParser parser = new myGrammarParser(tokens);

        // Specify our entry point
        myGrammarParser.StartqContext formsSentenceContext = parser.startq();

        LolVisitor visitor = new LolVisitor();
        visitor.visit(formsSentenceContext);

        // final ClassBuilder microClass = new ClassBuilder("JLolXD", "D:\\STUDIA\\6 SEMESTR\\Kompilatory\\Jlol","");

    }
}