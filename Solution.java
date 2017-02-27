import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String term1 = s.next();
		String term2 = s.next();
		int FindTerm = s.nextInt();

		      System.out.println(fib(FindTerm-1,term1,term2));
		        
		
		    }

		private static BigInteger fib(int n,String term1,String term2)
		    {
		        
			if(n<=0){
			BigInteger b = new BigInteger("0");
			return b;
			
			}
			
			/* Declare an array to store Fibonacci numbers. */
			
			else{
			//Temporary Object
			BigInteger temp = new BigInteger("0");
			//Array of collection but object is not created yet
			BigInteger f[] = new BigInteger[n+1];
		    
			
		    //Array of references   
		    f[0] = new BigInteger(term1);
		    f[1] = new BigInteger(term2);
		     
		    for (int i = 2; i <= n; i++)
		    {
		    	f[i] = new BigInteger("0");
		    	
		    	temp = f[i-1].multiply(f[i-1]) ;
		    	
		     f[i] = f[i-2].add(temp);
		    }
		      
		    return f[n];
		    }
		    }
		   
}