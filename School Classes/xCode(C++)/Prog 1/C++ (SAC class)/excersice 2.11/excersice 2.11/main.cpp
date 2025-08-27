// This program uses two variables with the name number.
#include <iostream>
using namespace std;

int main()
{
   // Define a variable named number.
   int number;

   cout << "Enter a number greater than 0: ";
   cin >> number;
   if (number > 0)
   {
      cout << "Your first number (outside the if block) was " << number << endl;

      int number;  // Another variable named number.
      
      cout << "Now enter another number: ";
      cin >> number;
      
      cout << "The second number you entered (inside the if block) was "
           << number << endl;
   }
   cout << "Your first number was " << number << endl;
   return 0;
}
