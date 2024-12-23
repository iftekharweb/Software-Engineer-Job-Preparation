#include <bits/stdc++.h>
using namespace std;

class Book {
    public: 
        int x;
    public:
        Book() {
            // Default Constructor No need to write
            cout << "Constructor will be called first and memory will be allocated" << endl;
        }
        void setX(int x) {
            this->x = x;
        }
        int getX() {
            return x;
        }
};

int main() {
    Book book;
    book.setX(1234);
    cout << book.getX() << endl;
    return 0;
}