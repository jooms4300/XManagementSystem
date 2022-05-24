package Member;

import java.io.Serializable;
import java.util.Scanner;

import Exception.EmailFormatException;

public abstract class Member implements MemberInput, Serializable { 
	/**
	 * 
	 */
	private static final long serialVersionUID = -582031875151753159L;
	protected MemberKind kind = MemberKind.KGym;
	protected int id;
	protected String name;
	protected String email;
	protected String phonenumber;
	
	public Member() {
		
	}
	
	public Member(MemberKind kind) {
		this.kind = kind;
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
	
	public Member(MemberKind kind,int id,String name,String email,String phonenumber) {
		this.kind = kind;
		this.id=id;
		this.name=name;
		this.email=email;
		this.phonenumber=phonenumber;

	}
	public MemberKind getKind() {
		return kind;
	}
	public void setKind(MemberKind kind) {
		this.kind = kind;
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
	public void setEmail(String email) throws EmailFormatException{
		if(!email.contains("@") && !email.equals("")) {
			throw new EmailFormatException();
		}
		this.email = email;
	}
	
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public abstract void printInfo();
	
	public void setMemberID(Scanner input) {
		System.out.print("Members ID:");
		int id =input.nextInt();
		this.setId(id);
	}
	
	public void setMemberName(Scanner input) {
		System.out.print("Members Name:");
		String name =input.next();
		this.setName(name);
	}
	
	public void setMemberEmail(Scanner input) {
		String email = "";
		while(!email.contains("@")) {
			System.out.print("Members Email:");
			email =input.next();
			try {
				this.setEmail(email);
			} 
			catch (EmailFormatException e) {
				System.out.println("Incorrect Email Format. put the e-mail address tha contains @");
			}
		}
	}
	
	public void setMemeberPhonenumber(Scanner input) {
		System.out.print("Members Phonenumber:");
		String phonenumber =input.next();
		this.setPhonenumber(phonenumber);
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
