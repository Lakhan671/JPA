import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;




public class CollegeTest {
	public EntityManagerFactory emf=Persistence.createEntityManagerFactory("college");
  public   EntityManager em=emf.createEntityManager();
    public void allrecord(){
    	em.getTransaction().begin();
   TypedQuery<College> qu= em.createQuery("select * from College",College.class);
    	List<College>college=qu.getResultList();
    	for(College c:college){
    	System.out.println(c);}
    	em.getTransaction().commit();
    }
public static void main(String[] args) {
	CollegeTest t=new CollegeTest();
	t.allrecord();
	
	
	


   
}
}
