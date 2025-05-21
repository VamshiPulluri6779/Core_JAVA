package GenericClass;

public class Main {

    public static void main(String[] args) {
        // you are specifying the type T and creating an object
        Test<Integer> test = new Test<>();
        test.setValue(1);
        System.out.println(test.getValue());

        // we can create object using raw type also, without mentioning the type, and internally it is passed as Object
        Test test1 = new Test();
        test1.setValue(1);
        System.out.println(test1.getValue());
    }
}
