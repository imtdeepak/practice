package apple;

public class PowerOfTwo {

    public static boolean isPowerOfTwo(int number) {
        if(number <=0)
            return false;
        else
            return (number & number-1) == 0;
    }

    public static void main(String[] args) {
        int[] numbers = {0, 1, 2,4, 6,8,10, 12, 16};
        for (int n: numbers) {
            System.out.printf("%d is a power of 2 : %b %n", n, isPowerOfTwo(n));
        }
    }
}

