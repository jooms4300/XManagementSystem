import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MemberManager membermanager = new MemberManager(input);
		
		int num=-1;
		while(num!=5) {
			System.out.println("1. Add fitness ceter members ");
			System.out.println("2. Delete fitness ceter members");
			System.out.println("3. Edit fitness ceter members");
			System.out.println("4. View fitness ceter members");
			System.out.println("5. Exit");
			System.out.print("Select one number between 1-5: ");
			num = input.nextInt();
			
			
			if(num == 1) {
				membermanager.addMembers();
			}
			else if(num == 2) {
				membermanager.DeleteMembers();
			}
			else if(num == 3) {
				membermanager.EditMembers();
			}
			else if(num == 4) {
				membermanager.ViewMembers();
			}
			else {
				continue;
			}
		}
	}
	
}
