import java.util.Random;
import java.util.Scanner;

	/* Exercise 1
	 * In the AgeGuess.java program from the previous lab, 
	 * insert a while loop so that the user has to keep guessing 
	 * the age until he or she gets it right.
	 */

public class AgeGuess {

	public static void main(String[] args) {
		
		// Created a new variable age
		
		int ageGuess;
		int age; 
		
		Scanner scan = new Scanner(System.in);
		
		// Saves the users guess into the ageGuess variable 
		
		System.out.print("Enter a guess for Age: ");
		ageGuess = scan.nextInt();
		
		
		Random rand = new Random();
	
		// Initializes age to a random variable between 0 and 100
		
		int upperbound = 101;
		age = rand.nextInt(upperbound);

		// Incorporating a while loop for the user to keep guessing the age
		
		while ( age != ageGuess) 
		{
			System.out.println("Incorrect guess. Try again! ");
			System.out.print("Guess the age: ");
			ageGuess = scan.nextInt();
		}	
	
	}

}
