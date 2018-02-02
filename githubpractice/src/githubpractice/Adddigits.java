package githubpractice;

public class Adddigits {
	public int addDigits(int num) {
        
        
        while(Integer.toString(num).length()>1){
        	String numm = Integer.toString(num);
            char[] temp = numm.toCharArray();
        	int sum = 0;
        for(int i=0;i<temp.length;i++){
        	sum += Character.getNumericValue(temp[i]);
        } num = sum;
        }
        return num;
    }
	public static void main(String[] args){
		int n = 38;
		Adddigits ad = new Adddigits();
		System.out.println(ad.addDigits(n));
		}
}
