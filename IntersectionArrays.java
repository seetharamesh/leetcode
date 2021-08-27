package leetpractice;
import java.util.*;
public class IntersectionArrays {
	public int[] intersect(int[] nums1, int[] nums2) {
		List<Integer> li = new ArrayList<>();
        
        int count = 0;
        for(int i = 0; i <nums1.length;i++){
            int elem = nums1[i];
            for(int j = 0; j < nums2.length; j++){
                if(elem == nums2[j]){
                    li.add(elem);
                    count++;    
                    nums2[j]=1001;//setting it back to a number that's outside the range specified in the problem
                    break;
                }
            }
        }
        int[] result = li.stream().mapToInt(i->i).toArray();
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntersectionArrays ia = new IntersectionArrays();
		int[] result = new int[10];
		int[] nums1 = {4,9,5}, nums2 = {9,4,9,8,4};
		result = ia.intersect(nums1, nums2);
		for(int i : result)
			System.out.println(i);
		

	}

}
