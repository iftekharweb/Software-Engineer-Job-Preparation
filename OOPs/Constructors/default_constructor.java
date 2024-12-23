public class default_constructor {
    private int x;

    public default_constructor() {
        System.out.println("Constructor will be called first and memory will be allocated");
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }

    public static void main(String[] args) {
        default_constructor obj = new default_constructor();
        obj.setX(1234);
        System.out.println(obj.getX());
    }
}
