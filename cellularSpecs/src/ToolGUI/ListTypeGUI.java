package ToolGUI;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;

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
		lblName.setBounds(20, 68, 46, 14);
		getContentPane().add(lblName);
		
		JLabel lblDefaulval = new JLabel("DefaultVal:");
		lblDefaulval.setBounds(21, 218, 64, 14);
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
		lblValues.setBounds(21, 93, 64, 14);
		getContentPane().add(lblValues);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(104, 96, 149, 108);
		getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		setSize(501, 496);
		
		values=textArea.getText().split("\n");
		comboBox.setModel(new DefaultComboBoxModel(values));
		
		JButton btnSave = new JButton("save");
		btnSave.setBounds(73, 365, 89, 23);
		getContentPane().add(btnSave);
		
		JButton btnCancel = new JButton("cancel");
		btnCancel.setBounds(201, 365, 89, 23);
		getContentPane().add(btnCancel);
		System.out.println(values.toString());
		JSeparator separator = new JSeparator();
		separator.setBounds(40, 243, 445, 2);
		getContentPane().add(separator);
		ImageIcon imageForOne = new ImageIcon(getClass().getResource("../add.png"));
		JButton button = new JButton("Add action",imageForOne);
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setHorizontalAlignment(SwingConstants.LEADING);
		button.setBackground(UIManager.getColor("Button.highlight"));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(20, 243, 236, 28);
		getContentPane().add(button);
		
		JLabel lblNewLabel_1 = new JLabel(textField.getText()+" val:");
		lblNewLabel_1.setBounds(20, 291, 84, 14);
		getContentPane().add(lblNewLabel_1);
		
		JComboBox comboBox1 = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {""}));
		comboBox.setBounds(57, 288, 78, 20);
		getContentPane().add(comboBox);
		
		JLabel label = new JLabel("Choose element:");
		label.setBounds(146, 291, 84, 14);
		getContentPane().add(label);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(229, 288, 89, 20);
		getContentPane().add(comboBox_1);
		
		JLabel label_1 = new JLabel("Change VAL:");
		label_1.setBounds(328, 291, 69, 14);
		getContentPane().add(label_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(397, 285, 78, 20);
		getContentPane().add(comboBox_2);
		setSize(501, 378);
		
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
