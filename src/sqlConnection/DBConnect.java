package sqlConnection;
import java.sql.*;

public class DBConnect {
	
	Connection conn;
	private Statement st;
	private ResultSet rs;
	public static DBConnect connectionInstance;
	
	public DBConnect(){
//	{
//	try{
//		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gameDB?user=root");
//		st = con.createStatement();
//	}catch(Exception ex){
//		System.out.println("Error: "+ex);
//	
//	}
//
//	}
//	
	try{
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gameDB?user=root");
    }catch(Exception ex){
        System.out.println("Connection failed :" +ex);}
    }
	public void getData(){
		try{
			String query = "select * from gameUser";
			rs = st.executeQuery(query);
			System.out.println("Record from db:");
			while(rs.next()){
				String name = rs.getString("userId");
				System.out.println("User ID:" +name);
			}
		}catch (Exception ex){
			
		}
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

