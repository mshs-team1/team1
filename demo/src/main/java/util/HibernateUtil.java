package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sf;
    static {
        Configuration   cfg = new Configuration().configure("hibernate.cfg.xml");
        sf= cfg.buildSessionFactory();
    }
    public static Session openSession(){
        return sf.getCurrentSession();
    }
}
