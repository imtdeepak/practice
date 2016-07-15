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

    private static List<Integer> bubbleSort8(List<Integer> unsorted) {

        if (!unsorted.isEmpty()) {
            return unsorted.stream().sorted(Comparator.comparing(Integer::intValue)).collect(toList());
        }
        return null;
    }

    //Big(O) = O(n*n)
    private static List<Integer> bubbleSort(List<Integer> unsorted) {

        if (!unsorted.isEmpty()) {
            Integer temp;
            boolean isSwapped = true;
            Integer numberOfIteration=0;

            while (isSwapped) {
                isSwapped = false;
                for (int i = 1; i < unsorted.size(); i++) {
                    if (unsorted.get(i - 1) > unsorted.get(i)) {
                        temp = unsorted.get(i - 1);
                        unsorted.set(i - 1, unsorted.get(i));
                        unsorted.set(i, temp);
                        isSwapped = true;
                        numberOfIteration++;
                    }
                }
            }
            System.out.println("Number of Iterations= "+numberOfIteration);
            return unsorted;

        }
        return null;
    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(6, 1, 8, 10, 2, 3, 4, 5, 7,9));

        System.out.println("UnSorted List=" + list);
        System.out.println("Sorted List=" + bubbleSort(list));
        System.out.println(list);

    }
}
