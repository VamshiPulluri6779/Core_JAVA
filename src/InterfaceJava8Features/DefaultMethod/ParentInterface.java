package InterfaceJava8Features.DefaultMethod;

public interface ParentInterface {

    default boolean isValid() {
        return true;
    }
}
