

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CustomerMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("myunit");
	        EntityManager em = emf.createEntityManager();
	 
	        try {
	            em.getTransaction().begin();
	           
	            Customer customer = new Customer();
	            customer.setName("Ram");
	            customer.setAddress("Raj Nagar");
	             
	            em.persist(customer);
	             
	            em.getTransaction().commit();
	            em.getTransaction().begin();
	             
	             customer = em.find(Customer.class, 1);
	            
	             
	            //em.persist(customer);
	             
	            em.getTransaction().commit();
	            System.out.println("customer "+customer);
	        }
	        catch (Exception e) {
	            em.getTransaction().rollback();
	            e.printStackTrace();
	        }
	        finally{
	            emf.close();
	        }

	}

}
