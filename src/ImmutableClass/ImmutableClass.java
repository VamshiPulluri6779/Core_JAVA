package ImmutableClass;

import java.util.ArrayList;
import java.util.List;

// Immutable class is one whose state can't be changed
// Make this class final so that it can't be extended by child classes
public final class ImmutableClass {

    // Once initialized this variable shouldn't be changed, hence made final
    private final String name;
    private final List<String> items;

    // Constructor for setting the values of the fields
    ImmutableClass(String name, List<String> items) {
        this.name = name;
        this.items = items;
    }

    // There won't be any setters, only getters are present
    public String getName() {
        return name;
    }

    // If we pass the reference of the list, it can be modified outside
    // Hence, whenever this method is called, we send a copy of list
    public List<String> getItems() {
        return new ArrayList<>(items);
    }

    public static void main(String[] args) {
        ImmutableClass immutableClass = new ImmutableClass("Immutable", List.of("Item1", "Item2"));

        System.out.println(immutableClass.getItems());
    }
}
