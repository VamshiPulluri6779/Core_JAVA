package ThreadLocalExample;

public class ThreadLocalExample {
    public static void main(String[] args) {

        // Shared object across all objects
        ThreadLocal<String> threadLocal = new ThreadLocal<>();

        threadLocal.set(Thread.currentThread().getName());

        Thread t2 = new Thread( () -> {
            threadLocal.set(Thread.currentThread().getName());
            System.out.println("Thread2");
        });

        t2.start();

        try{
            Thread.sleep(2000);
        } catch (Exception e){

        }

        System.out.println("Main thread local variable: "+threadLocal.get());
    }
}
