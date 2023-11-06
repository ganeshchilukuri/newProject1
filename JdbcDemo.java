package jdbcdemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JdbcDemo {
	

	
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			// Load the DB
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Connect the DB
			String dburl = "jdbc:mysql://localhost:3306/movies";
			String username = "root";
			String password = "root";
			Connection conn = DriverManager.getConnection(dburl, username, password);
			System.out.println("Succesfully connected");

			String query = "select * from movies";

			// send query to the DB

			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {

				System.out.print("Title:  " + rs.getString("Title") + "\t");

				System.out.print("Genre:  " + rs.getString("Genre") + "\t");

				System.out.print("Director:  " + rs.getString("Director") + "\t");

				System.out.println("Release Year:  " + rs.getString("Release_year") + "\t");

			}

			conn.close();

		}
			

		}
