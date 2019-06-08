import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class CollegeTest {
	public EntityManagerFactory emf=Persistence.createEntityManagerFactory("college");
  public   EntityManager em=emf.createEntityManager();
     public void removingRecord(){
    	 System.out.println("enter the collge name for  removing..");
    	 String name=new Scanner(System.in).next();
    	College college= em.find(College.class,name);
    	if(college!=null){
    		
    		em.getTransaction().begin();
    		
    		em.remove(college);
    		System.out.println("record is removed");
    		em.getTransaction().commit();
    		emf.close();
    	}
     }
	public void insertingRecord(){
		College co=new College();
		System.out.println("enter clllege name");
		String name=new Scanner(System.in).next();
		System.out.println("enter addresss");
		String addresss=new Scanner(System.in).next();
		System.out.println("enter location");
		String location=new Scanner(System.in).next();
		System.out.println("enter college code");
		int collegecode=new Scanner(System.in).nextInt();
		System.out.println("ente total Branches");
		int noBranches=new Scanner(System.in).nextInt();
		co.setAddress(addresss);
		co.setCollegeCode(collegecode);
		co.setLocation(location);
		co.setNoOfBranch(noBranches);
		co.setName(name);
		em.getTransaction().begin();
		em.persist(co);
		em.getTransaction().commit();
	}
	
	public void findingRecord(){
		System.out.println("record is finding by name");
		System.out.println("enter the college name");
		String name=new Scanner(System.in).next();
		College co=em.find(College.class,name);
		if(co!=null){
			System.out.println("Record is found");
			System.out.println(co);
		}else{
			System.out.println("record nit found  Please Enter the correct name of college");
		}
		
	}
	public void updatingRecord(){
		System.out.println("Enter the college name for updating the record..");
	String name=new Scanner(System.in).next();
		em.getTransaction().begin();
		
		College college=em.find(College.class,name);
		System.out.println("enter the new college code..");
		int cc=new Scanner(System.in).nextInt();
		college.setCollegeCode(cc);
		em.getTransaction().commit();
		System.out.println("record is updated...");
	}
public static void main(String[] args) {
	CollegeTest t=new CollegeTest();
	t.insertingRecord();
	//t.findingRecord();
	
	//t.removingRecord();
	//t.updatingRecord();
	
	
	


   
}
}
