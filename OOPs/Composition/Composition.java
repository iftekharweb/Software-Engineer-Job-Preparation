class Engine {
    public void start() {
        System.out.println("Engine started");
    }
}

class Car {
    private Engine engine;
    
    public Car() {
        engine = new Engine();
    }
    
    public void start() {
        engine.start();
    }
}

public class Composition {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}
