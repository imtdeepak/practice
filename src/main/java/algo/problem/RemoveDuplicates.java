package algo.problem; /**
 * Created by deepak on 11/23/18.
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        String stringWithDups = "alpakdaksdjhdshdjsdhfgeywr";
        char[] charArrayWithDups = stringWithDups.toCharArray();
        System.out.println("String with Duplicates = " + new String(charArrayWithDups));
        removeDuplicates(charArrayWithDups);


        System.out.print("String with No Duplicates = ");
        int i = 0;
        while (charArrayWithDups[i] != 0) {
            System.out.print(charArrayWithDups[i]);
            i++;
        }
    }

    private static void removeDuplicates(char[] stringWithDups) {

        if (stringWithDups == null || stringWithDups.length < 2) {
            return;
        }

        int tail = 1;
        int length = stringWithDups.length;
        for (int i = 1; i < length; i++) {
            int j;
            for (j = 0; j < tail; j++) {
                if (stringWithDups[i] == stringWithDups[j]) {
                    break;
                }
            }
            if (tail == j) {
                stringWithDups[tail++] = stringWithDups[i];
            }
        }
        stringWithDups[tail] = 0;
    }
}
