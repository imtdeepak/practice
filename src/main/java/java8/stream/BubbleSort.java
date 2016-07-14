package java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by byjumanikkan on 1/28/16.
 */
public class BubbleSort {

    private static void bubbleSort()
    {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        while(!list.isEmpty())
        {
            List<Integer> integers = list.stream().sorted(Comparator.comparing(Integer::intValue)).collect(toList());

        }
    }

    public static void main(String []args)
    {
         System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
