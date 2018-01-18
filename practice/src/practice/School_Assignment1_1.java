package practice;

public class School_Assignment1_1 {
	
	public static int parseInt(String s) throws NumberFormatException{
		return Integer.parseInt(s);
	}
	public static void main(String[] args){
		int[] num = new int[args.length];
		int sum = 0;
		for(int i=0;i<args.length;i++){
			num[i]=parseInt(args[i]);
			sum+=num[i];
		}
		System.out.println("The sum of arguments are : "+sum);
	}

}
