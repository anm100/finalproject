package ToolGUI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class action extends JFrame
{
	public action() {
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JLabel lblParamVal = new JLabel("Param val :");
		lblParamVal.setBounds(0, 64, 63, 14);
		getContentPane().add(lblParamVal);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(58, 61, 58, 20);
		getContentPane().add(comboBox);
		
		JLabel lblChooseParam = new JLabel("Choose param");
		lblChooseParam.setBounds(126, 64, 84, 14);
		getContentPane().add(lblChooseParam);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(198, 61, 89, 20);
		getContentPane().add(comboBox_1);
		
		JLabel label_2 = new JLabel("Change VAL:");
		label_2.setBounds(415, 64, 69, 14);
		getContentPane().add(label_2);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(484, 61, 78, 20);
		getContentPane().add(comboBox_2);
		
		JButton btnAddAction = new JButton("add action");
		btnAddAction.setBounds(0, 30, 89, 23);
		getContentPane().add(btnAddAction);
		
		JLabel lblCondition = new JLabel("Condition");
		lblCondition.setBounds(286, 64, 46, 14);
		getContentPane().add(lblCondition);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(342, 61, 63, 20);
		getContentPane().add(comboBox_3);
	}
}
