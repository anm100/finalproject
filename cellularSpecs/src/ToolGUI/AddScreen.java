package ToolGUI;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.TextArea;
import java.awt.Button;

public class AddScreen extends JFrame {
	private JTextField textField;
	public AddScreen() {
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JLabel lblAddScreenDetails = new JLabel("Screen details");
		lblAddScreenDetails.setBounds(10, 23, 89, 14);
		getContentPane().add(lblAddScreenDetails);
		
		JLabel lblScreenName = new JLabel("Name:");
		lblScreenName.setBounds(10, 48, 69, 14);
		getContentPane().add(lblScreenName);
		
		textField = new JTextField();
		textField.setBounds(47, 48, 142, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(10, 80, 69, 14);
		getContentPane().add(lblDescription);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(10, 100, 179, 179);
		getContentPane().add(textArea);
		
		Button button = new Button("Save");
		button.setBounds(10, 285, 70, 22);
		getContentPane().add(button);
		
		Button button_1 = new Button("Cancel");
		button_1.setBounds(99, 285, 70, 22);
		getContentPane().add(button_1);
	}
}
