package singleton;

/**
 * Created by byjumanikkan on 4/27/16.
 */
class B{
    static String s;
}
class A extends B{
    static String s;

    public static void main(String[] args) {
        System.out.println(B.s);
    }
}
