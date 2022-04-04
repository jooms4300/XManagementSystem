import java.util.Scanner;

public class MemberManager {
	Member member;
	Scanner input;
	 
	MemberManager(Scanner input){
		this.input = input; 
	}
	
	public void addMembers(){
		member = new Member();
		System.out.print("Members Id : ");
		member.id = input.nextInt();
		System.out.print("Members Name : ");
		member.name = input.next();
		System.out.print("Members Email : ");
		member.email = input.next();
		System.out.print("Members Phonenumber : ");
		member.phonenumber= input.next();
	}
 	public void DeleteMembers(){
		System.out.print("Members Id : ");
		int membersId = input.nextInt();
		if(member==null) {
			System.out.println("the member has not been registered");
			return;
		}
		if(member.id==membersId) {
			member = null;
			System.out.println("the member is deleted");
		}
	}
	public void EditMembers(){
		System.out.print("Members Id : ");
		int membersId = input.nextInt();
		if(member.id==membersId) {
			System.out.println("the member to be edited is " + member.id);
		}
	}
	public void ViewMembers(){
		System.out.print("Members Id : ");
		int membersId = input.nextInt();
		if(member.id==membersId) {
			member.printInfo();
		}
	}
}
