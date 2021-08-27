package leetpractice;
import java.util.*;

public class RomanNumeral {
	
public int romanToInt(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        

            s=s.replaceAll("IV","IIII").replaceAll("IX","VIIII")
                .replaceAll("XL","XXXX").replaceAll("XC","LXXXX")
                .replaceAll("CD","CCCC").replaceAll("CM","DCCCC");
          
            int num=0;
            for(int i=0;i<s.length();i++){
                num=num+hm.get(s.charAt(i));
            }
            
            
         return num;
                     
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RomanNumeral rn = new RomanNumeral();
		int n= rn.romanToInt("XX");
		System.out.println(n);

	}

}
