package week1.day2.assignment;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "madam";

		String rev = "";

		char[] charArray = text.toCharArray();

		for(int i=text.length()-1; i>=0; i--)
		{
			rev = rev+text.charAt(i);
		}

		if(text.equalsIgnoreCase(rev))
		{
			System.out.println(text + " is a Palindrome");
		}
		else
		{
			System.out.println(text + " is not a Palindrome");
		}
	}
}