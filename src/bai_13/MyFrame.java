package bai_13;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;


public class MyFrame extends JFrame implements ActionListener{
	JRadioButton pizzaButton,humButton, hotdogButton;
	ButtonGroup group;
	ImageIcon pizzaIcon, humIcon, hotdogIcon;
	public MyFrame() {
		// TODO Auto-generated constructor stub
		pizzaIcon = new ImageIcon(new ImageIcon("smartphone.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		humIcon = new ImageIcon(new ImageIcon("facebook.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		hotdogIcon = new ImageIcon(new ImageIcon("smartphone.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		pizzaButton = new JRadioButton("pizza");
		humButton = new JRadioButton("hamberger");
		hotdogButton = new JRadioButton("hotdog");
		
		pizzaButton.setIcon(pizzaIcon);
		humButton.setIcon(humIcon);
		hotdogButton.setIcon(hotdogIcon);
		
		group = new ButtonGroup();
		group.add(hotdogButton);
		group.add(humButton);
		group.add(pizzaButton);
		
		pizzaButton.addActionListener(this);
		humButton.addActionListener(this);
		hotdogButton.addActionListener(this);
		this.add(hotdogButton);
		this.add(humButton);
		this.add(pizzaButton);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==pizzaButton) {
			System.out.println("You order pizza!");
		}else if(e.getSource()==humButton){
			System.out.println("You order hamberger");
			
		}else if(e.getSource()==hotdogButton){
			System.out.println("You order hotdog");
		}
	}

}
