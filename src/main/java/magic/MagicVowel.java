package magic;

import java.util.*;

/**
 * Created by byjumanikkan on 5/22/16.
 */
public class MagicVowel {

    static Set<Character> vowelSet = new HashSet<>(Arrays.asList('a','e','i','o','u'));
    static Map<Character, Character> nextMap = new HashMap<>();
    static{
        nextMap.put('a','e');
        nextMap.put('e','i');
        nextMap.put('i','o');
        nextMap.put('o','u');
    }
    public static int longestSubSequence(String s)
    {
        char[] chars = s.toCharArray();
        List<String> result = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if(result.isEmpty()){
                while(i < chars.length && chars[i] != 'a') i++;
                if( i < chars.length) {
                    result.add("" + chars[i]);
                }
            }
            else{
                List<String> newResult = new ArrayList<>();
                for (String subStr : result) {
                    newResult.add(subStr);
                    char endChar = subStr.charAt(subStr.length()-1);
                    if(chars[i] == endChar || chars[i] == nextMap.get(endChar))
                    {
                        newResult.add(subStr+chars[i]);
                    }
                }
                result = newResult;
            }
        }
        int maxLen = 0;
        List<String> endResult = new ArrayList<>();

        for (String s1 : result) {
            int length = magicLength(s1);
            if(length > 0){
                endResult.add(s1);
                if(length > maxLen){
                    maxLen = length;
                }
            }
        }
        System.out.println(endResult);

        return maxLen;
    }

    private static List<String> filterNonValid(List<String> newResult) {
        List<String> result = new ArrayList<>();
        for (String s : newResult) {
            if(isValid(s)){
                result.add(s);
            }
        }
        return result;
    }

    private static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Set<Character> linkedHashSet = new LinkedHashSet<>();
        for (char aChar : chars) {
            linkedHashSet.add(aChar);
        }
        Character[] characters = linkedHashSet.toArray(new Character[0]);
        for(int i = 0; i < characters.length -1; i++)
        {
            for (Character character : vowelSet) {
                if(characters[i] < character && character < characters[i+1]){
                    return false;
                }
            }
        }
        return true;
    }

    static int magicLength(String s)
    {
        Set<Character> result = new HashSet<>(vowelSet);
        for (char c : s.toCharArray()) {
            result.remove(c);
        }
        if(result.isEmpty()){
            return s.length();
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(longestSubSequence("aaaaaaeeeeeeeeiiiiiiiiiooooooooouuuuuuuu"));
    }
}
