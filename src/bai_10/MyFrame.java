package bai_10;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MyFrame {
	public MyFrame() {
		//TODO Auto-generated constructor stub
		//JOptionPane.showMessageDialog(null, "This is some useless infor", "title", JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null, "This is some useless infor", "title", JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "in?", "title", JOptionPane.QUESTION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "This is some useless infor", "title", JOptionPane.WARNING_MESSAGE);
		//JOptionPane.showMessageDialog(null, "This is some useless infor", "title", JOptionPane.ERROR_MESSAGE);
		
//		System.out.println(JOptionPane.showConfirmDialog(null,"hihi","titel" , JOptionPane.YES_NO_CANCEL_OPTION));
//		String name = JOptionPane.showInputDialog("what is your name?: ");
//		System.out.println("Hi "+name);
		String[] res = {"No", "thank you","'ngu'"};
		ImageIcon icon = new ImageIcon("facebook.png");
		JOptionPane.showOptionDialog(null,"HI Lam","titel", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, res, 0);
	}
}
