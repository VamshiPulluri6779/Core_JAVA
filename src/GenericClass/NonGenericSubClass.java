package GenericClass;

/*
    Whenever we are creating a non-generic subclass without diamond syntax, we need to
    make sure that superclass is also not generic
 */
public class NonGenericSubClass extends Test<String>{
}
