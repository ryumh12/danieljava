package githubpractice;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;



public class Randomcompany {
		public class Stock {
			String name;
			Integer shares;
			public Stock(String name_, Integer shares_) {
				name = name_;
				shares = shares_;
			}
			
		}
		private ArrayList<Stock> comarr = new ArrayList<Stock>();
		private Integer sum = 0;
		
		void add(String company, int num){
			this.comarr.add(this.new Stock(company, num));
			this.sum += num;
		}
		String get(){
			Random ran = new Random();
			int rannum = ran.nextInt(this.sum)+1;
			int j=0;
			for(;j<this.comarr.size();j++){
				if(comarr.get(j).shares<rannum){
					rannum -= comarr.get(j).shares;
				
				}
				else
				{
					return comarr.get(j).name;
				}
			}
			return "";
			
		}
	
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			System.out.println("How many companies do you want to add?");
			int n = in.nextInt();
			in.nextLine();
			
			Randomcompany company = new Randomcompany();
			
			for(int i = 0; i<n; i++){
				System.out.println("Please enter the name of company: ");
				String com = in.nextLine();
				System.out.println("Please enter the number:");
				int nn = in.nextInt();
				in.nextLine();
				company.add(com, nn);
			}
			
			System.out.println("The selected company is: "+ company.get());
			
		}
}
