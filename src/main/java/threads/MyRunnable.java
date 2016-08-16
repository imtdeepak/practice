package threads;

import java.util.Random;

/**
 * Created by deepak.kumar on 2/28/16.
 */
public class MyRunnable implements Runnable {
    private static Random random = new Random();
    private final String name;
    private final DataHolder counter;

    public MyRunnable(String name, DataHolder counter)
    {
      this.name = name;
      this.counter = counter;
    }
    @Override
    public void run() {
        synchronized (this.counter) {
            int waitTime = random.nextInt(1000);
            int initialValue = counter.getValue();
            try {
                Thread.sleep(waitTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("thread " + this.name + " adding value  " + waitTime);
            counter.setValue(initialValue + waitTime);
            System.out.println("Running thread " + this.name);
        }
    }
}
