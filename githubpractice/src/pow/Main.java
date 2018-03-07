package pow;

import java.util.Scanner;

class Pow {
	public static double myPow(double x, int n) {
	double xx=x;
        if(n==1){
        	return x;
        }
        if(n==2){
        	return x*x;
        }
        
        return xx*myPow(x, n-1);
        }
    public static void main (String[] args){
    	Scanner in = new Scanner(System.in);
    	double bb = in.nextDouble();
    	int bbb = in.nextInt();
    	Pow p = new Pow();
    	
    	System.out.println(p.myPow(bb,bbb));
    	}
    }
