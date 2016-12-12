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
import javax.swing.JSeparator;

public class ButtonTypeGUI extends JFrame {
	private JTextField txtUndefined;
	private JTextField textField;
	private int i ; 
	public ButtonTypeGUI()
	{
		setTitle("ON-OFF");
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JLabel lblOnoff = new JLabel("Button ");
		lblOnoff.setFont(new Font("Arial", Font.BOLD, 22));
		lblOnoff.setBounds(20, 11, 361, 36);
		getContentPane().add(lblOnoff);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(30, 68, 46, 14);
		getContentPane().add(lblName);
		
		JLabel lblDefaulval = new JLabel("DefaultVal:");
		lblDefaulval.setBounds(30, 103, 64, 14);
		getContentPane().add(lblDefaulval);
		
		JLabel lblDetails = new JLabel("Move To : ");
		lblDetails.setBounds(30, 135, 57, 14);
		getContentPane().add(lblDetails);
		
		textField = new JTextField();
		textField.setBounds(104, 65, 152, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEnabled(false);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Undefined"}));
		comboBox.setBounds(104, 100, 152, 20);
		getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Show Screens"}));
		comboBox_1.setBounds(104, 132, 152, 20);
		getContentPane().add(comboBox_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 169, 418, 14);
		getContentPane().add(separator);
		
		JLabel lblConditions = new JLabel("conditions");
		lblConditions.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblConditions.setBounds(20, 175, 93, 20);
		getContentPane().add(lblConditions);
 
		JButton btnNewButton = new JButton("+");
		i=0;
		setSize(464, 413);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				JLabel lblElement = new JLabel("element:");
				lblElement.setBounds(48, 222+i, 46, 14);
				getContentPane().add(lblElement);
				
				JComboBox comboBox_2 = new JComboBox();
				comboBox_2.setBounds(104, 219+i, 80, 20);
				getContentPane().add(comboBox_2);
				
				JLabel lblValue = new JLabel("value:");
				lblValue.setBounds(210,222+i, 46, 14);
				getContentPane().add(lblValue);
				
				JComboBox comboBox_3 = new JComboBox();
				comboBox_3.setBounds(256, 219+i, 93, 20);
				getContentPane().add(comboBox_3);
				i+=30;
			       repaint();
			      revalidate();
				
				
			}
		});
		btnNewButton.setBounds(383, 176, 41, 23);
		getContentPane().add(btnNewButton);
		

		
	}
}
