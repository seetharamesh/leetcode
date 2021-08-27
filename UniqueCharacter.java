package leetpractice;
import java.util.*;
public class UniqueCharacter {
public int firstUniqChar(String s) {
	if(s.length() == 1)return 0;
      HashMap<Character,Integer>  hm = new HashMap<>();
      int count=1;
      int unique = 0;
      char[] c = s.toCharArray();
      for(int i=0; i <= c.length-1; i++) {
    	  if(hm.containsKey(c[i])) {
    		  count = hm.get(c[i]);
    		 hm.put(c[i], ++count);
    	  }
    	  else {
    		  count = 1;
    		  hm.put(c[i], count);
    	  } 	  
      }
      int p=0;
      boolean found=false;
      for(; p <=c.length-1; p++) {
    	  if((hm.get(c[p]) == 1)) {
    		  System.out.println("unique index: " + p);
              found=true;
    		  break;
    	  }
      }
        if(found)
            return p;
        return -1;
      
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueCharacter uc = new UniqueCharacter();
		int result =uc.firstUniqChar("dddccdbba");
		System.out.println(result);
	}

}
