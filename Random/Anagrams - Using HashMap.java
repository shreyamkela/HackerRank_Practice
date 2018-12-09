import java.util.Scanner;
//We're only allowed to import this library in tis question on hackerrank

public class Test {
    public static boolean isAnagram(String a, String b) {
    	
    	if(a.length()!=b.length()) return false; // if length of strings unequal then not anagrams

    	java.util.HashMap<Character, Integer> charFrequency = new java.util.HashMap<Character, Integer>();
    	/*
    	 * Using java.util.HashMap inside the block to use Hashmap module without including its library
    	 * 
    	 */
    	String str1 = a.toUpperCase(); 
    	// the string can be both upper case and lower case so we change all to upper case
    	// so as to only store 26 letters at most, in the memory
    	String str2 = b.toUpperCase();
    	
    	for(int i=0; i<str1.length(); i++) {
    		
    		// Increment frequency of a letter in the map when that letter is found in string 1
    		// Decrement frequency that letter in the map when that letter is found in string 2
    		// We use only 1 map
    		// So string 1 increments the values in map
    		// And string 2 decrements the values in map
    		// So if the strings are anagrams, the map should have all values as 0 at the end
    		    		
    		if(charFrequency.containsKey(str1.charAt(i))) 
    			charFrequency.put(str1.charAt(i), charFrequency.get(str1.charAt(i)) + 1);
    		// if map already has the current character(key) from string 1, put that character again at that place incrementing its value or the frequency
    		// put(key, value)
    		else 
    			charFrequency.put(str1.charAt(i), 1);
    		// if map does not have the current character(key), put that character in the map and put its value as 1
    		
    		if(charFrequency.containsKey(str2.charAt(i))) 
    			charFrequency.put(str2.charAt(i), charFrequency.get(str2.charAt(i)) - 1);
    		// if map already has the current character(key) from string 2, put that character again at that place decrementing its value
    		// so as to balance out string 1's increments
    		else 
    			charFrequency.put(str2.charAt(i), -1);	

    	}
    	
    	// iterate through the map and check if any value is other than 0
    	for ( int value: charFrequency.values()) { // for-each loop - should 'Integer' be written instead of int?
	        if ( value != 0) {
	            return false;
	        }
	     // Here if there was a way to directly find whether there's ay value which is not 0, then the loop is not required
	     // But couldnt find a way to check for values other than a particular value, in maps
	    }
    		
    	return true;   
    }
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" ); // Intuitive way of using a conditional statement in println
    }
}