package GenericClass;

/*
    Upper bound restricting the T to be any subclass of Number or Number class itself
    Here in place of Number, we can use an interface(we should not use implements)
 */
public class BoundedGenericClass<T extends Number>{
    T value;

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }
}
