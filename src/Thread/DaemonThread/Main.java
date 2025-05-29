package Thread.DaemonThread;

public class Main {
    public static void main(String[] args) {

        System.out.println("Main thread started execution");

        Thread t1 = new Thread(() -> {
            System.out.println("Daemon thread started execution");
            try{
                System.out.println("In try block sleeping for 5 secs");
                Thread.sleep(5000);
                System.out.println("After sleep");
            } catch (Exception e){
                //
            }
        });

        t1.setDaemon(true);
        t1.start();

        System.out.println("Main thread completed execution");
    }
}
