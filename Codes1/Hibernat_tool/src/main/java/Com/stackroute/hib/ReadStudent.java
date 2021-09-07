package Com.stackroute.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadStudent {

	public static void main(String[] args) {
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		int id=503;
		Session session =factory.getCurrentSession();
	try{
	     session.beginTransaction();
		Student stud= session.get(Student.class, id);
		System.out.println(stud);
		session.getTransaction().commit();
		session.close();
		
		}finally {
			factory.close();
		}

	}

}
