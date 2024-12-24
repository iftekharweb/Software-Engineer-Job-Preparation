#include <bits/stdc++.h>
using namespace std;

class Car {
    string brand;
    string color;

public:
    Car& setBrand(const string& b) {
        brand = b;
        return *this;  // Return the current object
    }

    Car& setColor(const string& c) {
        color = c;
        return *this;  // Return the current object
    }

    void display() const {
        cout << "Car: " << brand << ", Color: " << color << endl;
    }
};

int main() {
    Car car;
    car.setBrand("Toyota").setColor("Red").display();
    return 0;
}
