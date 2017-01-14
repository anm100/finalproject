package ToolGUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Listener.MouseActionListener;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;

public class MainScreenGui extends JFrame {
	Boolean flage;
	//ArrayList<Integer> list = new ArrayList<Integer>();  
	static  ArrayList<ScreenGUI> screenPanels=new ArrayList<ScreenGUI>() ;
	
	public static structers mytool = new structers();
	static ScreenGUI scrennGui;
	
	 public MainScreenGui() {
		flage=false;
			setSize(750,600);
		getContentPane().setLayout(null);
		//MouseActionListener mouseActionListener=new MouseActionListener();
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 709, 23);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnAddscreen = new JButton("AddScreen");
		btnAddscreen.setBounds(321, 0, 99, 23);
		panel.add(btnAddscreen);
		
		JButton btnNew = new JButton("new");
		btnNew.setBounds(24, 0, 89, 23);
		panel.add(btnNew);
		
		JButton btnNewButton = new JButton("import");
		btnNewButton.setBounds(123, 0, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnExport = new JButton("export");
		btnExport.setBounds(222, 0, 89, 23);
		panel.add(btnExport);
		
		JButton btnRunVerification = new JButton("Run verification");
		btnRunVerification.setBounds(570, 0, 113, 23);
		panel.add(btnRunVerification);
		
		JButton btnSelectrequirment = new JButton("selectRequirment");
		btnSelectrequirment.setBounds(434, 0, 126, 23);
		panel.add(btnSelectrequirment);
		btnAddscreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flage=true;
			
			}	
		});
		
		int x1=0,y1;
		addMouseListener(new MouseListener()  {
			public void actionPerformed(ActionEvent e) {
			
			}
			

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				if(flage==true)
				{
					 scrennGui=new ScreenGUI();
				//	S.setLocation(x1-9, y1-29);
					scrennGui.setLocation(arg0.getX()-9,arg0.getY()-29 );
					getContentPane().add(scrennGui);
					getContentPane().repaint();
					getContentPane().revalidate();
					flage=false;
					getContentPane().removeMouseListener(null);
					setBackground(null);
					screenPanels.add(scrennGui);
					
				}
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
		
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}


	public static void main(String[] args) {
		MainScreenGui f=new MainScreenGui();
	
	f.setVisible(true);
}
}
