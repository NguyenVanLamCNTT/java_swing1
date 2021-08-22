package bai_17;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrame extends JFrame implements ActionListener{
	JMenuItem loadItem, saveItem, exitItem;
	ImageIcon loadIcon, saveIcon, exitIcon;
	public MyFrame() {
		// TODO Auto-generated constructor stub
		loadIcon = new ImageIcon(new ImageIcon("smartphone.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		saveIcon = new ImageIcon(new ImageIcon("smartphone.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		exitIcon = new ImageIcon(new ImageIcon("smartphone.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		JMenu helpMenu = new JMenu("Help");
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save");
	    exitItem = new JMenuItem("Exit");
	    
	    fileMenu.setMnemonic(KeyEvent.VK_F);// alt+ f for file
	    editMenu.setMnemonic(KeyEvent.VK_E);// alt + e for edit
	    helpMenu.setMnemonic(KeyEvent.VK_H);// alt + h for help
	    
	    loadItem.setMnemonic(KeyEvent.VK_L);// l for load
	    saveItem.setMnemonic(KeyEvent.VK_S);// s for save
	    exitItem.setMnemonic(KeyEvent.VK_E);// e for exit
	    
	    loadItem.setIcon(loadIcon);
	    saveItem.setIcon(saveIcon);
	    exitItem.setIcon(exitIcon);
	    
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		this.setJMenuBar(menuBar);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==loadItem) {
			System.out.println("Load");
		}
		if(e.getSource()==saveItem) {
			System.out.println("save");
		}
		if(e.getSource()==exitItem) {
			System.exit(0);
		}
	}
	
}
