#include <bits/stdc++.h>
using namespace std;

class BankAccount {
    private:
        int amount;
    public:
        BankAccount() {
            this->amount = 0;
        }

        void setAmount(int amount) {
            if(amount < 0) {
                cout << "Amount cannot be nagetive" << endl;
            } else {
                this->amount += amount;
            }
        }

        int getAmount() {
            return this->amount;
        }
};

int main() {
    BankAccount bank;
    bank.setAmount(100);
    cout << bank.getAmount() << endl;
}