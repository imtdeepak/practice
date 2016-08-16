package threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by deepak.kumar on 2/28/16.
 */
public class ThreadTest {

    public static void main(String[] args) {
        DataHolder dataHolder = new DataHolder(0);
        List<MyRunnable> myRunnables = Arrays.asList(new MyRunnable("Thread1", dataHolder), new MyRunnable("Thread2", dataHolder), new MyRunnable("Thread3", dataHolder));
        List<Thread> threads = new ArrayList<>();
        for (MyRunnable myRunnable : myRunnables) {
            threads.add(new Thread(myRunnable));
        }
        for (Thread thread : threads) {
            thread.start();
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Total value is " + dataHolder.getValue());
    }
}
