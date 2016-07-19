package designpattern.observer.producer.consumer;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by sweetykumari on 7/18/16.
 */
public class ProducerConsumerSample {

    public static void main(String[] args) {

        BlockingDeque<Integer> storage = new LinkedBlockingDeque<>(5);

        Producer producer = new Producer(storage);
        Consumer consumer = new Consumer(storage);

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
