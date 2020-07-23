import java.util.Scanner;

	/*	Exercise 3 
	 * 	Design and implement an application that reads a string 
	 *	from the user and then determines and prints how many of
	 *  each lowercase vowel (a, e, i, o, and u) appear in the 
	 *  entire string. Have a separate counter for each vowel. 
	 *  Also count and print the number of non-vowel characters. 
	 *  Call this VowelCounter.java
	 */

public class VowelCounter {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a sentence: ");
		String Sentence = scan.nextLine();
		
		scan.close();
		
			int aCount = 0;
			int eCount = 0;
			int iCount = 0; 
			int oCount = 0; 
			int uCount = 0; 
			int i = 0;
			int non = 0;
			
		// Using the for loop with else statements to count each variable
			
		for (i = 0; i < Sentence.length(); i++)
			{ char c = Sentence.charAt(i); 
		
				if (c == 'a')
					aCount ++ ;
				
				else if (c == 'e')
				{
					eCount ++ ;
				}
				
				else if (c == 'i')
				{	
					iCount ++ ;
				}
				
				else if (c == 'o')
				{	
					oCount ++;
				}
				
				else if (c == 'u')
				{
					uCount ++;
				}
				
				else 
				{
					non ++;
				}
			}
		
		System.out.print("Number of  a's in the string: " + aCount +"\n");
		System.out.print("Number of  e's in the string: " + eCount +"\n");
		System.out.print("Number of  i's in the string: " + iCount +"\n");
		System.out.print("Number of  o's in the string: " + oCount +"\n");
		System.out.print("Number of  u's in the string: " + uCount +"\n");
		System.out.print("Number of non vowels in the string: " + non +"\n");
	}	 
	
}	
