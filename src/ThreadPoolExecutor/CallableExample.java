package ThreadPoolExecutor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) {

        ThreadPoolExecutor threadPoolExecutor = new
                ThreadPoolExecutor(1,1,1,
                TimeUnit.MINUTES, new ArrayBlockingQueue<>(2),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.DiscardOldestPolicy());

        // Use case 1
        Future<?> futureObj = threadPoolExecutor.submit(() -> {
            System.out.println("This is a runnable task");
        });

        try{
            Object result = futureObj.get();
            System.out.println(result);
        } catch(Exception e){
            //
        }

        // Use case 2
        // Runnable task with object T - it will update the list and return the updated list
        List<Integer> newList = new ArrayList<>();

        Future<List<Integer>> futureObj2 = threadPoolExecutor.submit(() -> {
            newList.add(100);
            System.out.println("This is a runnable task");
        }, newList);

        try{
            List<Integer> result = futureObj2.get();
            System.out.println(result.get(0));
        } catch(Exception e){
            //
        }

        // Use case 3
        // Scenario is like a workaround approach, callable is a cleaner way to doing it
        Future<List<Integer>> futureObj3 = threadPoolExecutor.submit(() -> {
            System.out.println("This is a callable task");
            List<Integer> list = new ArrayList<>();
            list.add(300);
            return list;   // We are returning it
        });

        try{
            List<Integer> result = futureObj3.get();
            System.out.println(result.get(0));
        } catch(Exception e){
            //
        }
    }
}
