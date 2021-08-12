package bai_9;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow extends JFrame {
	JLabel label;
	public NewWindow() {
		// TODO Auto-generated constructor stub
		label = new JLabel("Hello!");
		label.setBounds(0,0,100,50);
		label.setFont(new Font(null, Font.PLAIN,25));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.setLayout(null);
		this.add(label);
	}
}
