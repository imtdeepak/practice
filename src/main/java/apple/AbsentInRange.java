package apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AbsentInRange {

    public static List<Integer> findMissingNumbers(int[] nums) {
        int size = nums.length;
        List<Integer> missingNumbers = new ArrayList<>();
        if(nums.length > 0)  {
            int[] range = new int[size];
            Arrays.fill(range,0);
            for (int num : nums) {
                if (num <= size) {
                    range[num-1] = 1;
                }
            }

            for(int i = 0; i< size; i++){
                if(range[i] == 0)
                    missingNumbers.add(i+1);
            }
            return missingNumbers;
        }
        return missingNumbers;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] nums1 = new int[0];
        int[] nums2 = {1, 1};
        System.out.printf("Not Present number in %s :  %s%n", Arrays.toString(nums), findMissingNumbers(nums));
        System.out.printf("Not Present number in %s :  %s%n", Arrays.toString(nums1), findMissingNumbers(nums1));
        System.out.printf("Not Present number in %s :  %s%n", Arrays.toString(nums2), findMissingNumbers(nums2));

    }
}
