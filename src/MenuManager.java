import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MemberManager membermanager = new MemberManager(input);
		// MemberManger클래스를 활용하기 위해 클래스변수를 선언해주고 MemberManger클래스의 생성자 인수(input)를 넣어준다.
		int num=0;
		while(num!=5) {
			System.out.println("1. Add fitness ceter members ");
			System.out.println("2. Delete fitness ceter members");
			System.out.println("3. Edit fitness ceter members");
			System.out.println("4. View fitness ceter members");
			System.out.println("5. Exit");
			System.out.print("Select one number between 1-5: ");
			num = input.nextInt();
			
			// 위에서 만든 클래스변수로 MemberManger클래스에 있는 메소드에 접근한다.
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
