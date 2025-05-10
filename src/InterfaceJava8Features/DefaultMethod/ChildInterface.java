package InterfaceJava8Features.DefaultMethod;

/*
    * Here, the child interface can do nothing to parent interface's default method.
    * It can abstract that method and make its implementation class to implement it,
    * or it can override the default method and provide its own implementation and also use the parent interface's method too.
*/
public interface ChildInterface extends ParentInterface {

    default boolean isValid() {

        boolean isValid = ParentInterface.super.isValid();  // calling parent interface's default method

        return isValid;
    }

}
