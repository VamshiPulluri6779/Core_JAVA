package LockFreeConcurrency.AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

    // AtomicInteger internally uses CAS (compare and sweep)
    AtomicInteger counter = new AtomicInteger(0);

    public void increment(){
        counter.incrementAndGet();
    }

    public int getCounter(){
        return counter.get();
    }
}
