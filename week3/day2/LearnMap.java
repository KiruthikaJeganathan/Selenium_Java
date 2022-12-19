package week3.day2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {

	public static void main(String[] args)
	{
		Map<Integer, String> mentors = new LinkedHashMap<Integer, String>();
		mentors.put(20201920, "Ram"); // equivalent of add in List, Set
		mentors.put(20201921, "Princilla");
		mentors.put(20201922, "Aravind");
		mentors.put(20201923, "Subraja");
		mentors.put(20201924, "Dhilip");
		mentors.put(20201925, "Easwar");
		mentors.put(20201926, "Ranjani");
		mentors.put(20201927, "Aravind");
		mentors.put(20201922, "Babu"); // When you like to update the map, use the same key with different value

		System.out.println(mentors.size());

		for (Entry<Integer, String> i : mentors.entrySet()) {
			System.out.println(i.getKey() + " " + i.getValue());
		}
	}
}