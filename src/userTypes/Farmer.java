package userTypes;

import java.util.Properties;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;
import java.awt.print.Printable;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class Farmer {
	public Connection connect() {
		String conString = "jdbc:mysql://localhost:3306/vlanka";
		Properties prp = new Properties();
		prp.put("user", "root");

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(conString, prp);
			
			return conn;
		}
		
		catch(Exception e){
			return null;
		}
	}
	
	public void Register(String name, String nic, String address, String gender, String tp, String email, String username, String password) {
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			String hash = digest.digest(password.getBytes(StandardCharsets.UTF_8)).toString();
			
			final String query = "INSERT INTO agricultural_specialist(`nic`, `name`, `address`, `gender`, `telephone`, `email`, `username`, `password`) VALUES ('" + nic + "', '" + name +  "', '" + address + "', '" + gender + "', '" + tp + "', '" + email + "', '" + username + ", '" + hash + "'";
			
			Connection con = connect();
			Statement stmt = con.createStatement();
			stmt.executeQuery(query);
		}
		catch (Exception e) {
		}
		
	}



}
