package WildCards.LowerBoundWildcard;

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
        print.printVehicles(buses); // this is allowed, but if we pass vehicles it will fail

        // If we use a lower bound wildcard in the print method, we can pass a list of Vehicle too
        print.printVehicles(vehicles);
    }
}
