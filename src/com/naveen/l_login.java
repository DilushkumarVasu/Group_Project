package com.naveen;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dilush.dao.LoginDao;

@WebServlet("/l_login")
public class l_login extends HttpServlet {

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		
		LoginDao dao=new LoginDao();
		
		if(dao.check(uname, pass)) {
			
			HttpSession session=request.getSession();
			session.setAttribute("username", uname);
			//response.sendRedirect("welcome.jsp");
			response.sendRedirect("landowner.jsp");
		}
		else {
			
			response.sendRedirect("l_login.jsp");
		}
	}

}

