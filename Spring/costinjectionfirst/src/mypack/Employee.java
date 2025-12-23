package mypack;

public class Employee {
private int empid;
private String empname;
private String city;
private int salary;

public Employee() {
}
public Employee(int empid, String empname, String city, int salary) {
	super();
	this.empid = empid;
	this.empname = empname;
	this.city = city;
	this.salary = salary;
}
@Override
public String toString() {
	return ("empid=" + empid + ", empname=" + empname + ", city=" + city + ", salary=" + salary);
}



}
