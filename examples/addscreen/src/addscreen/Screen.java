package addscreen;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSplitPane;
import javax.swing.border.LineBorder;

public class Screen extends JPanel {
	private String Name;
	public Screen(String Name) {
		setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		this.setSize(new Dimension(119, 111));
		this.Name=Name;
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 9, 96, 33);
		add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 53, 96, 47);
		add(panel_1);
		//this.setBackground(Color.BLACK);

		JButton addNewItem = new JButton("AddItem");
		
		panel.add(addNewItem);

		addNewItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddItem addItem=new AddItem();
				panel_1.add(addItem);
				panel_1.repaint();
				panel.repaint();
				panel.revalidate();
			}
		});
		
	}
}