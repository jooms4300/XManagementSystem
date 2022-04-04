
public class Member { 
	int id;
	String name;
	String email;
	String phonenumber;
	
	public Member() {
		
	}
	public Member(int id,String name,String email,String phonenumber) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.phonenumber=phonenumber;
	}
	public void printInfo() {
		System.out.println("id: " + id + " name: "+ name 
				+ " email: " + email + " phonenumber: " + phonenumber);
	}
}
