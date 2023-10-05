package Assignment1;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class evaluateExpression extends ArithmeticBaseListener {
    private Stack<Double> stack = new Stack<Double>(); //stores variable, number and the result
    Map<String, Double> variables = new HashMap<>(); // stores the assigned variable

    @Override
    public void exitAssign(ArithmeticParser.AssignContext context)//Assigning variables to the hash map variables
    {
        String variableName = context.VARIABLE().getText();
        double Number = Double.parseDouble(context.expr().getText());
        variables.put(variableName, Number);
    }

    @Override
    public void exitNUMBER(ArithmeticParser.NUMBERContext context)//storing the number in a stack
    {
        Double i = Double.valueOf(context.NUMBER().getText());
        stack.push(i);
    }

    @Override
    public void exitVARIABLE(ArithmeticParser.VARIABLEContext context)//storing the value of the variables in map to a stack
    {
        String i = context.getText();
        double  a = variables.getOrDefault(i,0.0);

        stack.push(a);
    }

    @Override
    public void exitStart(ArithmeticParser.StartContext context)//printing the result
    {
        double result;
        result = stack.pop();

        System.out.println("result: " + result);
    }

    @Override
    public void exitMult(ArithmeticParser.MultContext context)          //calculation for the operator multiply or divide
    {                                                                   //using the values stored in the stack
        double left = stack.pop(); //values.get(context.expr(0));
        double right = stack.pop(); //values.get(context.expr(1));
        String operator = context.op.getText();
        double result;
        if (operator.equals("*")) {
            result = left * right;
        } else {
            result = left / right;
        }
        stack.push(result);
    }

    @Override
    public void exitAdd(ArithmeticParser.AddContext context)
                                                                        //calculation for the operator addition or
    {                                                                   //subtraction using the values stored in the stack
            double left = stack.pop(); // values.get(context.expr(0));
            double right = stack.pop(); //values.get(context.expr(1));
            String operator = context.op.getText();

            double result;
            if (operator.equals("+")) {
                result = left + right;
            } else {
                result = left - right;
            }
            stack.push(result);
        }

    }
