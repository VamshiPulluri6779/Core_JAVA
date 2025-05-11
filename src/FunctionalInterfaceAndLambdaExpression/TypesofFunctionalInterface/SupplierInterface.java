package FunctionalInterfaceAndLambdaExpression.TypesofFunctionalInterface;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {

        // Supplier accepts no values but returns a value
        Supplier<Integer> supplier = () ->
                ThreadLocalRandom.current().nextInt(1, 100);

        System.out.println("Supplier gave "+supplier.get());
    }
}
