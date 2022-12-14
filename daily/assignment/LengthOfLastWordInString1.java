package daily.assignment;

public class LengthOfLastWordInString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello World";

		//"Hello World" --> 5
		//"   fly me   to   the moon  " --> 4
		//"luffy is still joyboy" --> 6

		String[] strArr = s.split(" ");

		for(int i=strArr.length-1; i>=0; i--)
		{
			System.out.println(strArr[i].length());
			break;
		}
	}
}