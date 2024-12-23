#include <iostream>
#include <vector>
using namespace std;

class Car {
public:
    string brand;
    vector<string>* features;

    // Constructor
    Car(string b, vector<string> f) {
        brand = b;
        features = new vector<string>(f);
    }

    // Deep Copy Constructor
    Car(const Car& other) {
        brand = other.brand;
        features = new vector<string>(*other.features);
    }

    ~Car() {
        delete features;
    }

    void displayInfo() {
        cout << "Car: " << brand << ", Features: ";
        for (const string& feature : *features) {
            cout << feature << " ";
        }
        cout << endl;
    }
};

int main() {
    vector<string> features = {"Airbags", "ABS"};
    Car car1("Toyota", features);

    Car car2 = car1;  // Deep copy

    // Modify the original object's features
    car1.features->push_back("Sunroof");

    car1.displayInfo();  // Output: Car: Toyota, Features: Airbags ABS Sunroof
    car2.displayInfo();  // Output: Car: Toyota, Features: Airbags ABS

    return 0;
}
