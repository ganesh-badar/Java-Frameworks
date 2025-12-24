package mypack;

public class Person {
private String ename;
private String city;
public Person(String name, String city) {
	super();
	this.ename = name;
	this.city = city;
}
@Override
public String toString() {
	return ( ename + " " + city );
}
}
