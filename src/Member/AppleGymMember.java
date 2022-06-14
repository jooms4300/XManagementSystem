package Member;

import java.util.Scanner;

public class AppleGymMember extends Member {
	
	public AppleGymMember(MemberKind kind){
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setMemberID(input);
		setMemberName(input);
		setMemberEmail(input);
		setMemeberPhonenumber(input);
	}
	
	public void printInfo() {
		String skind = getKindString();
		
		System.out.println("Kind: " + skind + " id: " + id + " name: "+ name 
				+ " email: " + email + " phonenumber: " + phonenumber);
	}
}
