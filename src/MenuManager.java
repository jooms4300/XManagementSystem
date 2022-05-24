import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;

public class MenuManager {
	
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		MemberManager membermanager = getObject("membermanager.sec");
		if(membermanager == null) {
			membermanager = new MemberManager(input);
		}
	
		selectMenu(input, membermanager);
		putObject(membermanager, "membermanager.sec");
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
					logger.log("add a student");
					break;
				case 2:
					membermanager.DeleteMembers();
					logger.log("Delete a student");
					break;
				case 3:
					membermanager.EditMembers();
					logger.log("Edit a student");
					break;
				case 4:
					membermanager.ViewMembers();
					logger.log("View a student");
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
	
	public static MemberManager getObject(String filename){
		MemberManager membermanager = null;
		
		try {
			
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			membermanager = (MemberManager)in.readObject();
			
			in.close();
			file.close();
			
			return membermanager;
		} catch (FileNotFoundException e) {
				return membermanager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
		
		return membermanager;
	}
	
	public static void putObject(MemberManager membermanager, String filename) {

		try {
			
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(membermanager);
			
			out.close();
			file.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
