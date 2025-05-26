package ThreadPoolExecutor;

import java.util.concurrent.*;

public class CompletableFuture3 {
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
        }, threadPoolExecutor).
                thenCompose((String value) -> CompletableFuture.supplyAsync(() -> value + "then apply")).
                thenComposeAsync((String value) -> CompletableFuture.supplyAsync(() -> value + "then apply async"), threadPoolExecutor);

        System.out.println(completableFuture.get());
    }
}
