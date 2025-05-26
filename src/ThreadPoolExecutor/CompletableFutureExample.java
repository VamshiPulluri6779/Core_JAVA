package ThreadPoolExecutor;

import java.util.concurrent.*;

public class CompletableFutureExample {
    public static void main(String[] args) {

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1,
                1,1, TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardOldestPolicy());

        // If we don't pass custom pool, it uses shared Fork-Join pool
        // Supplier is functional interface that returns a value
        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("Completable Future Example");
            return 45;
        }, threadPoolExecutor).
                thenApply((Integer value) -> value * 2);  // thenApply will work on top of result of supplyAsync

        try{
            System.out.println(completableFuture.get());
        } catch (Exception e) {
            //
        }
    }
}
