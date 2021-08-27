package leetpractice;
import java.util.*;
public class CountDuplicates {
	public int countDuplicates(int[] nums) {
        int i=0,count=0;
        HashSet<Integer> hs = new HashSet<>();
        
        for(int j = 1; j<nums.length;j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
            else{
                count++;
                hs.add(nums[j]);
            }
            
            
        }
        int[] res = hs.stream().mapToInt(k->k).toArray();
        for(int j: res)
        	System.out.println(j);
        System.out.println("Number of duplicates:" + count);
        return i+1;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,2,3,5,6,6,7,7,7};
		CountDuplicates rd = new CountDuplicates();
		int k = rd.countDuplicates(arr);
		System.out.println("\n"+k);

	}

}
