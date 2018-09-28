package hibernatesample;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class appmain {

	public static void main(String[] args) 
	{
		Configuration con = new Configuration();
		
		SessionFactory sf = con.configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		books b1 = new books();
		b1.setId(3);
		b1.setName("first");
		books b2= new books();
		b2.setId(4);
		b2.setName("comic");
		
		List<books> chintu = new ArrayList<books>();
		chintu.add(b1);
		chintu.add(b2);
		
		students s1 = new students();
		s1.setName("lala");
		s1.setStudentid(2);
		s1.setList(chintu);
		
//		s1.setName("lala");
//		s1.setStudentid(2);
//		s1.setBook(b2);
		
		
		s.save(b1);
		s.save(b2);
		s.save(s1);
		tx.commit();
		s.close();
		System.out.println(s1);
		System.out.println(b1);
		
		
		
		
		

	}

}
