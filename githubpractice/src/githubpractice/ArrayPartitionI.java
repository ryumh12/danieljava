package githubpractice;

import java.util.Arrays;
import java.util.Scanner;

class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        if(nums.length>3){
            
        
        Arrays.sort(nums);
            int c=0;
        for(int i=2; i<nums.length+1;i+=2){
            c += nums[nums.length-i];
        }
        return c;
        
    }else{
            Arrays.sort(nums);
            return nums[0];
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] aa = null;
        int i = 0;
        while(in.hasNext()){
            aa[i] = in.nextInt();
            i++;
        }
        ArrayPartitionI sl = new ArrayPartitionI();
        System.out.println(sl.arrayPairSum(aa));
    }
}