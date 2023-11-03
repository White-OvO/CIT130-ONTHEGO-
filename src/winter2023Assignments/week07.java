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
		System.out.println("Invalid input. Please enter a valid number of students: ");
        students = scanner.nextInt();
		
		
	}
	if (students == 1){ 
		System.out.println("Enter the name of the student followed by test score\n");
	}

	else { 
		System.out.println("Enter the amount of name of the " + students + " students followed by test score \n");
	}
	
	
	
	
	/*
	//////////////////////////////////////////////////////////////////
	//			Declaration of varriables
	//////////////////////////////////////////////////////////////////
*/
	
	
	
	String[] studentNames = new String[students];
	
	
	/*
	// we need to read both but individually 
	*/
	
	
	double [] testScores = new double[students];

	
	
	
	/*
	
	///     giving each student a name and test score
*/
/*	
	/// reading the input for the students
*/	
	

/*	//////////////////////////////////////////////////////////////////
	//			looping for name and test score to store in variable
	//////////////////////////////////////////////////////////////////
*/	
	
	
	
	for (int i = 0 ; i < students; i++ ) { 
	System.out.println("Enter the name of student "+ (i +1) + " : ");
	studentNames[i] = scanner.next(); 
	
	System.out.println("Enter test score of student " + (i + 1) + " : " );
	testScores[i] = scanner.nextDouble();
	
	}
	
	System.out.println("\n");
	System.out.println("*** here is what I have for your data ***");
	

/*
	//////////////////////////////////////////////////////////////////
	//			loops the name of the name and test score to output
	//////////////////////////////////////////////////////////////////
*/	
	
	for (int i = 0; i < students; i++) { 
//System.out.println("*** Sorted data ***\n");
		System.out.printf("%s  %.2f\n", studentNames[i], testScores[i]);

	}
    double averageScore = calculateAverageScore(testScores);
//scanner.close();
	System.out.println("average is : " +averageScore);
	scanner.close();
	}

/*
// A method that calculates and returns the average of the 
//test scores. The method will need the test score array.
*/



public static double calculateAverageScore(double[] testScores) { 

	double sum = 0;

	for(double score : testScores) { 
		sum += score;

	}
	
	
	
	double average = sum / testScores.length;   // calculating the average

	
	return average;
	}

}

