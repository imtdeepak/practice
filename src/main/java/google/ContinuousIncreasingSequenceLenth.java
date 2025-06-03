package google;

public class ContinuousIncreasingSequenceLenth {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 4, 5, 6, 9, 8};
        System.out.println(maxLength(arr));
    }

    public static int maxLength(int[] arr) {
        int maxLength = 0;
        int currentLength = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }
        return Math.max(maxLength, currentLength);
    }
}
