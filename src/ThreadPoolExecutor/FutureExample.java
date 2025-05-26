package ThreadPoolExecutor;

import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args) {

        ThreadPoolExecutor threadPoolExecutor = new
                ThreadPoolExecutor(1,1,1,
                TimeUnit.MINUTES, new ArrayBlockingQueue<>(2),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.DiscardOldestPolicy());

        // new thread will be created lazily and perform the task
        Future<?> futureObj = threadPoolExecutor.submit(() -> {
           try{
               Thread.sleep(5000);
               System.out.println("Inside try block");
           } catch (Exception e){
               //
           }
        });

        // caller is checking the status of thread it created using the Future object
        System.out.println("is done: " + futureObj.isDone());

        try{
            // tell the task that it has 2 seconds to finish, but our task won't finish
            // Hence this will throw the TimeoutException
            futureObj.get(2, TimeUnit.SECONDS);
        } catch(TimeoutException | InterruptedException | ExecutionException e){
            System.out.println("Timeout Exception happened");
        }

        // caller will wait indefinitely until task is finished
        try{
            futureObj.get();
        } catch(InterruptedException | ExecutionException e){
            //
        }


        System.out.println("is done : " + futureObj.isDone());
        System.out.println("is Cancelled : " + futureObj.isCancelled());
    }
}
