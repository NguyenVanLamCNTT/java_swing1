package bai_4;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {
	JButton button;
	JLabel label;
	public MyFrame() {
		ImageIcon icon = new ImageIcon(new ImageIcon("facebook.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		label = new JLabel();
		label.setIcon(icon);
		label.setBounds(150,250,150,150);
		label.setVisible(false);
	    button =new JButton();
		button.setBounds(100,100,250,100);
		button.addActionListener(e -> test());
		button.setText("I'm a button");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans", Font.BOLD,25));
		button.setIconTextGap(-5);
		button.setForeground(Color.cyan);
		button.setBackground(Color.lightGray);
		button.setBorder(BorderFactory.createEtchedBorder());
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}
	public void test() {
//		System.out.println("haha") ;button.setEnabled(false);
		label.setVisible(true);
	}
}
