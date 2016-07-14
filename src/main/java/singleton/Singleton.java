package singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Created by deep on 5/20/16.
 */
public class Singleton implements Serializable,Cloneable{

//    private static Singleton oneInstance=null;

//    public static Singleton getInstance()
//    {
//        return instance;
//    }

//    private Singleton(){
//    }

    private static volatile  Singleton oneInstance=null;

    private Singleton() {
        if (oneInstance != null) {
            throw new RuntimeException(" Can not create Single Instance object once again");
        }
        //proceed
        System.out.println("Creating Singleton instance");
    }


    //Synchronized whole getInstance method -- Safe but not efficient
//    public static synchronized Singleton getInstance() {
//
//        if(oneInstance==null){
//            oneInstance=new Singleton();
//
//        }
//        return oneInstance;
//    }


    //Double check --Works mostly but will break
//    public static Singleton getInstance() {
//
//        if(oneInstance==null){//Check 1
//            synchronized(Singleton.class){
//                if(oneInstance==null) {//Check 2
//                    oneInstance = new Singleton();
//                }
//            }
//
//
//        }
//        return oneInstance;
//    }

    static class Holder{
        static final Singleton INSTANCE=new Singleton();
    }
    public static Singleton getInstance() {
        return Holder.INSTANCE;
    }

    private Object readResolve() throws ObjectStreamException{
        System.out.println("Deserializing resolve");
        return oneInstance;

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
