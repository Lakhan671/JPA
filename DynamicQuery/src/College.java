import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class College {
	@Id
	private String name;
	private int collegeCode;
	private int noOfBranch;
	private String location;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCollegeCode() {
		return collegeCode;
	}
	public void setCollegeCode(int collegeCode) {
		this.collegeCode = collegeCode;
	}
	public int getNoOfBranch() {
		return noOfBranch;
	}
	public void setNoOfBranch(int noOfBranch) {
		this.noOfBranch = noOfBranch;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "College [name=" + name + ", collegeCode=" + collegeCode
				+ ", noOfBranch=" + noOfBranch + ", location=" + location
				+ ", address=" + address + "]";
	}
	

}
