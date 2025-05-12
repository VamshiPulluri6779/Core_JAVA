package Java9Features;

/*
    * In java8, we have static and default methods, but they are public by default
    * In java9, we can have private methods in interfaces too, and they can be called from default or static method in this interface
 */
public interface PrivateMethodInterface {

    void isAbstractValid();        // This is equivalent to public abstract void isAbstractValid();

    default void isDefaultValid() {
        System.out.println("Default method");
        isStaticValid();
        isPrivateStaticValid();
        isPrivateValid();
    }

    static void isStaticValid() {
        System.out.println("Static method");
        isPrivateStaticValid();
    }


    // private methods can only be called from within this interface's default or static methods
    private void isPrivateValid() {
        System.out.println("private method");
    }

    private static void isPrivateStaticValid() {
        System.out.println("Private Static method");
    }
}
