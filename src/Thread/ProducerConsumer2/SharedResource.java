package Thread.ProducerConsumer2;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {

    private Queue<Integer> dataQueue;
    private int bufferSize;

    SharedResource(int bufferSize){
        dataQueue = new LinkedList<>();
        this.bufferSize = bufferSize;
    }

    public synchronized void produceData(int item) throws Exception{

        // If buffer is full, we have to wait until consumer to consume the items
        while(bufferSize == dataQueue.size()){
            System.out.println("Queue is full waiting for consumer to consume");
            wait();
        }

        dataQueue.add(item);
        System.out.println("Producer added "+item);
        notifyAll();
    }

    public synchronized void consumeData() throws Exception{

        while(dataQueue.isEmpty()){
            System.out.println("Queue is Empty, Waiting for producer to produce the messages");
            wait();
        }

        int item = dataQueue.poll();
        System.out.println("Consumed item "+item);
        notifyAll();
    }
}
