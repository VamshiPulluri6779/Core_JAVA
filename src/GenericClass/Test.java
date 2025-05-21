package GenericClass;

/*
    <> is diamond syntax used to specify a generic type, where T can be of any
    type except primitive types
 */
public class Test<T> {

    T value;

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }
}
