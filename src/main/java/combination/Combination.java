package combination;

/**
 * Created by byjumanikkan on 5/21/16.
 */
public class Combination {

    public void combine(String str){

        char[] charArr = str.toCharArray();
        for(int i = 0 ; i < charArr.length; i++){
            for(int j = i+1 ; j <= charArr.length; j++)
            {
                System.out.println(str.substring(i, j));
            }
        }
    }

    public static void main(String[] args) {
        Combination combination = new Combination();
        combination.combine("wxyz");
    }
}
