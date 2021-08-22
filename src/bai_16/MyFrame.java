package bai_16;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class MyFrame {
	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar();
	public MyFrame() {
		// TODO Auto-generated constructor stub
		bar.setValue(0);
		bar.setBounds(0,0,420,50);
		bar.setStringPainted(true);
		bar.setFont(new Font("MV Boli",Font.BOLD,25));
		
		frame.add(bar);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		fill();
	}
	public void fill() {
	int i;
		for (i = 0; i<= 100;i++) {
			bar.setValue(i);
			try {
				Thread.sleep(50);
			}catch (InterruptedException e) {
				// TODO: handle exception
				
				e.printStackTrace();
			}
		}
		bar.setString("Done! :)");
	}
}
