package FunctionalInterfaceAndLambdaExpression;

public class AnonymousClass {
    public static void main(String[] args) {

        // Functional interface can be implemented using anonymous class
        // This same thing below can be implemented using lambda expression
        Interface interfaceObj = new Interface() {
            @Override
            public void pay(int amount) {
                System.out.println("Paying with anonymous class "+amount);
            }
        };

        interfaceObj.pay(110);
    }
}
