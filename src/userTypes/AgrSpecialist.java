package userTypes;

import java.util.Properties;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;
import java.awt.print.Printable;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class AgrSpecialist {
	
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
	
	//function to register a new agricultural specialist in the system
	public void Register(String name, String nic, String speciality, String address, String email, String tp, String region) {
		final String query = "INSERT INTO agricultural_specialist(`nic`, `name`, `speciality`, `address`, `email`, `region`, `telephone`) VALUES ('" + nic + "', '" + name +  "', '" + speciality + "', '" + address + "', '" + email + "', '" + region + "', '" + tp + "'";
		
		try {
			Connection con = connect();
			Statement stmt = con.createStatement();
			stmt.executeQuery(query);
		}
		catch (Exception e) {
		}
		
	}
	
	public ResultSet getReports() {
		Connection con = connect();
		
		try {
			ResultSet rs = con.createStatement().executeQuery("SELECT * FROM reports ORDER BY date DESC");
			return rs;
		}
		catch(Exception e) {
			return null;
		}
	}
	
	public ResultSet getNotifications() {
		Connection con = connect();
		
		try {
			ResultSet rs = con.createStatement().executeQuery("SELECT * FROM `reports` WHERE status != 'read' ORDER BY date DESC");
			return rs;
		}
		catch(Exception e) {
			return null;
		}
	}

	
	
//	public static String fun() {
//		ResultSet rs = null;
//		String retString = null;
//		
//		try {
//			
//		
//			Statement stmt = conn.createStatement();
//			rs = stmt.executeQuery("SELECT * FROM test");
//			
//			rs.next();
//			retString = rs.getString(2);
//		}
//		catch(Exception e) {
//			retString = e.toString();
//		}
//		
//		return retString;
//	}
	
	
	
}
 