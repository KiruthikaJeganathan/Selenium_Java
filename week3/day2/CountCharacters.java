package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountCharacters {

	public static void main(String[] args)
	{
		String company = "amazon development center"; // a -> 2, m -> 2, . . .
		char[] ch = company.toCharArray();

		Map<Character, Integer> charCount = new HashMap<Character, Integer>();

		for(int i = 0; i < ch.length; i++)
		{
			int value = 1;
			if(charCount.containsKey(ch[i]))
			{
				charCount.put(ch[i], value+1);
			}
			else
			{
				charCount.put(ch[i], value);
			}
		}
		System.out.println(charCount);
	}
}