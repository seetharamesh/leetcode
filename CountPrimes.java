package leetpractice;

import java.math.BigInteger;

public class CountPrimes {

	public static void main(String[] args) {
		
		int n= 15;
		int count = 1; //including 2 as prime too in the count
        for(int i = 3; i<n;i+=2) {
    		boolean isprime = true;
        	for(int j = 3; j <= Math.floor(Math.sqrt(i)); j+=2) {
        		if(i % j == 0) {
        			//is not prime
        			isprime=false;
        			break;
        		}   		
        	}
        	if(isprime) {
        		System.out.println(i);
        		++count;
        	}
        	
        }
        System.out.println("Total prime count including 2: " + count);
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//using biginteger
//		int n = 30;
//		int pcount = 0;
//		for(int i = 3; i <n; i+=2) {
//			BigInteger b = new BigInteger(String.valueOf(i));
//	        if(b.isProbablePrime(1))
//	        ++pcount;
//		}
//		System.out.println(pcount);
		
		
		
		//another way
		//another way
//		int n=5;
//		int pcount=0;
//		 for( int i = 2; i <= n ; i++){
//	            
//	            boolean isPrime = true;
//	            for( int j = 2; j <= i/2; j++){
//	                
//	                if(i % j == 0){
//	                    isPrime = false;
//	                    break;
//	                }
//	            }
//	            
//	            //print if it is a prime number
//	            if(isPrime) {
//	                System.out.print(i + " ");
//	                pcount++;
//	            }
//	        }
//	        System.out.println("***"+pcount);
		
		
//		int i, number, count,pcount=0; 
//		
//		for(number = 2; number <= 3; number++)
//		{
//			count = 0;
//		    for (i = 2; i <= number/2; i++)
//		    {
//		    	if(number % i == 0)
//		    	{
//		    		count++;
//		    		break;
//		    	}
//		    }
//		    if(count == 0 && number != 1 )
//		    {
//		    	System.out.print(number + " ");
//		    	pcount++;
//		    	
//		    }  
//		}
//		
//		System.out.println("***"+ pcount);
//		
//	}


