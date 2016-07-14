package singleton;

/**
 * Created by byjumanikkan on 7/13/16.
 */
public class DoubleCheckSingleton {

    private static DoubleCheckSingleton instance;

    public static DoubleCheckSingleton getInstance()
    {
        if(instance == null){
            synchronized (DoubleCheckSingleton.class){
                if(instance == null){
                    instance = new  DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
    private DoubleCheckSingleton()
    {

    }
}
