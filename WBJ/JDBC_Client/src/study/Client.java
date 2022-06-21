package study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Client {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//load the driver class from jar to RAM
		Class.forName("com.mysql.cj.jdbc.Driver"); //this is class name from Referenced Library
		
		String url ="jdbc:mysql://localhost:3306/WBJava";
		String uname= "root";
		String pwd= "Rupesh@1996";
		
		Connection con= DriverManager.getConnection(url, uname,pwd);
		
		Statement stmt = con.createStatement();
		
		int id=2;
		String name="'Key'";
		int cost=300;
		String sql="insert into product values("+id+","+name+","+cost+")";
		stmt.executeUpdate(sql);
		System.out.println("record Insterted");
		
		//System.out.println(con);
		
	}

}
