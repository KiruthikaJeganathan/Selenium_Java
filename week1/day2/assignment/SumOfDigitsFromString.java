package week1.day2.assignment;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "Tes12Le79af65";
		int sum = 0;

		for(int i=0; i<text.length(); i++)
		{
			if(Character.isDigit(text.charAt(i)))
			{
				sum=sum+Character.getNumericValue(text.charAt(i));
			}
		}
		System.out.println("Sum of digits of a given string " + text + " is " + sum);
	}
}