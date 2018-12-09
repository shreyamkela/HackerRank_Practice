import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
	// Add your code here
    public int a=0,b=0;

    Difference(int[] array) {
        elements = array;
    }

    public void computeDifference() {
    	
        a = elements[0];
        b = elements[0];
        
        for(int i=1; i<elements.length; i++) {
        	
            a = elements[i]>a?elements[i]:a;
            b = elements[i]<b?elements[i]:b;
            	
        }
        
        maximumDifference = Math.abs(a-b);

    }

} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}