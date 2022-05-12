package Member;

import java.util.Scanner;

import Exception.EmailFormatException;

public abstract class PowerGymMember extends Member{
	public PowerGymMember (MemberKind kind) {
		super(kind);
	}

	public abstract void getUserInput(Scanner input);
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("Kind: " + skind + " id: " + id + " name: "+ name 
				+ " email: " + email + " phonenumber: " + phonenumber);
	}
	
	public void setMemberEmailwithYN(Scanner input) {
		char answer ='X';
		while(answer!='y' && answer!='Y' && answer!= 'n' && answer!='N') {
			System.out.print("Do you have and Members Email? (Y/N) ");
			answer = input.next().charAt(0);
			try {
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
			catch(EmailFormatException e) {
				System.out.println("Incorrect Email Format. put the e-mail address tha contains @");
				answer ='X';
			}
		}
	}
	
	public String getKindString() {
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
		return skind;
	}

}
