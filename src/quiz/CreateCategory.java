package quiz;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CreateCategory extends JFrame{
	private JTextField textField;
	public CreateCategory() {
		getContentPane().setLayout(null);
		
		JLabel lblCreateANew = new JLabel("Create a new Category");
		lblCreateANew.setBounds(10, 11, 120, 14);
		getContentPane().add(lblCreateANew);
		
		textField = new JTextField();
		textField.setBounds(10, 36, 207, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(10, 67, 89, 23);
		getContentPane().add(btnSubmit);
	}
}
