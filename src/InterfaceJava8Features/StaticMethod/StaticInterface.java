package InterfaceJava8Features.StaticMethod;

public interface StaticInterface {

    // This can't be overridden by class implementing this interface just can only use it and called using interface name only
    static boolean isValid(){
        return true;
    }
}
