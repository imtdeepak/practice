package datastructure;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by 212550544 on 7/7/16.
 */
public class SetSample {

    public static void main(String[] args) {
        Set<Integer> number1=new HashSet<>();
        number1.add(3);number1.add(2);number1.add(1);
        System.out.println("HashSet --"+number1);//Auto sorting

        Set<Integer> number2=new LinkedHashSet<>();
        number2.add(3);number2.add(2);number2.add(1);
        System.out.println("LinkedHashSet --"+number2);//Order of adding is preserved


    }
}
