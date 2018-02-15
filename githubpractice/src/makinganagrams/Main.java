package makinganagrams;

import java.util.Arrays;
import java.util.Scanner;



	public class Main {
	    public static int numberNeeded(String first, String second) {
	      char [] first_ = first.toCharArray();
	      char [] second_ = second.toCharArray();
	      
	        Arrays.sort(first_);
	        Arrays.sort(second_);
	      
	        int a = first_.length;
	        int b = second_.length;
	        
	        for(int i = 0; i < first_.length; i++){
	        	for(int j = 0; j < second_.length; j++){
	        		if(first_[i]==second_[j]){
	        			a--;
	        			b--;
	        			first_[i]='A';
	        			second_[j]='B';
	        		}
	        	}
	        }
	        return a+b;
	        
	    }
	  
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String a = in.next();
	        String b = in.next();
	        System.out.println(numberNeeded(a, b));
	    }
	}


