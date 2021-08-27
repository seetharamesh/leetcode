package leetpractice;

public class ReverseInteger {

	public int reverse(int x){
		
		long res = 0;
		//efficient way
		while(x != 0) {
			int getrightmostdigit = x%10;
			res = res*10 + getrightmostdigit;
			x = x/10; //reset x to quotient value	
		}
		if (res < Integer.MIN_VALUE 
	             || res > Integer.MAX_VALUE) {
	            return 0;
	        }
		
		return (int)res;
		
//		int y= Math.abs(x);
//        System.out.println(y);
//        String s = Integer.toString(y);
//        StringBuilder sb = new StringBuilder();
//        sb.append(s);
//        sb.reverse();
//        String mystr = sb.toString();
//        long res = Long.valueOf(mystr);
//        if(x < 0) res = 0-res;
//        if(res < Integer.MIN_VALUE || res > Integer.MAX_VALUE)return 0;
//        return (int)res;
//		
		
		
		
		
		//alternate way
//		if(x > 2147483647L) return 0;
//        boolean flag = false;
//        if(x < 0) {
//            flag = true;
//            x = Math.abs(x);
//            }
//		String s = "";
//		
//		while(x > 0) {
//			int getrightmostdigit = x%10;
//			s += getrightmostdigit;
//			x = x/10;
//		}
//        if(flag) s = "-" + s;
//		// convert s to integer
//		int res=0;
//		try {
//			 res = Integer.valueOf(s);
//		}
//		catch(NumberFormatException e) {
//			return 0;
//		}
//       
//		return res;
// ------------------------------------------		
//		int result=0;
//		String s = Integer.toString(x);
//		String appendresult="";
//		boolean negflag = false;
//		for(int i = s.length()-1; i >=0 ; i--) {
//			if(s.charAt(i) == '-') {
//				negflag=true;
//				continue;
//			}
//			appendresult += s.charAt(i);
//		}	
//		if(negflag) {
//			appendresult = "-" + appendresult;
//		}
//		//-2,147,483,648 to 2,147,483,647
//		try {
//		if(Integer.valueOf(appendresult) < 2147483647L)
//			return Integer.valueOf(appendresult);
//		}
//		catch(NumberFormatException e) {
//			System.out.println("exception");
//		}
//		return 0;
		//return Integer.valueOf(appendresult);
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseInteger ri = new ReverseInteger();
		int k = ri.reverse(-2147483648);
		System.out.println(k);
	}

}
