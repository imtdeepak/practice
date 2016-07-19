package designpattern.observer.producer.consumer;

import java.util.concurrent.BlockingDeque;

/**
 * Created by sweetykumari on 7/18/16.
 */
public class Consumer implements Runnable {

    BlockingDeque blockingDeque;

    public Consumer(BlockingDeque blockingDeque) {
        this.blockingDeque = blockingDeque;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Consuming " + i + " from Storage ");
            blockingDeque.poll();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
