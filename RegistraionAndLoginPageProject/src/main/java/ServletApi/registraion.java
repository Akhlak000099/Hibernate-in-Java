package ServletApi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import EntityPage.*;
import DaoPage.Dao;
import UtilPage.HibernateUtil_page;

@WebServlet("/registerServlet") 
public class registraion extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				
//		PrintWriter out= resp.getWriter();
		
		String fname= req.getParameter("name");
		String empId= req.getParameter("empId");
		String email=req.getParameter("email");
		String phone= req.getParameter("ph");
		String dep= req.getParameter("depaterment");
		String salary= req.getParameter("salary");
		String gender= req.getParameter("gender");
		String password= req.getParameter("password");
		String cpassword=req.getParameter("cpassword");
		
		Emp_dtls details= new Emp_dtls();
		
		details.setName(fname);
		details.setEmp_id(empId);
		details.setEmail(email);
		details.setDepaterment(dep);
		details.setGender(gender);
		details.setPh(phone);
		details.setSalary(salary);
		details.setPassword(password);
		
		System.out.println(details);
//		out.print(fname+empId+phone+dep+salary+gender+password);
		
		HttpSession session=req.getSession();

		if(cpassword.equals(password)) {
			
			Dao dao= new Dao(HibernateUtil_page.getSessionFactory());
			boolean f = dao.saveDao(details);
			
			
			if(f) {
				session.setAttribute("msg", "You Are Registered plz do login your Id");
				System.out.println("User Inter successfully");
				
			}
			else
			{
				session.setAttribute("msg", "sorry something wrong plz try again");
				System.out.println("sorry something wrong plz try again");
			}
			resp.sendRedirect("index.jsp");
		}
		else {
			session.setAttribute("msg", "plz re enter your password and confirm password it doesn't matched");
		}

	}

	
}
