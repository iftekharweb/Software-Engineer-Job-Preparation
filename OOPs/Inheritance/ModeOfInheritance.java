class Base {
    public int publicVar = 10;
    protected int protectedVar = 20;
    private int privateVar = 30; // Not accessible in Derived
}

class Derived extends Base {
    public void display() {
        System.out.println("Public Var: " + publicVar);
        System.out.println("Protected Var: " + protectedVar);
    }
}

public class ModeOfInheritance {
    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.display();
        System.out.println("Public Var (outside): " + obj.publicVar);
        // System.out.println(obj.protectedVar); // Error: ProtectedVar not accessible
    }
}
