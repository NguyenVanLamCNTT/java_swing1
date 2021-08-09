package bai_1;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	public MyFrame() {
		// TODO Auto-generated constructor stub
	this.setTitle("Bai 1");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(false);
	this.setSize(420, 420);
	this.setVisible(true);
	ImageIcon image = new ImageIcon("facebook.png");
	this.setIconImage(image.getImage());
	this.getContentPane().setBackground(Color.green);
	}
}
