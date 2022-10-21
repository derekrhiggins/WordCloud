package ie.gmit.dip;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

/**
 * Parses ignore file creating Set of words to be ignored.
 * 
 * @author derek
 *
 */
public class IgnoreFileParse extends SourceParse {
	
	/**
	 * Path of the file containing the ignorewords.
	 */

	public static final String ignoreWordsFile = "ignorewords.txt"; 
	
	private static Set<String> ignoreWords = new TreeSet<String>(); 
	
	IgnoreFileParse() {
		try {
			parse();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Check if the word passed as argument is in the Set of words to be ignored. Operates in O(Log(n)) time.
	 * 
	 * @param word Word to be checked if present.
	 * @return True / False
	 */
	public static boolean check(String word) { //O(Log(n)) operation -- check if TreeSet contains the word
		
		if (ignoreWords.contains(word)) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public void parse() throws IOException{

			BufferedReader ignoreFile = new BufferedReader(new FileReader(ignoreWordsFile));
			String next = null;

			while ((next = ignoreFile.readLine()) != null) 
			{
				if (next.isEmpty()) //just do action if not empty and drop the continue?
				{
					continue;
				}
				
				ignoreWords.add(next.toLowerCase()); // This is an O(1) constant time operation.
			}
			//System.out.println("Ignore file has been parsed. Size: " + ignoreWords.size());
			ignoreFile.close();
	}
}
