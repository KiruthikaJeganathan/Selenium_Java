package week3.day2.assignment1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrintUniqueCharactersSet {

	public static void main(String[] args)
	{
		String name = "kiruthika";

		char[] arr = name.toCharArray();

		Set<Character> sh = new HashSet<Character>();
		Set<Character> st = new TreeSet<Character>();

		for(int i = 0; i < arr.length; i++)
		{
			if(sh.contains(arr[i]))
			{
				sh.remove(arr[i]);
				st.remove(arr[i]);
			}
			else
			{
				sh.add(arr[i]);
				st.add(arr[i]);
			}
		}

		System.out.println(sh);
		System.out.println(st);
	}
}