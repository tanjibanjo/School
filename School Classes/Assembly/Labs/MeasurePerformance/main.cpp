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

void test_function() {
	// Simulate some work
	volatile int sum = 0;
	for (int i = 0; i < 1000000; ++i) {
		sum += i;
	}
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
	cout << "Entering Program\n\n";

	cout << "Testing the time it takes to calculate the n item of the Fibonacci sequence: 2000\n";
	auto start = getCurrentTime();
	longEvaluation(2000);
	auto end = getCurrentTime();
	cout << "\nTime passed in nanoseconds: " << chrono::duration_cast<chrono::microseconds>(end - start).count() << endl << endl;

	cout << "Testing the time it takes to calculate the n item of the Fibonacci sequence: 2000000\n";
	auto start2 = getCurrentTime();
	longEvaluation(2000000);
	auto end2 = getCurrentTime();
	cout << "\nTime passed in nanoseconds: " << chrono::duration_cast<chrono::microseconds>(end2 - start2).count() << endl << endl;

	cout << "\nMeasuring a test function:\n";
	auto start3 = getCurrentTime();
	test_function();
	auto end3 = getCurrentTime();
	cout << "\nTime passed in nanoseconds: " << chrono::duration_cast<chrono::microseconds>(end3 - start3).count() << endl << endl;
	

	return 0;

}