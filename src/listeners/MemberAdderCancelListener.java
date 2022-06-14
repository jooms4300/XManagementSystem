package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.MemberAdder;
import gui.WindowFrame;

public class MemberAdderCancelListener implements ActionListener{
	WindowFrame frame;
	
	public MemberAdderCancelListener(WindowFrame frame) {
		this.frame = frame;
	}
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuselction());
		frame.revalidate();
		frame.repaint();
	}
}
