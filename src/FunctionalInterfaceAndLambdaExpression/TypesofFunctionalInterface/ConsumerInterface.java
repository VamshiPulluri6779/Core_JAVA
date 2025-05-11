package FunctionalInterfaceAndLambdaExpression.TypesofFunctionalInterface;

import java.util.function.*;

public class ConsumerInterface {
    public static void main(String[] args) {

        /*
            * Consumer interface accepts a parameter and returns no result
            * It is a functional interface present in java.util.function
        */
        Consumer<Integer> consumer = (Integer val) ->
                System.out.println("Consuming integer "+val);

        consumer.accept(11);
    }
}
