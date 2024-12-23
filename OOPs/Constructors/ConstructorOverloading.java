public class ConstructorOverloading {
    private double length;
    private double width;

    // Default constructor
    public ConstructorOverloading() {
        length = 1;
        width = 1;
    }

    // Constructor with one parameter
    public ConstructorOverloading(double length) {
        this.length = length;
        this.width = 1;
    }

    // Constructor with two parameters
    public ConstructorOverloading(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public static void main(String[] args) {
        ConstructorOverloading rect1 = new ConstructorOverloading();          // Default constructor
        ConstructorOverloading rect2 = new ConstructorOverloading(5);        // Single-parameter constructor
        ConstructorOverloading rect3 = new ConstructorOverloading(4, 6);     // Two-parameter constructor

        System.out.println("Area of rect1: " + rect1.area());  // Output: 1
        System.out.println("Area of rect2: " + rect2.area());  // Output: 5
        System.out.println("Area of rect3: " + rect3.area());  // Output: 24
    }
}
