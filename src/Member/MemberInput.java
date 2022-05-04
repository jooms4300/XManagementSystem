package Member;

import java.util.Scanner;

public interface MemberInput {
	public int getId();
	
	public void setId(int id);
	
	public void setName(String name);
	
	public void setEmail(String email);
	
	public void setPhonenumber(String phonenumber);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
}
