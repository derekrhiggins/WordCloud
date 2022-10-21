package ie.gmit.dip;

import java.io.IOException;
import java.io.InputStream;

/**
 * Parses a .txt file
 * 
 * @author derek
 *
 */

public class TextFileParse extends SourceParse {

	/**
	 * Must be implemented from the abstract class. Inherited from interface.
	 */
	@Override
	public void parse() throws IOException {
		// TODO Auto-generated method stub
		
	}
	
	
	/**
	 * Takes an InputStream and parses it.
	 */
	@Override
	public void parse(InputStream in) throws IOException {
		// TODO Auto-generated method stub
		super.parse(in);
		in.close();
		//System.out.println("TextFile Parsed. Size" + WordMap.wordMap.size());
	}
	


	
	
}
