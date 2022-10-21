package ie.gmit.dip;

import java.io.*;
import java.net.URL;
import java.util.*;
/**
 * Class that displays menu interface for user.
 * 
 * @author derek
 *
 */
public class Menu 
{
	private static Scanner console = new Scanner(System.in);
	
	private static String userFile;
	private static String userImage;
	private static int maxWords;
	
	/**
	 * Displays the menu for user to interact with.
	 * 
	 * @throws Exception on incorrect input data.
	 * @throws IOException on failure to access files.
	 */
	public static void showMenu() throws Exception, IOException 
	{
		int option;
		
		System.out.println("Enter 1 to parse a file; 2 to parse a URL; or -1 to exit: ");
		option = console.nextInt();
		
		if(option == 1) {
			System.out.println("Option 1: Parse a file has been selected...");
			setUserFileName();
			setUserImageName();
			setMaxWords();
			
			new TextFileParse().parse(new FileInputStream(Menu.getUserFileName()));
			
		}
		
		else if(option == 2) {
			System.out.println("Option 2: Parse a URL has been selected...");
			setUserFileName();
			setUserImageName();
			setMaxWords();
			
			new URLParse().parse(new URL(Menu.getUserFileName()));	
			
		}
		
		else if(option == -1)
		{
			System.exit(0);
			
		}
		else
		{
			System.out.println("Incorrect option / try again");
			showMenu();
		}
	}
	
	/**
	 * Returns a string of the filename provided by the user.
	 * @return file name input by user.
	 */
	public static String getUserFileName() 
	{
		return userFile;
	}

	/**
	 * Sets the filename to be accessed as supplied by the user.
	 */
	public static void setUserFileName() 
	{
		Scanner console = new Scanner(System.in);
		String userFileName;
				
		System.out.println("Please enter the path of the file including extension: ");
		
		userFileName = console.nextLine();
		userFile = userFileName;
	
	}
	
	/**
	 *  Returns image name input by user 
	 * @return name of the file to be created.
	 */
	public static String getUserImageName() 
	{ 
		return userImage;
	}
	
	/**
	 * Sets the image name to be created as defined by the user.
	 */
	public static void setUserImageName() 
	{
		Scanner console = new Scanner(System.in);
		String userImageName;
		
		System.out.println("Please enter the name for the output image excluding extension: ");
		userImageName = console.nextLine();
			
		userImageName += ".png";
		userImage = userImageName;
		
		
	}
	/**
	 * Returns the Max Words to be included in the Word Cloud.
	 * @return Max Words to be shown.
	 */
	public static int getMaxWords() 
	{
		return maxWords;
	}
	
	/**
	 * Sets the Max Words to be shown in the Word Cloud. 
	 */
	public static void setMaxWords() 
	{
		Scanner console = new Scanner(System.in);
		int maxWordsAllowed;
		
		System.out.println("Please enter the amount of words desired in the wordcloud: ");
		maxWordsAllowed = console.nextInt();
		
		maxWords = maxWordsAllowed;
	}
}
