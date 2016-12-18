package addscreen;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Space extends JFrame{
	public Space() 
	{
		getContentPane().setLayout(null);
		
		JButton btnAddScreen = new JButton("Add Screen");
		btnAddScreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAddScreen.setBounds(0, 0, 91, 23);
		getContentPane().add(btnAddScreen);		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

