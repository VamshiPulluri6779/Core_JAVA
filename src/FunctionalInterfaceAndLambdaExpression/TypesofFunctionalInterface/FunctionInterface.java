package FunctionalInterfaceAndLambdaExpression.TypesofFunctionalInterface;

import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {

        // accepts a value and also returns a value
        Function<Integer, String> function = (Integer amount) -> String.valueOf(amount + 100);

        System.out.println("Function gave value as " +function.apply(100));
    }
}
