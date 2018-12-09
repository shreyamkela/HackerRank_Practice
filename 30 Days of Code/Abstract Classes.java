import java.util.*;
//Abstract classes are used when you want ot create objects only of the subclasses that extent the abstract superclass
//For eg Animal abstract superclass has non-abstract dog and cat subclasses
//You can create dog and cat objects but not Animal object.
//The analogy is that in real life there is no 'Animal'; there are 'Dogs' and 'Cats'. But dogs and cats are a 'kind of' animal.
abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}

// Declare your class here. Do not use the 'public' access modifier.
// A file can only have 1 public class. All other classes are used by this public class.
// Therefore as we already have a driver class which is public, we cannot make MyBook as public
class MyBook extends Book {

    // Declare the price instance variable
	int price;
    
    /**   
    *   Class Constructor
    *   
    *   @param title The book's title.
    *   @param author The book's author.
    *   @param price The book's price.
    **/
    // Write your constructor here
	MyBook(String title, String author, int price) {
		
		super(title, author);
		this.price = price;
		
	}
    
    /**   
    *   Method Name: display
    *   
    *   Print the title, author, and price in the specified format.
    **/
    // Write your method here
	// you can use public here as display is a method and not a class
	void display() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
	}
	
}	
// End class
	
public class Test {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        // Create object of abstract superclass Book, as new MyBook
        Book book = new MyBook(title, author, price);
        book.display();
    }
}