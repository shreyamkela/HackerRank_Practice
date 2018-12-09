#include <iostream>
#include <string>
using namespace std;

class PrintSomething{ // Declaring a class
	public:
	// Remember the colon
	// This is Access specifier
        // If not put 'public' then main() wont be able to use the underlying functions
	
		void printIt(){
			cout << "Hey!" << endl;
		}

		void setName(string s){ // setter function
			name = s; // indirectly manipulate class variable
		}

		string getName(){ // getter function
			return name;
		}

	private:
		string name; // class variable


}; //Remember the semicolon

int main()
{
	PrintSomething printThis;
	// Making an object of class. Basically PrintSomething is the datatype and
	// printThis is the variable

	printThis.printIt();

	printThis.setName("Shreyam");
	cout << printThis.getName();


	return 0;
}
