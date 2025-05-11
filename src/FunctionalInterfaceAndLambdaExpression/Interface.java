package FunctionalInterfaceAndLambdaExpression;

/*
    * Functional Interface (SAM - single abstract method interface)
    *
    * A functional interface is an interface that contains only one abstract method.
    * It can have multiple default or static methods.
    *
    * This annotation is optional, but it is a good practice to use it so that it restricts adding once more abstract method to the interface.
 */

@FunctionalInterface
public interface Interface {

    void pay(int amount);
}
