package super_merket_demo;

import java.util.*;



import org.hibernate.Session;
import org.hibernate.Transaction;



public class SuperMarket_Dao {

	public void save_product(SuperMarketProduct smp) {
		
		Transaction t=null;
		try(Session session=Session_Factory.getSessionFactory().openSession())
		{
			
			t=session.beginTransaction();
			session.save(smp);
			t.commit();
			
		}
		catch(Exception e) {
			if(t!=null) {
				t.rollback();
			}
			e.printStackTrace();
		}
	}
	
	public void product_update(SuperMarketProduct smp) {
		org.hibernate.Transaction t=null;
		try(Session session=Session_Factory.getSessionFactory().openSession()){
			
			t=session.beginTransaction();
			session.update(smp);
			t.commit();
			
		}
		catch(Exception e) {
			if(t!=null) {
				t.rollback();
			}
			e.printStackTrace();
		}
	}
	
	public SuperMarketProduct search_prroduct(long id) {
		
		org.hibernate.Transaction t=null;
		SuperMarketProduct smp = null;
		try(Session session=Session_Factory.getSessionFactory().openSession()){
			
			t=session.beginTransaction();
			session.get(SuperMarketProduct.class,id);
			t.commit();
			
		}
		catch(Exception e) {
			if(t!=null) {
				t.rollback();
			}
			e.printStackTrace();
		}
	
		
		return smp;
		
	}
	
	public List<SuperMarketProduct> ShowAll_product(){
		
		org.hibernate.Transaction t=null;
		List<SuperMarketProduct> smp=null;
		
       try(Session session=Session_Factory.getSessionFactory().openSession()){
			
			t=session.beginTransaction();
			session.createQuery("from SuperMarketProduct").list();
			t.commit();
			
		}
		catch(Exception e) {
			if(t!=null) {
				t.rollback();
			}
			e.printStackTrace();
		}
		
		return smp;
		
	}
	
	public void delete_product(long id) {
		
		org.hibernate.Transaction t=null;
		SuperMarketProduct smp = null;
		try(Session session=Session_Factory.getSessionFactory().openSession()){
			
			t=session.beginTransaction();
			session.get(SuperMarketProduct.class,id);
			session.delete(smp);
			t.commit();
			
		}
		catch(Exception e) {
			if(t!=null) {
				t.rollback();
			}
			e.printStackTrace();
		}
	
		
		
	}
	
}
