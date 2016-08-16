package threads.tutorial;

/**
 * Created by Deepak on 8/14/16.
 */


class Runner extends Thread {
    @Override
    public void run() {
        System.out.println("Hello from Thread " + Thread.currentThread().getName());
    }
}

public class ThreadSample {

    public static void main(String[] args) {
        Runner runner1 = new Runner();

        System.out.println("This is Thread.start");
        runner1.start();


        Runner runner2 = new Runner();

        System.out.println("\n This is Thread.run");

        runner2.run();


    }
}



