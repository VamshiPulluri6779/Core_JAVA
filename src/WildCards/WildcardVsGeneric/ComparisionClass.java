package WildCards.WildcardVsGeneric;

import java.util.List;

public class ComparisionClass {

    /*
        Using wildcards - we can pass a list of any subclass of Number, source can be
        integers and destination can be floats

        Here we can use lower bound but not in generics
     */
    public void compareLists(List<? extends Number> source, List<? super Number> destination) {
    }

    /*
        Using generics, we are forced to use the same type for both source and destination

        Here we can have multiple generics but not in wildcard(no multiple question marks)
     */
    public <T extends Number> void compareLists2(List<T> source, List<? super T> destination) {
    }
}
