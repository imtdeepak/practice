package inheritance;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by byjumanikkan on 2/17/16.
 */
public class Palindrome {
    private static volatile Palindrome instance = null;
    public static Palindrome getInstance()
    {
        if(instance == null){
            synchronized (Palindrome.class) {
                if(instance == null) {
                    instance = new Palindrome();
                }
            }
        }
        return instance;
    }
    private Palindrome() {
    }
    public boolean isPalindromeByRecursion(String input)
    {
        if(input == null )
        {
            return true;
        }
        char[] chars = input.toCharArray();

        return isPalindrome(chars, 0, chars.length);
    }
    public boolean isPalindrome(char[] chars , int i, int n){
        if( i >= n/2) {
            return true;
        }
        return chars[i] == chars[n-i-1] && isPalindrome(chars, i+1, n);
    }

    public boolean isPalindrome(String input)
    {
        if(input == null )
        {
            return true;
        }
        char[] chars = input.toCharArray();
        int n = chars.length;
        for(int i =0 ; i < n /2 ; i++)
        {
            if(chars[i] != chars[n -i -1])
            {
                return false;
            }
        }
        return true;
    }

    private boolean isAllCapitalLetters(String input) {
        if(input == null )
        {
            return true;
        }
        char[] chars = input.toCharArray();
        for(int i =0 ; i < chars.length  ; i++)
        {
            if(chars[i] < 'A' || chars[i] > 'Z')
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("1234321");
        stringList.add("malayalam");
        stringList.add("MALAYALAM");
        stringList.add("amma");
        stringList.add("chitanya");
        stringList.add("");
        Palindrome palindromeInstance = Palindrome.getInstance();
        System.out.println(palindromeInstance);
        Palindrome palindromeInstance1 = Palindrome.getInstance();
        System.out.println(palindromeInstance1);

        for (String palindrome : stringList) {
            System.out.println(palindrome + " Palindrome  " + palindromeInstance.isPalindromeByRecursion(palindrome));
            System.out.println(palindrome + " all capital letters " + palindromeInstance.isAllCapitalLetters(palindrome));
        }

    }
}
