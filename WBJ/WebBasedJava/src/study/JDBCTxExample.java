package study;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCTxExample {

	public static void main(String[] args) throws SQLException {
		DAO dao= new DAO();
		Connection con =dao.myGetConnection();
		PreparedStatement pstmt = con.prepareStatement("Update account set balance = ? where acctid=?");

		try{
			con.setAutoCommit(false);
			pstmt.setInt(1, 1000);
			pstmt.setString(2, "A");

			pstmt.executeUpdate();
			System.out.println("first Query Success");//succeeds but NOT committed-- on hold

			pstmt.setInt(1, 7000);
			pstmt.setString(2, "B");
			pstmt.executeUpdate();

			System.out.println("Succeeded...");
			con.commit();
		}catch(SQLException e)
		{
			System.out.println("Failed....");
			con.rollback();
		}
	}//end of main
}//end of class
