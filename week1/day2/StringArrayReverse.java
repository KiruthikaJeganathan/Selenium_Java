package week1.day2;

import com.fasterxml.jackson.core.sym.Name1;

public class StringArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Amazon development center, Chennai";

		String name1 = name.toLowerCase();

		String[] nameArray = name1.split(" ");

		for(int i=nameArray.length-1; i>=0; i--)
		{
			System.out.print(nameArray[i] + " ");
		}
	}
}