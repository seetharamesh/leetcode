package leetpractice;

public class MoveZeros {
	 public void moveZeroes(int[] nums) {
	        
		 int count = 0;
		 for(int j = 0; j<nums.length; j++) {
			 if(nums[j] != 0) {
				 nums[count++] = nums[j];
			 }
		 }
		 //remaiining zeros
		 for(int i = count; i < nums.length; i++)
			 nums[i] = 0;
		 
		 for(int p: nums)
			 System.out.println(p);
		 
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,0,3,12};
		MoveZeros mz = new MoveZeros();
		mz.moveZeroes(nums);
		
	}

}
