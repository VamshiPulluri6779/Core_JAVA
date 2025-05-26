package ThreadPoolExecutor;

import java.util.concurrent.*;

public class CompletableFuture2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1,
                1,1, TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardOldestPolicy());

        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("supplyAsync run by thread "+ Thread.currentThread().getName());
            try{
                Thread.sleep(4000);
            } catch (Exception e){
                //
            }
            return "Completable Future";
        }, threadPoolExecutor);

        // This is run by same thread as above i.e., thread from our thread pool
        CompletableFuture<String> completableFuture2 = completableFuture.thenApply((String value) -> {
            System.out.println("then apply run by thread "+ Thread.currentThread().getName());
            return value + "then apply";
        });

        // This is run async by a thread from fork join pool if we don't pass our thread pool executor
        CompletableFuture<String> completableFuture3 = completableFuture2.thenApplyAsync((String value) -> {
            System.out.println("then apply async run by thread "+ Thread.currentThread().getName());
           return value + "then apply async";
        });

        System.out.println(completableFuture3.get());
    }
}
