#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <map>
#include <sstream>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int queryCount;
    long int mobile;
    string query, name, find_name;

    map<string, int> dict;

    cin >> queryCount;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    for(int i = 0; i<queryCount; i++)
    {
    	getline(cin,query);
    	// "cin << query" doesnt work here. It inputs only the first word in the string.
    	// Always use getline so as to input all contents in the string, which has words seperated by spaces.
    	stringstream ss(query);
    	//To split strings and take one word at a time

    	ss >> name >> mobile;
    	dict[name] = mobile;
    	// map[Key] = Value
    	// Can also use dict.insert(pair <string, int> (name, mobile));

    }


    /* TO ITERATE THROUGH AND PRINT ALL KEY AND VALUES IN A MAP. ORDER WILL BE RANDOM:
     *
     *
     * map <string, int> :: iterator itr; => This declaration of itr is not required in C++11. Just use 'auto itr'
     *
     * for (auto itr = dict.begin(); itr != dict.end(); ++itr)
     *   {
     *      cout  << itr->first << " " << itr->second << endl;
     *   }
	   *	
     *
     *
     */


    while(cin >> find_name) // While there is input present
    {

		auto it = dict.find(find_name);
		if (it != dict.end()) // If iterator has not reached end
			cout << it->first << "=" << it->second << endl;
			// Print key and value respectively
		else
			cout << "Not found" << endl;

    }

    return 0;
}
