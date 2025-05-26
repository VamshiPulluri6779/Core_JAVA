package WildCards.UpperBoundWildcard;

import WildCards.Bus;
import WildCards.Print;
import WildCards.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        List<Bus> buses = new ArrayList<>();

        Print print = new Print();
        print.printVehicles(vehicles); // this is allowed, but if we pass buses it will fail

        // If we use an upperbound wildcard in the print method, we can pass a list of Bus too
        print.printVehicles(buses);
    }
}
