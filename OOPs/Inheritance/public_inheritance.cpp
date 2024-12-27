#include <iostream>
using namespace std;

class Base {
public:
    int publicVar = 10;
protected:
    int protectedVar = 20;
private:
    int privateVar = 30;  // Not accessible in Derived
};

class Derived : public Base {
public:
    void display() {
        cout << "Public Var: " << publicVar << endl;
        cout << "Protected Var: " << protectedVar << endl;
    }
};

int main() {
    Derived obj;
    obj.display();
    cout << "Public Var (outside): " << obj.publicVar << endl;
    // cout << obj.protectedVar; // Error: ProtectedVar not accessible
    return 0;
}
