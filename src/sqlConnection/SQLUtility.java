//package sqlConnection;
//
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class SQLUtility {
////	private PreparedStatement statement;
//	private Statement statement;
//	private SQLConnect database;
//	
//	public SQLUtility(){
//		database = SQLConnect.getDatabaseConnectionInstance();
//	}
//	/**
//     *
//     * @param query String The query to be executed
//     * @return a ResultSet object containing the results or null if not available
//     * @throws SQLException
//     */
//    public ResultSet query(String query) throws SQLException{
//        statement = database.conn.createStatement();
//        ResultSet res = statement.executeQuery(query);
//        return res;
//    }
//    /**
//     * @desc Method to insert data to a table
//     * @param insertQuery String The Insert query
//     * @return boolean
//     * @throws SQLException
//     */
//    public int insert(String insertQuery) throws SQLException {
//        statement = database.conn.createStatement();
//        int result = statement.executeUpdate(insertQuery);
//        return result;
// 
//    }    
//    // ETC
//}
//   