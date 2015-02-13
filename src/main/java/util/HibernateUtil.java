package util;


import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Created by Nikolai on 13.02.2015.
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();
    private static ServiceRegistry serviceRegistry;

    private HibernateUtil() {

    }

    private static SessionFactory buildSessionFactory() {
        try {
            System.out.println("1");
            Configuration configuration = new Configuration();
            System.out.println("2");
            configuration.configure();
            System.out.println("3");
            serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();
            System.out.println("4");
            return configuration.buildSessionFactory(serviceRegistry);
        } catch (Throwable e) {
            System.out.println("5");
            System.err.println("Initial SessionFactory creation failed." + e);
            throw new ExceptionInInitializerError(e);
        }
    }


    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
