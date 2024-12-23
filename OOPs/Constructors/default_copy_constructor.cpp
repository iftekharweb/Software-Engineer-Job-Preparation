#include <iostream>
using namespace std;

class Car {
private:
    string brand;
    int year;

public:
    // Constructor
    Car(string b, int y) : brand(b), year(y) {}
    /*      OR
    Car(string b, int y) {
        brand = b, year = y;
    }
    */

   // Default / Shallow Copy | We can skip writing it cause it will be created autometicly
    Car(Car &obj) {
        this->brand = obj.brand;
        this->year = obj.year;
    }

    // Method to display car details
    void displayInfo() {
        cout << "Car: " << brand << ", Year: " << year << endl;
    }
};

int main() {
    Car car1("Toyota", 2020);  // Normal constructor
    Car car2(car1);          // Default copy constructor is invoked

    car2.displayInfo();  // Output: Car: Toyota, Year: 2020
    return 0;
}
