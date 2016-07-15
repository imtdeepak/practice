package java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by 212550544 on 7/14/16.
 */
public class BubbleSort {

    private static List<Integer> bubbleSort(List<Integer> unsorted)
    {

        if(!unsorted.isEmpty())
        {
            List<Integer> integers = unsorted.stream().sorted(Comparator.comparing(Integer::intValue)).collect(toList());
            return integers;

        }
        return null;
    }

    public static void main(String []args){
        List<Integer> list = new ArrayList<>(Arrays.asList(6,1,8,10,2,3,4,5,9));

        System.out.println("UnSorted List="+list);
        System.out.println("Sorted List="+bubbleSort(list));

    }
}
