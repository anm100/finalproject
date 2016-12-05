package addscreen;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Listener implements java.awt.event.ActionListener{
	private int x,y;
	private  MainScreen mainScreen;
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		AddScreen addScreen=new AddScreen();
		addScreen.addToMain(mainScreen);
		addScreen.setVisible(true);
		String Name=addScreen.textField.toString();
		if(!(Name.equals(""))){
		mainScreen.addMouseListener(new MouseAdapter() { 
	          public void mouseClicked(MouseEvent me) { 
	        	 System.out.print("saeed ");
	        	  y=me.getY(); 
	        	  x=me.getX(); 	
	        	   mainScreen.removeMouseListener(this);
	    		Screen S=new Screen(Name);
	    		mainScreen.getContentPane().add(S);
	    		mainScreen.setContentPane(mainScreen.getContentPane());
	    		S.setLocation(x-9, y-29);
	    		
	            } 
	          }); 

		}
	
	}
	public void addToMain( MainScreen mainScreen)
	{
		this.mainScreen = mainScreen;
	}
}
