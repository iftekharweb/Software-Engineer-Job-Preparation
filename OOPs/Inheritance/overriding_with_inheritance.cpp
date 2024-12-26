#include<bits\stdc++.h>
using namespace std;

class Parent {
    public:
        int x;
        Parent() {
            x = 5;
        }
        virtual void showValue(int x) {
            cout << "Parent show() " << x << endl;
        }
};

class Child : public Parent {
    public:
        void showValue(int x) override {
            cout << "Child Show() " << this->x + x << endl; 
        }
};

int main() {
    Child obj;
    obj.showValue(10); // Output: Child Show() 15
}