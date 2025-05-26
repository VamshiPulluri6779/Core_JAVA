package ThreadPoolExecutor;

import java.util.concurrent.*;

public class CompletableFutureExample4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> "Hello");

        completableFuture.thenAccept(System.out::println);

        CompletableFuture<Integer> completableFuture2 = CompletableFuture.supplyAsync(() -> 10);

        CompletableFuture<String> completableFuture3 = CompletableFuture.supplyAsync(() -> "K");

        CompletableFuture<String> stringCompletableFuture = completableFuture2.thenCombine(completableFuture3, (val1, val2) -> val1+val2);

        System.out.println(stringCompletableFuture.get());
    }
}
