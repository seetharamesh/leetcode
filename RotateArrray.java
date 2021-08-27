package leetpractice;

public class RotateArrray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5,6,7};
		int k = 3;
		
		//using brute force swap technique
		
//		for(int i=0; i<k;i++) {
//			int lastelm = nums[nums.length -1];
//			for(int j=0; j<nums.length; j++) {
//				int temp = nums[j];
//				nums[j]= lastelm;
//				lastelm = temp;
//			}
//		}
		


		//using o(n) complexity
		int[] a = new int[nums.length];
	    for (int i = 0; i < nums.length; i++) {
	      a[(i + k) % nums.length] = nums[i];
	    }
	    //copying back to nums array according to problem
	    for (int i = 0; i < nums.length; i++) {
	      nums[i] = a[i];
	      System.out.println(nums[i]);
	    }
		
		
		
		
		
		
//		if(nums.length > 2){
//	       
//			int backindex=0;
//	        if(k == nums.length +1) backindex=nums.length-1;
//	        else backindex = nums.length - k;
//	        
//			int[] temp = new int[nums.length];
//			
//			int j=0;
//			for(int i =backindex; i <=  nums.length-1;i++) {
//				temp[j]=nums[i];
//				j++;
//				
//			}
//			//System.out.println(j);
//			for(int m = 0; m <= backindex-1; m++) {
//				temp[j]=nums[m];
//				j++;
//			}
//	        //copy back to nums array
//	        for(int p=0; p <nums.length;p++)
//	            nums[p] =temp[p];
//	}
//		if((k==3 || k==1)&& nums.length ==2){
//            int temp = nums[0];
//            nums[0]=nums[1];
//            nums[1]=temp;
//        }
//}
}
}
