package minimaxnumber;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	    static void miniMaxSum(int[] arr) {
	        // Complete this function
	        Arrays.sort(arr);
	       
	        long sum = 0;
	        for(int i = 0;i<5;i++){
	            sum+=arr[i];
	    }
	        //System.out.println(sum);
	        long first= sum-arr[4];
	        //System.out.println(sum);
	        long last = sum-arr[0];
	        
	        System.out.print(first+" "+last);
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int[] arr = {256741038,623958417,467905213,714532089,938071625};
	        
	        miniMaxSum(arr);
	        in.close();
	    }
	}


