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
			
			switch(num) {
			case 1:
				{
				System.out.print("Members Id : ");
				int membersId = input.nextInt();
				
				System.out.print("Members Name : ");
				String membersName = input.next();
				
				System.out.print("Members Password : ");
				int membersPassword = input.nextInt();
				
				System.out.print("Members Email : ");
				String membersEmail = input.next();
				
				System.out.print("Members Phonenumber : ");
				int membersPhonenumber = input.nextInt();
				
				break;
				}
			case 2:
				{
					
				}
			case 3:
				{
					
				}
			case 4:
				{
				System.out.print("Members Id : ");
				int membersId2 = input.nextInt();
				}
			case 5:
				{
					
				}
			case 6:
				{
					
				}
			}
		}
	}

}
