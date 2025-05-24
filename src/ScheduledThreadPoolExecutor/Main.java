package ScheduledThreadPoolExecutor;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ScheduledExecutorService poolExecutor = Executors.newScheduledThreadPool(5);

        // This took a runnable task which doesn't return anything
        poolExecutor.schedule(() -> System.out.println("Hello"), 5, TimeUnit.SECONDS);

        // Input is a callable object which returns a string can be caught in Future object
        ScheduledFuture<String> future = poolExecutor.schedule(() -> {return "Hello";}, 5, TimeUnit.SECONDS);

        System.out.println(future.get());


        // It will run continuously with initial delay of 5 secs with 5 secs gap until we cancel using futureObj.cancel(true)
        Future<?> future1 = poolExecutor.scheduleAtFixedRate(() -> System.out.println("Hello"), 5, 5, TimeUnit.SECONDS);

        try{
            Thread.sleep(20000);
        } catch(Exception e){
            //
        }

        future1.cancel(true);

        // It will run continuously with initial delay of 5 secs and delay of 5 secs after execution of previous task, and will run
        // until we cancel using futureObj.cancel(true)
        Future<?> future2 = poolExecutor.scheduleWithFixedDelay(() -> System.out.println("Hello"), 5, 5, TimeUnit.SECONDS);

        try{
            Thread.sleep(20000);
        } catch(Exception e){
            //
        }

        future2.cancel(true);
    }
}
