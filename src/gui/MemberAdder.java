package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listeners.MemberAdderCancelListener;
import listeners.MemberAdderListener;
import manager.MemberManager;

public class MemberAdder extends JPanel {
	
	WindowFrame frame;
	
	MemberManager membermanager;
	
	public MemberAdder(WindowFrame frame, MemberManager membermanager) {
		this.frame =frame;
		this.membermanager = membermanager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelID = new JLabel("ID : ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelName = new JLabel("Name : ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelEmail = new JLabel("Email : ", JLabel.TRAILING);
		JTextField fieldEmail = new JTextField(10);
		labelName.setLabelFor(fieldEmail);
		panel.add(labelEmail);
		panel.add(fieldEmail);
	
		JLabel labelPhone = new JLabel("phone : ", JLabel.TRAILING);
		JTextField fieldPhone= new JTextField(10);
		labelName.setLabelFor(fieldPhone);
	
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new MemberAdderListener(fieldID,fieldName,fieldEmail,fieldPhone, membermanager));
		
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new MemberAdderCancelListener(frame));
		panel.add(labelPhone);
		panel.add(fieldPhone);
		
	
		panel.add(saveButton);
		panel.add(cancelButton);
	
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);
		
	}
}
