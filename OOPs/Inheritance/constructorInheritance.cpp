#include<bits\stdc++.h>
using namespace std;

class Parent {
    protected:
        int x;
    public:
        Parent(int x) {
            this->x = x;
            cout << "Parent Number Is :" << x << endl;
        }
};

class Child : public Parent{
    public:
        int y;
    public:
        Child(int x, int y): Parent(x) {
            this->y = y;
            cout << "Child : " << this->y << "\nParent : " << this->x << endl;
        }
};

int main() {
    Child child(10, 20);
    return 0;
}
/*
Output:
Parent Number Is :10
Child : 20
Parent : 10
*/