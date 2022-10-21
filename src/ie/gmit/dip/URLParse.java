package ie.gmit.dip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Parses a URL.
 * 
 * @author derek
 *
 */

public class URLParse extends SourceParse {

	/**
	 * Must be implemented from the abstract class. Inherited from interface.
	 */
	@Override
	public void parse() throws IOException {
		// TODO Auto-generated method stub
	}
	
	/**
	 * Must be implemented from the abstract class.
	 */
	@Override
	public void parse(InputStream in) throws IOException {
		// TODO Auto-generated method stub
		super.parse(in);
	}
	

	/**
	 * Parses a URL
	 * 
	 * @param file the java.NET type URL to be parsed
	 * @throws Exception on error access file
	 */
	public void parse(URL file) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(file.openStream()));
			
		String line = null;
		
		try {
			while((line = br.readLine()) != null) 
			{
				String[] words = line.split(" ");
				
				for(String word:words) {
					
					if (word.toLowerCase().matches("[a-z]+")) {
						if(!IgnoreFileParse.check(word.toLowerCase())) // O(Log N) as its a treeset
						{
							WordMap.add(word.toLowerCase());
						}
					}
				}				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 	
	}
}
