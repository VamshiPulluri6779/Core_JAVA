package ImmutableClass;

import java.util.ArrayList;
import java.util.List;

// Immutable class is one whose state can't be changes
// Make this class final so that it can't be extended
public final class ImmutableClass {

    // Once initialized this variable can't be changed, hence made final
    private final String name;
    private final List<String> items;

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
}
