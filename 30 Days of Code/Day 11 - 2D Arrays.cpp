#include <bits/stdc++.h>
using namespace std;

int main()
{
    int  length = 3, highest;
    vector<vector<int>> arr(length);
    
    for (int i = 0; i < length; i++) {
    
        arr[i].resize(length);
        for (int j = 0; j < length; j++) {
            cin >> arr[i][j];
        }
        cin.ignore(numeric_limits<streamsize>::max(), '\n');
    }


    for (int i = 0; i < length-2; i++) {
    	for (int j = 0; j < length-2; j++) {

    	/* 
        For a 6*6 matrix, we run the loop for the first 4*4 elements as each hourglass will be starting 
        from one of these 4*4 now we dont need another loop for calc. the hourglass sum for each of this 
        starting element just add manually all the elements that form the hourglass. 
        Adding a third loop would increase the complexity.
        */
        
    		int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j+1] + arr[i+2][j] + arr[i+2][j+2];
    		if (i == 0 && j == 0)
    			/*
         		Initialize 'highest' variable with sum value for the first hourglass.
    			if we initilize highest beforehand with a 0, then if the matrix has all or most elements as negative numbers,
    			zero would always be higher then their hourglass sum which would be wrong as no hourglass would have sum as 0
    			as all hourglasses could have sum below zero
         		 */
          
    			highest = sum;
    		  	if(highest < sum)
    			  highest = sum;
    	}
    }

    for (int i = 0; i < length; i++) {
        for (int j = 0; j < length; j++) {
            cout << arr[i][j] << " ";
        }
        cout << endl;
    }

    cout << highest << endl;
    return 0;
}
