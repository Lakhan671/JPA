import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Test {
	public static void main(String[]aa){
		
	
	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("student");
	   EntityManager em=emf.createEntityManager();
	  
	   Student st=new Student();
	   st.setName("lakhan");
	   st.setId(10001);
	   em.getTransaction().begin();
	   em.persist(st);
	   em.getTransaction().commit();
	   System.out.println("table is create");
	   
	}
}
