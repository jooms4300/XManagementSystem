package Member;

import java.util.Scanner;

public class MusclefactoryMember extends Member {
	
	protected String pt_number;
	protected String pt_price;
	
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
		
		answer ='X';
		while(answer!='y' && answer!='Y' && answer!= 'n' && answer!='N') {
			System.out.print("Are you going to do pt? (Y/N) ");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("pt number : ");
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
	
	public void printInfo() {
		String skind="none";
		switch(this.kind) {
		case KGym:
			skind = "K"
					+ ".";
			break;
		case Muscle_Factoroy:
			skind = "Muscle.";
			break;
		case AppleGym:
			skind = "Apple.";
			break;
		case PowerGym:
			skind = "Power.";
			break;
		default:
		}
		
		System.out.println("Kind: " + skind + "id: " + id + " name: "+ name 
				+ " email: " + email + " phonenumber: " + phonenumber + " pt_number: " + pt_number + 
				" pt_price: " + pt_price);
	}
}
