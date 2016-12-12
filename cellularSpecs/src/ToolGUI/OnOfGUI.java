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

public class OnOfGUI extends JFrame {
	protected JTextField txtUndefined;
	protected JTextField textField;
	protected static JButton btnSave;
	public OnOfGUI(String ScreenName)
	{
		setTitle("ON-OFF");
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JLabel lblOnoff = new JLabel("ON-OFF");
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
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"OFF", "ON"}));
		comboBox.setBounds(104, 100, 152, 20);
		getContentPane().add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(100, 142, 247, 134);
		getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		 btnSave = new JButton("save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ScreenGUI j=MainScreenGui.screenPanels.get(MainScreenGui.screenPanels.size()-1);
				
			
		 	       JLabel lblNewLabel = new JLabel("New label");
			        lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 1));
			        lblNewLabel.setBounds(0, 0, 143, 40);
			      lblNewLabel.setText(" "+textField.getText().toString()+"");

				      j.panel.add(lblNewLabel);
			        j.repaint();
			        j.revalidate();
			    	dispose();
				
			}
		});
		btnSave.setBounds(99, 287, 89, 23);
		getContentPane().add(btnSave);
		
		JButton btnCancel = new JButton("cancel");
		btnCancel.setBounds(230, 287, 89, 23);
		getContentPane().add(btnCancel);
		setSize(450, 370);
		
	}
	
}
