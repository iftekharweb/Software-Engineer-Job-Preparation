public class Setter_getter {
    private String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public static void main(String[] args) {
        Setter_getter myCar = new Setter_getter();
        myCar.setBrand("Toyota");
        System.out.println("Car Brand: " + myCar.getBrand()); 
    }
}
