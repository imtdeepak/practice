package algo.problem;

import java.util.Arrays;

/**
 * Created by Deepak on 7/18/16.
 */
public class GreyCodeExample {

    public static void main(String[] args) {
        int[] greyCode = {1, 0, 1, 1, 0};
        int[] binCode = greyToBinCode(greyCode);

        System.out.println(" Grey Code=" + Arrays.toString(greyCode));
        System.out.println("Converted Bin Code=" + Arrays.toString(binCode));


        int[] greyCodeBack = binToGrayCode(binCode);

        System.out.println("Getting Binary Code=" + Arrays.toString(greyCodeBack));
    }

    private static int[] binToGrayCode(int[] binCode) {
        if (binCode.length != 0) {
            int[] grey = new int[binCode.length];

            grey[0] = binCode[0];
            for (int i = 1; i < binCode.length; i++) {
                grey[i] = grey[i - 1] ^ binCode[i];
            }
            return grey;
        }
        return null;
    }


    private static int[] greyToBinCode(int[] greyCode) {
        if (greyCode.length != 0) {
            int bin[] = new int[greyCode.length];

            bin[0] = greyCode[0];
            for (int i = 1; i < greyCode.length; i++) {
                bin[i] = greyCode[i - 1] ^ greyCode[i];
            }
            return bin;
        }
        return null;
    }
}
