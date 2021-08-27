package leetpractice;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Race a Car";
		s = s.toLowerCase();
		String mystr =  s.replaceAll("[^a-zA-Z0-9]","");
		
		StringBuilder sb = new StringBuilder();
		sb.append(mystr);
		sb.reverse();
		String revstr = sb.toString();
		if(mystr.equals(revstr)) System.out.println("true");
		else System.out.println("false");
		
	}

}
