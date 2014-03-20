package quiz;

import javax.swing.JFrame;
import javax.swing.JRadioButton;

import java.awt.Color;
import java.sql.DriverManager;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

import com.mysql.jdbc.Connection;

import sqlConnection.SQLConnect;
import sqlConnection.SQLUtility;
import cannonGame.CannonGame;
import sqlConnection.DBConnect;
import javax.swing.JTextField;
import javax.swing.JTextPane;


public class Quiz extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	
	
	
	public Quiz(){
	SQLUtility select = new SQLUtility();
	String str = "SELECT question FROM gamequestions";
	String Question = (String) select.Select(str);
	
	
	getContentPane().setBackground(Color.LIGHT_GRAY);
	getContentPane().setLayout(null);
	this.setSize(450, 325);
	
	JPanel panel = new JPanel();
	panel.setBounds(72, 15, 337, 69);
	getContentPane().add(panel);
	
	
	JLabel lblQuestion = new JLabel("Question:");
	lblQuestion.setBounds(10, 11, 55, 14);
	getContentPane().add(lblQuestion);
	
	JLabel lblSelectYourAnswer = new JLabel("Select your answer");
	lblSelectYourAnswer.setBounds(10, 113, 102, 14);
	getContentPane().add(lblSelectYourAnswer);
	
	JRadioButton rdbtnA = new JRadioButton("a)");
	rdbtnA.setBounds(20, 134, 109, 23);
	getContentPane().add(rdbtnA);
	
	JRadioButton rdbtnB = new JRadioButton("b:");
	rdbtnB.setBounds(20, 160, 109, 23);
	getContentPane().add(rdbtnB);
	
	JRadioButton rdbtnC = new JRadioButton("c)");
	rdbtnC.setBounds(20, 186, 109, 23);
	getContentPane().add(rdbtnC);
	
	JRadioButton rdbtnD = new JRadioButton("d)");
	rdbtnD.setBounds(20, 212, 109, 23);
	getContentPane().add(rdbtnD);
	
	JButton btnNewButton = new JButton("Submit");
	btnNewButton.setBounds(20, 242, 89, 23);
	getContentPane().add(btnNewButton);
	
	JPanel panel_1 = new JPanel();
	panel_1.setBounds(135, 134, 274, 23);
	getContentPane().add(panel_1);
	
	JPanel panel_2 = new JPanel();
	panel_2.setBounds(135, 158, 274, 25);
	getContentPane().add(panel_2);
	
	JPanel panel_3 = new JPanel();
	panel_3.setBounds(135, 186, 274, 23);
	getContentPane().add(panel_3);
	
	JPanel panel_4 = new JPanel();
	panel_4.setBounds(135, 212, 274, 23);
	getContentPane().add(panel_4);
	
	textField = new JTextField();
	textField.setBounds(167, 95, 86, 20);
	getContentPane().add(textField);
	textField.setColumns(10);
	
	
	JTextPane textPane = new JTextPane();
	textPane.setBounds(328, 95, 60, 20);
	getContentPane().add(textPane);
}
	
	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quiz().setVisible(true);
                
               
            }
        });
			}
	}
