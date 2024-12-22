class Parent {
    private int x;

    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }
}

public class Inheritance extends Parent {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.setX(10);
        System.out.println(parent.getX());
    }
}