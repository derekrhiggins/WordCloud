package ie.gmit.dip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
/**
 * Abstract class for parsing sources of text such as files or URLs
 * @author derek
 *
 */
public abstract class SourceParse implements Parse {

	/**
	 * Parses an inputstream
	 * 
	 * @param in source of text data.
	 * @throws IOException on failure to access files.
	 */
	public void parse(InputStream in) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String line = null;
		
		try {
			while((line = br.readLine()) != null) 
			{
				String[] words = line.split(" ");
				
				for(String word:words) {
					if(!IgnoreFileParse.check(word.toLowerCase())) // O(Log N) as its a treeset
					{
						WordMap.add(word.toLowerCase());
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
