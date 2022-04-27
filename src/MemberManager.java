import java.util.ArrayList;
import java.util.Scanner;

import Member.KGymMember;
import Member.Member;
import Member.MemberKind;
import Member.MusclefactoryMember;

public class MemberManager {
	ArrayList<Member> members = new ArrayList<Member>();
	Scanner input;
	MemberManager(Scanner input){
		this.input = input; 
	}
	
	public void addMembers(){
		int kind=0;
		Member member;
		while(kind !=1 &&kind != 2) {
			System.out.println("1 for KGym ");
			System.out.println("2 for MuscleFactory ");
			System.out.println("Select num for Member Kind between 1 and 2 : ");
			kind = input.nextInt();
			if(kind==1) {
				member = new KGymMember();
				member.getUserInput(input);
				members.add(member);
				break;
			}
			else if(kind == 2) {
				member = new MusclefactoryMember();
				member.getUserInput(input);
				members.add(member);
				break;
			}
			else {
				System.out.print("Select num for Member Kind : ");
			}
		}

	}
 	public void DeleteMembers(){
		System.out.print("Members Id : ");
		int membersId = input.nextInt();
		int index = -1;
		for(int i = 0;i<members.size();i++) {
			if(members.get(i).getId()==membersId) {
				index = i;
				break;
			}
		}
		if(index>=0) {
			members.remove(index);
			System.out.println("the member"+ membersId +" is deleted");
		}
		else{
			System.out.println("the member has not been registered");
			return;
		}
	}
	public void EditMembers(){
		System.out.print("Members Id : ");
		int membersId = input.nextInt();
		for(int i = 0;i<members.size();i++) {
			Member member = members.get(i);
			if(member.getId()==membersId) {
				int num = -1;
				
				while(num!=5) {
					System.out.println("1. Edit Id ");
					System.out.println("2. Edit Name ");
					System.out.println("3. Edit Email");
					System.out.println("4. Edit Phonenumber");
					System.out.println("5. Exit");
					System.out.print("Select one number between 1-5: ");
					num = input.nextInt();
					
					
					if(num == 1) {
						System.out.print("Members ID:");
						int id =input.nextInt();
						member.setId(id);
					}
					else if(num == 2) {
						System.out.print("Members Name:");
						String name =input.next();
						member.setName(name);
						}
					else if(num == 3) {
						System.out.print("Members Email:");
						String email =input.next();
						member.setEmail(email);
						}
					else if(num == 4) {
						System.out.print("Members Phonenumber:");
						String phonenumber =input.next();
						member.setPhonenumber(phonenumber);
						}
					else {
						continue;
					} // if
				}// while
				break;
			}// if
		}// for
	}
	public void ViewMembers(){
//		System.out.print("Members Id : ");
//		int membersId = input.nextInt();
		System.out.println("# of registered members:" + members.size());
		for(int i = 0;i<members.size();i++) {
			members.get(i).printInfo();
		}
	}
}
