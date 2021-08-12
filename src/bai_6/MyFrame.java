package bai_6;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	public MyFrame() {
		// TODO Auto-generated constructor stub
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout(FlowLayout.LEADING,10,10));
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(250,250));
		panel.setBackground(Color.lightGray);
		panel.setLayout(new FlowLayout());;
		panel.add(new JButton("1"));
		panel.add(new JButton("1"));
		panel.add(new JButton("1"));
		panel.add(new JButton("1"));
		panel.add(new JButton("1"));
		panel.add(new JButton("1"));
		panel.add(new JButton("1"));
		panel.add(new JButton("1"));
		panel.add(new JButton("1"));
		panel.add(new JButton("1"));
		panel.add(new JButton("1"));
		this.add(panel);
	}
}
