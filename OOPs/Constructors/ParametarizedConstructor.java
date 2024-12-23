public class ParametarizedConstructor {
    String brand;
    String model;
    int year;

    public ParametarizedConstructor(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Car: " + brand + " " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        ParametarizedConstructor myCar = new ParametarizedConstructor("Toyota", "Corolla", 2020);
        myCar.displayInfo(); 
    }
}
