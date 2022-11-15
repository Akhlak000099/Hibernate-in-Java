package Dao_Demo;

import javax.transaction.Transaction;

import com.mysql.cj.Session;
import com.mysql.cj.xdevapi.SessionFactory;

import Demo.Hibernate.Demo;
import Session_Factory.Session_Factory_Demo;

public class Deo {

	public void save_demo(Demo ob) {
		
		Transaction t=null;
		try(Session s = Session_Factory_Demo.getSessionFactory().openSession()) 
		{
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
