import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	int id;
	String name;
	float salary;
	String address;
	
	public Employee(){}
	public Employee(int id, String name, float salary, String address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	public void setEmployee(int id, String name,float salary,String address){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.address=address;
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ ", address=" + address + "]";
	}
	
	

}
