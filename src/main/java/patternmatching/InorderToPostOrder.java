package patternmatching;

import java.util.Stack;

/**
 * Created by byjumanikkan on 5/11/16.
 */
public class InorderToPostOrder {

    public String convert(String input){
        Stack<String> postOrder = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();
        char [] tokens = input.toCharArray();
        for(int i=0; i < tokens.length; i++){
            if(tokens[i] == ' '){
                continue;
            }
            if(tokens[i] >= '0' && tokens[i] <= '9'){
               StringBuffer sb = new StringBuffer();
                while(i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9'){
                    sb.append(tokens[i]);
                    i++;
                }
                i--;
                postOrder.push(sb.toString());
            } else if (isOperator(tokens[i])) {
                if(!operatorStack.isEmpty() && hasPrecedence(operatorStack.peek(), tokens[i])){
                    String operandB = postOrder.pop();
                    String operandA = postOrder.pop();
                    postOrder.push(operandA + " " + operandB + " " + operatorStack.pop());
                }
                operatorStack.push(tokens[i]);

            }
            else if(tokens[i] == '(') {
                operatorStack.push(tokens[i]);
            }else if(tokens[i] == ')') {
                while(operatorStack.peek() != '('){
                    String operandB = postOrder.pop();
                    String operandA = postOrder.pop();
                    postOrder.push(operandA + " " + operandB + " " + operatorStack.pop());
                }
                operatorStack.pop();
            }
        }
        while(!operatorStack.isEmpty()){
            String operandB = postOrder.pop();
            String operandA = postOrder.pop();
            postOrder.push(operandA + " " + operandB + " " + operatorStack.pop());
        }
        return postOrder.pop();
    }

    private boolean hasPrecedence(char op1, char op2) {
        return (op1 == '*' || op1 == '/') &&
                (op2 == '-' || op2 == '+');
    }

    private boolean isOperator(char token) {
        return token == '+' ||
                token == '-' ||
                token == '*' ||
                token == '/';
    }
    public Integer postOrderEval(String expression){
        char[] tokens = expression.toCharArray();
        Stack<Integer> values = new Stack<>();
        for (int i = 0; i < tokens.length; i++){
            if(tokens[i] == ' '){
                continue;
            }
            if(tokens[i] >= '0' && tokens[i] <= '9'){
                StringBuffer sb = new StringBuffer();
                while(i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9'){
                    sb.append(tokens[i]);
                    i++;
                }
                i--;
                values.push(Integer.parseInt(sb.toString()));
            } else if (isOperator(tokens[i])) {
                    Integer operandB = values.pop();
                    Integer operandA = values.pop();
                    values.push(eval(operandA, operandB, tokens[i]));
                }
            }
        return values.pop();
    }

    private Integer eval(Integer operandA, Integer operandB, char token) {
        Integer result;
        switch(token) {
            case '+' : result = operandA + operandB;
                break;
            case '-' : result = operandA - operandB;
                break;
            case '*' : result = operandA * operandB;
                break;
            case '/' :
                if(operandB == 0) {
                    throw new UnsupportedOperationException("Cant divide by 0");
                }
                result = operandA / operandB;
                break;
            default:
                throw new UnsupportedOperationException("Unknown operation");
        }
        return result;
    }


    public static void main(String[] args) {
        InorderToPostOrder inoderToPostOrder = new InorderToPostOrder();
        System.out.println(inoderToPostOrder.postOrderEval(inoderToPostOrder.convert("1+2")));
        System.out.println(inoderToPostOrder.postOrderEval(inoderToPostOrder.convert("1+2*3")));
        System.out.println(inoderToPostOrder.convert("(1+2)*3"));
    }
}
