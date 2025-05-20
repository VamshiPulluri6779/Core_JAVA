package ExceptionHandling;

public class CheckedExceptionHandling {

    // Here, main is also throwing instead of handling. Hence, code will get compiled but will not run
    public static void main(String[] args) throws ClassNotFoundException {
        method1();
    }

    // throws tells that I may throw an exception, my caller can handle it
    public static void method1() throws ClassNotFoundException {
        throw new ClassNotFoundException();  // Exception is thrown while compiling
    }
}
