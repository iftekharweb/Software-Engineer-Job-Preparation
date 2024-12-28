#include<bits\stdc++.h>
using namespace std;

class Engine {
public:
    void start() {
        cout << "Engine starting..." << endl;
    }
};

class Car {
private:
    Engine engine;  // Composition: Car "has-a" Engine

public:
    void start() {
        engine.start();  // Delegating functionality to Engine
        cout << "Car is ready to drive!" << endl;
    }
};

int main() {
    Car car;
    car.start();
    return 0;
}