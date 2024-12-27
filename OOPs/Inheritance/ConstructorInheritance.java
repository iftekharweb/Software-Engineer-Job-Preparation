class Parent {
    protected int parentProperty;

    // Parent class constructor
    public Parent(int prop) {
        this.parentProperty = prop;
        System.out.println("Parent constructor called with property: " + parentProperty);
    }
}

class Child extends Parent {
    private int childProperty;

    // Child class constructor that calls Parent constructor
    public Child(int parentProp, int childProp) {
        super(parentProp);  // Call Parent constructor
        this.childProperty = childProp;
        System.out.println("Child constructor called with property: " + childProperty);
    }

    public void display() {
        System.out.println("Parent Property: " + parentProperty);
        System.out.println("Child Property: " + childProperty);
    }
}

public class ConstructorInheritance {
    public static void main(String[] args) {
        Child obj = new Child(100, 200);
        obj.display();
    }
}

