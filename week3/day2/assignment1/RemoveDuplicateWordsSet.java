package week3.day2.assignment1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWordsSet {

	public static void main(String[] args)
	{
		String text = "We learn java basics as part of java sessions in java week1";
		String[] s = text.split(" ");

		Set<String> st = new LinkedHashSet<String>();

		for(int i = 0; i < s.length; i++)
		{
			st.add(s[i]);
		}

		System.out.println(st.toString().replace(",", ""));

		/*for (String s1 : st)
		{
			System.out.print(s1 + " ");
		}*/
	}
}