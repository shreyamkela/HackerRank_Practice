import java.util.Scanner;

public class Test {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        smallest = s.substring(0, k); // extract substring from 0 to k excluding kth position letter
        for(int i = 0; i+k-1<s.length(); i++){
        
            if((s.substring(i, i+k)).compareTo(smallest)<0) smallest = s.substring(i, i+k); 
            // compareTo compares 2 string. if the string inside bracket is greater then result of comparison is < 0  
            if((s.substring(i, i+k)).compareTo(largest)>0) largest = s.substring(i, i+k);
        }
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}