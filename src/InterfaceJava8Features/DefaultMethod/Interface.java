package InterfaceJava8Features.DefaultMethod;

/*
    * Before java8, interfaces can only have abstract methods.
    * Java added default and static methods to interfaces because of streams has been added to Collections interface and there are a lot of classes implementing
    * Collections interface. So, to add new methods to Collections interface, it would be difficult to implement all the classes again.
    * Hence, they came up with this approach
    *
    * To add new functionality to legacy interfaces, Java 8 introduced this.
 */
public interface Interface {

    int abstractMethod(int a, int b); // abstract by default

    default int defaultMethod(int a, int b) { // default method which can be used by all the classes implementing this interface
        return a + b;
    }
}
