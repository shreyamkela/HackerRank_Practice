import java.io.*;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        char[] stringArray = A.toCharArray();
        if(stringArray.length == 1) System.out.println("Yes"); // condition for when length is 1
        for(int i=0; i<stringArray.length/2; i++) { // works for both even and odd lengths
            if(stringArray[i]!=stringArray[(stringArray.length-1)-i]) {
                System.out.println("No");
                break;
            }
            if(i==(stringArray.length/2)-1) {
                 System.out.println("Yes");
            }
        }
    }
}



