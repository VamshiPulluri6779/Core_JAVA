package GenericClass;

/*
    * MultiBound.java
    *
    * This class demonstrates the use of multiple bounds in a generic class.
    * It requires that the type parameter T extends ConcreteClass and implements
    * both Interface1 and Interface2. First one should always be concrete class and then
    * can be followed any no.of interfaces
 */
public class MultiBound <T extends ConcreteClass & Interface1 & Interface2> {
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
