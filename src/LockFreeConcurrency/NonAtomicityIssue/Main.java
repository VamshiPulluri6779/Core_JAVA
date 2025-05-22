package LockFreeConcurrency.NonAtomicityIssue;

public class Main {
    public static void main(String[] args) {

        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> {
            for(int i=0; i <= 2_00000; i++){
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for(int j=0; j <= 2_00000; j++){
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        } catch (Exception e){
            // do nothing
        }

        // Since counter++ operation is not an atomic one
        // You will end up getting different value each time you run it
        System.out.println("Value of counter is " + counter.getCounter());
    }
}
