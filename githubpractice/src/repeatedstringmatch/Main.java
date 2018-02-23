package repeatedstringmatch;

//https://leetcode.com/problems/repeated-string-match/description/
public class Main {
	public int repeatedStringMatch(String A, String B) {
		
		int count =1;
		String tempa = A;
		while(A.indexOf(B)==-1){
			A+=tempa;
			count++;
			if(A.length()>B.length()*2&&A.indexOf(B)==-1)return -1;
			
		}
        return count;
    }
	
	public static void main(String[] args){
		String a = "abcd";
		String b = "cdabcdab";
		Main main = new Main();
		System.out.println(main.repeatedStringMatch(a,b));
	}
}
