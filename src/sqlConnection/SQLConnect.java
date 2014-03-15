package sqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SQLConnect {
	public static SQLConnect connectionInstance;
	public Connection conn = null;
	
	public SQLConnect(){
		try { 
			Class.forName("com.mysql.jdbc.Driver");
            try {
                this.conn = DriverManager.getConnection("jdbc:mysql://localhost/gameDB", "root", "");
            } catch (SQLException ex) {
                Logger.getLogger(SQLConnect.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch (ClassNotFoundException e) {
            System.out.println("not connected");
        }
	}
	public static synchronized SQLConnect getDatabaseConnectionInstance() {
		if ( connectionInstance == null ) {
			connectionInstance = new SQLConnect();
		}
		return connectionInstance;
	}
	
	public void getData(){
		try{
			String query = "select * from gameUser";
			
			
		}catch(Exception ex){
			System.out.println(ex);
		}
	
	}
	
}

