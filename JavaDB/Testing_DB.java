import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
public class Testing_DB {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		createTables();  
		//insertion();
		fetchData();
	}
	
	public static void fetchData() throws Exception {
		//use the try 
		//import the array list class
		//create connection
		//prepare a statement;
		//use the ResultSet Class to execute the query 
		//use the while ResultSet variable.next();
		//use the ResultSet variable.getString,.getInt, .getFloat, .getChar etc
		//Number one 
		try {
			ArrayList<String> array = new ArrayList<String>();
			Connection con = getConnection();
			PreparedStatement get = con.prepareStatement("SELECT * FROM users WHERE sex = 'M'");
			ResultSet result = get.executeQuery();
			
			while(result.next()) {
				System.out.print("|" + result.getInt("id") + " | " + result.getString("fname") + " | " + result.getString("lname") 
				+ " | " + result.getString("email") + " | " + result.getInt("phone") + " | " + result.getString("sex") + "|\n");
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Query Successful");
		}
	}
	public static void createTables() throws Exception {
		try {
			//first thing is to get the connection;
			//secondly is to create the statement using the PreparedStatement class. (remember to import it);
			//thirdly execute the command using the prepared statement variable with a method executeUpdate;
			//go down and use the finally statement.
			//First Action:
			Connection conn = getConnection();
			//Second Action:
			PreparedStatement create = conn.prepareStatement("CREATE TABLE IF NOT EXISTS users ("
					+ "id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, "
					+ "fname VARCHAR(30) NOT NULL, "
					+ "lname VARCHAR(30) NOT NULL, "
					+ "email VARCHAR(30) NOT NULL UNIQUE,"
					+ "phone INT NOT NULL UNIQUE,"
					+ "sex CHAR(1) NOT NULL"
					+ ");");
			//third Action:
			create.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Table Created Successfully");
		}
	}
	
	public static void insertion() throws Exception {
		//we have to prepare our insertion data by declaring them.
		//create a connection;
		//prepare the insertion statement using PreaparedStatement insertVariable = connectionVariable.preparedStatement();
		//then execute it using insertVariable.executeUpdate;
		//do a finally code down.
		final String fname = "Joyce";
		final String lname = "Chioma";
		final String email = "chiomajoyce@yahoo.com";
		final int phone = 66348163;
		final char sex = 'F';
		try {
		
		Connection con = getConnection();
		PreparedStatement post = con.prepareStatement("INSERT INTO users ("
				+ "fname, lname, email, phone, sex) VALUES ("
				+ "'" + fname + "', '" + lname + "', '" + email + "', " + phone + ", '" + sex + "')");
			post.executeUpdate();
		} catch (Exception e) {
			System.out.print(e);
		} 
		finally {
			System.out.println("Insert Statment OK!");
		}
	} 
	
	public static Connection getConnection() throws Exception { //we imported the Connection class for Connection
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/javaDB";
			String username = "javaDB";
			String password = "javaDB";
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connected");
			System.out.println("Lancense!! So we connect Finally");
			return conn;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

}
