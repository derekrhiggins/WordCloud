package ie.gmit.dip;

import java.io.BufferedReader;
import java.io.File;

import java.lang.Exception;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.System;


import javax.imageio.ImageIO;

/**
 * Takes program flow from the Runner class and executes the methods necessary to generate the Word Cloud.
 * 
 * @author derek
 *
 */

public class Commands {

	/**
	 * Takes the command passed to it as a String argument.
	 * 
	 * @param Arguments The command to be executed.
	 * @throws Exception if passed command is unknown.
	 */
	public static void DoCommand(String Arguments) throws Exception { // Method for acting on user input


		String[] arr = Arguments.toLowerCase().split(" "); //Split input into arguments

		try { // TRY/CATCH FOR ERRORS LIKE 'SET' WITH NO ARGUMENT
			switch (arr[0]) {

			case "run": // Run the word cloud

				new IgnoreFileParse();
				
				Menu.showMenu();

				new WordQueue().sortMap();
				
				WordCloudImage img = new WordCloudImage();
				img.drawString(WordQueue.getWordQueue(), Menu.getMaxWords());
				
				ImageIO.write(img.getImage(), "png", new File(Menu.getUserImageName())); 
				break;


			default: // Unknown command
				System.out.println("Unknown Command");
				System.out.println();
			}
			
		} catch (ArrayIndexOutOfBoundsException e) { // Usually thrown by no argument on SET
			System.out.println(ConsoleColour.RED_BOLD);
			System.out.println("SET commands requires an argument.");
			System.out.print(ConsoleColour.RESET);
			arr[0] = null; // Set the commands received back to nothing
			
		} catch (IOException e) { // Error loading input file. Possibly output/write issues also?
			System.out.println(ConsoleColour.RED_BOLD);
			System.out.println("Unable to load selected input file. Please check settings.");
			System.out.println(ConsoleColour.RESET);
		}
	}
}
