package jcis4110;

import java.util.Scanner;


public class Assignment3 {
	//My assignment is making an asterisk stair
	protected Scanner in = new Scanner(System.in); 
	protected String asterisk="*";
	protected int num; 

	public void stairGetter(){ 

		System.out.println("Enter the number of row"); 
		setNumber(); 
		if (num>1){
			System.out.println(asterisk);
			for (int i=0;i<num-2;i++){
				System.out.print(asterisk);
					for(int k=0;k<i;k++){
						System.out.print(" ");
					}
				
				System.out.println(asterisk);
				}}
			
			for(int j=0;j<num;j++){
				System.out.print("*");
			}
		} 


	 

	public void setNumber(){ 
	
		num = in.nextInt();
	} 

	public int getNumber(){
		
		return num;
	} 

	public static void main(String[] args){ 
	
		Assignment3 newstair = new Assignment3(); 
		newstair.stairGetter(); 

	} 


}

