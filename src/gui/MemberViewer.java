package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Member.MemberInput;
import manager.MemberManager;

public class MemberViewer  extends JPanel{
	
	WindowFrame frame;

	MemberManager membermanager;
	
	public MemberViewer(WindowFrame frame,MemberManager membermanager) {
		this.frame =frame;
		this.membermanager = membermanager;
		
		System.out.println("***" + membermanager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("NAME");
		model.addColumn("Email");
		model.addColumn("Contact Info");
		
		for(int i=0; i<membermanager.size();i++) {
			Vector row = new Vector();
			MemberInput si = membermanager.get(i);
			row.add(si.getId());
			row.add(si.getName());
			row.add(si.getEmail());
			row.add(si.getPhonenumber());
			model.addRow(row);
			
		}
		
		JTable table  = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

}
