package githubpractice;

import java.util.Scanner;
import java.lang.*;

public class SumofSquareNumbers {

	    public boolean judgeSquareSum(int c) {
	    	if (c==0){
	    		return true;
	    	}else{
	    	int a, b, e;
	    	Double d = new Double("0.0");
	        a = (int) Math.sqrt(c);
	        for(int i=a;i>0;i--){
	        	d = Math.sqrt((c-(i*i)));
	        	e= (int) d.intValue();
	        	if(d==e){
		        	return true;
	        }
	        }
	        	return false;
	    }}
	    public static void main (String[] args){
	    	Scanner in = new Scanner(System.in); 
	    	SumofSquareNumbers ss = new SumofSquareNumbers();
	    	boolean ans;
	    	ans = ss.judgeSquareSum(in.nextInt());
	    	
	    	System.out.println(ans);
	}
}
