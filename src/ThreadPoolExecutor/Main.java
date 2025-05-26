package ThreadPoolExecutor;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {

        // For thread factory, we can Executors.defaultThreadFactory() instead of custom thread factory
        // In case of custom RejectedExecutionHandler, we can use new ThreadPoolExecutor.DiscardPolicy()

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3,
                5,
                5,
                TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(5),
                new CustomThreadFactory(),
                new CustomRejectedExecutionHandler());

        //  Creates threads beforehand and first task would be null for these - hence less task execution compared to lazy init of thread pool
        threadPoolExecutor.prestartAllCoreThreads();

        for(int i = 0; i < 12; i++){
            System.out.println("Task submitted " + i);
            threadPoolExecutor.submit(() -> {
                try{
                    Thread.sleep(8000);
                } catch (Exception e){
                    //
                }
            });
        }

        threadPoolExecutor.shutdownNow();

        try{
            Thread.sleep(10000);
        } catch(Exception e){
            //
        }
        System.out.println(threadPoolExecutor.getPoolSize());
    }

}

class CustomThreadFactory implements ThreadFactory{

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread();
        thread.setName("New thread");
        thread.setDaemon(false);
        thread.setPriority(Thread.NORM_PRIORITY);
        System.out.println("New thread is created");
        return thread;
    }
}

class CustomRejectedExecutionHandler implements RejectedExecutionHandler{

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("This task is rejected " + r.toString());
    }
}
