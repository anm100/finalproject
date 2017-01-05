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
			setSize(500,600);
		getContentPane().setLayout(null);
		//MouseActionListener mouseActionListener=new MouseActionListener();
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 484, 23);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnAddscreen = new JButton("AddScreen");
		
		int x1=0,y1;
		btnAddscreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flage=true;
			
			}	
		});
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
		
		btnAddscreen.setBounds(385, 0, 99, 23);
		panel.add(btnAddscreen);
	}


	public static void main(String[] args) {
		MainScreenGui f=new MainScreenGui();
	
	f.setVisible(true);
}

}
