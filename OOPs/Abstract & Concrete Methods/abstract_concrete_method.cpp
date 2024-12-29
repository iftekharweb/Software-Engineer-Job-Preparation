#include<bits\stdc++.h>
using namespace std;

class Shape {
    public:
        // Abstract method
        virtual void draw() = 0;

        // Concrete method
        void description() {
            cout << "This is a shape" << endl;
        }
};

class Circle : public Shape {
    public:
        void draw() override {
            cout << "Drawing a Circle" << endl;
        }
};

int main() {
    Shape* shape = new Circle();
    shape->description(); // Concrete method
    shape->draw();        // Abstract method implementation

    delete shape;
    return 0;
}