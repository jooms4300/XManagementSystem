package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Exception.EmailFormatException;
import Member.KGymMember;
import Member.MemberInput;
import Member.MemberKind;
import manager.MemberManager;

public class MemberAdderListener implements ActionListener {
	JTextField fieldID;
	JTextField fieldName;
	JTextField fieldEmail;
	JTextField fieldPhone;
	
	MemberManager membermanager;
	
	public MemberAdderListener(JTextField fieldID, 
			JTextField fieldName, 
			JTextField fieldEmail, 
			JTextField fieldPhone,MemberManager membermanager) {
		this.fieldID = fieldID;
		this.fieldName = fieldName;
		this.fieldEmail = fieldEmail;
		this.fieldPhone = fieldPhone;
		this.membermanager = membermanager;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		MemberInput member = new KGymMember(MemberKind.KGym);
		
		try {
			member.setId(Integer.parseInt(fieldID.getText()));
			member.setName(fieldName.getName());
			member.setEmail(fieldEmail.getText());
			member.setPhonenumber(fieldPhone.getText());
			membermanager.addMembers(member);
			putObject(membermanager, "membermanager.sec");
			member.printInfo();
		} catch (EmailFormatException e1) {
			e1.printStackTrace();
		}
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
