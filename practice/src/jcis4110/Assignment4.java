package jcis4110;

import java.util.Scanner;


public class Assignment4 extends Assignment3 {
	private String bar = "-";
	
	public void doubleStair(){
		stairGetter();
		System.out.println("");
		for(int i=0;i!=num;i++){
			System.out.print(bar);
		}
		System.out.println("");
		for(int j=0;j<num;j++){
			System.out.print("*");
		}
		System.out.println("");
		if (num>1){
			
			for (int i=num-1;i>1;i--){
				System.out.print(asterisk);
					for(int k=i-2;k>0;k--){
						System.out.print(" ");
					}
				
				System.out.println(asterisk);
				}
			System.out.print("*");}
	}
	public static void main(String[] args){ 
		Assignment4 asgn4 = new Assignment4();
		asgn4.doubleStair();
	}
}

