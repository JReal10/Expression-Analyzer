package Assignment1;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.swing.*;
import java.io.IOException;
import java.util.Arrays;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    private final static String DIR = "./src/Assignment1/";

    public static void main(String[] args) throws IOException {

        CharStream cs = fromFileName(DIR + "text.cc");  //read the input file
        ArithmeticLexer lexer = new ArithmeticLexer(cs);  //create a lexer object
        ArithmeticParser parser = new ArithmeticParser(new CommonTokenStream(lexer)); //create a arser objet
        parser.addParseListener(new evaluateExpression());
        ParseTree parseTree = parser.start();

        JFrame frame = new JFrame("Parse Tree");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Create a TreeViewer object with the parse tree
        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), parseTree);

        // Set some options for the TreeViewer
        viewer.setScale(1.5);
        viewer.setAutoscrolls(true);

        // Add the TreeViewer to the frame and show the frame
        frame.add(viewer);

        frame.setVisible(true);
        parser.start();

        Pprint printer = new Pprint();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(printer, parseTree);

        System.out.println("LISP-like text form: " + printer.getResult());

    }
}