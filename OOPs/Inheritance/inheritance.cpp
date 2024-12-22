#include <bits/stdc++.h>
using namespace std;

class Sport {
    private:
        string type;
    public:
        void setType(string type) {
            this->type = type;
        }
        string getType() {
            return this->type;
        }
};

class Football : public Sport {
    private:
        int goal;
    public:
        void setGoals(int n) {
            this->goal = n;
        }
        int getGoals() {
            return this->goal;
        }
};

int main() {
    Football obj;
    obj.setType("Foot_Type");
    obj.setGoals(3);
    cout << obj.getType() << " " << obj.getGoals() << endl;
    return 0;
}