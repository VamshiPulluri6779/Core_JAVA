package Thread.ThreadJoining;

/*
    * Join makes sure that t1 completes its execution and main should wait until that
*/
public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main thread started execution");

        Thread t1 = new Thread(() -> {
            System.out.println("T1 thread started execution");
            try{
                Thread.sleep(10000);
            } catch (Exception e){
                // do nothing
            } finally {
                System.out.println("T1 thread completed execution");
            }
        });

        t1.start();
        t1.join(); // If we don't use this, main thread will complete execution and then t1 will end

        System.out.println("Main thread completed execution");
    }
}
