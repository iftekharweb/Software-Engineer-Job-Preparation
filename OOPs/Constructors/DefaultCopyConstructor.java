import java.util.ArrayList;

class Car implements Cloneable {
    String brand;
    int year;
    ArrayList<String> features;

    public Car(String brand, int year, ArrayList<String> features) {
        this.brand = brand;
        this.year = year;
        this.features = features;  // Shallow copy
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();  // Shallow copy
    }

    void displayInfo() {
        System.out.println("Car: " + brand + ", Year: " + year + ", Features: " + features);
    }
}

public class DefaultCopyConstructor {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<String> features = new ArrayList<>();
        features.add("Airbags");
        features.add("ABS");
        features.add("Cruise Control");

        Car car1 = new Car("Toyota", 2020, features);
        Car car2 = (Car) car1.clone();  // Shallow copy

        car1.features.add("Sunroof");

        car1.displayInfo();  // Car: Toyota, Year: 2020, Features: [Airbags, ABS, Cruise Control, Sunroof]
        car2.displayInfo();  // Car: Toyota, Year: 2020, Features: [Airbags, ABS, Cruise Control, Sunroof]
    }
}
