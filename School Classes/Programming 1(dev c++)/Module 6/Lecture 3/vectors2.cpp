//************************************************************************
//	Author: Lane Pollock	
//	Date:
//	Language: C++
//	Assignment: 
//	Description: demo of using vectors 2
//************************************************************************


#include <iostream>
#include <vector>
using namespace std;

//function prototypes

int main()
{
	//declare local variables
	vector<int> myVector;
	
	//add elements
	myVector.push_back(2);
	myVector.push_back(4);
	myVector.push_back(1);
	myVector.push_back(6);
	myVector.push_back(5);
	myVector.push_back(-4);
	myVector.push_back(12);
	myVector.push_back(9);
	
	//access an element of the vector
	cout << "The first element of the vector is " << myVector[0] << endl;
	
	//iterate using a normal for loop
	for(int i = 0; i < myVector.size(); i++)
		cout << myVector[i] << " ";
	
	cout << endl;
	
	cout << "Vector size: " << myVector.size() << endl;
	cout << "Vector capacity: " << myVector.capacity() << endl;
	myVector.push_back(10);
	cout << "After adding another element: \n";
	cout << "Vector size: " << myVector.size() << endl;
	cout << "Vector capacity: " << myVector.capacity() << endl;
	
	myVector.resize(12);
	cout << "After doing a resize: \n";
	cout << "Vector size: " << myVector.size() << endl;
	cout << "Vector capacity: " << myVector.capacity() << endl;
	
	//use range based for loop to iterate
	for(int num : myVector)
		cout << num << " ";
	cout << endl;
	
	//remove an element
	myVector.pop_back();
	
	//iterate again
	for(int num : myVector)
		cout << num << " ";
	cout << endl;
	
    return 0;
}

//function definitions