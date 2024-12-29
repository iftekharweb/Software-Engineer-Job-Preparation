#include<bits\stdc++.h>
using namespace std;

class Base {
    public:
        // Constructor overloading
        Base() {
            cout << "Default constructor for Base class" << endl;
        }
        Base(int x) {
            cout << "Parameterized constructor for Base class : " << x << endl;
        }

        // Method Overloading
        void display() {
            cout << "Display with no arguments" << endl;
        }

        void display(int x) {
            cout << "Display with one argument: " << x << endl;
        }

        // Method overriding
        virtual void info() {
            cout << "Info from the Base class" << endl;
        }
};

class Derived : public Base{
    public:
        // Constructor of the Derived class
        Derived() {
            cout << "Constructor of Derived class" << endl;
        }

        // Overrriding base class method
        void info() override {
            cout << "Info from Derived class" << endl;
        }
};

class Complex{
    private:
        int real, img;
    public:
        Complex(int real, int img) {
            this->real = real, this->img = img;
        }

        // Overloading the '+' operator
        Complex operator+(const Complex& other) {
            return Complex(real+other.real, img+other.img);
        }
        void display() {
            cout << real << " + " << img << "i" << endl;
        }
};

int main() {
    // Constructor Overloading
    Base b1;
    Base b2(42);

    // Method Overloading
    b1.display();
    b1.display(100);

    // Method Overriding
    Derived d;
    Base* basePtr = &d;
    basePtr->info();

    // Operator Overloading
    Complex c1(3, 4), c2(1, 2);
    Complex c3 = c1 + c2; // Using overloaded '+' operator
    cout << "Result of addition: ";
    c3.display();
}