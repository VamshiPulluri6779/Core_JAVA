package FunctionalInterfaceAndLambdaExpression;

// Lambda expression is a way of implementing functional interface, main intention is to reduce verbose code
public class LambdaExpression {
    public static void main(String[] args) {

        Interface interfaceObj = (amount) -> {
            System.out.println("Paying with lambda expression "+amount);
        };

        interfaceObj.pay(110);
    }
}
