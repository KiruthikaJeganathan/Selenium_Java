package week3.day2.assignment2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.collections4.iterators.EntrySetMapIterator;

public class FindMostDuplicateCharacterMap {

	public static void main(String[] args)
	{
		String s = "abbabab";

		char[] c = s.toCharArray();

		int value = 1;

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for(int i = 0; i < c.length; i++)
		{
			if(map.containsKey(c[i]))
			{
				value = map.get(c[i]);
				map.put(c[i], value+1);
			}
			else
			{
				map.put(c[i], 1);
			}
		}

		System.out.println(map);

		int max=(Collections.max(map.values()));  // This will return max value in the HashMap
		for (Entry<Character, Integer> entry : map.entrySet())
		{  
			if (entry.getValue()==max)
			{
				System.out.println(entry.getKey());
			}
		}
	}
}