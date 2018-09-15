#include <bits/stdc++.h>


using namespace std;



int main()
{
    int n;
    cin >> n;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    long int remainder;
    int highest = 0, counter = 0;

    for(int i=19; i>=0; i--)
    	// 2^19 is 524288 which is highest power of 2 attainable between range of 1 to 10^6 (Hackerrank constraint)
    	// We start checking from the highest power attainable i.e 2^19 till 2^0
    {
        if(pow(2,i)<=n)
        {
            remainder = n-pow(2,i);
            counter++;
            // if value of current greatest power of 2 is less than the remainder, then this binary will be 1

            if(remainder == 0 && highest < counter) //  seperate condition for when 2^0 is attained and there are consecutive 1s counting 2^0
            {
                highest = counter;
            }

            n = remainder;
        }
        else
        {
        	// if value of current greatest power of 2 is more than the remainder, then this binary will be 0
        	// So count all the previous 1s (i.e 'counter' variable) and compare with previous 'highest' value of consec 1s
        	if (highest < counter)
        		highest = counter;

        	counter = 0; // after comparison set counter to 0

        }
    }

    cout << highest;
    return 0;
}
