package xyz;

import java.util.Properties;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class AgrSpecialist {
	//testing
	
	public static String fun() {
		String conString = "jdbc:mysql://localhost:3306/test";
		Properties prp = new Properties();
		prp.put("user", "root");
		
		ResultSet rs = null;
		String retString = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(conString, prp);
		
			Statement stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM test");
			
			rs.next();
			retString = rs.getString(2);
		}
		catch(Exception e) {
			retString = e.toString();
		}
		
		return retString;

		
	}
}
