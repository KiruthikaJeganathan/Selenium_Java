package week3.day2.assignment2;

import java.util.Map;
import java.util.TreeMap;

public class FindNumberOfOccurencesMap {

	public static void main(String[] args)
	{
		int[] input = {2,3,5,6,3,2,1,4,2,1,6,-1};

		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

		for(int i = 0; i < input.length; i++)
		{
			int value = 1;

			if(map.containsKey(input[i]))
			{
				map.put(input[i], value + 1);
			}
			else
			{
				map.put(input[i], value);
			}
		}

		System.out.println(map);
	}
}