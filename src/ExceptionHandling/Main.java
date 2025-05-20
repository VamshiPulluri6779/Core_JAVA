package ExceptionHandling;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        try{
            method();
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    static void method() throws CustomException {
        throw new CustomException("Custom Exception");
    }
}
