package mypack;

public class Employee  extends Person{
public Employee(String name, String city, int empid, String dpt) {
		super(name, city);
		this.empid = empid;
		this.dpt = dpt;
	}

private int empid;
private String dpt;
@Override
public String toString() {
	return (empid + " " + dpt +" "+ super.toString());
}



}



