package Member;

import java.util.Scanner;

public abstract class Member { 
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
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public abstract void printInfo();
	

	

}
