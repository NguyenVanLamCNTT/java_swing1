package bai_9;

import java.awt.Button;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage extends JFrame{
	public LaunchPage() {
		// TODO Auto-generated constructor stub
		JButton myButton = new JButton("New Window");
		myButton.setBounds(100,160,200,40);
		myButton.setFocusable(false);
		myButton.addActionListener(e ->test());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.setLayout(null);
		this.add(myButton);	
	}
	public void test() {
		
		NewWindow myWindow = new NewWindow();
		myWindow.setVisible(true);
	}
}
