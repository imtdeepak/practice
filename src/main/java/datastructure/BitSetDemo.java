package datastructure;import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by deepak on 10/10/18.
 */
public class BitSetDemo {

    public static void main(String[] args) {

        int[] testArray = {1, 2, 3, 5, 7};
        int[] testUnsortedArry = {1, 6, 5, 3, 4};

        printMissingNumbers(testArray, 10);
        printMissingNumbers(testUnsortedArry, 10);

        int[] testDuplicateNumbers = {1, 2, 2, 3, 3, 3, 4, 5, 6, 7, 8, 8};
        printDuplicateNumbers(testDuplicateNumbers);
    }

    public static void printMissingNumbers(int[] arrayInt, int numberCount) {
        BitSet bs1 = new BitSet(numberCount);
        int missingNUmberCount = numberCount - arrayInt.length;
        //setting the bits with numbers index -1, to utilize 0 index
        for (int number : arrayInt) {
            bs1.set(number - 1);
        }

        int lastMissingIndex = 0;
        for (int i = 0; i < missingNUmberCount; i++) {
            lastMissingIndex = bs1.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }
    }

    public static void printDuplicateNumbers(int[] arrayInt) {
        BitSet bs = new BitSet(arrayInt.length);
        System.out.println("Duplicate Numbers are");
        Set<Integer> duplicateSet = new HashSet<>();
        for (int number : arrayInt) {
            if (bs.get(number)) {
                duplicateSet.add(number);
                System.out.print(number + "  ");
            } else {
                bs.set(number);
            }
        }
        if (!duplicateSet.isEmpty()) {
            System.out.println("Duplicate Set=" + duplicateSet);
        }

    }
}
