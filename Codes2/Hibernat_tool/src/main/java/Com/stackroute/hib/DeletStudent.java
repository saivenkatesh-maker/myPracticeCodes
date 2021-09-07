package Com.stackroute.hib;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeletStudent {
	public static void main(String[] args) {
		//create Session factory as a first step
		SessionFactory factory =
				new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		int id=509;
		Session session= factory.getCurrentSession();
		session.beginTransaction();
		Student Stud=session.get(Student.class,id);
		session.delete(Stud);
		session.getTransaction().commit();
		session.close();
		System.out.println("Deleted");
	}

}
