package ThreadLocalExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CleanUpThreadLocal {
    public static void main(String[] args) {

        ThreadLocal<String> threadLocalObj = new ThreadLocal<>();

        // We are creating a thread pool of 5 threads
        ExecutorService threadPoolObj = Executors.newFixedThreadPool(5);

        // When we submit task, one thread out of 5 picks it up
        // Here, we are not cleaning the variable after setting it
        threadPoolObj.submit(() -> {
            System.out.println("Task picked up by "+ Thread.currentThread().getName());
            threadLocalObj.set(Thread.currentThread().getName());

            // After work complete, we can clear resource
            threadLocalObj.remove();
        });

        // Because of ignoring clean-up, we might still see that resource available the in the thread that picked above task
        for(int i=0 ; i<15 ; i++){
            threadPoolObj.submit(() -> {
                System.out.println("Value in thread : " +
                        Thread.currentThread().getName() + " is " + threadLocalObj.get());
            });
        }
    }
}
