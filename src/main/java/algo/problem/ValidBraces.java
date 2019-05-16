package algo.problem; /**
 * Created by deepak on 1/4/19.
 */
public class ValidBraces {

    public static void main(String[] args) {

        String braceString = "{(    )[    ]}";
        System.out.println("Checking the well formed braces =" + braceString);
        System.out.println(isWellFormedBrackets(braceString));

    }

    static boolean isWellFormedBrackets(String input) {
        String previous = "";
        while (input.length() != previous.length()) {
            previous = input;
            input = input.replace(" ", "")
                    .replace("()", "")
                    .replace("[]", "")
                    .replace("{}", "");
        }
        return (input.length() == 0);
    }
}
