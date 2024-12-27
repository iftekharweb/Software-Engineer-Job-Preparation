#include <iostream>
using namespace std;

class Base {
public:
    int publicVar = 10;
protected:
    int protectedVar = 20;
};

class Derived : protected Base {
public:
    void display() {
        cout << "Public Var (now protected): " << publicVar << endl;
        cout << "Protected Var: " << protectedVar << endl;
    }
};

int main() {
    Derived obj;
    obj.display();
    // cout << obj.publicVar; // Error: publicVar is now protected
    return 0;
}
