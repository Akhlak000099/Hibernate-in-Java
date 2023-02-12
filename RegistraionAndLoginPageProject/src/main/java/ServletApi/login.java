package ServletApi;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;

import DaoPage.*;
import EntityPage.Emp_dtls;
import UtilPage.HibernateUtil_page;

@WebServlet("/login")
public class login extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String empId=req.getParameter("empId");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		Dao dao= new Dao(HibernateUtil_page.getSessionFactory());
		boolean i= dao.IsLogin(empId, email, password);
		
		if(i) {
			//session.setAttribute("msg", "You Are Registered plz do login your Id");
			System.out.println("User login successfully");
//			resp.sendRedirect("login.jsp");
			
		}
		else
		{
		//	session.setAttribute("msg", "sorry something wrong plz try again");
			System.out.println("sorry something wrong plz try again");
		}
		resp.sendRedirect("show.jsp");
		//System.out.println();
		
	}

	
}
