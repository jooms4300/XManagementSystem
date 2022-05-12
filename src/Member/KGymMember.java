package Member;

import java.util.Scanner;

public class KGymMember extends PowerGymMember {
	
	public KGymMember(MemberKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setMemberID(input);
		setMemberName(input);
		setMemberEmailwithYN(input);
		setMemeberPhonenumber(input);
	}
	
	
}
