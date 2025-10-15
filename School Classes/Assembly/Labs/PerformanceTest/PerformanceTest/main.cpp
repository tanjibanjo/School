//lane pollock
//15 oct 2025
//C++
//assembly lab - create a program in any language that will test the performance of the computer - I have chosen C++

#include <iostream>
#include <chrono>

using namespace std;

//gets and returns current time
auto getCurrentTime() {
    return chrono::steady_clock::now();
}

//function to do a bunch of operations
void longEvaluation(int n) {
    //inefficient fibonacci calculator

    //var
    int t1 = 0, t2 = 1, nextT = 0;

    if (n > 2) {
        //for numbers over 2, calculate the fibonacci
        for (int i = 2; i < n; i++) {
            nextT = t1 + t2;
            t1 = t2;
            t2 = nextT;
        }
        cout << nextT;
    }
    else if (n == 1) {
        cout << 0;
    }
    else if (n == 2) {
        cout << 1;
    }
    else {
        cout << "nope\n";
    }
}

int main() {
    cout << "Entering Program\n";

    //local var
    auto start = getCurrentTime();
    longEvaluation(2000000);
    auto end = getCurrentTime();

    cout << "\nTime Passed: " << chrono::duration_cast<chrono::microseconds>(end - start).count() << endl;


    return 0;

}
