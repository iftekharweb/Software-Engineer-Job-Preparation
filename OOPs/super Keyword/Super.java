class Parent {
    int parentValue;

    Parent(int value) {
        this.parentValue = value;
        System.out.println("Parent Constructor called with value: " + value);
    }
    void display() {
        System.out.println("Parent's display method");
    }
}

class Child extends Parent {
    Child(int value) {
        super(value);  // Call Parent class constructor
        System.out.println("Child Constructor called");
    }
    public void display() {
        super.display();  // Call Parent class method
        System.out.println("Value of parentValue: " + parentValue);
    }
}

public class Super {
    public static void main(String[] args) {
        Child obj = new Child(100);
        obj.display();
    }
}
