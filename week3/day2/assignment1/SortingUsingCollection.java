package week3.day2.assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args)
	{
		List<String> cmp = new ArrayList<String>();

		cmp.add("HCL");
		cmp.add("Wipro");
		cmp.add("Aspire Systems");
		cmp.add("CTS");

		//System.out.println(cmp);

		Collections.sort(cmp);
		Collections.reverse(cmp);

		System.out.println(cmp);

	}
}