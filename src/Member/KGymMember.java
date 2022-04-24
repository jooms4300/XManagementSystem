package Member;

import java.util.Scanner;

public class KGymMember extends Member {
	
	public void getUserInput(Scanner input) {
		System.out.print("Members Id : ");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("Members Name : ");
		String name = input.next();
		this.setName(name);
		
		char answer ='X';
		while(answer!='y' && answer!='Y' && answer!= 'n' && answer!='N') {
			System.out.print("Do you have and Members Email? (Y/N) ");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Members Email : ");
				String email = input.next();
				this.setEmail(email);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				this.setEmail("");
				break;
			}
			else {
			}
		}
		
		System.out.print("Members Phonenumber : ");
		String phonenumber= input.next();
		this.setPhonenumber(phonenumber);
	}
}
