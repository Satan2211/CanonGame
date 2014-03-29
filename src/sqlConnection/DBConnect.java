package sqlConnection;
import java.sql.*;

public class DBConnect {
	
	Connection conn;
	private Statement st;
	private ResultSet rs;
	public static DBConnect connectionInstance;
	
	public DBConnect(){
	try{
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gameDB?user=root");
    }catch(Exception ex){
        System.out.println("Connection failed :" +ex);}
    }

	public static synchronized DBConnect getDatabaseConnectionInstance() {
		if ( connectionInstance == null ) {
			connectionInstance = new DBConnect();
		}
		return connectionInstance;
	}
	public Statement createStatement() {
		// TODO Auto-generated method stub
		return null;
	}

}

