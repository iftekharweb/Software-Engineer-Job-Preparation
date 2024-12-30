// Interface declaration
interface Vehicle {
    void startEngine();
    void stopEngine();
}

class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped");
    }
}

class Bike implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Bike engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Bike engine stopped");
    }
}

public class Interface {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.startEngine();
        bike.startEngine();

        car.stopEngine();
        bike.stopEngine();
    }
}

