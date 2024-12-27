#include <iostream>
using namespace std;

class Base {
public:
    int publicVar = 10;
protected:
    int protectedVar = 20;
};

class Derived : private Base {
public:
    void display() {
        cout << "Public Var (now private): " << publicVar << endl;
        cout << "Protected Var (now private): " << protectedVar << endl;
    }
};

int main() {
    Derived obj;
    obj.display();
    // cout << obj.publicVar; // Error: publicVar is now private
    return 0;
}
