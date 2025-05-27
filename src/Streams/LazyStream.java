package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LazyStream {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);

        // This won't print anything as there are only intermediate operations and if there are no
        // terminal operations, stream processing won't be done

        // Hence intermediate operations are lazy
        Stream<Integer> integerStream = integers.stream().
                                                filter(val -> val > 1).
                                                peek(System.out::println);

        // If I do this, then now peek will print the values
        integerStream.count();
    }
}
