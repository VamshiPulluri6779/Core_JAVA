package LockFreeConcurrency.NonAtomicityIssue;

public class Counter {
    private int counter;

    // For achieving concurrency in below method, we can add synchronized
    // Another alternative lock-free approach is to use AtomicInteger
    public void increment(){
        counter++;
    }

    public int getCounter(){
        return counter;
    }
}
