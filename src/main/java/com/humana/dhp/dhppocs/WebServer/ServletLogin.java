package com.humana.dhp.dhppocs.WebServer;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class ServletLogin extends HttpServlet {

		public void doGet (HttpServletRequest req, HttpServletResponse res) {
			String uid = req.getParameter("username");
			String pwd = req.getParameter("password");
			
			try {
				if(uid.equals("saroj") && pwd.equals("123")) {
					res.getWriter().write(" login is successful ");



				 // text format response

				req.getSession().setAttribute("login", "success");
				res.sendRedirect("welcome.html");
				}

				else {
					//req.getSession().setAttribute("login", "failed");
					res.getWriter().write("login failed");
					
//					byte[] b="login failed".getBytes();
//					res.getOutputStream().write(b); // binary format response

//					req.getSession().setAttribute("login", "failed");
//					req.getRequestDispatcher("error.jsp").forward(req, res);
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		}

		public void doPost() {

		}

		public void init() {
			System.out.println("System is running for the first time.");
		}

		public void destroy() {
			System.out.println("This helps clearing all data.");
		}


		//TODO:	Create a new branch and switch to it:
	}