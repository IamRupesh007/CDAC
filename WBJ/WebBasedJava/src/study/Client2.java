package study;

import java.sql.ResultSet;

public class Client2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DAO dao = new DAO();
		ResultSet rs = dao.getRows("SELECT * from prodts");

		dao.showResultSet(rs);
	}

}