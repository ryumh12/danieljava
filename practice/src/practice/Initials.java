package practice;


import java.util.Scanner;

public class Initials {   
	
		private String fullName = " ";
		private String firstNameInitial = " ";
		private String lastNameInitial = " ";
		private int space = 0;
		private String initials = " ";
	
		public Initials(){
				
		}

	
		public String getFullName(){
		
			return fullName;
		}


		public void setFullName(String fN){
		
		fullName = fN;
		}

		
		public String findFirstNameInitial(){
		
			firstNameInitial = fullName.substring(0, 1);
			return firstNameInitial;
		}


		public void findSpace(){
		
			space = fullName.indexOf(" ");
			
		}

		public String findLastNameInitial(){
		
			this.findSpace();
			lastNameInitial = fullName.substring(++space, ++space);
			return lastNameInitial;
		}
	
	
		public String findInitials(){
		
			initials = this.findFirstNameInitial() + " " + this.findLastNameInitial();
			return initials;
		}

		public static void main(String[] args) { 
		
				Initials initials = new Initials();
		
				Scanner receiveUserInput = new Scanner(System.in); 
				System.out.println("Enter Full Name- First Name and Last Name:");
        
    			initials.setFullName(receiveUserInput.nextLine());
        		System.out.println("The full name you entered is: " + initials.getFullName());
                        
        		System.out.println("The initials of " + initials.getFullName() + " are:" + initials.findInitials());
        
        		receiveUserInput.close();
	}

} 

	