package Thread.Deadlock;

public class SharedResource {

    public synchronized void doNothing(){
        System.out.println("lock acquired by "+ Thread.currentThread().getName());

        try{
            Thread.sleep(8000);
        } catch (Exception e){
            //
        }

        // This log won't print as thread is suspended, released only when resumed
        System.out.println("Lock released");
    }
}
