// Interface 1
interface Animal {
    void eat();
}

// Interface 2
interface Bird {
    void fly();
}

// Class implementing multiple interfaces
class Bat implements Animal, Bird {
    @Override
    public void eat() {
        System.out.println("Bat is eating insects.");
    }

    @Override
    public void fly() {
        System.out.println("Bat is flying at night.");
    }
}

public class MultipleInheritanceWIthInterface {
    public static void main(String[] args) {
        Bat bat = new Bat();

        // Using methods from both interfaces
        bat.eat();  // Output: Bat is eating insects.
        bat.fly();  // Output: Bat is flying at night.
    }
}
