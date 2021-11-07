package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static final SessionFactory sessionFactory = buildSessionFactory();
	private static final String HIBERNATE_CFG_XML_FILE_PATH = "config/hibernate.cfg.xml";
	

	private static SessionFactory buildSessionFactory() {
		try {
			return new Configuration().configure(HIBERNATE_CFG_XML_FILE_PATH).buildSessionFactory();
		} catch (Exception e) {
			System.err.println("SessionFactory nesnesi oluþturulamadý!"+e);
			throw new ExceptionInInitializerError();
		}

}

	
	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}
	
	public static void shutdown() {
		getSessionfactory().close();
	}

}
