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
			
			
			
			/* 
			   저번 class project 시간에는 case문으로 사용자에게 입력받은 메뉴번호를 조건으로 실행문을 구현했지만
			   이번시간에는 메소드를 이용하여 구현을 함.
			   
			   메뉴 1-6번을 사용자에게 입력받고 num==1일때는 멤버를 추가할 수 있는 메소드를
			   num==2일때는 멤버를 삭제하는 메소드를 num==3일때는 멤버를 수정하는 메소드를 
			   num==4일떄는 멤버를 볼 수 있는 메소드를 불러오게 하도록 if else문을 구현한다.
		 	   if else구문을 한 이유는 num이 각각 1,2,3,4일때와 메뉴를 보여주는 경우 이 5가지의 조건이 있기 떄문이다.
			   else부분에 continue는 다시 메뉴번호의 입력을 받게 하기위함이다.(없어도 while반복문에 의해 메뉴의 입력을 받음)
			*/
			
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
			
			// 
		}
	}
	
	// 위의 조건이 만족할 때 실행문에서 불러오는 메소드를 만든다.
	
	// num==1일때 불러올 메소드
	/* 
	   Id는 정수타입으로 입력받고 나머지 이름,이메일,전화번호는 문자열타입을 입력받고 저장한다.
	   정수타입을 입력받을때 : .nextInt(), 문자열타입을 입력받을떄 : .next()
	*/
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
	
	// 멤버삭제,멤버수정,멤버보기도 각각 num이 2,3,4일떄 불러오는 메소드는 만든다.
	
	// 삭제,수정,보기를 하려면 멤버를 Id를 불러와야하기 떄문에 먼저 멤버의 Id를 받는 실행문을 구현한다.
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
