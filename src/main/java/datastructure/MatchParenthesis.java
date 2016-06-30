package datastructure;

import java.util.*;
public class MatchParenthesis{

    public static void main(String []args){

        for(String match:args){
            System.out.println("MatchParenthesis of argument passed" +matchParenthesis(match));
        }
        System.out.println("MatchParenthesis of argument passed " +"[{}]()"+ matchParenthesis("[{}]()"));
    }



    public static boolean matchParenthesis(String arg){
        if(arg==null){
            return false;
        }
        Stack<Character> parenthesisStack = new Stack<Character>();

        for(char ch:arg.toCharArray()){
            if(ifOpenBracket(ch)){
                parenthesisStack.push(ch);
            }
            else if(isCloseBracket(ch)){
                if(!parenthesisStack.empty() &&!isLastOpened(ch,parenthesisStack.pop())){
                    return false;
                }
            }else{
                return false;
            }

        }

        if(!parenthesisStack.empty()){
            return false;
        }else{
            return true;
        }

    }

    private static boolean isLastOpened(char ch, Character pop) {
    	char expectedOpenBracket = ' ';
    	if(ch==']'){
    		expectedOpenBracket='[';
    	}else if(ch=='}'){
    		expectedOpenBracket='{';
    	}else if(ch==')'){
    		expectedOpenBracket='(';
    	}
    	
    	if(pop.equals(expectedOpenBracket)){
    		return true;
    	}
		// TODO Auto-generated method stub
		return false;
	}



	public static boolean ifOpenBracket(char c){
        String openBrackets="[{(";
        for(char ch:openBrackets.toCharArray() ){
            if(c==ch){
                return true;
            }
        }
        return false;
    }

    public static boolean isCloseBracket(char c){
        String closeBrackets="]})";
        for(char ch:closeBrackets.toCharArray() ){
            if(c==ch){
                return true;
            }
        }
        return false;
    }
}
