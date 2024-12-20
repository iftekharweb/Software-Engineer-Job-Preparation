#include <bits/stdc++.h>
using namespace std;
using ll = long long;

// Class with public access modifier
class Car {
public:
    string car_name;

    Car(string a) {
        car_name = a;
    }

    void get_car_name() {
        cout << car_name << endl;
    }
};

// Class with Private access modifier
class Book {
private:
    string name, type;
    int price;

public:
    Book() {
        this->name = "First_One";
        this->type = "Unknown";
        this->price = 0;
    }
    void change_book_price(int price) {
        this->price = price;
    }
    void get_book_info() {
        cout << name << " " << type << " " << price << endl;
    }
};

int main() 
{
    Car objCar("BMW");
    objCar.get_car_name();
    objCar.car_name = "Audi";
    cout << objCar.car_name << endl;

    Book objBook;
    objBook.get_book_info();
    objBook.change_book_price(137);
    objBook.get_book_info();
    return 0;
}