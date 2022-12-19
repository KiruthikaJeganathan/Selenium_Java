package week3.day2.assignment1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesSet {

	public static void main(String[] args)
	{
		String st = "PayPal India";
		st = st.replaceAll("\\s", "");

		char[] arr = st.toCharArray();

		Set<Character> set = new LinkedHashSet<Character>();
		Set<Character> dupSet = new LinkedHashSet<Character>();

		for(int i = 0; i < arr.length; i++)
		{
			if(!set.add(arr[i]))
			{
				dupSet.add(arr[i]);
			}
		}

		set.removeAll(dupSet);

		System.out.println(set);
		System.out.println(dupSet);
	}
}