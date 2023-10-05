package Assignment1;

import org.antlr.v4.runtime.tree.*;

public class Pprint extends ArithmeticBaseListener {
    private StringBuilder sb = new StringBuilder();//used to concatenate strings

    @Override
    public void enterAssign(ArithmeticParser.AssignContext context) {
        sb.append("(= ").append(context.VARIABLE().getText()).append(" ");
    }

    @Override
    public void exitAssign(ArithmeticParser.AssignContext context) {
        sb.append(" )");
    }
    //creates (= ) and appends to sb
    @Override
    public void enterNUMBER(ArithmeticParser.NUMBERContext context) {
        sb.append("( ").append(context.getText()).append(" )");
    }
    //creates ( number ) and append to sb
    @Override
    public void enterVARIABLE(ArithmeticParser.VARIABLEContext context) {
        sb.append("( ").append(context.getText()).append(" )");
    }
    //create ( variable ) and append to sb
    @Override
    public void enterMult(ArithmeticParser.MultContext context) {
        sb.append("(* ");
    }

    @Override
    public void exitMult(ArithmeticParser.MultContext context) {
        sb.append(")");
    }
    //create (* ) and append to sb
    @Override
    public void enterAdd(ArithmeticParser.AddContext context) {
        sb.append("(+ ");
    }

    @Override
    public void exitAdd(ArithmeticParser.AddContext context) {
        sb.append(")");
    }
    //create (+ ) and append to sb
    @Override
    public void enterParen(ArithmeticParser.ParenContext context) {
        sb.append("(");
    }

    @Override
    public void exitParen(ArithmeticParser.ParenContext context) {
        sb.append(")");
    }
    //appends () around the expression
    public String getResult() {
        return sb.toString();
    }
}