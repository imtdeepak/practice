package threads;

/**
 * Created by Deepak on 7/18/16.
 */

import java.util.concurrent.*;

public class Pinger {
    public static void main(String[] args) {
        ScheduledExecutorService ses =
                Executors.newScheduledThreadPool(1);
        Runnable pinger = new Runnable() {
            public void run() {
                System.out.println("PING!");
            }
        };
        ses.scheduleAtFixedRate(pinger, 5, 5, TimeUnit.SECONDS);
    }
}

