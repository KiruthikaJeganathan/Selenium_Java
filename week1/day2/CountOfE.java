package week1.day2;

public class CountOfE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "hexaware";
		char expected = 'e';
		char[] charArray = name.toCharArray();
		int count = 1;
		for(int i=0; i<charArray.length-1; i++)
		{
			if(charArray[i]==expected)
			{
				count++;
			}
		}

		System.out.print(count);
	}
}