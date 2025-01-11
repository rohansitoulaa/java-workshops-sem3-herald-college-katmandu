package week02;

class Person{
	protected String address;
	
}
class Employee extends Person{
	String department ;
	public String toString() {
		return "the person address is"+address+"is from "+department+"department";
	}
	
}
public class qn04 {
public static void main(String[] args) {
	Employee myobj = new Employee();
	myobj.department = " ssd ";
	myobj.address = " naxal ";
	System.out.println(myobj.toString());
}
}
