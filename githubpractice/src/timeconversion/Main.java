package timeconversion;
//https://www.hackerrank.com/challenges/time-conversion/problem

import java.util.Scanner;

public class Main {
	static String timeConversion(String s) {
        // Complete this function
        if(s.substring(8,10).equals("AM")){
        	if(s.substring(0,2).equals("12"))
        		return "00"+s.substring(2,8);
        	return s.substring(0,8);}
        else{int temp=Integer.parseInt(s.substring(0,2))+12;
        if(s.substring(0,2).equals("12"))
    		return "12"+s.substring(2,8);
        	return Integer.toString(temp)+s.substring(2,8);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
