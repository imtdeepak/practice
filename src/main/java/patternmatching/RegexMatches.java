package patternmatching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by deepak.kumar on 5/8/16.
 */
public class RegexMatches {

    public static void main(String[] args) {
        String line = "This order was placed for QT 3000! OK?";
        String pattern = "(.*)(\\d+)(.*)";

        Pattern r = Pattern.compile(pattern);

        Matcher matcher = r.matcher(line);
        if(matcher.find()){
            System.out.println("Group Count : " + matcher.groupCount() );
            System.out.println("Found value: " + matcher.group(0) );
            System.out.println("Found value: " + matcher.group(1) );
            System.out.println("Found value: " + matcher.group(2) );
            System.out.println("Found value: " + matcher.group(3) );
        }
        else{
            System.out.println("No matching found");
        }

    }
}
