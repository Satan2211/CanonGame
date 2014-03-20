package quiz;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import sqlConnection.DBConnect;
import sqlConnection.SQLUtility;

public class viewQuestions extends JFrame {
	private JTable table;
	public viewQuestions() {
		DBConnect con = new DBConnect();
		getContentPane().setLayout(null);
		
		JLabel lblYourCurrentQuestions = new JLabel("Your current questions");
		lblYourCurrentQuestions.setBounds(10, 11, 123, 14);
		getContentPane().add(lblYourCurrentQuestions);
		
		DefaultTableModel model = (DefaultTableModel) JTable.getModel();
		while(rs.next())
		{ 
		    n = rs.getString("Full_Name");
		    e= rs.getString("Email");
		    //Object[][]data={{n,e}};
		    // This will add row from the DB as the last row in the JTable. 
		    model.insertRow(table.getRowCount(), new Object[] {n, e});
		}
		
		table = new JTable();
		table.setBounds(10, 50, 403, 189);
		getContentPane().add(table);
		
	}
}
