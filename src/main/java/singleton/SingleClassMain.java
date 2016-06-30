package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * Created by deep on 5/20/16.
 */
public class SingleClassMain {

    static void useSingleton(){
//        Singleton singleton = Singleton.INSTANCE;
        Singleton singleton= Singleton.getInstance();
        printObject("singleton",singleton);
    }

    public static void main(String args[]) throws Exception

    {

        System.out.println("Using MultiThread");

        ExecutorService execService= Executors.newFixedThreadPool(2);
        execService.submit(SingleClassMain::useSingleton);
        execService.submit(SingleClassMain::useSingleton);

        execService.shutdown();


        Singleton s1 = Singleton.getInstance();

        Singleton s2 = Singleton.getInstance();

        //Same instances
        printObject("s1",s1);
        printObject("s2",s2);



        //Reflection
//        System.out.println("Using reflection");
//
//        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Singleton s3=constructor.newInstance();
//        printObject("s3",s3);


        //Using Serialization

        System.out.println("Using Serialization/Deserialization");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("/tmp/s1.ser"));
        objectOutputStream.writeObject(s1);
        objectOutputStream.close();


        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("/tmp/s1.ser"));

        Singleton s4= (Singleton) objectInputStream.readObject();

        printObject("s4",s4);
        

        objectInputStream.close();




    }



    public static void printObject(String name, Object obj) {
        if (obj != null) {
            System.out.println("Hashcode of object "+name +"= " + obj.hashCode());
        }
    }
}

//Enum can also serve all the purpose of Singleton behavior and is
// Reflection, Serialization/Deserialization   and Multi threading safe
//
// enum Singleton{
//
//    INSTANCE:
//    public String getConfiguration{
//        System.out.println("ALpha Beeta");
//    }
//
//}
