package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listeners.ButtonAddListener;
import listeners.ButtonViewListener;

public class MenuSelection extends JPanel {
	
	WindowFrame frame;
	
	public MenuSelection(WindowFrame frame) {
		this.frame =frame;
		
		this.setLayout(new BorderLayout());
		JPanel pane11 = new JPanel();
		JPanel pane12 = new JPanel();
		JLabel label = new JLabel("Menu Selection");
		
		JButton button1 = new JButton("add Member");
		JButton button2 = new JButton("view Member");
		JButton button3 = new JButton("Edit Member");
		JButton button4 = new JButton("Delete Member");
		JButton button5 = new JButton("Exit Program");
		
		
		button1.addActionListener(new ButtonAddListener(frame));
		button2.addActionListener(new ButtonViewListener(frame));
		
		
		pane11.add(label);
		pane12.add(button1);
		pane12.add(button2);
		pane12.add(button3);
		pane12.add(button4);
		pane12.add(button5);
		
		this.add(pane11,BorderLayout.NORTH);
		this.add(pane12,BorderLayout.CENTER);
	}
}
