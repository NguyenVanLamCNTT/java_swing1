package bai_2;



import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class MyFrame extends JFrame{
	public MyFrame() {
		ImageIcon image = new ImageIcon("facebook.png");
		Border border = BorderFactory.createLineBorder(Color.green,3);
		JLabel label = new JLabel();
		label.setText("Hi Lam");
		label.setIcon(image);
	    label.setHorizontalTextPosition(JLabel.CENTER);	//text center
		label.setVerticalTextPosition(JLabel.TOP);//set text top;
		label.setForeground(new Color(0,255,0));// color text
		label.setFont(new Font("MV Boli", Font.PLAIN,20));//set font text
		label.setIconTextGap(-25);
		label.setBackground(new Color(255,0,0));
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);// image center
		label.setHorizontalAlignment(JLabel.CENTER);// text center
//		label.setBounds(100,100,550,550);
		
		this.setTitle("Bai 2");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setSize(500,500);
//		this.setLayout(null);
		this.setVisible(true);
		this.add(label);
		this.pack();
	}
}
