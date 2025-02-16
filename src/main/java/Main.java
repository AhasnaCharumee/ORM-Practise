import config.FactoryConfiguration;
import entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
    Customer c1 = new Customer();
    c1.setId("C001");
    c1.setName("Lithira");
    c1.setSalary(24000.00);
    c1.setAddress("Palalla");

    Customer c2 = new Customer();
         c2.setId("C002");
         c2.setName("Lihini");
         c2.setSalary(50000.00);
         c2.setAddress("Matara");

    Session session = FactoryConfiguration.getInstance().getSession();
    Transaction transaction = session.beginTransaction();
//    session.save(c2);
        session.update(c2);
    transaction.commit();
    session.close();
    }
}