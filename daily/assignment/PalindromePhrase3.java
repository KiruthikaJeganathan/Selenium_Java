package daily.assignment;

public class PalindromePhrase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "A man, a plan, a canal: Panama";

		//"A man, a plan, a canal: Panama" --> Palindrome
		//"race a car" --> Not a Palindrome
		//" " --> Palindrome

		String s1 = s.toLowerCase();
		String s2 = "";
		String s3 = "";

		char[] ca = s1.toCharArray();

		for(int j=0; j<s1.length(); j++)
		{
			if(Character.isAlphabetic(s1.charAt(j)))
			{
				s3=s3+s1.charAt(j);
			}
		}

		for(int i=s1.length()-1; i>=0; i--)
		{
			if(Character.isAlphabetic(s1.charAt(i)))
			{
				s2=s2+s1.charAt(i);
			}
		}

		if(s2.equalsIgnoreCase(s3))
		{
			System.out.println("True");
			System.out.println(s + " is a Palindrome");
		}
		else
		{
			System.out.println("False");
			System.out.println(s + " is not a Palindrome");

		}
	}
}