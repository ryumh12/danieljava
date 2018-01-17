package githubpractice;
import java.util.Scanner;

public class Climbingstairs {
//use Fibonacci series
	public int climbStairs(int n) {
		int a = 1;
		int b = 2;
		int c=0;
        if (n==1||n==2){
            return n;
        }else {
        	for(int i=0;i<n-2;i++){
        		c=a+b;
        		a=b;
        		b=c;
        	}
        	return c;
        }
    }
    public static void main (String[] args){
    	Scanner in = new Scanner(System.in);
    	Climbingstairs cs = new Climbingstairs();
    	int ans = cs.climbStairs(in.nextInt());
    	System.out.println(ans);
    }
}