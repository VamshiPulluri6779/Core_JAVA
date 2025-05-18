package ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();
        Car car1 = new Car("swift",10);
        Car car2 = new Car("xuv700", 30);
        Car car3 = new Car("xuv500", 25);
        Car car4 = new Car("i20", 15);

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);

        // We can do this same thing in Car class by implementing Comparator interface and
        // overriding the compare method
        Comparator<Car> priceComparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getPrice() - o2.getPrice();
            }
        };

        carList.sort((Car c1, Car c2) -> c2.getCarName().compareTo(c1.getCarName()));

        for(Car car : carList){
            System.out.println("Car "+ car.getCarName()+" costs "+ car.getPrice()+" lakhs");
        }

        System.out.println("----------------------------------");

        carList.sort((Car c1, Car c2) -> c2.getPrice() - c1.getPrice());

        for(Car car : carList){
            System.out.println("Car "+ car.getCarName()+" costs "+ car.getPrice()+" lakhs");
        }

        System.out.println("----------------------------------");

        carList.sort(priceComparator);

        for(Car car : carList){
            System.out.println("Car "+ car.getCarName()+" costs "+ car.getPrice()+" lakhs");
        }

        System.out.println("----------------------------------");

        // This sorting is because of implementing Comparable interface and overriding
        // compareTo method, internally for comparing sorting algorithms use this method only
        Collections.sort(carList);

        for(Car car : carList){
            System.out.println("Car "+ car.getCarName()+" costs "+ car.getPrice()+" lakhs");
        }
    }
}
