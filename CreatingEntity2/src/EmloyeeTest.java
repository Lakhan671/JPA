import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class EmloyeeTest {
	
	public Employee serchingRecordById(EntityManager em,int id){
		
		Employee emp=em.find(Employee.class,id);
		
		return emp;
		
	}
	
	public void deletingRecord(EntityManager em,int id){
		
		Employee emp=em.find(Employee.class,id);
		if(emp!=null){
			
			em.remove(emp);
			System.out.println("employee record is removed");
			//System.out.println(emp);
		}else{
			System.out.println("id note found ");
		}
		
	}
	public Employee insertRecordInEmployee(){
		System.out.println("Enter your detail ...");
		System.out.println("Enter id");
		int id=new Scanner(System.in).nextInt();
		System.out.println("Enter name");
		String name=new Scanner(System.in).next();
		System.out.println("Enter salary");
		float salary=new Scanner(System.in).nextFloat();
		System.out.println("enter address");
		String address=new Scanner(System.in).next();
		
		Employee emp=new Employee();
		emp.setEmployee(id, name, salary, address);
		System.out.println("..Employee Object is Returning..");
		return emp;
		
	}
	public void insertRecordInTableEmployee(){
		
	}
	public static void main(String[] as){
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("myunit");
	EntityManager em=emf.createEntityManager();
	em.getTransaction().begin();
	Employee emp1=new Employee();
	EmloyeeTest t=new EmloyeeTest();
	
/*	//inserting the record in tables.
	emp1=t.insertRecordInEmployee();
	em.persist(emp1);*/
	
	/*
	System.out.println("Enter the id for finding the record");
	int id=new Scanner(System.in).nextInt();
	emp1=t.serchingRecordById(em, id);
	System.out.println(emp1);*/
	
	
	System.out.println("enter the id for deleting the record");
	int dd=new Scanner(System.in).nextInt();
	t.deletingRecord(em, dd);
	//emf.close();
	//em.close();
	em.getTransaction().commit();
	System.out.println("table is created");
	}

}
