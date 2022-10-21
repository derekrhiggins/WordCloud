package ie.gmit.dip;

import java.util.*;

import java.util.Set;
/**
 * Creates a PriorityQueue object from the wordmap which is stored a s a TreeSet and automatically sorted by frequency.
 * 
 * @author derek
 *
 */
public class WordQueue {

private static Queue<ParsedWord> pq = new PriorityQueue<>(); // What is the O notation of this?
	
	/**
	 * Sorts the WordMap by keys into a PriorityQueue. Operates in O(Log(n)) time.
	 */
	public void sortMap() // // O(Log(n)) - Places words into the queue sorted by their frequency, Javadocs says O(Log(n)) operation for this offer method.
	{
		Set<String> keys = WordMap.wordMap.keySet(); // O(1)
		
		for(String key : keys) 
		{
			pq.offer(new ParsedWord(key, WordMap.wordMap.get(key))); // O(log(n))
		}	
	}
	/**
	 * Returns the PriorityQueue object.
	 * @return the sorted queue of words in descending order.
	 */
	public static Queue<ParsedWord> getWordQueue() 
	{
		return pq;
	}
}


