package Implementation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class LoadDriver {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/mydatabase"; 
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "deeya";
	public static void main(String[] args) {
	try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
	System.out.println("Database connected successfully");
	} 
	catch (SQLException e) {
	System.err.println("Database not connected:" + e.getMessage());
	}
}
}