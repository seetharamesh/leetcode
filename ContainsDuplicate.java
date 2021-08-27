package leetpractice;

import java.util.Arrays;

public class ContainsDuplicate {

	public boolean checkdup(int[] nums) {
		//another way to solve
		
		Arrays.sort(nums);
		for(int i = 1; i < nums.length; i++) {
			if(nums[i-1] == nums[i])
				return true;
		}
			return false;
			
			
			
			
		
		
		
		
//	boolean flag = false;
//	
//		for(int i=0; i < nums.length; i++) {
//			int c = nums[i];
//			for(int j = i+1; j < nums.length;j++) {
//				if(nums[j] == c) {
//					flag = true;
//					break;
//				}
//				
//		}
//			if(flag)return true;
//		}
//			
//		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4};
		ContainsDuplicate cd = new ContainsDuplicate();
		boolean result = cd.checkdup(nums);
		System.out.print(result);
	}

}
