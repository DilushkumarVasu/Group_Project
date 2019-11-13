package userTypes;

import java.util.Properties;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class AgrSpecialist {
	public Connection connect() {
		String conString = "jdbc:mysql://localhost:3306/test";
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
	
	public String[] getNotifications() {
		Connection con = connect();
		
		try {
			ResultSet rs = con.createStatement().executeQuery("SELECT * FROM `reports` WHERE status != 'read' ORDER BY date DESC");
			List<String> notifications = new ArrayList<String>();
			
			//limit the text only to 25 words in notificatioins 
			while(rs.next()) {
				String msg =  rs.getString("message");
				notifications.add(msg.substring(0, 25));
			}
			
			String[] notificationArray = notifications.toArray(new String[notifications.size()]);
			return notificationArray;
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
 