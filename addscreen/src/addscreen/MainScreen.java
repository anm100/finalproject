package addscreen;

import java.awt.Dimension;

import javax.swing.*;

public class MainScreen extends JFrame {
public String Name;
public MainScreen()
{
	Listener listener=new Listener();
	listener.addToMain(this);
	setSize(new Dimension(500,500));
	getContentPane().setLayout(null);
	JButton btnAddScreen = new JButton("Add Screen");
	btnAddScreen.setHorizontalAlignment(SwingConstants.LEADING);
	btnAddScreen.setBounds(0, 0, 101, 23);
	btnAddScreen.addActionListener(listener);
	getContentPane().add(btnAddScreen);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainScreen MainFrame=new MainScreen();
		MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainFrame.setVisible(true);
		

	}
	
}
