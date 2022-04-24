package Member;

import java.util.Scanner;

public class Member { 


	public Member() {
		
	}
	public Member(int id,String name) {
		this.id=id;
		this.name=name;

	}
	public Member(int id,String name,String email,String phonenumber) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.phonenumber=phonenumber;

	}
	
	public MemberKind getKind() {
		return Kind;
	}
	public void setKind(MemberKind kind) {
		Kind = kind;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	protected MemberKind Kind = MemberKind.KGym;
	protected int id;
	protected String name;
	protected String email;
	protected String phonenumber;
	public void printInfo() {
		System.out.println("id: " + id + " name: "+ name 
				+ " email: " + email + " phonenumber: " + phonenumber);
	}
	
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
}
