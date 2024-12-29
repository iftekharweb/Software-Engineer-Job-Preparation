class Base {
    // Constructor Overloading
    Base() {
        System.out.println("Default constructor of Base class");
    }

    Base(int x) {
        System.out.println("Parameterized constructor of Base class: " + x);
    }

    // Method Overloading
    void display() {
        System.out.println("Display with no arguments");
    }

    void display(int x) {
        System.out.println("Display with one argument: " + x);
    }

    // Method for overriding
    void info() {
        System.out.println("Info from Base class");
    }
}

class Derived extends Base {
    // Constructor of Derived
    Derived() {
        System.out.println("Constructor of Derived class");
    }

    // Overriding base class method
    @Override
    void info() {
        System.out.println("Info from Derived class");
    }
}

class Complex {
    int real, imag;

    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    // Operator overloading is not supported directly in Java.
    // Simulate with a method
    Complex add(Complex other) {
        return new Complex(real + other.real, imag + other.imag);
    }

    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Constructor Overloading
        Base b1 = new Base();
        Base b2 = new Base(42);

        // Method Overloading
        b1.display();
        b1.display(100);

        // Method Overriding
        Derived d = new Derived();
        Base baseRef = d;
        baseRef.info();

        // Operator Overloading Simulation
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(1, 2);
        Complex c3 = c1.add(c2); // Using add method
        System.out.print("Result of addition: ");
        c3.display();
    }
}
