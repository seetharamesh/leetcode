package leetpractice;
import java.util.*;
public class NumOfJewelsInStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jewels = "aA", stones = "aAAbbbb";
		
		char[] temp = new char[stones.length()];
		int count=0;
		for(int i = 0; i < stones.length();i++) {
			char c = stones.charAt(i);
			temp[i] = c;
		}
		
		for(int j=0; j< jewels.length();j++) {
			char jelm = jewels.charAt(j);
			for(int k=0; k < temp.length;k++) {
				if(jelm == temp[k])
					count++;
			}
				
				
		}
		
		System.out.println(count);
	}

}
