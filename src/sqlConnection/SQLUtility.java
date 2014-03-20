package sqlConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLUtility<T> {
	private PreparedStatement pst = null;
	private ResultSet rs		  = null;
	private SQLConnect database;
	
	public SQLUtility(){
		database = SQLConnect.getDatabaseConnectionInstance();
	}
	@SuppressWarnings("unchecked")
	public T Select(String Query) {
		try {
			pst = database.conn.prepareStatement(Query);
			rs  = pst.executeQuery();
			if(rs.next()) {
				return (T) rs.getString(1);
//				System.out.println(rs.getStatement());
//				System.out.println(rs.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
//	public T Insert(String insertQuery) {
//		try {
//			pst = database.conn.prepareStatement(Query);
//			rs  = pst.executeQuery();
//			if(rs.next()){
//				insert (T) rs.insertRow();
//			}
	/**
     *
     * @param query String The query to be executed
     * @return a ResultSet object containing the results or null if not available
     * @throws SQLException
     */
//    public ResultSet query(String query) throws SQLException{
//        statement = database.conn.createStatement();
//        ResultSet res = statement.executeQuery(query);
//        return res;
//    }
    /**
     * @desc Method to insert data to a table
     * @param insertQuery String The Insert query
     * @return boolean
     * @throws SQLException
     */
//    public int insert(String insertQuery) throws SQLException {
//        statement = database.conn.createStatement();
//        int result = statement.executeUpdate(insertQuery);
//        return result;
//    }    
    // ETC
}
   