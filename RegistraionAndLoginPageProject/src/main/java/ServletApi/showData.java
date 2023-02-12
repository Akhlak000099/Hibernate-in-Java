package ServletApi;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;
import org.hibernate.mapping.List;

import DaoPage.Dao;
import EntityPage.Emp_dtls;
import UtilPage.HibernateUtil_page;

/**
 * Servlet implementation class showData
 */
@WebServlet("/show")
public class showData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showData() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Dao dao = new Dao(HibernateUtil_page.getSessionFactory());
		 List listUser =(List) Dao.getAllUser();
        request.setAttribute("listUser", listUser);
        RequestDispatcher dispatcher = request.getRequestDispatcher("show.jsp");
        dispatcher.forward(request, response);
		
		
		
	}


//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		Dao dao = new Dao(HibernateUtil_page.getSessionFactory());
////		Dao  dao= new Dao();
//		List listUser=(List) dao.show();
//		
//		req.setAttribute("msg", listUser);
//		RequestDispatcher dispatcher=req.getRequestDispatcher("show.jsp");
//		dispatcher.forward(req, resp);
//	}

}
