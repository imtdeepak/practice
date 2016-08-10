package singleton;



/**
 * Created by deepak.kumar on 2/19/16.
 */
public class ConsumeSingleton {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1);
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance2);

    }
}
