package leftrotation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    static int[] leftRotation(int[] a, int d) {
        // Complete this function
        int[] b = a.clone();
        for(int j = 0;j<d;j++){
        int temp = b[0];
        for(int i = 0;i<a.length-1;i++){
        	b[i] = b[i+1];
        	
        }
        b[b.length-1] = temp;}
        return b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
