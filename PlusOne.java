package leetpractice;

public class PlusOne {
	public int[] plusOne(int[] digits) {
		
		for(int i = digits.length-1; i >= 0;i--) {
			if(digits[i] <9) {
				digits[i] ++;
				return digits;
			}
			else {//if it's equal to 9
				digits[i] = 0;
			}
			
		}
		//if we have 9,9,9
		int res[] = new int[digits.length + 1];
		res[0] = 1;
		return res;
		
	}
	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlusOne p = new PlusOne();
		int[] digits = new int[] {9,9,9};
		int[] result = p.plusOne(digits);
		for(int i: result)
			System.out.println(i);
	}

}
