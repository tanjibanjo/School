//************************************************************************
//	Author: Lane Pollock
//	Date: 10 Apr 2024
//	Language: C++
//	Assignment: Lab 6.2: Election
//	Lab Purpose/ Description: Write a program that lets the user enter 
//      names of candidates and their votes, then displays results
//************************************************************************

#include <iostream>
#include <iomanip>
using namespace std;


//function prototypes
void getData(int[], string[], int&, int);
void displayResults(int[], string[], int, int);
string winner(int[], string[], int);

int main()
{
	//declare local variables
	const int ARRAY_SIZE = 5;
	int votes[ARRAY_SIZE];
	string candidates[ARRAY_SIZE];
	int totalVotes;
	
	
	//call getData function to get the names and votes for candidates
	getData(votes, candidates, totalVotes, ARRAY_SIZE);
	
    cout << endl;

	//call function to display the results
	displayResults(votes, candidates, totalVotes, ARRAY_SIZE);

    return 0;
}

//function definitions

//function to prompt user to enter names and votes for candidates
void getData(int v[], string n[], int& total, int SIZE)
{
	//prompt user to enter the last name of candidate 
	//followed by the number of votes they received
	cout << "Please enter in candidate's last name and votes, "
		 << "seperated by a space:\n";
	
	for(int i = 0; i < SIZE; i++)
	{ //loop for all 5 candidates
		cout << "Candidate " << i + 1 << ": ";
		cin >> n[i] >> v[i];
		total += v[i]; //add to running total
	}
} //end function

//function to calculate the winner based on number of votes
string winner(int vote[], string name[], int SIZE)
{
	//local variables
	int highest = vote[0];
	string winner = name[0];
	
	//iterate through arrays to find the winner and return the name
	for(int i = 1; i < SIZE; i++)
	{
		if(vote[i] > highest)
		{
			highest = vote[i]; //update highest votes received
			winner = name[i]; //update winner
		}
	} //end for loop
	
	return winner;
} //end function

//function to display the results of the election
void displayResults(int v[], string n[], int totalV, int SIZE)
{
	//print header first
	cout << left << setw(18) << "Candidate"
		 << setw(18) << "Votes Received"
		 << "% of Total Votes\n\n";
		
	cout << showpoint << fixed << setprecision(2); //to match formatting in example
	
	//iterate through the arrays, displaying the info
	for(int i = 0; i < SIZE; i++)
	{
		cout << left << setw(24) << n[i] << setw(6) << v[i]
			 << right << setw(21) 
			 << (static_cast<double>(v[i]) / totalV) * 100 
			 << endl;
	}
	
	cout << left << setw(24) << "Total" << totalV << endl;
	
	//use winner function to display winner 
	cout << "\nThe winner of the election is " << winner(v, n, SIZE)
		 << ".";
}