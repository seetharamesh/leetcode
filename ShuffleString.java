package leetpractice;

import java.util.*;
public class ShuffleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "codeleet";
		char[] c = s.toCharArray();
		int[] indices = new int[] {4,5,6,7,0,2,1,3};
		
		HashMap<Integer,Character> hm = new HashMap<>();
		for(int i = 0; i < s.length(); i++)
			hm.put(indices[i], c[i]);
		
		//now shuffle
		StringBuilder sb = new StringBuilder();
		for(int j = 0; j < s.length(); j++) {
			char sc = hm.get(j);
			sb.append(sc);
		}
		
		System.out.println(sb);
	}

}
