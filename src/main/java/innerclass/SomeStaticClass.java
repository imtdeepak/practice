package innerclass;

/**
 * Created by byjumanikkan on 6/17/16.
 */
public class SomeStaticClass {

    public void doSoemthing(final Object s)
    {
        Runnable r = new Runnable() {
            public void run() {
                System.out.println(s);
            }
        };

        Someclass.staticMethod(r);
    }

    public static void main(String[] args) {
        SomeStaticClass someStaticClass = new SomeStaticClass();
        someStaticClass.doSoemthing("abc");
    }
}
