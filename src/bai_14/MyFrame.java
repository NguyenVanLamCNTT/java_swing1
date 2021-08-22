package bai_14;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	JComboBox comboBox ;
	public MyFrame() {
		// TODO Auto-generated constructor stub
		
		String[] array = {"dog", "cat", "bird"};
		comboBox = new JComboBox(array);
		
		comboBox.addActionListener(this);
		
		this.add(comboBox);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== comboBox) {
			System.out.println(comboBox.getSelectedItem());
			comboBox.setEditable(false);
		}
	}

}
