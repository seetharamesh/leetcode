package leetpractice;

public class LongesCommonPrefix {
public static String longestCommonPrefix(String[] strs) {
        
        //to store result
        StringBuilder sb = new StringBuilder();
        //find the shortest length of string
        int minlen = strs[0].length();
        for(int i =1; i< strs.length; i++){
            minlen = Math.min(minlen, strs[i].length());
        }
        //Next, loop only upto minlen
        for(int j = 0; j < minlen; j++){
            //get first char of first string.use the first string as a base
            char c = strs[0].charAt(j);
            //compare with all strings including first
            for(String s: strs){
                //compare "c" with first letter of all strings
                if(s.charAt(j) != c)
                    return sb.toString();
            }
            sb.append(c);
        }
        return sb.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strs = {"abc","defgh","ijklmn"};
		String s = longestCommonPrefix(strs);
		System.out.println(s);
		
//		StringBuilder sb = new StringBuilder();
//		boolean breakflag = false;
//		//1.find shortest string
//		int minstrlen = strs[0].length();
//		for(int i = 1; i < strs.length; i++) {
//			minstrlen = Math.min(minstrlen,strs[i].length());
//		}
//		//now compare minstrlen with all other strings
//		for(int i = 0; i < minstrlen;i++) {
//			char c = strs[0].charAt(i);
//			for(String j: strs) {
//				if(j.charAt(i) != c) {
//					System.out.println(sb);
//					breakflag=true;
//					break;
//				}
//			}//end of inner for
//			if(breakflag)break;
//			sb.append(c);
//		}//end of for
//		System.out.println(sb.toString());
//	}
	}
}
