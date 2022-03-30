import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
public class gettingdetailsuser {
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
			// get input from user 
			Scanner input = new Scanner(System.in);
			System.out.println("Enter your name");
			String name = input.nextLine();
			System.out.println("Enter your password");
			String password = input.nextLine();
			System.out.println("Enter your country");
			String country = input.nextLine();
			System.out.println("Enter your name");
			int mark = input.nextInt();
			String sql = "insert into student values(?, ?, ?, ?)";
			PreparedStatement stmt = con.prepareStatement(sql)
			stmt.setString(1, name);
			stmt.setString(2, password);
			stmt.setString(3, country);
			stmt.setInt(4, mark);
			stmt.execute();
			stmt.close();
			con.close(); // close connection
			
			
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		} 
		
	}

}
