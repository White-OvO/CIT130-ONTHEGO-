package winter2023Assignments;

import java.util.Scanner;

/* @author Christopher Gonzalez cit130_pa7.java
 * 
 * 
 * @file :Demonstrate your understanding of Java arrays. 
 * This assignment is based on the material covered 
 * in chapter 7 of your textbook.

 *assignment: Write a program to process scores for a set
 * of students. Arrays and methods must be used for this program. 
 * 
 */


public class week07 {

	public static void main(String[] args) {
		//Scanner scanner = new Scanner;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount of students : \n");
	//giving the number of students entered an array
		int students = scanner.nextInt(); // read an integer from the user

	while(students < 1) { 
		System.out.println("Invalid try again \n");
	}
	else if (students == 1){ 
		System.out.println("Enter the name of the student followed by test score\n");
	}

	else if{ 
		System.out.println("Enter the amount of name of the " + students + " students followed by test score \n");
	}
	
	
	
	
	
	//////////////////////////////////////////////////////////////////
	//			Declaration of varriables
	//////////////////////////////////////////////////////////////////
	//Scanner StudentScanner = new scanner;
	//String[] studentNames = new String[students];	
	//studentNames[i] = scanner.next(); 
	String[] studentNames = new String[students];
	
	
	
	// we need to read both but individually 
	
	
	
	double [] testScores = new double[students];
	//Scanner StudentsScores = new scanner;
	//int[] testScores = new int[students];
	//testScores[i] = scanner.nextInt(); 
	
	
	
	
	
	
	
	///     giving each student a name and test score
	//Scanner scanner = new Scanner(System.in); 
	//students[] = Scanner.new;
	//students[] = scanner.next();
	
	
	/// reading the input for the students
	
	

	//////////////////////////////////////////////////////////////////
	//			looping for name and test score to store in variable
	//////////////////////////////////////////////////////////////////
	
	
	
	
	for (int i = 0 ; i < students; i++ ) { 
	//	System.out.println(studentNames +" " + testScores);
	//	System.out.println(studentNames[i] + " " + testScores[i]);
	System.out.println("Enter the name of student "+ (i +1) + " : ");
	studentNames[i] = scanner.next(); 
	
	System.out.println("Enter test score of student " + (i + 1) + " : " );
	testScores[i] = scanner.nextDouble();
	
	}
	
	
	
	


	//////////////////////////////////////////////////////////////////
	//			loops the name of the name and test score to output
	//////////////////////////////////////////////////////////////////
	
	
	for (int i = 0; i < students; i++) { 
//	System.out.printf(".2f",studentNames[i] + "  " + ".2f",testScores[i]);
	//System.out.printf("%s  %.2f", studentNames[i], testScores[i]);
		System.out.printf("%s  %.2f\n", studentNames[i], testScores[i]);

	}

scanner.close();
	
	}


// A method that calculates and returns the average of the 
//test scores. The method will need the test score array.




//public void average() {
public double calculateAverageScore(double[] testScores) { // scorePiles are the test scores in total 
	// adds a number to to the sumtotal
	double cardsUltimatelyInDeck = 0;
	int numStudents = testScores.length;
	for (int i = 0; i < testScores.length; i++ ) { 


	//sumTotal =+ sumTotal / sumTotal.length;
		cardsUltimatelyInDeck += testScores[i];
	}
	
	
	
	double average = cardsUltimatelyInDeck / testScores.length;   // calculating the average

	// the .length priortie is to count the size of number of element in array its variable is .
	
	//int count = 0;

System.out.println("average is : " +average);
return average;
}

}

