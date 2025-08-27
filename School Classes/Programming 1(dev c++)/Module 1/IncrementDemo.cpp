// Increment/Decrement Demo

#include <iostream>
using namespace std;

int main() 
{
	// declare local variables
	int myAge = 25;
	
	// postfix operator - variable updated post use
	cout << "Age (with postfix): " << myAge++ << endl;
	cout << "Age (after postfix): " << myAge << endl;
	
	// prefix operator - variable updated pre use
	cout << "Age (with prefix): " << ++myAge << endl;
	cout << "Age (after prefix): " << myAge << endl;
	 
	return 0;
}