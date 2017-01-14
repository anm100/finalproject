package ToolGUI;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.Icon;

public class AddActionGUI extends JFrame
{
	public AddActionGUI() {
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"wifi"}));
		comboBox.setEnabled(false);
		comboBox.setBounds(108, 44, 84, 20);
		getContentPane().add(comboBox);
		
		JLabel lblChooseParam = new JLabel("Choose param");
		lblChooseParam.setBounds(42, 113, 84, 14);
		getContentPane().add(lblChooseParam);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(118, 110, 89, 20);
		getContentPane().add(comboBox_1);
		
		JLabel label_2 = new JLabel("Change VAL:");
		label_2.setBounds(248, 113, 69, 14);
		getContentPane().add(label_2);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(315, 110, 78, 20);
		getContentPane().add(comboBox_2);
		
		JLabel lblOnoff = new JLabel("<dynamic>- ONOFF - Add Action");
		lblOnoff.setFont(new Font("Arial", Font.BOLD, 22));
		lblOnoff.setBounds(32, 0, 361, 36);
		getContentPane().add(lblOnoff);
		
		JLabel lblNewLabel = new JLabel("Condition for action: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(22, 177, 116, 20);
		getContentPane().add(lblNewLabel);
		ImageIcon imageForOne = new ImageIcon(getClass().getResource("../delete.png"));
		JButton btnAddOtherConditon = new JButton("+");
		btnAddOtherConditon.setBounds(146, 177, 41, 21);
		getContentPane().add(btnAddOtherConditon);
		
		JLabel lblAction = new JLabel("Action:");
		lblAction.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAction.setBounds(10, 76, 63, 20);
		getContentPane().add(lblAction);
		
		JLabel label = new JLabel("Choose param");
		label.setBounds(27, 47, 84, 14);
		getContentPane().add(label);
		
		JLabel lblValue = new JLabel("Value=");
		lblValue.setBounds(218, 47, 84, 14);
		getContentPane().add(lblValue);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"ON", "OFF"}));
		comboBox_3.setBounds(262, 44, 84, 20);
		getContentPane().add(comboBox_3);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 156, 499, 20);
		getContentPane().add(separator);
		
		JLabel label_1 = new JLabel("Choose param");
		label_1.setBounds(56, 212, 84, 14);
		getContentPane().add(label_1);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setEnabled(false);
		comboBox_4.setBounds(139, 209, 84, 20);
		getContentPane().add(comboBox_4);
		
		JLabel label_3 = new JLabel("Value=");
		label_3.setBounds(233, 211, 84, 14);
		getContentPane().add(label_3);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(277, 208, 84, 20);
		getContentPane().add(comboBox_5);
		
		JButton button = new JButton("+");
		button.setBounds(118, 75, 41, 21);
		getContentPane().add(button);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(133, 320, 112, 23);
		getContentPane().add(btnSave);
		
		JButton button_2 = new JButton("cancel");
		button_2.setBounds(255, 320, 116, 23);
		getContentPane().add(button_2);
		
		JLabel lblNewLabel_1 = new JLabel(imageForOne);
		lblNewLabel_1.setBounds(32, 212, 25, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel label_4 = new JLabel(imageForOne);
		label_4.setBounds(22, 113, 25, 14);
		getContentPane().add(label_4);
	}
}
