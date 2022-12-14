package daily.assignment;

import java.util.Arrays;


public class FindUniqueElementInArray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {2,2,1};
		
		//nums = (2,2,1} --> 1
		//nums = {4,1,2,1,2} --> 4
		//nums = {1} --> 1
				
		for(int i=0; i<nums.length; i++)
		{
			int count = 1;
			for(int j=0; j<nums.length; j++)
			{
			if(nums[i] == nums[j] && i!=j)
			{
				count++;
				break;
			}
			}
			if(count==1)
			{
				System.out.println(nums[i]);
			}
	   }
	}
}