class MethodChaining {
    private String brand;
    private String color;

    public MethodChaining setBrand(String brand) {
        this.brand = brand;
        return this;  // Return the current object
    }

    public MethodChaining setColor(String color) {
        this.color = color;
        return this;  // Return the current object
    }

    public void display() {
        System.out.println("MethodChaining: " + brand + ", Color: " + color);
    }

    public static void main(String[] args) {
        MethodChaining car = new MethodChaining();
        car.setBrand("Toyota").setColor("Red").display();
    }
}
