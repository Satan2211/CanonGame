package quiz;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

import sqlConnection.DBConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class InsertQuestion extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private Connection con;
	private Statement st;
	private ResultSet rs;

	public InsertQuestion() {
		DBConnect con = new DBConnect();
		
		getContentPane().setLayout(null);

		JLabel lblQuestion = new JLabel("Question");
		lblQuestion.setBounds(10, 36, 46, 14);
		getContentPane().add(lblQuestion);

		JButton btnAddNewQuestion = new JButton("Add and return");
		btnAddNewQuestion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAddNewQuestion.setBounds(10, 327, 109, 23);
		getContentPane().add(btnAddNewQuestion);

		JButton btnAddAndCreate = new JButton("Add and create a new question");
		btnAddAndCreate.setBounds(129, 327, 183, 23);
		getContentPane().add(btnAddAndCreate);

		JLabel lblSelectCategory = new JLabel("Select Category");
		lblSelectCategory.setBounds(10, 11, 77, 14);
		getContentPane().add(lblSelectCategory);

		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Statement stmt = con.createStatement() ;
				String query = "select game_category from gamecategory ;" ;
				ResultSet rs = stmt.executeQuery(query) ;
			}
		});
		comboBox.setBounds(109, 8, 77, 20);
		getContentPane().add(comboBox);

		JButton btnCreateNewCategory = new JButton("Create new category");
		btnCreateNewCategory.setBounds(196, 7, 135, 23);
		getContentPane().add(btnCreateNewCategory);

		textField = new JTextField();
		textField.setBounds(10, 59, 377, 70);
		getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(65, 166, 322, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblSelectCorrectAnswer = new JLabel("Select correct answer");
		lblSelectCorrectAnswer.setBounds(10, 140, 104, 14);
		getContentPane().add(lblSelectCorrectAnswer);

		JRadioButton rdbtnA = new JRadioButton("a)");
		rdbtnA.setBounds(10, 165, 109, 23);
		getContentPane().add(rdbtnA);

		JRadioButton rdbtnB = new JRadioButton("b)");
		rdbtnB.setBounds(10, 202, 46, 23);
		getContentPane().add(rdbtnB);

		JRadioButton rdbtnC = new JRadioButton("c)");
		rdbtnC.setBounds(10, 241, 46, 23);
		getContentPane().add(rdbtnC);

		JRadioButton rdbtnD = new JRadioButton("d)");
		rdbtnD.setBounds(10, 282, 46, 23);
		getContentPane().add(rdbtnD);

		textField_2 = new JTextField();
		textField_2.setBounds(65, 203, 322, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(65, 242, 322, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(65, 283, 322, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
	}
}
