package Implementation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBCExample {
    static final String JDBC_URL = "jdbc:mysql://localhost:3306/mydatabase"; 	// JDBC URL for MySQL
    static final String USERNAME = "root"; 	// MySQL username
    static final String PASSWORD = "deeya"; 	// MySQL password
    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");		 // Loading the JDBC driver
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);		// Establishing a connection to the database
            System.out.println("Connected to the database.");

            Statement statement = connection.createStatement();		// Creating a statement object

            String query = "SELECT * FROM students";		// Example query: retrieve all records from a table
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {		// Displaying the results
                int id = resultSet.getInt("id");		// Example: assuming the table has columns "id" and "name"
                String name = resultSet.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }
            
            resultSet.close();		// Closing resources
            statement.close();		// Closing resources
        } 
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        } 
        catch (SQLException e) {
            e.printStackTrace();
        } 
        finally {
            if (connection != null) {		// Closing the connection
                try {
                    connection.close();
                    System.out.println("Disconnected from the database.");
                } 
                catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}