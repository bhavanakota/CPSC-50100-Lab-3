	/* Exercise 4: Create a project with a class called Box (w/ main)
	 * that contains the following instance variable: int size = 0;
	 * Then add a method to this class named printBox with no parameters 
	 * and void return type, that prints out to the screen a set of * (star) 
	 * characters with size rows and size columns. Enter code in the main 
	 * method to create a Box object, change its size to 5 (using the dot operator), 
	 * and then invoke its printBox method. Run the program and fix any errors you may have.
	 */

public class Box {

	// Creating the variable size 
	static int size = 0;
	
	public static void main(String[] args) 
		{ 
		
		// Creating the object box and then setting the size equal to 5
		Box box = new Box(); 
			
		box.size = 5; 
		
		// Printing the box 
		printBox(); 
			
		}
	
		// Creating the new method printBox 
		public static void printBox() 
		{ 
			
		// Creating a for loop to repeat until size requirement is fulfilled 
			for (int i = 0; i < size; i++)
			{
				for (int j = 0; j < size; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
