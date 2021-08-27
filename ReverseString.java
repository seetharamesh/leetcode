package leetpractice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reverse a string and store in same char array without creating any new array.
		char[] s = {'H','b','v','a','n','p'};
		int j = s.length-1, i =0;
        while(i<j){
            char c = s[j];
            s[j] = s[i];
            s[i]=c;
            j--;
            i++;
    }
        for (char p: s)
        	System.out.println(p);
		
		//reverse string and just output
//		char[] s={'H','b','v','a','n'};
//		for(int i = s.length -1; i >=0; i--) {
//			System.out.println(s[i]);
		}

	}
	
	

