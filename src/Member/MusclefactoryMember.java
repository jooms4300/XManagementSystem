package Member;

import java.util.Scanner;

import Exception.EmailFormatException;

public class MusclefactoryMember extends PowerGymMember{
	
	protected int pt_number;
	
	
	public MusclefactoryMember (MemberKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setMemberID(input);
		setMemberName(input);
		setMemberEmailwithYN(input);
		
		char answer ='X';
		while(answer!='y' && answer!='Y' && answer!= 'n' && answer!='N') {
			System.out.print("Are you going to do pt? (Y/N) ");
			answer = input.next().charAt(0);
			try {
				if(answer == 'y' || answer == 'Y') {
					System.out.print("pt number : ");
					pt_number = input.nextInt();
					this.setpt_num(pt_number);
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
			}
		}
		setMemeberPhonenumber(input);
		printInfo(); 
	}
	
	public void printInfo() {
		
		String skind = getKindString();
		
		System.out.println("Kind: " + skind + "id: " + id + " name: "+ name 
				+ " email: " + email + " phonenumber: " + phonenumber + " pt_number: " + pt_number);
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
	
	void setpt_num(int pt_number){
		this.pt_number=pt_number;
	}
	
	int getpt_num(){
		return this.pt_number;
	}
}
