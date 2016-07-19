package designpattern.observer.producer.consumer;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by sweetykumari on 7/18/16.
 */
public class Producer implements Runnable {

    BlockingDeque<Integer> blockingDeque;

    public Producer(BlockingDeque blockingDeque) {
        this.blockingDeque = blockingDeque;
    }

    @Override
    public void run() {
        System.out.println("Making products ");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Putting " + i + " in to the Storage");
            blockingDeque.offerLast(new Integer(i));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
