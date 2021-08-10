package bai_5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	JPanel panel1,panel2, panel3,panel4, panel5;
	
	public MyFrame() {
		// TODO Auto-generated constructor stub
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		panel5 = new JPanel();
		
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.green);
		panel3.setBackground(Color.yellow);
		panel4.setBackground(Color.magenta);
		panel5.setBackground(Color.blue);
		
		panel1.setPreferredSize(new Dimension(100,100));
		panel2.setPreferredSize(new Dimension(100,100));
		panel3.setPreferredSize(new Dimension(100,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new BorderLayout(10,10));
		this.add(panel1,BorderLayout.NORTH);
		this.add(panel2,BorderLayout.WEST);
		this.add(panel3,BorderLayout.CENTER);
		this.add(panel4,BorderLayout.EAST);
		this.add(panel5,BorderLayout.SOUTH);
		this.setVisible(true);
	}
}
