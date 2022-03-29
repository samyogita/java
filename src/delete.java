import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class delete {
	public static void main(String args[]) {
		try {
			// Object of type connection
			Connection con = null;
			// Load drivers that will enable us to connect to our database server
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			// Connection properties username, password
			con = DriverManager.getConnection("jdbc:msql://localhost:3306/vit", "root", "");
			// Message for successful connection
			System.out.println("Connection successful");
			// delete 
			Statement stmt = con.createStatement();
			stmt.executeUpdate("delete from student where name='satish';");
			System.out.println("Deleted successfully")
			stmt.close();
			con.close(); // close connection
			
			
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		} 
		
	}

}
