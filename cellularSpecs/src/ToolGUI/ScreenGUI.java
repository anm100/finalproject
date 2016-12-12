package ToolGUI;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JScrollPane;

import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class ScreenGUI extends JPanel {

	public static JPanel panel;
	private int x=0,y=0,width=143,hight=40;
	private JTextField	textField;
	protected String screenName;
	
	public ScreenGUI() {
		setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		setSize(161, 220);
		setLayout(null);
	
  		textField = new JTextField();
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(1, 1, 123, 32);
		add(panel_1);
		panel_1.setLayout(null);
		textField = new JTextField();
		textField.setBounds(71, 6, 50, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("Screen Name");
		label.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label.setBounds(1, 5, 73, 22);
		panel_1.add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(125, 1, 35, 32);
		add(panel_2);
		screenName=(textField.getText().toString());
		   OnOfGUI onOffGui=new OnOfGUI(screenName);
			 DefUndefGUI  defUndefGUI=new DefUndefGUI();
	  		  ListTypeGUI listTypeGui=new ListTypeGUI();
		   
		/*JButton btnNewButton = new JButton("+");
		panel_2.add(btnNewButton);
		btnNewButton.setFont(new Font("Sylfaen", Font.PLAIN, 9));
		btnNewButton.setHorizontalAlignment(SwingConstants.RIGHT);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	ElementsGUI elementGui=new ElementsGUI();
				//elementGui.setVisible(true);
				//panel.repaint();
				//panel.revalidate();
				//panel.add(elementGui);
				textField.setEditable(false);
				repaint();
				revalidate();
				panel_2.remove(btnNewButton);
				
			
			}
		});*/
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBorder(null);
        scrollPane.setViewportBorder(null);
        scrollPane.setBounds(10, 44, 143, 165);
        add(scrollPane);
         panel = new JPanel();
        scrollPane.setViewportView(panel);
        panel.setBorder(null);
        panel.setLayout(null);
		 JMenuBar menubar = new JMenuBar();
		 panel_2.add(menubar);
		 JMenu newMenu = new JMenu("+");
		 newMenu.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 	//	frameScreenPanels.addElement(screenName, scrennGui);
		 	}
		 });
		 	JMenuItem onOff = new JMenuItem("On/Off");
		 	onOff.addActionListener(new ActionListener() 
		 	{
		 		public void actionPerformed(ActionEvent arg0) {
		 		    System.out.println("Selected: " + arg0.getActionCommand());
		 		    onOffGui.setVisible(true);
			        
		 		}
		 	});
		 	
		 	
		 	
	        JMenuItem button = new JMenuItem("button");
	        button.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent arg0) {
		 		    System.out.println("Selected: " + arg0.getActionCommand());
	
	        	}
	        });
	        
	        JMenuItem defUndef = new JMenuItem("defined/undefined");
	        defUndef.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent arg0) {
	        		
	        		 System.out.println("Selected: " + arg0.getActionCommand());

	        		 defUndefGUI.setVisible(true);
	        	}
	        });
	        
	        JMenuItem List = new JMenuItem("List");
	        List.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent arg0) {
		 		    System.out.println("Selected: " + arg0.getActionCommand());
			 		 
				 		  listTypeGui.setVisible(true);
	        	}
	        });
	        newMenu.add(onOff);
	        newMenu.add(button);
	        newMenu.add(List);
	        newMenu.add(defUndef);


	        menubar.add(newMenu);

	        


		

	}
	protected void Create(String string, String string2) {
		//String s=null;
		//s=string +" "+string2;
      //  JLabel l1=new JLabel(s);
       // JLabel lblNewLabel = new JLabel("New label");
       // lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 1));
      //  lblNewLabel.setBounds(0, 0, 143, 40);
       // panel.add(lblNewLabel);
      //  repaint();
    //    revalidate();
		
		
	}


}
