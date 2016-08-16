package designpattern.override;

/**
 * Created by deepak.kumar on 2/12/16.
 */
abstract class BaseAbstract {
    public void f() {
        System.out.println("Base :: f");
    }
}

public class Base extends BaseAbstract{
    public void f() {
        System.out.println("Extended :: f");
    }

    public static void main(String[] args) {
        BaseAbstract b = new Base();
        b.f();
    }
}

