package week3.day2;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromStringUsingSet {

	public static void main(String[] args)
	{
		String companyName = "google";
		char[] ca = companyName.toCharArray();

		Set<Character> uniqueCharacters = new LinkedHashSet<Character>();

		for(int i = 0; i < ca.length; i++)
		{
			uniqueCharacters.add(ca[i]);
		}

		for (Character character : uniqueCharacters) {
			System.out.print(character);
		}
	}
}