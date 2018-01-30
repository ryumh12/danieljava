package githubpractice;
import java.util.*; 
import java.io.*;

class Kaprekarsconstant {  
	public static int Sortnum(int aa){
		String aaa = Integer.toString(aa);
		if(aaa.length()==3){
			aaa+='0';
			
		}
		char[] a = aaa.toCharArray();
		Arrays.sort(a);
		String aab = new String(a);
		int ans = Integer.parseInt(aab);
		return ans;
	}
	public static int Sortnumr(int bb){
		String bbb = Integer.toString(bb);
		if(bbb.length()==3){
			bbb+='0';
			
		}
		char[] b = bbb.toCharArray();
		Arrays.sort(b);
		String abb = new String(b);
		String bbbb = new String();
		for(int i = abb.length()-1;i>=0;i--){
			bbbb += abb.charAt(i);
		}
		int anss = Integer.parseInt(bbbb);
		return anss;
	}
  public static int KaprekarsConstant(int num) { 
	  int count=0;
	  while(num!=6174){
	  num = (int) (Sortnumr(num) - Sortnum(num));
	  count+=1;
  }
  
    return count;
    
  } 
  
  public static void main (String[] args) {  
      
    Scanner s = new Scanner(System.in);
    System.out.print(KaprekarsConstant(s.nextInt())); 
  }   
  
}