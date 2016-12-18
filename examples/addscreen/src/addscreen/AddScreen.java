package addscreen;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;

public class AddScreen extends JFrame{
	public  JTextField textField;
	private  JFrame MainScreen;
	private String Name;
	private MainScreen mainScreen;
	public AddScreen() 
	{
		JLabel lblInsertAName = new JLabel("* insert a name ");
		lblInsertAName.setForeground(Color.RED);
		Listener listener = null;
		getContentPane().setLayout(null);
		setSize(new Dimension(440, 167));
		textField = new JTextField();
		textField.setBounds(145, 45, 208, 32);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Screen Name");
		lblNewLabel.setBounds(33, 45, 127, 32);
		getContentPane().add(lblNewLabel);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().toString().equals(""))
					lblInsertAName.setVisible(true);
				else
				{
					Name=textField.getText().toString();
					setVisible(false); //you can't see me!
					dispose(); //Destroy the JFrame object

				}
			}
		});
		
		btnAdd.setBounds(117, 99, 91, 23);
		getContentPane().add(btnAdd);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false); //you can't see me!
				dispose(); //Destroy the JFrame object
			}
		});
		btnCancel.setBounds(230, 99, 91, 23);
		getContentPane().add(btnCancel);
		
	
		lblInsertAName.setVisible(false);
		lblInsertAName.setBounds(159, 11, 135, 14);
		getContentPane().add(lblInsertAName);
		

	}
	public void addToMain( MainScreen mainscreen)
	{
		this.mainScreen = mainscreen;
	}

}