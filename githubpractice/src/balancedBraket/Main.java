package balancedBraket;

import java.util.*;

public class Main {

    static String isBalanced(String s) {
        char[] c = s.toCharArray();
        if (s.length()%2!=0)return "NO";
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
        	if(c[i]=='['||c[i]=='{'||c[i]=='(') stack.push(c[i]);
        	if(c[i]==')'){
        		if(stack.size()==0)return "NO";
        		if(stack.pop()!='(')return "NO";
        			
        	}
        	if(c[i]=='}'){if(stack.size()==0)return "NO";
        		if(stack.pop()!='{')return "NO";
        	}
        	if(c[i]==']'){if(stack.size()==0)return "NO";
        		if(stack.pop()!='[')return "NO";
        	}
        }
        if(stack.size()==0)return "YES";
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}
