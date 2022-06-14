package Member;

import java.util.Scanner;

import Exception.EmailFormatException;

public interface MemberInput {
	public int getId();
	
	public void setId(int id);
	
	public String getName();
	
	public void setName(String name);
	
	public String getEmail();
	
	public void setEmail(String email) throws EmailFormatException;
	
	public String getPhonenumber() ;
	
	public void setPhonenumber(String phonenumber);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public  void setMemberID(Scanner input);
	
	public void setMemberName(Scanner input);
	
	public void setMemberEmail(Scanner input);

	public void setMemeberPhonenumber(Scanner input); 
}
