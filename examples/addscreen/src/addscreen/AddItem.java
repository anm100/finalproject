package addscreen;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddItem  extends JPanel {
		private JTextField textField;
		public AddItem() {
			this.setSize(104,22);
			this.setLayout(new FlowLayout(FlowLayout.LEFT,1,1));
			textField = new JTextField();
			this.add(textField);
			textField.setColumns(5);
				JButton btnNewButton2 = new JButton("OFF");
				btnNewButton2.setPreferredSize(new Dimension(55,20));
			this.add(btnNewButton2);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
