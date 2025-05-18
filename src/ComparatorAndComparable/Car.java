package ComparatorAndComparable;


import java.util.Comparator;

public class Car implements Comparator<Car>, Comparable<Car> {

    private String carName;
    private int price;

    Car(String carName, int price){
        this.carName = carName;
        this.price = price;
    }

    public String getCarName() {
        return carName;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getPrice() - o2.getPrice();
    }

    // Using comparable, we don't have the flexibility as we can't use lambda expression or
    // anonymous class for this as comparator. Since it has only one parameter it should be
    // inside the Object for which we want to use it
    @Override
    public int compareTo(Car o) {
        return o.getPrice() - this.getPrice();
    }
}
