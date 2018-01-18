package practice;

import java.util.Scanner;

class MyCalculator {
    long power(int a, int b) throws Exception{
        if(a<0 || b<0){
            throw new Exception("n and p should be non-negative");
        }
        else{
            return (long)Math.pow(a,b);
        }
    }
}
public class ExceptionHandle {
	 public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);

		  while ( in .hasNextInt()) {
		   int n = in .nextInt();
		   int p = in .nextInt();
		   MyCalculator my_calculator = new MyCalculator();
		   try {
		    System.out.println(my_calculator.power(n, p));
		   } catch (Exception e) {
		    System.out.println(e);
		   }
		  }
		 }
}
