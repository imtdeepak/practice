package threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by imtde on 7/16/2016.
 */
public class ExecutorTest {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(10);

        List<MyRunnable> myRunnables=new ArrayList<>(Arrays.asList(new MyRunnable("thread1",new DataHolder(100)),new MyRunnable("thread2",new DataHolder(200))) );
        List<Future<?>> futures = new ArrayList<>();
        for(Runnable task:myRunnables){
            Future<?> future=executor.submit(task);
            futures.add(future);
        }

        for(Future f:futures){
            try {
                f.get();
            } catch (InterruptedException |ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
    }


}
