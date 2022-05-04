package Member;

import java.util.Scanner;

public class AppleGymMember extends Member implements MemberInput {
	public void getUserInput(Scanner input) {
		System.out.print("Members Id : ");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("Members Name : ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Members Email : ");
		String email = input.next();
		this.setEmail(email);
		
		System.out.print("Members Phonenumber : ");
		String phonenumber= input.next();
		this.setPhonenumber(phonenumber);
	}
	
	public void printInfo() {
		String skind="none";
		
		switch(this.kind) {
		case KGym:
			skind = "K.";
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
		
		System.out.println("Kind: " + skind + " id: " + id + " name: "+ name 
				+ " email: " + email + " phonenumber: " + phonenumber);
	}
}
