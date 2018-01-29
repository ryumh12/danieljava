package githubpractice;

import java.util.Scanner;
import java.util.Stack;

class Baseballgame {
	public static boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    // only got here if we didn't return false
	    return true;
	}

public int calPoints(String[] ops) {
    	
    	Stack<Integer> sta = new Stack<>();
    	
    	for(int j = 0; j<ops.length;j++){
        if(Baseballgame.isInteger(ops[j])){
        	sta.push(Integer.parseInt(ops[j]));
        }else if(ops[j].equals("+")){
            Integer i1 = sta.pop();
            Integer i2 = i1 + sta.peek();
            sta.push(i1);
            sta.push(i2);
        }else if(ops[j].equals("D")){
        	sta.push(sta.peek()*2);
        }else if(ops[j].equals("C")){
        	sta.pop();
        }
    }
    	int sum = 0;
        int nn = sta.size();
    	while(!sta.isEmpty()){
    	    sum = sum + sta.pop();
    	}
    	return sum;
    }
    public static void main (String[] args){
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	in.nextLine();
    	String inp[] = new String[n];
    	for(int i=0;i<n;i++){
    		
    		inp[i] = in.nextLine();
 
    	}
    	Baseballgame bbg = new Baseballgame();
    	System.out.println(bbg.calPoints(inp));
    	
    	
    }
    

}

