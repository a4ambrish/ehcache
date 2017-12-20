package echcache.application;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import ehcache.modal.StateDO;

public class HibernateUtils {
	private static SessionFactory sessionFactory;
	static{
		System.out.println("Configuring Hibernate Session - Start\n\n");
		sessionFactory = new Configuration().configure().buildSessionFactory();
		System.out.println("\n\nConfiguring Hibernate Session - end\n \n");
	}
	
	public static Session getSession(){
		
		return sessionFactory.openSession();
		
	}
	
	public static List<StateDO> loadStateAndDistrict() {

		
		Session session = sessionFactory.openSession();

		String strQuery = " from StateDO ";
		Query query = session.createQuery(strQuery);
		query.setCacheable(false);
		query.setCacheRegion("ehcache.modal.StateDO");
		List<StateDO> list = (List<StateDO>) query.list();

		session.close();

		return list;
	}
}
