package leetpractice;

import java.util.Arrays;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find the number that's not repeated. There'll be one number not repeated
		int result=0;
		int[] nums = {1,1,2,2,4,4,5};
		for(int i = 0; i < nums.length; i++) {
			result = result ^ nums[i];
    }
       System.out.println(result);
	}

}
