import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num=0;
		Scanner input = new Scanner(System.in);
		while(num!=6) {
			System.out.println("1. Add fitness ceter members ");
			System.out.println("2. Delete fitness ceter members");
			System.out.println("3. Edit fitness ceter members");
			System.out.println("4. View fitness ceter members");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.print("Select one number between 1-6: ");
			num = input.nextInt();
			
			if(num == 1) {
				addMembers();
			}
			else if(num == 2) {
				DeleteMembers();
			}
			else if(num == 3) {
				EditMembers();
			}
			else if(num == 4) {
				ViewMembers();
			}
			else {
				continue;
			}
		}
	}
	public static void addMembers(){
		Scanner input = new Scanner(System.in);
		System.out.print("Members Id : ");
		int membersId = input.nextInt();
		System.out.print("Members Name : ");
		String membersName = input.next();
		System.out.print("Members Email : ");
		String membersEmail = input.next();
		System.out.print("Members Phonenumber : ");
		String membersPhonenumber = input.next();
	}
 	public static void DeleteMembers(){
		Scanner input = new Scanner(System.in);
		System.out.print("Members Id : ");
		int membersId = input.nextInt();
	}
	public static void EditMembers(){
		Scanner input = new Scanner(System.in);
		System.out.print("Members Id : ");
		int membersId = input.nextInt();
	}
	public static void ViewMembers(){
		Scanner input = new Scanner(System.in);
		System.out.print("Members Id : ");
		int membersId = input.nextInt();
	}
}
