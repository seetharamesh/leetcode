package leetpractice;


	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.*;


	public class TwoSum {

		public int[] twoSum(int[] nums, int target) {
			HashMap<Integer, Integer> hm = new HashMap<>();
			for(int i=0;i<nums.length;i++) {
				int diff = target - nums[i];
				if(hm.containsKey(diff)) {
					
					int[] result = {hm.get(diff),i};
					return result;
					
				}
				hm.put(nums[i],i);
			}
			return null;
		  }
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			    TwoSum ts = new TwoSum();
			    int[] nums = {2,7,11,15};
			    //int[] result = {};
			    int results[] = new int[] {0,0};
			     results = ts.twoSum(nums, 26);
			     
			     for(int r: results) {
			    	 System.out.println(r);
			     }

		}
	}
