import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by deepak.kumar on 2/25/16.
 */
public class PatternUtil {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^\\d{1,3} $");

        Matcher matcher = pattern.matcher("byju hello");
        System.out.println(matcher.matches());
        System.out.println(matcher.matches());
    }
}
