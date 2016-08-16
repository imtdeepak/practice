package threads.tutorial;

/**
 * Created by Deepak on 8/15/16.
 */
public class RunnableSample {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runner1());
        Thread t2 = new Thread(new Runner1());
        t1.start();
        t2.start();

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("Direct running in Thread=" + Thread.currentThread());

            }
        });

        t3.start();
    }
}

class Runner1 implements Runnable {

    @Override
    public void run() {
        System.out.println("I am in Thread=" + Thread.currentThread());

    }
}
