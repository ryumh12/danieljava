package githubpractice;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumbers {


    public int missingNumber(int[] nums) {
    	int n=0;
        for(int i=0;i<nums.length;i++){
        	n = n+i-nums[i];
        	}
        return n;
        }
        
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int[] numss=null;
        int i=0;
        while(in.hasNext()){
        	numss[i] = in.nextInt();
        	i++;
        }
        Arrays.sort(numss);
        MissingNumbers mn = new MissingNumbers();
        System.out.println(mn.missingNumber(numss));
        
    }
    
}
