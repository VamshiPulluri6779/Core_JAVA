package FunctionalInterfaceAndLambdaExpression.TypesofFunctionalInterface;

import java.util.function.Predicate;

public class PredicateInterface {
    public static void main(String[] args) {

        // It takes a value and returns a boolean
        Predicate<Integer> predicate = (Integer amount) -> amount % 2 == 0;

        // same as above
        Predicate<Integer> predicate1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };

        System.out.println("Predicate returned "+ predicate.test(13));
    }
}
