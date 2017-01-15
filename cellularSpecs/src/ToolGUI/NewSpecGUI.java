package ToolGUI;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JProgressBar;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewSpecGUI extends JFrame{
	private JTextField textField;
	private JTextField txtC;
	public NewSpecGUI() {
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JButton btnCancel = new JButton("Abort");
		btnCancel.setBounds(227, 218, 107, 23);
		getContentPane().add(btnCancel);
		
		JLabel lblVerifySpec = new JLabel("New workspace");
		lblVerifySpec.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblVerifySpec.setBounds(23, 0, 263, 45);
		getContentPane().add(lblVerifySpec);
		
		JLabel lblStatus = new JLabel("Spec name: ");
		lblStatus.setBounds(23, 70, 64, 14);
		getContentPane().add(lblStatus);
		
		JLabel lblPath = new JLabel("Location:");
		lblPath.setBounds(23, 108, 53, 14);
		getContentPane().add(lblPath);
		
		textField = new JTextField();
		textField.setBounds(86, 67, 284, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		txtC = new JTextField();
		txtC.setText("c:\\");
		txtC.setColumns(10);
		txtC.setBounds(86, 105, 208, 20);
		getContentPane().add(txtC);
		
		JButton btnBrowse = new JButton("Browse..");
		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBrowse.setBounds(297, 104, 75, 23);
		getContentPane().add(btnBrowse);
	}
}
