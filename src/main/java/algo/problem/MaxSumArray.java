package algo.problem; /**
 * Created by deepak on 11/11/18.
 * <p>
 * {-2,-1,3,4,5,2}
 */
public class MaxSumArray {

    public static void main(String[] args) {
        int[] arr = {-2, -1, 3, 4, 5, 2};

        System.out.println(maxSumA(arr));
    }

    private static int maxSumA(int[] arr) {
        if (arr.length == 0) {
            return 0;
        } else {

            int previosValue = arr[0];
            int maxSofar = arr[0];

            for (int i = 0; i < arr.length; i++) {

                if (previosValue > 0) {
                    previosValue += arr[i];
                } else {
                    previosValue = arr[i];
                }
                if (previosValue > maxSofar) {
                    maxSofar = previosValue;
                }
            }
            return maxSofar;


        }

    }

}
