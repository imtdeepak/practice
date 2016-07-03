package datastructure;

/**
 * Created by deepak on 7/2/16.
 */
public class ReverseString {
    public static  void main(String []agrs){

        System.out.println("We are reversing the string");
        String straightString="Olympic Rio";

        System.out.println("Reversed String= "+reverseString(straightString));
    }

    private static String reverseString(String straightString) {
        StringBuffer stbf=new StringBuffer();
        int length=straightString.length();
        char[] chArray=straightString.toCharArray();
        System.out.println(chArray);
        for(int i=length; i>0;i--){
            System.out.println(chArray[i-1]);
            stbf.append(chArray[i-1]);
        }

        return stbf.toString();
    }
}
