// Class with public access modifier
class Car {
    public String car_name;

    public Car(String a) {
        this.car_name = a;
    }
    public void get_car_name() {
        System.out.println(car_name);
    }
}

// Class with Private access modifier
class Book {
    private String name, type;
    private int price;

    public Book() {
        this.name = "First_one";
        this.type = "Unknown";
        this.price = 0; 
    }
    public void change_book_price(int price) {
        this.price = price;
    }
    public void get_book_info() {
        System.out.println(this.name + " " + this.type + " " + this.price);
    }
}

public class public_private {
    public static void main(String[] args) {
        Car objCar = new Car("BMW");
        objCar.get_car_name();

        Book objBook = new Book();
        objBook.get_book_info();
        objBook.change_book_price(137);
        objBook.get_book_info();
    }
}
