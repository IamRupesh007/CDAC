package study;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class DAO {

	public Connection myGetConnection()
	{
		Connection con = null;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/wbjava";
			String uname = "root";
			String pwd = "Rupesh@1996";

			con = DriverManager.getConnection(url,uname,pwd);
		}
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println("The connection could not be made "+e);
		}
		return con;
	}

	public ResultSet getRows(String query) {

		Connection con = myGetConnection();
		Statement stmt;
		ResultSet rs =null;

		try {

			stmt = con.createStatement();
			rs= stmt.executeQuery(query);
		} catch(SQLException e) {
			e.printStackTrace();
		}

		return rs;
	}

	public void showResultSet(ResultSet rs)
	{
		
		try {
			while(rs.next())
			{
				int pId=rs.getInt("id");
				String pName = rs.getString("productName");
				int cost = rs.getInt(3);
				
				System.out.println("Row : "+pId+","+pName+","+cost);
			}
		} catch (SQLException e) {
			
			System.out.println("problem showing resultset"+e);
			
		}

	}
	public void callgetNameProc(int id)
	{
		Connection con = myGetConnection();
		
		try {
			CallableStatement cstmt= con.prepareCall("{ call getName(?,?)}");
			cstmt.registerOutParameter(2, Types.VARCHAR);
			cstmt.setInt(1, id);
			
			cstmt.execute();

			String msg = cstmt.getString(2);
			System.out.println("You got a message"+msg);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}