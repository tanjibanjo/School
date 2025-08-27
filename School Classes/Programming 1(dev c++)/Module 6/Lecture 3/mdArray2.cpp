//************************************************************************
//	Author: Lane Pollock	
//	Date: 10 Apr 2024
//	Language: C++
//	Assignment: 
//	Description: demo for md arrays using randomo sequencing to create random sentences
//************************************************************************


#include <iostream>
#include <string>
#include <ctime>
#include <cstdlib>
using namespace std;

//function prototypes
string getWord(string[]);

void printSentence(string[]);

int main()
{
	//seed the random number generator
	srand( time(NULL) );
	
	//declare local variables
	string articles[] = {"the", "a", "one", "some", "many"};
	string nouns[] = {"boy", "girl", "dog", "town", "car"};
	string verbs[] = {"drove", "jumped", "ran", "walked", "skipped"};
	string prepositions[] = {"to", "from", "over", "under", "on"};
	string sentences[20][6]; //array to hold 20 sentences of 6 words
	
	//for each sentence, get 6 words
	for(int i = 0; i < 20; i++)
	{
		sentences[i][0] = getWord(articles);
		sentences[i][1] = getWord(nouns);
		sentences[i][2] = getWord(verbs);
		sentences[i][3] = getWord(prepositions);
		sentences[i][4] = getWord(articles);
		sentences[i][5] = getWord(nouns);
	}
	
	//print each of the twenty sentences
	for(int i = 0; i < 20; i++)
	{
		printSentence(sentences[i]);
	}
	
	
    return 0;
}

//function definitions

//function to get a word from an array of 5 words
string getWord(string wordList[])
{
	//local variable
	int randomNumber = rand() % 5;
	
	//return the word at the index of the random number
	return wordList[randomNumber];
}

//function to print the sentence from array of words
void printSentence(string sentence[])
{
	//for each 6 words, print
	for(int word = 0; word < 6; word++)
	{
		//capitalize first letter of the first word
		sentence[0][0] = toupper(sentence[0][0]);
		cout << " " << sentence[word];
	}
	cout << ".\n"; //period new line at end of each sentence
}