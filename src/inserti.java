import java.sql.*;
public class inserti {
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
			// insert 
			Statement stmt = con.createStatement();
			stmt.executeUpdate("insert into student values ('tom', 'test', 'UK', 95);");
			System.out.println("Record Inserted successfully");
			stmt.close();
			con.close(); // close connection
			
			
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		} 
		
	}

}
