package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.MemberManager;

public class WindowFrame extends JFrame{
	
	MenuSelection menuselction;
	MemberAdder memberadder;
	MemberViewer memberviewer;
	
	MemberManager membermanager;
	
	public WindowFrame(MemberManager membermanager) {
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My frame");
		
		this.membermanager = membermanager;
		this.menuselction = new MenuSelection(this);
		this.memberadder = new MemberAdder(this,this.membermanager);
		this.memberviewer = new MemberViewer(this,this.membermanager);
	
		this.setupPanel(menuselction);
		
		this.setVisible(true);		
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselction() {
		return menuselction;
	}

	public void setMenuselction(MenuSelection menuselction) {
		this.menuselction = menuselction;
	}

	public MemberAdder getMemberadder() {
		return memberadder;
	}

	public void setMemberadder(MemberAdder memberadder) {
		this.memberadder = memberadder;
	}

	public MemberViewer getMemberviewer() {
		return memberviewer;
	}

	public void setMemberviewer(MemberViewer memberviewer) {
		this.memberviewer = memberviewer;
	}


}
