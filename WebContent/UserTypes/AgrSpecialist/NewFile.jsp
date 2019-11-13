<%@page import="java.util.Properties"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Array"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="xyz.AgrSpecialist"%> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
int x = 10;
int y = x+10;
%>

<% y = 21; %>

<%/*
	//This connection and reading works :D
	
	String conString = "jdbc:mysql://localhost:3306/test";
	Properties prp = new Properties();
	prp.put("user", "root");
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection(conString, prp);
	
	Statement stmt = conn.createStatement();
	ResultSet rs = stmt.executeQuery("SELECT * FROM test");
	
	while(rs.next()){
		out.print("<p>");
		out.print(rs.getString(1) + rs.getString(2));
		out.print("</p><br>");
	}
	*/
%>

<% //testing with class file
	out.println(AgrSpecialist.fun());
%>


<p> ***</p>
<p>*** <% //out.println(x); %> </p>
<br><br>
<p>and*** <% //out.println(y); %></p>
</body>
</html>