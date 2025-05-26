package WildCards;

import java.util.List;

public class Print {

    // This will allow us to pass a list of buses or any superclass of Bus
    public void printVehicles(List<? super Bus> vehicles) {
        for (Object vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
}
