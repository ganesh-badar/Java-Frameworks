package mypack;

public class Employee {

	private int empid;
	private String empname;
	Address empadd;   // Association
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Address getEmpadd() {
		return empadd;
	}
	public void setEmpadd(Address empadd) {
		this.empadd = empadd;
	}
	
}
