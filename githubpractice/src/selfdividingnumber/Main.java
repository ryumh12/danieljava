package selfdividingnumber;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = left;i<=right;i++){
			boolean flag = true;
			for(int j = 0;j<Integer.toString(i).length();j++){
			int divisor = Integer.parseInt(Integer.toString(i).substring(j,j+1));
			//System.out.println(divisor);
			if(divisor==0)flag = false;
			else if(i%divisor!=0)flag = false;			
		}
			if(flag)list.add(i);
		}
        return list;
    }
	
	public static void main(String[] args){
		int left_ = 1;
		int right_ = 22;
		Main main = new Main();
		System.out.println(main.selfDividingNumbers(left_, right_));
	}
}
