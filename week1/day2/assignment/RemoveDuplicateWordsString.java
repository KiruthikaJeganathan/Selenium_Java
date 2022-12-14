package week1.day2.assignment;

public class RemoveDuplicateWordsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "We learn java basics as part of java sessions in java week1";

		String[] textArr = text.split(" ");

		int count=0;
		for (int i = 0; i<textArr.length; i++)
		{
			for (int j = i + 1; j<textArr.length; j++)
			{
				if ((textArr[i].equalsIgnoreCase(textArr[j])))
				{
					textArr[j]="";
				}
			}

			if(count>=1 || textArr[i] != "")
			{
				System.out.print(textArr[i] + " ");
			}
		}
	}
}