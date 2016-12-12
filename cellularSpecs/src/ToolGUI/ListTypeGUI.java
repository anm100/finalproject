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
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.event.PopupMenuListener;
import javax.swing.event.PopupMenuEvent;

public class ListTypeGUI extends JFrame {
	private JTextField txtUndefined;
	private JTextField textField;
	private String values[]={""} ; 
	public ListTypeGUI()
	{
		setTitle("List Element");
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JLabel lblOnoff = new JLabel("List Element");
		lblOnoff.setFont(new Font("Arial", Font.BOLD, 22));
		lblOnoff.setBounds(20, 11, 361, 36);
		getContentPane().add(lblOnoff);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(30, 68, 46, 14);
		getContentPane().add(lblName);
		
		JLabel lblDefaulval = new JLabel("DefaultVal:");
		lblDefaulval.setBounds(30, 218, 64, 14);
		getContentPane().add(lblDefaulval);
		
		textField = new JTextField();
		textField.setBounds(104, 65, 152, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		JComboBox comboBox = new JComboBox();


		comboBox.setModel(new DefaultComboBoxModel(values));
		comboBox.setBounds(104, 215, 152, 20);
	
		

		
		getContentPane().add(comboBox);
		
		JLabel lblValues = new JLabel("Values:");
		lblValues.setBounds(20, 93, 64, 14);
		getContentPane().add(lblValues);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(104, 96, 149, 108);
		getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		setSize(450, 326);
		
		values=textArea.getText().split("\n");
		comboBox.setModel(new DefaultComboBoxModel(values));
		
		JButton btnSave = new JButton("save");
		btnSave.setBounds(76, 246, 89, 23);
		getContentPane().add(btnSave);
		
		JButton btnCancel = new JButton("cancel");
		btnCancel.setBounds(197, 246, 89, 23);
		getContentPane().add(btnCancel);
		System.out.println(values.toString());
		
		comboBox.addPopupMenuListener(new PopupMenuListener() {
			public void popupMenuCanceled(PopupMenuEvent arg0) {
			}
			
			public void popupMenuWillBecomeInvisible(PopupMenuEvent arg0) {
			}
			public void popupMenuWillBecomeVisible(PopupMenuEvent arg0) {
				values=textArea.getText().split("\n");
				comboBox.setModel(new DefaultComboBoxModel(values));
				System.out.println(values.toString());
			}
		});


		
		
	}
	
}
