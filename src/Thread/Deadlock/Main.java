package Thread.Deadlock;

public class Main {
    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();

        System.out.println("Main thread started");

        Thread t1 = new Thread(() -> {
            System.out.println("Thread t1 calling doNothing method");
            sharedResource.doNothing();
        });

        Thread t2 = new Thread(() -> {
            try{
                Thread.sleep(2000);
            } catch (Exception e){
                //
            }
            System.out.println("Thread t2 calling doNothing method");
            sharedResource.doNothing();
        });


        t1.start();
        t2.start();

        try{
            Thread.sleep(3000);
            t1.suspend();
            System.out.println("Thread t1 is suspended");
        } catch (Exception e){
            //
        }

        try{
            Thread.sleep(3000);
            t1.resume();
            System.out.println("Thread t1 is resumed");
        } catch (Exception e){
            //
        }

        System.out.println("Main thread execution is done");
    }
}
