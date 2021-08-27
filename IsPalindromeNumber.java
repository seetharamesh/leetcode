package leetpractice;

public class IsPalindromeNumber {

	public boolean isPalindrome(int x) {
		String s = Integer.toString(x);
		String result = "";
		for(int i= s.length()-1; i >=0 ; i--) {
			char getchar = s.charAt(i);
			result += getchar;
		}
		if(s.equals(result))return true;
		return false;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsPalindromeNumber ipn = new IsPalindromeNumber();
		boolean b = ipn.isPalindrome(-121);
		System.out.println(b);

	}

}
