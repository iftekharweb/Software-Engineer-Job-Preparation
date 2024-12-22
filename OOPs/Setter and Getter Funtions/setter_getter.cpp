#include <bits/stdc++.h>
using namespace std;

class Car {
    private:
        string brand;
    public:
        void setBrand(string brand) {
            this->brand = brand;
        }
        string getBrand() {
            return brand;
        }
};

int main() {
    Car obj;
    obj.setBrand("Audi");
    cout << obj.getBrand() << endl;
    return 0;
}