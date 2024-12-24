#include <bits\stdc++.h>
using namespace std;

class Car {
public:
    string brand;
    vector<string>* vec;

    // Constructor
    Car(string b, vector<string> v) {
        brand = b;
        vec = new vector<string>(v);  
        cout << "Constructor called for " << brand << endl;
    }

    // Destructor
    ~Car() {
        delete vec;
        cout << "Destructor called for " << brand << endl;
    }
};

int main() {
    Car car1("Toyota", {"shishir"});  // Constructor called for Toyota
    {                    // Begin inner scope
        Car car2("Honda", {"ricy"});
    }                    // Destructor called for Honda (as car2 goes out of scope)
    return 0;            // Destructor called for Toyota (as car1 goes out of scope)
}
