package algo.problem;

import java.util.Stack;
import java.util.regex.Matcher;

/**
 * Created by byjumanikkan on 3/5/16.
 */
public class BraceMatching {

    public static void main(String[] args) {
        String input[] = {"{}[]()", "{[}]","{{[]}([]{})}"};
        String result[] = braces(input);
        for (String s : result) {
            System.out.println(s);
        }
    }

    private static String[] braces(String[] input) {
        String result[] = new String[input.length];
        for(int i = 0; i < input.length; i++){
            result[i] = brace(input[i]);
        }
        return result;
    }

    private static String brace(String input) {
        Stack<Character> stack = new Stack<>();
        boolean isMatching = true;
        for (char c : input.toCharArray()) {
            if(c == '{' || c == '[' || c == '('){
                stack.push(c);
            } else if((c == '}' || c == ']' || c == ')') &&
                    ((stack.isEmpty() || !isMatching(stack.pop(), c)))){
                    isMatching = false;
                    break;
                }

        }
        return isMatching && stack.isEmpty() ? "YES" : "NO";
    }

    private static boolean isMatching(char startChar, char c) {
        return (startChar == '{' && c == '}')
                ||(startChar == '[' && c == ']')
                ||(startChar == '(' && c == ')');
    }
}
