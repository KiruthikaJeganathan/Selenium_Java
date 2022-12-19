package week3.day2.assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargestNumberSetList {

	public static void main(String[] args)
	{
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};

		Set<Integer> set = new TreeSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();

		for(int i = 0; i < data.length; i++)
		{
			set.add(data[i]);
		}

		list.addAll(set);
		Collections.sort(list);

		int j = list.size()-1;
		System.out.println(list);		
		System.out.println(list.get(j-1));
	}
}