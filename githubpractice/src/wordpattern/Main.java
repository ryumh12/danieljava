package wordpattern;

import java.util.HashMap;

public class Main {
	    public boolean wordPattern(String pattern, String str) {
	        char[] paT = pattern.toCharArray();
	        String[] stR = str.split(" ");
	        if(paT.length!=stR.length) return false;
	        
	        HashMap<Character, String> hmap = new HashMap<Character, String>();
	        for (int i = 0; i<paT.length;i++){
	        	if(!hmap.containsKey(paT[i])&&!hmap.containsValue(stR[i])){
	        		
	        			hmap.put(paT[i], stR[i]);
	        		}
	        }
	      System.out.println(hmap);
	        boolean flag = true;
	        for(int j = 0; j<paT.length;j++){
	        	if(!hmap.containsKey(paT[j])) return false;
	        	if(!hmap.get(paT[j]).equals(stR[j])) return false;
	        	
	        	
	        }
	        return flag;
	    }
	    public static void main(String[] args){
	    	String a = "abba";
	    	String b = "dog dog dog dog";
	    	Main main = new Main();
	    	System.out.println(main.wordPattern(a,b));
	    }
	}