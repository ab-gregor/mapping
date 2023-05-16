package mapping.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration config = new Configuration().configure().addAnnotatedClass(Author.class).addAnnotatedClass(Book.class).addAnnotatedClass(Customers.class);

    	
   	 SessionFactory factory = config.buildSessionFactory();
   	
   	Session session = factory.openSession();
   	Transaction tx = session.beginTransaction();
   	
   	for(int i=1;i<=3;i++)
   	{	Author a1=new Author();
		a1.setAuth_id(i);
		a1.setAuth_name("Auth"+i);
		session.save(a1);
   		Book b1=new Book();
   		b1.setBook_id(i);
   		b1.setBook_name("Book"+i);
   		b1.setA2(a1);
   		session.save(b1);
   		Customers c1=new Customers();
   		c1.setCust_id(i);;
   		c1.setCust_name("Customer"+i);
   		session.save(c1);
   	}
   	

   	tx.commit();
    }
}
