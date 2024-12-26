class Parent {
    public int x;

    Parent() {
        this.x = 20;
    }
    void print(int x) {
        System.out.println("Parent " + x);
    }
}
class Child extends Parent {
    @Override
    void print(int x) {
        System.out.println("Child " + (this.x + x));
    }
}
public class OverridingWithInheritance {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.print(35);
    }
    
}
