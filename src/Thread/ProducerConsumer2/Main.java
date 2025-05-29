package Thread.ProducerConsumer2;



public class Main {
    public static void main(String[] args) throws Exception{

        SharedResource sharedResource = new SharedResource(3);


        // 1 item is put into queue by producer and it is consumed
        Thread producerThread = new Thread(() -> {
            for(int i=0; i<6; i++){
                try {
                    sharedResource.produceData(i);
                } catch (Exception e) {
                    // do nothing
                }
            }
        });

        Thread consumerThread = new Thread(() -> {
            for(int i=0; i<6; i++){
                try {
                    sharedResource.consumeData();
                } catch (Exception e) {
                    // do nothing
                }
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
