package ToolGUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class DefUndefGUI extends JFrame {
	private JTextField txtUndefined;
	private JTextField textField;
	public DefUndefGUI()
	{
		setTitle("Defined/Undefined");
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JLabel lblOnoff = new JLabel("Defined/Undefined");
		lblOnoff.setFont(new Font("Arial", Font.BOLD, 22));
		lblOnoff.setBounds(20, 11, 361, 36);
		getContentPane().add(lblOnoff);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(30, 68, 46, 14);
		getContentPane().add(lblName);
		
		JLabel lblDefaulval = new JLabel("DefaultVal:");
		lblDefaulval.setBounds(30, 103, 64, 14);
		getContentPane().add(lblDefaulval);
		
		JLabel lblDetails = new JLabel("Details:");
		lblDetails.setBounds(30, 142, 46, 14);
		getContentPane().add(lblDetails);
		
		textField = new JTextField();
		textField.setBounds(104, 65, 152, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Undefined", "Defined"}));
		comboBox.setBounds(104, 100, 152, 20);
		getContentPane().add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(100, 142, 247, 134);
		getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnSave = new JButton("save");
		btnSave.setBounds(120, 287, 89, 23);
		getContentPane().add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(258, 287, 89, 23);
		getContentPane().add(btnCancel);
		setSize(450, 367);
		
	}
}
