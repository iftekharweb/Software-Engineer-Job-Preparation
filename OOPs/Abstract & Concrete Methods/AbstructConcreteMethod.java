abstract class Shape {
    // Abstract method
    abstract void draw();

    // Concrete method
    void display() {
        System.out.println("Displaying Shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class AbstructConcreteMethod {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.display();    // Concrete method
        shape.draw();       // Abstract method implementation
    }
}
