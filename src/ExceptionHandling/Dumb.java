package ExceptionHandling;

public class Dumb {
    public static void main(String[] args) {
        try{
            method();
        } catch(ArithmeticException e){
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally block executed");
        }
    }

    private static void method() {
        throw new ClassCastException();
    }
}
