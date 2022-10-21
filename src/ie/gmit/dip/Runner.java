package ie.gmit.dip;


import java.lang.Exception;

/**
 * Generates a word cloud image using the supplied source file or URL to a .PNG 
 * file named as specified during run-time. The number of words shown in the 
 * word cloud is variable and requested during execution. The words are shown
 * in the word cloud in descending order based on their frequency of appearance 
 * within the supplied source file.
 * 
 * @author Derek Higgins
 * @version 1.0
 */

public class Runner { 
	
	/**
	 * Main method executes SplashScreen and loads the menu interface for the user.
	 * 
	 * @param args Command line arguments are not utilised within the code.
	 * @throws Exception typically due to errors reading source file from path or URL.
	 */
	public static void main(String[] args) throws Exception 
	{
			new SplashScreen(); // Display the starting splash

			Commands.DoCommand("run");
			
			System.out.println();
			System.out.println("Operation Complete. Goodbye!");
	}
}