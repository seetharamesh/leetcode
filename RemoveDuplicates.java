package leetpractice;
import java.util.*;
import java.util.stream.Collectors;
//remove duplicates in sorted non decreasing order array
public class RemoveDuplicates {
	public int removeDuplicates(int[] nums) {
		int countdup = 0;
		if (nums.length == 0) return 0;
	    int i = 0;
	    for (int j = 1; j < nums.length; j++) {
	        if (nums[j] != nums[i]) {
	            i++;
	            nums[i] = nums[j];
	        }
	        else {
	        	countdup++;
	        }
	    }
	    for(int k: nums)
	    	System.out.print(k + " ");
	    System.out.println("num of dup is:" + countdup);
	    return i + 1;
		
		
//		boolean dupflag = false;
//		int dup_pos=0;
//		
//		for(int i=0;i < nums.length-1;i++) {
//			if(dupflag) {
//				nums[dup_pos]=nums[i+1];
//			}
//			if(nums[i] != nums[i+1]) resultsize++;
//			else {
//				dup_pos = i+1;
//				dupflag=true;
//				resultsize++;
//			}
//			
//		}
//		
//		
//		
//		System.out.println(resultsize+"***");
//		for(int p: nums)
//			System.out.print(p+" ");
		
		
		
		
		
		
//        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
//        for(int i: set)
//            System.out.println(i);
//        return set.size();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,2,3,5,6,6};
		RemoveDuplicates rd = new RemoveDuplicates();
		int k = rd.removeDuplicates(arr);
		System.out.println("\n"+k);

	}

}
