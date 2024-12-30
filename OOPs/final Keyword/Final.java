// Final class - cannot be extended
final class Constants {
    // Final variable - value cannot be changed after initialization
    final int MAX_SPEED = 120;

    // Final method - cannot be overridden in subclasses
    final void displaySpeedLimit() {
        System.out.println("The maximum speed is: " + MAX_SPEED);
    }
}

// Attempting to extend the final class will result in a compilation error
// class ExtendedConstants extends Constants { // Error: Cannot inherit from final class
// }

class Vehicle {
    // Final variable for vehicle type
    final String type;

    // Constructor to initialize the final variable
    Vehicle(String type) {
        this.type = type;
    }

    // Final method - cannot be overridden
    final void displayType() {
        System.out.println("Vehicle type: " + type);
    }
}

class Car extends Vehicle {
    Car(String type) {
        super(type);
    }

    // Cannot override the final method from Vehicle
    // void displayType() { // Error: Cannot override the final method
    //     System.out.println("This won't work.");
    // }
}

public class Final {
    public static void main(String[] args) {
        // Using final class and methods
        Constants constants = new Constants();
        constants.displaySpeedLimit();

        // Using final variable
        Vehicle vehicle = new Vehicle("Sedan");
        vehicle.displayType();

        // Using final variable in a subclass
        Car car = new Car("Sports");
        car.displayType();
    }
}
