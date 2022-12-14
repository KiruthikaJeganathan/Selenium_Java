package daily.assignment;

public class ReturnMajorityElement6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {3,2,3};
		//nums = {2,2,1,1,1,2,2};
		int n = nums.length;
		int maxCount = 0;
		int index = 0;

		for(int i=0; i<nums.length; i++)
		{
			int count = 0;
			for(int j=0; j<nums.length; j++)
			{
				if(nums[i]==nums[j])
				{
					count++;
				}
			}
			if (count > maxCount)
			{
				maxCount = count;
				index = i;
			}
		}
		if (maxCount > n / 2)
			System.out.println(nums[index]);

		else
			System.out.println("No Majority Element");
	}
}