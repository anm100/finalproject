package ToolGUI;

import javax.swing.JFrame;
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

public class ScreenGUI extends JPanel {
	private JTextField textField;
	public ScreenGUI() {
		setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		setSize(135, 182);
		setLayout(null);
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		panel.setBounds(7, 30, 118, 141);
		add(panel);
		panel.setLayout(null);
		textField = new JTextField();
		textField.setBounds(10, 3, 67, 20);
		add(textField);
		textField.setColumns(10);
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ElementsGUI elementGui=new ElementsGUI();
				elementGui.setVisible(true);
				panel.repaint();
				panel.revalidate();
				panel.add(elementGui);
				textField.setEditable(false);
				repaint();
				revalidate();
			}
		});
		btnNewButton.setBounds(79, 3, 46, 21);
		add(btnNewButton);
		btnNewButton.setFont(new Font("Sylfaen", Font.PLAIN, 9));
		btnNewButton.setHorizontalAlignment(SwingConstants.RIGHT);
		

	}
}
