package week1.day1.assignment;

public class IsPrime {

	public static void main(String[] args) {
		int n=10;

		for(int i=2; i<=n-1; i++)
		{
			int count=0;
			for(int j=1; j<=i; j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i+" is prime");
			}
			else
				System.out.println(i+" is non-prime");
		}
	}
}