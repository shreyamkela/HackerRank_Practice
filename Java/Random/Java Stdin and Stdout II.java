import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		double d = scan.nextDouble();
		scan.nextLine();
		// nextDouble() will not input the \n when user hits enter, 
		// so nextline element will be stored in String s if the above scan.nextLine() is not used, which is undesirable.
		// The next() does not take in \n
		String s = scan.nextLine();
		scan.close();
		
		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Integer: " + i);
		
	}
}
