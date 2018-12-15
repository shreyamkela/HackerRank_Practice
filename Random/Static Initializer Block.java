import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Test {

static Scanner s = new Scanner(System.in);
static boolean flag = true;
static int B = s.nextInt();
static int H = s.nextInt();

static{
	// We use try catch to check whether B and H are <= 0. 
	// This approach is better than checking if B and H are > 0
    try{
        if(B <= 0 || H <= 0){
            flag = false;
            throw new Exception("Breadth and height must be positive"); 
            // This action will cause an exception to be raised and 
            // will require the calling method to catch the exception or throw the exception to the next level in the call stack.
            // Normally java.lang.Exception is not printed while exceptions are caught in console. But here we explicitly throw an 
            // exception using throw, therefore, java.lang.Exception is printed
        }
    }catch(Exception e){
        System.out.println(e);
    }

}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

