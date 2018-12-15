import java.util.*;

class Test{
    public static void main(String []args)
    {
    	int line = 1;
    	Scanner scan = new Scanner(System.in);
    	while(scan.hasNext()) {//Keep inputting till there is an input
    		System.out.println(line + " " + scan.nextLine()); // no need of storing each line in a string. Print directly
    		line++;
    	}	
    	scan.close();
    }  
}


