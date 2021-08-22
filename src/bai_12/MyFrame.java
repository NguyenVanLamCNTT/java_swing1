package bai_12;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	JCheckBox checkBox ;
	JButton button;
	ImageIcon vicon;
	ImageIcon xicon;
	public MyFrame() {
		// TODO Auto-generated constructor stub
		vicon = new ImageIcon(new ImageIcon("facebook.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		xicon = new ImageIcon(new ImageIcon("smartphone.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		button = new JButton("Submit");
		button.addActionListener(this);
		checkBox = new JCheckBox();
		checkBox.setText("I'm not a robot");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Consolas", Font.PLAIN,35));
		checkBox.setIcon(xicon);
		checkBox.setSelectedIcon(vicon);
		this.add(checkBox);
		this.add(button);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== button) {
			System.out.println(checkBox.isSelected());
		}
	}
}
