package InterfaceJava8Features.DefaultMethod;

/*
    * Here the issue, ImplClass is implementing two interfaces which has same method name and both are default methods.
    * Hence, when creating the object of ImplClass, it will give error because it doesn't know which method to call.
    *
    * Therefore, we need to override the method in ImplClass and provide implementation here too to avoid the ambiguity
 */
public class ImplClass implements Interface, Interface2 {

    @Override
    public int abstractMethod(int a, int b) {
        return a * b;
    }

    @Override
    public int defaultMethod(int a, int b) { // overriding the default method to avoid ambiguity
        return a - b;
    }

}
