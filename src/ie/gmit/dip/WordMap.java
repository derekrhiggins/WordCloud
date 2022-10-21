package ie.gmit.dip;

import java.util.Map;
import java.util.TreeMap;
/**
 * Maps words as keys to frequencies as values.
 * 
 * @author derek
 *
 */
public class WordMap {
	
	/**
	 * Creates a Map of type TreeMap.
	 */
	public static Map<String, Integer> wordMap = new TreeMap<>(); //Wordmap - Maps Words as Keys to Frequencies
	
	/**
	 * Add words to the map. Will increment their value if already present. Operates in O(1) constant time.
	 * 
	 * @param word the word to be added to the map.
	 */
	public static void add(String word) { //O(1) operation
		
		int frequency = 1;
		
		if(wordMap.containsKey(word)) {
			frequency = wordMap.get(word);
			wordMap.put(word, ++frequency);
		} else {
			wordMap.put(word, 1); //Put the word into the map with a frequency of 1
		}
		
		//System.out.println("Added word: " + word + " Freq: " + frequency + " Map Size: " + wordMap.size());
	}
}
