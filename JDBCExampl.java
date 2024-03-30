package Implementation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class JDBCExampl {
	public static void main(String [] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","deeya");
		System.out.println("Connection Established!");
	}
}
