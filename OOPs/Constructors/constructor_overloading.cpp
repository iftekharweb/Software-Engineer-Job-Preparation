#include <iostream>
using namespace std;

class Rectangle {
private:
    double length, width;

public:
    // Default constructor
    Rectangle() {
        length = 1;
        width = 1;
    }

    // Constructor with one parameter
    Rectangle(double l) {
        length = l;
        width = 1;
    }

    // Constructor with two parameters
    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    double area() {
        return length * width;
    }
};

int main() {
    Rectangle rect1;          // Calls default constructor
    Rectangle rect2(5);       // Calls single-parameter constructor
    Rectangle rect3(4, 6);    // Calls two-parameter constructor

    cout << "Area of rect1: " << rect1.area() << endl;  // Output: 1
    cout << "Area of rect2: " << rect2.area() << endl;  // Output: 5
    cout << "Area of rect3: " << rect3.area() << endl;  // Output: 24

    return 0;
}
