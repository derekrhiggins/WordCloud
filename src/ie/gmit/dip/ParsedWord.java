package ie.gmit.dip;

import java.util.*;
/**
 * Class for storing and manipulating words that have been parsed.
 * 
 * @author derek
 *
 */
public class ParsedWord implements Comparable<ParsedWord> 
{

	private String word;
	private int frequency;
	
	/**
	 * Creates an empty ParsedWord object.
	 */
	public ParsedWord() {
		//Initiate an empty object
	}
	
	/**
	 * Creates a ParsedWord object that will update the Map to add the word and its frequency.
	 * 
	 * @param word the word to be added. Duplicate entries are not possible.
	 * @param frequency the new frequency to be stored.
	 */
	public ParsedWord(String word, Integer frequency) 
	{
		setWord(word);
		setFrequency(frequency);
	}
	
	/**
	 * returns the word of this object.
	 * @return word from the Map.
	 */
	public String getWord() 
	{
		return word;
	}
	
	/**
	 * Set the word for this object.
	 * @param word stored in this object.
	 */
	public void setWord(String word) 
	{
		this.word = word;
	}
	
	/**
	 * returns the frequency of this stored word.
	 * @return frequency that this word occurs.
	 */
	public int getFrequency() 
	{
		return frequency;
	}
	
	/**
	 * Sets the frequency of occurence stored for this word.
	 * @param frequency the number of occurrences recorded and to be stored.
	 */
	public void setFrequency(int frequency) 
	{
		this.frequency = frequency;
	}
		
	Map<String, Integer> map = new HashMap<String, Integer>();
	Queue<ParsedWord> pq = new PriorityQueue<>();
	
	Set<String>keys = map.keySet();
	{
		for(String key:keys) 
		{
			pq.offer(new ParsedWord(key, frequency)); // O(log(n)) operation
		}
	}
	
	
	@Override
	public int compareTo(ParsedWord word) 
	{
		return word.frequency - this.frequency;
	}

}

