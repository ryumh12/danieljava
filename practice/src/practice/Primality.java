package practice;

import java.util.*;
import java.math.*;

public class Primality {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      BigInteger n = in.nextBigInteger();
      in.close();
      // Write your code here.
       System.out.println(n.isProbablePrime(1)?"prime":"not prime");
   }
}
