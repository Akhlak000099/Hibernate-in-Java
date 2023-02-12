package servlet_api;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import HibernateProject.HibernateUtil;
import HibernateProject.UserDaoPage;
import HibernateProject.Users_details;

@WebServlet("/registerServlet") 
public class registerServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name= req.getParameter("fname");
		
		String username = req.getParameter("username");
		
		String email = req.getParameter("email");

		String phone = req.getParameter("phone");
				
		String password = req.getParameter("password");
		
		String cpassword = req.getParameter("cpassword");
		
		Users_details uDetails = new Users_details();
		
		PrintWriter out = resp.getWriter();
//		
//		out.print(name+username+email+phone+password);
		
		uDetails.setFullname(name);
		uDetails.setUsername(username);
		uDetails.setEmail(email);
		uDetails.setPhone(phone);
		uDetails.setPassword(password);
		
		System.out.println(uDetails);
		
		if(cpassword.equals(password)) {
			
			UserDaoPage daoPage = new UserDaoPage(HibernateUtil.getSessionFactory());
			
			boolean f = daoPage.saveDao(uDetails);
			
			HttpSession session= req.getSession();
			if(f) {
				session.setAttribute("msg", "User Details Add Successfully");
				System.out.println("User Details Add Successfully");
			}
			else {
				session.setAttribute("msg", "Plz try again somthing wrong");
				System.out.println("Plz try again somthing wrong");
			}
			resp.sendRedirect("index.jsp");
		}
		else {
			out.print("plz re-enter the password & confirm-password it dosn't match");
		}
		
	}

}
