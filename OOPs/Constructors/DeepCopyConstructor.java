import java.util.ArrayList;

public class DeepCopyConstructor implements Cloneable {
    String brand;
    ArrayList<String> features;
    
    public DeepCopyConstructor(String brand, ArrayList<String> features) {
        this.brand = brand;
        this.features = new ArrayList<String>(features);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Car clonedCar = (Car) super.clone();
        clonedCar.features = new ArrayList<>(this.features);  // Deep copy
        return clonedCar;
    }

    public void displayInfo() {
        System.out.println("Car: " + brand + ", Features: " + features);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<String> features = new ArrayList<>();
        features.add("Airbags");
        features.add("ABS");

        DeepCopyConstructor car1 = new DeepCopyConstructor("Toyota", features);
        DeepCopyConstructor car2 = (DeepCopyConstructor) car1.clone();  // Deep copy

        // Modify the original object's features
        car1.features.add("Sunroof");

        car1.displayInfo();  // Output: Car: Toyota, Features: [Airbags, ABS, Sunroof]
        car2.displayInfo();  // Output: Car: Toyota, Features: [Airbags, ABS]
    }
}
