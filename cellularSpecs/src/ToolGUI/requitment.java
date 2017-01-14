package ToolGUI;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class requitment extends JFrame{
	public requitment() {
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JLabel lblChooseRequirment = new JLabel("check :");
		lblChooseRequirment.setBounds(10, 11, 98, 14);
		getContentPane().add(lblChooseRequirment);
		
		JCheckBox chckbxAll = new JCheckBox("All");
		chckbxAll.setBackground(Color.WHITE);
		chckbxAll.setBounds(0, 33, 97, 23);
		getContentPane().add(chckbxAll);
		
		JCheckBox chckbxThereIs = new JCheckBox("There is Always an exit from any screen.");
		chckbxThereIs.setBackground(Color.WHITE);
		chckbxThereIs.setBounds(0, 57, 243, 23);
		getContentPane().add(chckbxThereIs);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("There is a screen (root), such that each screen is reached from it.");
		chckbxNewCheckBox.setBackground(Color.WHITE);
		chckbxNewCheckBox.setBounds(0, 83, 371, 23);
		getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("We can't  move from screen_j to screen_i without changing or defining a parameter.");
		chckbxNewCheckBox_1.setBackground(Color.WHITE);
		chckbxNewCheckBox_1.setBounds(0, 111, 459, 23);
		getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Parameter cannot accept value that is not defined in the List of the possible values.");
		chckbxNewCheckBox_2.setBackground(Color.WHITE);
		chckbxNewCheckBox_2.setBounds(0, 137, 427, 23);
		getContentPane().add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("There is no path to a screen that allows  \"Illegal parameters values\".");
		chckbxNewCheckBox_3.setBackground(Color.WHITE);
		chckbxNewCheckBox_3.setBounds(0, 163, 427, 23);
		getContentPane().add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Each list of parameters must be defined before entering a screen.");
		chckbxNewCheckBox_5.setBackground(Color.WHITE);
		chckbxNewCheckBox_5.setBounds(0, 217, 427, 23);
		getContentPane().add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Parameters values cannot change unless it was intended to do so in its path");
		chckbxNewCheckBox_6.setBackground(Color.WHITE);
		chckbxNewCheckBox_6.setBounds(0, 243, 427, 23);
		getContentPane().add(chckbxNewCheckBox_6);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("If a Parameter changes  in a specific state the change should be updated wherever the parameter is used.");
		chckbxNewCheckBox_7.setBackground(Color.WHITE);
		chckbxNewCheckBox_7.setBounds(0, 269, 543, 23);
		getContentPane().add(chckbxNewCheckBox_7);
		
		JCheckBox chckbxNewCheckBox_8 = new JCheckBox("All parameters always must be consistent.");
		chckbxNewCheckBox_8.setBackground(Color.WHITE);
		chckbxNewCheckBox_8.setBounds(0, 294, 270, 23);
		getContentPane().add(chckbxNewCheckBox_8);
		
		JLabel lblNote = new JLabel("note: (Illegal i.e. value that does not defined in the list of the parameters values)");
		lblNote.setBounds(10, 193, 443, 14);
		getContentPane().add(lblNote);
		
		JButton btnSave = new JButton("save");
		btnSave.setBounds(86, 330, 89, 23);
		getContentPane().add(btnSave);
		
		JButton btnClear = new JButton("clear");
		btnClear.setBounds(181, 330, 89, 23);
		getContentPane().add(btnClear);
		
		JButton btnCancel = new JButton("cancel");
		btnCancel.setBounds(280, 330, 89, 23);
		getContentPane().add(btnCancel);
	}
}
