package merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by byjumanikkan on 3/21/16.
 */
public class MergeSort {

    private static int[] merge(int[] arrayA, int[] arrayB) {

        int[] merged = new int[arrayA.length + arrayB.length];
        int i = 0, j = 0, k = 0;

        while (i < arrayA.length && j < arrayB.length) {
            if (arrayA[i] < arrayB[j]) {
                merged[k++] = arrayA[i++];
            } else {
                merged[k++] = arrayB[j++];
            }
        }

        while (i < arrayA.length) {
            merged[k++] = arrayA[i++];

        }

        while (j < arrayB.length) {
            merged[k++] = arrayB[j++];
        }
        return merged;
    }


    private static List<Integer> merge(List<Integer> listA, List<Integer> listB) {

        List<Integer> merged = new ArrayList<>();
        Iterator<Integer> iteratorA = listA.iterator();
        Iterator<Integer> iteratorB = listB.iterator();
        Integer itemA = null;
        Integer itemB = null;

        while (iteratorA.hasNext() &&  iteratorB.hasNext()) {
            if(itemA == null ){
                itemA = iteratorA.next();
            }
            if(itemB == null ){
                itemB = iteratorB.next();
            }
            if (itemA < itemB) {
                merged.add(itemA);
                itemA = null;
            } else {
                merged.add(itemB);
                itemB = null;
            }
        }
        if(itemA != null){
            merged.add(itemA);
        }

        if(itemB != null){
            merged.add(itemB);
        }

        while (iteratorA.hasNext()) {
            if(iteratorA.hasNext()) {
                merged.add(iteratorA.next());
            }else{
                merged.add(iteratorB.next());
            }
        }
        return merged;
    }

    public static void main(String[] args) {
        int [] arrayA = {1,2,3,6,8,10};
        int [] arrayB = {2,5,7,11};
        int[] arrayC = merge(arrayA, arrayB);
        for(int i : arrayC)
        {
            System.out.println(i);
        }

        List<Integer> merged = merge(Arrays.asList(1,2,3,6,8,10), Arrays.asList(2,5,7,11));
        System.out.println(merged);
    }
}
