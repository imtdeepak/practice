package inheritance;

/**
 * Created by byjumanikkan on 2/17/16.
 */
public class Extend extends Base{
    @Override
    public String greetMe(String s, int i)
    {
        return "Extended greetings";
    }

    public static void main(String[] args) {
        Base base = new Extend();
        System.out.println(base.greetMe("",0));
    }
}
