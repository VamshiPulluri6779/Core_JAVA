package Thread.ProducerConsumer1;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();

        Thread producerThread = new Thread(() -> {
            // Adding sleep to make sure consumer goes and wait first
            try {
                sleep(5000);
            } catch (Exception e) {
                // do some action
            }
            sharedResource.addItem();
        });

        Thread consumerThread = new Thread(() -> {
            System.out.println("Item consumption started by consumer");
            sharedResource.consumeItem();
        });

        producerThread.start();
        consumerThread.start();
    }
}
