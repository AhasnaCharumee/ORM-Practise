package config;

import entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;

    private FactoryConfiguration() {
        Configuration configure = new Configuration().configure().addAnnotatedClass(Customer.class);
        configure.addAnnotatedClass(Customer.class);
        sessionFactory = configure.buildSessionFactory();
    }

    public static FactoryConfiguration getInstance() {
        if (factoryConfiguration == null){
            factoryConfiguration = new FactoryConfiguration();
        }
        return factoryConfiguration;
    }
    public Session getSession(){
        return sessionFactory.openSession();
    }

}
