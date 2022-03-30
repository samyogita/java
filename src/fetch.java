import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class fetch {
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
			// fetch 
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery("select * from student");
			if(rs.next == false)
			{
				System.out.println("The table is empty");
			}
			else
			{
				rs.previous();
			while(rs.next())
			{
				System.out.println(rs.getString(1) + rs.getString(2) + rs.getString(3) + rs.getInt(5))
			}
			stmt.close();
			con.close(); // close connection
			
			
		}
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		} 
		
	}

}
