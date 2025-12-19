package mypack;

import java.util.List;

public class Department {
	private int did;
	private String dname;
	private List <Employee> emp;		//one-to-many
	public int getId() {
		return did;
	}
	public void setId(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public List<Employee> getEmp() {
		return emp;
	}
	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
}
