package java8.stream;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by deepak.kumar on 2/6/16.
 */
public class Fibonacii {
    private static Map<Integer,Integer> fibSum=new HashMap<>();

    public static int fibonacci(int x){
        if(x==0){
            fibSum.put(0,0);
            return 0;
        }else if(x==1){
            fibSum.put(1,1);
            return 1;
        }else{
            Integer sum1=fibSum.get(x-1);
            Integer sum2 = fibSum.get(x-2);
            if(sum1==null){
                sum1=fibonacci(x-1);
                fibSum.put(x-1,sum1);
            }
            if (sum2==null){
                sum2=fibonacci(x-2);
                fibSum.put(x-2,sum2);
            }

            return sum1+sum2;
        }


    }
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            System.out.println("Fibonacci of "+i+" = "+ fibonacci(i));
        }

    }
}
