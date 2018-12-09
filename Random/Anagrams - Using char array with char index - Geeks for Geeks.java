import java.util.*;
 
class Test{
    
    static int NO_OF_CHARS = 26;// 
	/* 
	 * static int NO_OF_CHARS = 256; 
	 * ASCII codes are till 256 but this would be not efficient complexity wise as alphabets are only 26
	 * So we use char array of 26 instead
	 * Note that we cannot store both capital and small as then we would require 2*26 space
	 * So we convert all into either upper or lower 
	 */
     
    /* function to check whether two strings
    are anagram of each other */
    static boolean areAnagram(char str1[], char str2[])
    {
    	
        // If both strings are of different length.
        // Removing this condition will make the program 
        // fail for strings like "aaca" and "aca"
        if (str1.length != str2.length)
            return false;
        
        
        // Create 2 count arrays and initialize
        // all values as 0
        int count[] = new int [NO_OF_CHARS];
        Arrays.fill(count, 0); //Initialize all elements with 0
        int i;
        
        // For each character in input strings,
        // increment count in the corresponding
        // count array
        for (i = 0; i <str1.length && i < str2.length ; i++) 
        	// taking in 1 letter input from both strings
        	// we dont really need to check both lengths here are we had already put a check of equality on the lengths before this for block
        {
            count[Character.toUpperCase(str1[i]) - 'A']++; 
            // str1[i] would give a letter and then it would be converted to ascii and that would be the index of count1
            // so it looks like we are doing character-index to integer-value mapping but it is actually simple array manipulation
            // ASCII of A is is substracted from each input letter so that the actual index starts from 0
            // Recall that we can only have indices from 0 to 25 as length is 26
            
            count[Character.toUpperCase(str2[i]) - 'A']--;
            //
        }
  

        // See if there is any non-zero value in count array
        for (i = 0; i < NO_OF_CHARS; i++)
            if (count[i]!=0)
                return false;
         return true;

    }
  
    /* Driver program to test to print printDups*/
    public static void main(String args[])
    {
        char str1[] = ("geeksforgeeks").toCharArray();
        char str2[] = ("forgeeksgeeks").toCharArray();
         
        if ( areAnagram(str1, str2) ) 
        	// intuitive way of directly passing a method as the condition
        	// This is legal as the return type of the method is boolean
            System.out.println("The two strings are anagram of each other");
        else
            System.out.println("The two strings are not anagram of each other");
    }
}