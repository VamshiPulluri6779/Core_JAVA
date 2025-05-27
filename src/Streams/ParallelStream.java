package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;


public class ParallelStream {
    public static void main(String[] args) {

        // Create a large dataset
        List<Integer> largeList = new ArrayList<>();
        IntStream.range(1, 10_000_000).forEach(largeList::add);

        // Sequential stream
        long startSequential = System.currentTimeMillis();
        long sequentialSum = largeList.stream()
                .mapToLong(ParallelStream::intensiveCompute)
                .sum();
        long endSequential = System.currentTimeMillis();
        System.out.println("Sequential Stream Time: " + (endSequential - startSequential) + " ms");

        // Parallel stream
        long startParallel = System.currentTimeMillis();
        long parallelSum = largeList.parallelStream()
                .mapToLong(ParallelStream::intensiveCompute)
                .sum();
        long endParallel = System.currentTimeMillis();
        System.out.println("Parallel Stream Time: " + (endParallel - startParallel) + " ms");

        System.out.println("Sequential Sum: " + sequentialSum);
        System.out.println("Parallel Sum: " + parallelSum);
    }

    // Simulate a computationally intensive task
    private static long intensiveCompute(int value) {
        long result = 0;
        for (int i = 0; i < 1_000; i++) {
            result += (long) (Math.sqrt(value) * Math.sqrt(value));
        }
        return result;
    }
}
