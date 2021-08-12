package bai_7;

import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		// TODO Auto-generated constructor stub
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new GridLayout(3,3,10,10));
		this.add(new JButton("1"));
		this.add(new JButton("1"));
		this.add(new JButton("1"));
		this.add(new JButton("1"));
		this.add(new JButton("1"));
		this.add(new JButton("1"));
		this.add(new JButton("1"));
		this.add(new JButton("1"));
		this.add(new JButton("1"));
	
	}
}
