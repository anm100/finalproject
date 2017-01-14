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
import javax.swing.JLabel;
import java.awt.Font;

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
		
		JButton btnAddscreen = new JButton("AddScreen");
		btnAddscreen.setBounds(25, 55, 99, 23);
		getContentPane().add(btnAddscreen);
		
		JLabel label = new JLabel("<Spec name>");
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBounds(34, 11, 163, 35);
		getContentPane().add(label);
		
		JButton btnNewButton = new JButton("Open..");
		btnNewButton.setBounds(511, 17, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNew = new JButton("NEW");
		btnNew.setBounds(412, 17, 89, 23);
		getContentPane().add(btnNew);
		
		JButton btnExport = new JButton("Save spec");
		btnExport.setBounds(610, 17, 89, 23);
		getContentPane().add(btnExport);
		
		JButton btnRunVerification = new JButton("Verifiy Spec");
		btnRunVerification.setBounds(563, 513, 136, 23);
		getContentPane().add(btnRunVerification);
		btnExport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
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
