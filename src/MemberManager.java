import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Member.AppleGymMember;
import Member.KGymMember;
import Member.Member;
import Member.MemberInput;
import Member.MemberKind;
import Member.MusclefactoryMember;

public class MemberManager extends Member {
	ArrayList<MemberInput> members = new ArrayList<MemberInput>();
	Scanner input;
	MemberManager(Scanner input){
		this.input = input; 
	}
	
	public void addMembers(){
		
		int kind=0;
		
		MemberInput memberInput;
		
		while(kind !=1 &&kind != 2) {
			try {
				System.out.println("1 for KGym ");
				System.out.println("2 for MuscleFactory");
				System.out.println("3 for AppleGym");
				System.out.println("Select num for Member Kind between 1, 2, or 3 : ");
				
				kind = input.nextInt();
			
				if(kind==1) {
					memberInput = new KGymMember(MemberKind.KGym);
					memberInput.getUserInput(input);
					members.add(memberInput);
					break;
				}
				else if(kind == 2) {
					memberInput = new MusclefactoryMember(MemberKind.Muscle_Factoroy);
					memberInput.getUserInput(input);
					members.add(memberInput);
					break;
				}
				else if(kind == 3) {
					memberInput = new AppleGymMember(MemberKind.AppleGym);
					memberInput.getUserInput(input);
					members.add(memberInput);
					break;
				}
				else {
					System.out.print("Select num for Member Kind : ");
				}
			}
			catch(InputMismatchException e){
				System.out.println("Please put an integer between 1 and 3!");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}

	}
	
 	public void DeleteMembers(){
		System.out.print("Members Id : ");
		int membersId = input.nextInt();
		int index = findIndex(membersId);
		removedfromMembersint(index, membersId);
	}
 	
 	public int findIndex(int membersId) {
 		int index = -1;
		for(int i = 0;i<members.size();i++) {
			if(members.get(i).getId()==membersId) {
				index = i;
				break;
			}
		}
		return index;
 	}
 	
 	public int removedfromMembersint(int index, int membersId) {
		if(index>=0) {
			members.remove(index);
			System.out.println("the member"+ membersId +" is deleted");
			return 1;
		}
		else{
			System.out.println("the member has not been registered");
			return -1;
		}
 	}
 	
	public void EditMembers(){
		System.out.print("Members Id : ");
		
		int membersId = input.nextInt();
		
		for(int i = 0;i<members.size();i++) {
			
			MemberInput member = members.get(i);
			
			if(member.getId()==membersId) {
			
				int num = -1;
				
				while(num!=5) {
					showEditMenu();
					num = input.nextInt();
					
					switch(num) {
					case 1:
						member.setMemberID(input);
						break;
					case 2:
						member.setMemberName(input);
						break;
					case 3:
						member.setMemberEmail(input);
						break;
					case 4:
						member.setMemeberPhonenumber(input);
						break;
					default:
						continue;
					}
				}// while
				break;
			}// if
		}// for
	}
	public void ViewMembers(){

		System.out.println("# of registered members:" + members.size());
		for(int i = 0;i<members.size();i++) {
			members.get(i).printInfo();
		}
	}
	
	public void showEditMenu() {
		System.out.println("1. Edit Id ");
		System.out.println("2. Edit Name ");
		System.out.println("3. Edit Email");
		System.out.println("4. Edit Phonenumber");
		System.out.println("5. Exit");
		System.out.print("Select one number between 1-5: ");
	}

	public void getUserInput(Scanner input) {

	}

	public void printInfo() {

	}

}
