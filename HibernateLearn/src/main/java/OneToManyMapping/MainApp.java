package OneToManyMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		worker_address address1=new worker_address(101,"New Delhi","Delhi");
		worker_address address2=new worker_address(102,"Banglore","Karnatak");
		worker_address address3=new worker_address(103,"Mumbai","Maharastra");
		worker_address address4=new worker_address(104,"Noida","Uttar Pardesh");
		worker_address address5=new worker_address(105,"Gurgaon","Haryana");
		
		List<worker_address> list= new ArrayList<worker_address>();
		list.add(address1);
		list.add(address2);
		list.add(address3);
		list.add(address4);
		list.add(address5);
		
		worker_dtls emDtls = new worker_dtls();
		
		emDtls.setId(1);
		emDtls.setName("Akhlak");
		emDtls.setAddress(list); 

		Session session= sessionFactory.openSession();
		
		Transaction transaction= session.beginTransaction();
//		// create data
//		session.save(address1);
//		session.save(address2);
//		session.save(address3);
//		session.save(address4);
//		session.save(address5);
//		
//		
//		session.save(emDtls);
		
		
		/// read data by use worker_Dtls (One TO Many Mapping)
		worker_dtls dtls = (worker_dtls) session.get(worker_dtls.class, 1);
		
		System.out.println("The worker name is :"+dtls.getName());
		
		for(worker_address address:dtls.getAddress()) {
			System.out.println("State :"+address.getState()+" --> City :"+address.getCity());
		}
		
		///read data by use worker_address (Many To One Mapping)
		
//		worker_address address= (worker_address) session.get(worker_address.class, 102);
//		System.out.println("Emp Name: "+address.getDtls().getName());
//		System.out.println("state :"+address.getState()+ " --> City :"+address.getCity());
//		
		
		System.out.println("read data successfully");
		transaction.commit();
		session.close();
		
		
	}

}
