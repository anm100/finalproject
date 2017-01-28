package ToolGUI;

import javax.swing.ImageIcon;
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
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;

import java.awt.Component;

import javax.swing.Box;
import javax.swing.JSeparator;

import java.awt.Button;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class DefUndefGUI extends JFrame {
	protected JTextField txtUndefined;
	protected JTextField textField;
	protected  int  x=0,y=0,hight=143,width=30;
	protected static JButton btnSave;
	public DefUndefGUI(String ScreenName)
	{
		setTitle(ScreenName+"Empty/NotEmpty");
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JLabel lblOnoff = new JLabel("<dynamic>-Empty/NotEmpty");
		lblOnoff.setFont(new Font("Arial", Font.BOLD, 22));
		lblOnoff.setBounds(20, 11, 361, 36);
		getContentPane().add(lblOnoff);
		
		JLabel lblName = new JLabel("Element name:");
		lblName.setBounds(30, 68, 78, 14);
		getContentPane().add(lblName);
		
		JLabel lblDefaulval = new JLabel("DefaultVal:");
		lblDefaulval.setBounds(30, 103, 64, 14);
		getContentPane().add(lblDefaulval);
		
		textField = new JTextField();
		textField.setBounds(104, 65, 152, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		 btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//ScreenGUI j=new ScreenGUI
				ScreenGUI j=MainScreenGui.screenPanels.get(MainScreenGui.screenPanels.size()-1);
				JLabel lblNewLabel=new JLabel ();
				 lblNewLabel=CreateLabel("New label",x,y,hight,width);
				 	y=y+30;
				 	System.out.print(lblNewLabel.getText().toString());
				      j.panel.add(lblNewLabel);
			        j.repaint();
			        j.revalidate();

			    	dispose();
			    	
				
			}
		});
		btnSave.setBounds(128, 287, 112, 23);
		getContentPane().add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(250, 287, 116, 23);
		getContentPane().add(btnCancel);
		
		JRadioButton rdbtnOn = new JRadioButton("NotEmpty");
		rdbtnOn.setBounds(100, 96, 78, 28);
		getContentPane().add(rdbtnOn);
		
		JRadioButton rdbtnOff = new JRadioButton("Empty");
		rdbtnOff.setSelected(true);
		rdbtnOff.setBounds(178, 96, 84, 28);
		getContentPane().add(rdbtnOff);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(30, 145, 445, 2);
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
		button.setBounds(20, 145, 236, 28);
		getContentPane().add(button);
		setSize(501, 367);
		
	}
	protected JLabel CreateLabel(String string, int x2, int y2, int hight2, int width2) {
	       JLabel lblNewLabel = new JLabel(string);
	        lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 1));
	        lblNewLabel.setBounds(x2, y2, hight2, width2);
	      lblNewLabel.setText(" "+textField.getText().toString()+"");
	      return lblNewLabel;
		// TODO Auto-generated method stub
	}
}
