package week1.day2.assignment;

public class ReverseEvenWordsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "I am a software tester";

		String[] testArr = test.split(" ");

		String rev = "";

		for(int i=0; i<testArr.length; i++)
		{
			if(i%2==1)
			{
				rev = rev + new StringBuilder(testArr[i]).reverse().toString() + " ";				
			}
			else
			{
				rev = rev + testArr[i] + " ";
			}
		}
		System.out.println(rev.trim());
	}
}