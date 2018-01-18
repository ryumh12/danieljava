package practice;

import java.util.Scanner;

public class School_Assignment2_2 {

	public static void main (String [] args){
		System.out.println("Enter the full name: ");
		Scanner sc = new Scanner(System.in);
		String fullname= sc.nextLine();
		System.out.println(fullname.substring(0,1)+" "+fullname.substring(fullname.indexOf(" ")+1, fullname.indexOf(" ")+2));
		
}
}