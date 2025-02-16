package lk.ijse.gdse72;

import config.FactoryConfiguration;
import entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Customer newCustomer = new Customer("C002", "Jane Doe", 6000.0, "456 Elm St");
        Session session = null;
        session.save(newCustomer);


        session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
//        session.save(c2);
        Customer c1 = session.get(Customer.class, "C001");
        System.out.println(c1);
        transaction.commit();
        session.close();
    }
}