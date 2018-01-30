package githubpractice;

import java.util.*; 
import java.io.*;

class LetterChanges {  
public static String LetterChanges(String str) { 
	  String strr = new String();
	  int ascii;
       for(int i = 0;i<str.length();i++){
    	   if(str.charAt(i)!='z'&&str.charAt(i)!=' '){
    	   ascii = (int) str.charAt(i)+1;
    	   strr += (char) ascii;}
    	   else {
    		   strr += str.charAt(i);
    	   }
       }
       		  strr =  strr.replace('i','I');
    		  strr =  strr.replace('a','A');
    		  strr =  strr.replace('e','E');
    		  strr =  strr.replace('o','O');
    		  strr =  strr.replace('u','U');
    	       return strr;
  } 
  public static void main (String[] args) {  
    Scanner s = new Scanner(System.in);
    System.out.print(LetterChanges(s.nextLine())); 
  }   

}