import java.util.Scanner;

	/* Exercise 2
	 * Design and implement an application that reads an integer value and 
	 * prints the sum of all even integers between 2 and the input value, 
	 * inclusive. Print an error message if the input value is less than 2 
	 * and have the user reenter the number. Prompt accordingly. 
	 * Call this EvenNumSum.java
	 */

public class EvenNumSum {

	public static void main(String[] args) {
		
		 // Creating variables 
		
		 int number; 
		 int i =0; 
		 int total =0; 
		 
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.print("Enter an integer greater than 2: ");
		 number = scan.nextInt();
		 
		 // Inserting a while loop to make sure the inputed number is greater than 2 
		 while (number < 2)
			{
				System.out.println("Error. Number less than 2. ");
				System.out.print("Please enter a number greater than 2: ");
				number = scan.nextInt();
			}	
		 
		 // Adding the for loop to add every number that is divisible by 2 without a remainder
		 for (i = 0; i <= number; i++)
		 {
			 if (i % 2 != 0);
			 else 
				 total = total + i; 
		 }
		 
		 System.out.print("The sum of the even numbers is " + total);
		 
		 scan.close();
	}
}