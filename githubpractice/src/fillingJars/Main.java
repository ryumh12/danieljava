package fillingJars;

import java.io.*;
import java.util.*;

public class Main {
	static Scanner in = new Scanner(System.in);
	public int filljar(int nn, int mm){
		long [] arr = new long[nn];
		for(int i =0;i<mm;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            long k = in.nextLong();
            for(int j = a-1;j<b;j++){
            	arr[j]+=k;
            }
        }
		
		long total = 0;
        for(int i=0;i<arr.length;i++){
        	total+=arr[i];
        }
        return (int)total/nn;
	}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
    	int n = in.nextInt();
        int m = in.nextInt();
        Main main = new Main();
        System.out.println(main.filljar(n,m));
        
    }
    
}