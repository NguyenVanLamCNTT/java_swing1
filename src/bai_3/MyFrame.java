package bai_3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	public MyFrame() {
		ImageIcon imageIcon = new ImageIcon(new ImageIcon("facebook.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		JLabel label = new JLabel();
		label.setText("Hi");
		label.setIcon(imageIcon);
		label.setVerticalAlignment(JLabel.BOTTOM);
		label.setHorizontalAlignment(JLabel.RIGHT);
		
		JPanel redPanel =new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 250, 250);
		redPanel.add(label);
		JPanel bluPanel =new JPanel();
		bluPanel.setBackground(Color.blue);
		bluPanel.setBounds(250, 0, 250, 250);
		JPanel greenPanel =new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 500, 250);
		greenPanel.setLayout(new BorderLayout());
		greenPanel.add(label);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(750,750);
		this.setVisible(true);
		this.add(redPanel);
		this.add(bluPanel);
		this.add(greenPanel);

	}
}
