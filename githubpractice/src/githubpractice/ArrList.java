package githubpractice;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrList {
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        //System.out.println("Enter the number you want to make arraylists:");
        int numarr = in.nextInt();
        List<List<Integer>> arra = new ArrayList<List<Integer>>() ;
        for(int i=0;i<numarr;i++){
        	//System.out.println("Enter the number of elements: ");
        	int numarrb = in.nextInt();
        	List<Integer> arrb = new ArrayList<Integer>();
        	for(int j=0;j<numarrb;j++){
        		//System.out.println("Enter the elements: ");
        		int element = in.nextInt();
        		arrb.add(element);
        	}
        	arra.add(arrb);
        }
        //System.out.println("How many times do you want to pull the number?");
        int n = in.nextInt();
        for(int k=0;k<n;k++){
        //System.out.println("Enter the number of list and number of element: ");
        int x = in.nextInt();
        int y = in.nextInt();
        if(x<1||x>arra.size()){
        	System.out.println("ERROR!");
        }
        List<Integer> arrans = new ArrayList<Integer>();
        arrans = arra.get(x-1);
            
        if(y<1||y>arrans.size()){
        	System.out.println("ERROR!");
        }else{
        	System.out.println(arrans.get(y-1));
        }}
        //System.out.println("Done");
    }
}