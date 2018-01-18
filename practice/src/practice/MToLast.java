package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MToLast {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		in.nextLine();
        String s = in.nextLine();
        
            ML(m,s);
        }
    private static void ML(int Mth, String str) {
    
      	String[] arr = str.split(" ");
      	if (arr.length - Mth>=0){
      	System.out.println(arr[arr.length - Mth]);
        }
      	else{
      		System.out.println("error");
      	}
    }
}