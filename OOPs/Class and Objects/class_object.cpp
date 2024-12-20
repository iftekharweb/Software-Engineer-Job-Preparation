#include <bits/stdc++.h>
using namespace std;

using ll = long long;

class Book {
private:
    string name, author;
public:
    Book(string a, string b) {
        name = a;
        author = b;
    }
    void book_info() {
        cout << "The " << name << " " << author << " car's engine has started!" << endl;
    }
};

int main() 
{
    Book bigOne("Introduction to Electronics", "Iftekhar");
    bigOne.book_info(); 
    return 0;
}