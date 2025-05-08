package AnonymousInnerClass;

public class Showroom {
    public static void main(String[] args) {

        Car audiObj = new Car() {
            @Override
            void pressBrake() {
                System.out.println("Audi brake pressed");
            }
        };

        audiObj.pressBrake();
    }
}
