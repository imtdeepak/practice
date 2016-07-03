package datastructure;

/**
 * Created by deepak on 7/2/16.
 */
public class ReverseNumber {
    public static  void main(String []agrs){

        System.out.println("We are reversing the Number");
        int straightNumber=123456;
        System.out.println("Straight number ="+straightNumber);
        System.out.println("Reversed String= "+reverseNumber(straightNumber));
}

    private static int reverseNumber(int straightNumber) {
        Integer reverseNumber=0;
        while(straightNumber!=0){
            reverseNumber=reverseNumber*10+straightNumber%10;
            straightNumber=straightNumber/10;
        }

        return reverseNumber;
    }

}
