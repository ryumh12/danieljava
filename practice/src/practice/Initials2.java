package practice;


import java.util.Scanner; 

public class Initials2 { 

	private Scanner in = new Scanner(System.in); 
	private String splitname[] = new String[10]; 
	private String name; 

	public void initialGetter(){ 

		System.out.println("Enter Your Full Name!"); 
		setName(); 
		splitname = name.split(" "); 

		for (int i = 0; i < splitname.length; i++){
		 
			System.out.print(splitname[i].substring(0, 1)); 
		} 


	} 

	public void setName(){ 
	
		name = in.nextLine();
	} 

	public String getName(){
		
		return name;
	} 

	public static void main(String[] args){ 
	
		Initials2 newname = new Initials2(); 
		newname.initialGetter(); 

	} 


}