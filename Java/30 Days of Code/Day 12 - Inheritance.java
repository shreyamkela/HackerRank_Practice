import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}	 
}
class Student extends Person{
	private int[] testScores;
    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String firstName, String lastName, int id, int[] scores) { 
    	
    	//As in main, the called class Student has 4 param so we create a constructor with 4 param
    	//There is no const in Person with 4 param
    	//Therefore, when super() would be implicitly called here, it will give error as there is no Person() const without any arguments
    	//Therefore, we use a super with 3 param here so that the values are directly passed to the Person(3 args) const
    	
    	super(firstName,lastName,id);
        testScores = scores;
        //testScores has been declared as private so we cannot use testScores directly as a param in Student
        //So we used scores as a param and set its value into testScores indirectly (Basically a setter function)

    }

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    
    public char calculate() {
    	
    	int sum = 0;
    	double average;
    	for (int i : testScores)
    	    sum += i;
    	average = (double) sum/testScores.length;
    	
    	if(100>=average && average>=90) {
    		return 'O';
    	}
    	else if(90>average && average>=80) {
    		return 'E';		
		}
    	else if(80>average && average>=70) {
    		return 'A';
		}
    	else if(70>average && average>=55) {
    		return 'P';
		}
    	else if(55>average && average>=40) {
    		return 'D';
		}
    	else {
    		return 'T';
		}

    }
}
class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}
