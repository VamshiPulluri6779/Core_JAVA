package Thread.ProducerConsumer1;

public class SharedResource {

    private boolean isItemAvailable = false;

    public synchronized void addItem() {
        isItemAvailable = true;
        System.out.println("Item has been made available by producer");
        notifyAll();
    }

    public synchronized void consumeItem(){

        // To avoid spurious wake-up
        while(!isItemAvailable){
            try{
                System.out.println("Consumer thread "+Thread.currentThread() + " is waiting for item");
                wait();
            } catch (Exception e){
                // Some action
            }
        }

        System.out.println("Item has been consumed by the consumer");
        isItemAvailable = false;
    }
}
