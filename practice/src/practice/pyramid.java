package practice;
import java.util.Scanner;
public class pyramid {

	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows?");
		int num=sc.nextInt();
		if (num>1){
		System.out.println("*");
		for (int i=0;i<num-2;i++){
			System.out.print("*");
				for(int k=0;k<i;k++){
					System.out.print(" ");
				}
			
			System.out.println("*");
			}}
		
		for(int j=0;j<num;j++){
			System.out.print("*");
		}
		}}

