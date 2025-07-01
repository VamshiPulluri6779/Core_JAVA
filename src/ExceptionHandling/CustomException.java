package ExceptionHandling;

/* Any exception that extends Excpetion class is a checked and the ones which extend RuntimeException are unchecked ones*/
public class CustomException extends Exception{

    CustomException(String message){
        super(message);
    }
}
