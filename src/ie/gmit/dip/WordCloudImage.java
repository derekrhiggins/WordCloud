package ie.gmit.dip;

import java.util.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Generates the image of the wordcloud.
 * 
 * @author derek
 *
 */
public class WordCloudImage 
{

	private static final double maxFont = 60;
	private static final double minFont = 12;
	private BufferedImage image;
	
	/**
	 * Creates a new WordCloudImage object.
	 */
	public WordCloudImage() 
	{
		image = new BufferedImage(640, 480, BufferedImage.TYPE_4BYTE_ABGR);
	}

	/**
	 * For accessing the generated image.
	 * @return the generated image.
	 */
	public BufferedImage getImage() 
	{
		return image;
	}
	
	/**
	 * Iterates over the parsed words adding strings to the image.
	 * @param q The PriorityQue of Parsed Words automatically sorted by frequency
	 * @param maxWords the number of words to be displayed in the image.
	 */
	public void drawString(Queue<ParsedWord> q, int maxWords) 
	{
		int i = 0;
		int count = 0;
		int max = 0;
		int min = 0;
		
		Graphics2D graphics = image.createGraphics(); 

		graphics.setColor(Color.WHITE);
		graphics.fillRect(0, 0, 640, 480);
		
		ParsedWord wordFrequency = new ParsedWord();
		
		Iterator<ParsedWord> iterator = q.iterator(); 
		
		Random r = new Random();
		
		while (iterator.hasNext() && count < maxWords) 
		{ 
			i = iterator.next().getFrequency();
		
			if (i > max) {
				max = i;
			}
			
			if (i < min) {
				min = i;
			}
			
			while ((!q.isEmpty()) && count < maxWords)
			{  
				wordFrequency = q.poll();
				graphics.setColor(Color.BLACK); // color of word
				graphics.setFont(new Font(Font.SERIF, Font.BOLD, fontSize(wordFrequency.getFrequency(), min, max)));
				graphics.drawString(wordFrequency.getWord(), r.nextInt(500-100)+100, r.nextInt(400-50)+50); // Word Placement
				count++;
			}	
		}
		graphics.dispose();
	}
	
	private int fontSize(double freq, int min, int max) //Change font size based on frequency
	{
		return (int) Math.ceil((maxFont - minFont) * (freq - min) / (max - min) + minFont);
	}
}
