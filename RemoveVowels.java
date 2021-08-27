package leetpractice;
import java.util.*;
public class RemoveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "seetha";
		List<Character> vowels = new ArrayList<>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(vowels.contains(c))continue;
			else sb.append(c);
		}
		System.out.println(sb);

	}

}
