package variables;
import static java.lang.Math.abs;

/**
 * Created by deepak.kumar on 3/10/16.
 */
public class Variable {

    public static int reverse(int value)
    {
        int reversed  = 0;
        while( value > 0 ){
            reversed = reversed * 10;
            int reminder = value % 10;
            reversed = reversed + reminder;
            value = value / 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        int i = 10;
        switch (i){
            case 10 : System.out.println(" it is 10");
                //break;
            case 11 : System.out.println(" it is 11");
                break;
            case 1 : System.out.println(" it is 1");
                //break;
            //default:System.out.println(" i dont know what it is ");
        }


    }
}
