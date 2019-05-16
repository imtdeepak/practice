package threads; /**
 * Created by deepak on 12/1/18.
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class RaceConditionExample {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ReentrantLock lock = new ReentrantLock(true);

        Counter counter = new Counter(lock);


        for (int i = 0; i < 1000; i++) {
            executorService.submit(() -> counter.increment());
        }

        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);

        System.out.println("Final count is : " + counter.getCount());
    }
}

class Counter {
    int count = 0;
    ReentrantLock lock;

    public Counter(ReentrantLock lock) {
        this.lock = lock;
    }

    public void increment() {
        try {
            lock.lock();
            count = count + 1;
        } finally {
            lock.unlock();
        }

    }

    public int getCount() {
        return count;
    }
}