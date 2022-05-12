import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MemberManager membermanager = new MemberManager(input);
		
		selectMenu(input, membermanager);
	}
	
	public static void selectMenu(Scanner input, MemberManager membermanager) {
		int num=-1;
		while(num!=5) {
			try {
				showMenu();
				
				num = input.nextInt();
				
				switch(num) {
				case 1:
					membermanager.addMembers();
					break;
				case 2:
					membermanager.DeleteMembers();
					break;
				case 3:
					membermanager.EditMembers();
					break;
				case 4:
					membermanager.ViewMembers();
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e){
				System.out.println("Please put an integer between 1 and 5!");
				if (input.hasNext()) {
					input.next();
				}
				num=-1;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("1. Add fitness ceter members ");
		System.out.println("2. Delete fitness ceter members");
		System.out.println("3. Edit fitness ceter members");
		System.out.println("4. View fitness ceter members");
		System.out.println("5. Exit");
		System.out.print("Select one number between 1-5: ");
		
		
	}
}
