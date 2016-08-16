package patternmatching;

import java.util.Stack;

/**
 * Created by deepak.kumar on 5/8/16.
 */
public class EvaluateExpression {

    public int evaluate(String expression)
    {
        char[] tokens = expression.toCharArray();
        Stack<Integer> values = new Stack<>();
        Stack<Character> ops = new Stack<>();
        for(int i =0; i < tokens.length; i++){
            if(tokens[i] == ' '){
                continue;
            }
            if(tokens[i] >= '0' && tokens[i] <= '9'){
                StringBuffer stringBuffer = new StringBuffer();
                while(i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9'){
                    stringBuffer.append(tokens[i++]);
                }
                values.push(Integer.parseInt(stringBuffer.toString()));
            }
            else if(tokens[i] == '('){
                ops.push(tokens[i]);
            }
            else if(tokens[i] == ')'){
                while(ops.peek() != '('){
                    values.push(evaluate(ops.pop(), values.pop(), values.pop()));
                }
                ops.pop();
            }
            else if(isOperator(tokens[i])){
                while(!ops.isEmpty() && hasPrecedence(tokens[i], ops.peek())){
                    values.push(evaluate(ops.pop(), values.pop(), values.pop()));
                }
                ops.push(tokens[i]);
            }
        }
        while(!ops.isEmpty())
        {
            values.push(evaluate(ops.pop(), values.pop(), values.pop()));
        }

        return values.pop();
    }

    private boolean hasPrecedence(char op1, char op2) {
        if(op1 == '(' || op2 == '('){
            return false;
        }
        else if((op1 == '*' || op1 == '/') && (op2== '+' || op2 == '-')) {
            return false;
        }
        return true;
    }

    private boolean isOperator(char op) {
        return op == '*' || op == '/' || op == '+' || op == '-' ;
    }

    private Integer evaluate(Character op, Integer a, Integer b) {
        int result = 0;
        switch(op){
            case '+' :  result = a + b;
                break;
            case '-' :  result = b - a;
                break;
            case '*' :  result = a * b;
                break;
            case '/' :
                if(a == 0){
                    throw new UnsupportedOperationException("Can't devide by 0");
                }
                result = b / a;
                break;

        }
        return result;
    }
    public static void main(String[] args)
    {
        EvaluateExpression expression = new EvaluateExpression();
        System.out.println(expression.evaluate("10 + 2 * 6"));
        System.out.println(expression.evaluate("100 * 2 + 12"));
        System.out.println(expression.evaluate("100 * ( 2 + 12 )"));
        System.out.println(expression.evaluate("100 * ( 2 + 12 ) / 14"));
        System.out.println(expression.evaluate("100 - 98"));
    }
}
