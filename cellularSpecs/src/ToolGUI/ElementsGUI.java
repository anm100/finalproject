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

public class ElementsGUI extends JPanel {
	private JTextField textField;
	private JTextField txtUndefined;
	private 	JPanel panel;
	public ElementsGUI()
	{
		setBorder(new LineBorder(new Color(255, 0, 0), 0, true));
		setLayout(null);
		setSize(143, 133);
		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblName.setBounds(10, 11, 46, 14);
		add(lblName);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField.setBounds(51, 11, 63, 14);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblType = new JLabel("Type");
		lblType.setHorizontalAlignment(SwingConstants.LEFT);
		lblType.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblType.setBounds(10, 32, 46, 14);
		add(lblType);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 10));

		comboBox.setModel(new DefaultComboBoxModel(new String[] {"----","TextField", "List", "Button", "On/Off"}));
		comboBox.setBounds(51, 30, 63, 19);
		add(comboBox);
		

		 panel = new JPanel();
		panel.setBounds(10, 52, 123, 80);
		add(panel);
		panel.setLayout(null);


		

		
		
		

		

		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=comboBox.getSelectedItem().toString();
				switch (s)
				{
					case "----":
						panel.removeAll();
						repaint();
						break;
					case "TextField":
						CallCase3();
						break;
					case "List":
						CallCase2();
						break;
					case "Button":
						CallCase3();
						break;
						
					case "On/Off":
						 CallCase4();

						break;
				}
				
			}
		});
		
	}
	private void CallCase2() {
		// TODO Auto-generated method stub
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(0, 0, 138, 125);
		panel.add(panel_2);
		
		JList list = new JList();
		list.setBounds(127, 11, 1, 1);
		panel_2.add(list);
		
		JLabel lblListOfValues = new JLabel("Values");
		lblListOfValues.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblListOfValues.setBounds(0, 0, 74, 25);
		panel_2.add(lblListOfValues);
		JComboBox comboBox_2 = new JComboBox();
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("comboBoxEdited"))
				{
					comboBox_1.addItem(comboBox_1.getSelectedItem());
					comboBox_2.addItem(comboBox_1.getSelectedItem());
					comboBox_1.setSelectedItem(" ");
				}
			}
		});

		comboBox_1.setEditable(true);

		comboBox_1.setBounds(41, 2, 65, 20);
		panel_2.add(comboBox_1);
		
		JLabel lblDefultValue = new JLabel("defult ");
		lblDefultValue.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblDefultValue.setBounds(0, 28, 40, 14);
		panel_2.add(lblDefultValue);
		
		
		comboBox_2.setBounds(41, 25, 65, 20);
		panel_2.add(comboBox_2);
		panel.removeAll();
		panel.add(panel_2);
		
		JButton btnSave = new JButton("save");
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnSave.setBounds(41, 53, 65, 20);
		panel_2.add(btnSave);
		panel_2.setVisible(true);
		repaint();
		revalidate();

		
		
	}
	private void CallCase3() {
		panel.removeAll();
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(0, 0, 138, 80);
		JLabel lblDefultValue_1 = new JLabel("defult");
		lblDefultValue_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblDefultValue_1.setBounds(0, 0, 69, 26);
		panel_3.add(lblDefultValue_1);
		
		txtUndefined = new JTextField();
		txtUndefined.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtUndefined.setText("undefined");
		txtUndefined.setBounds(42, 3, 62, 20);
		panel_3.add(txtUndefined);
		txtUndefined.setColumns(10);
		panel.add(panel_3);
		
		JButton btnNewButton = new JButton("save");
		btnNewButton.setBounds(35, 46, 75, 23);
		panel_3.add(btnNewButton);
		panel_3.setVisible(true);
		repaint();
		revalidate();
	}
	private void CallCase4() {
		panel.removeAll();
		
		repaint();
		revalidate();

	}
}
