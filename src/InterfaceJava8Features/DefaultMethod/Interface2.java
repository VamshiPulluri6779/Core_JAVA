package InterfaceJava8Features.DefaultMethod;

public interface Interface2 {

    default int defaultMethod(int a, int b) {
        return a + b;
    }
}
