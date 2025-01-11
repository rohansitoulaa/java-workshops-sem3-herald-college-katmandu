package week01;
class Person{
	String name;
	int age;
	String address;
	public Person(String name,int age,String address) {
		this.name = name;
		this.age = age;
		this.address = address;
}
}
public class qn14 {
public static void main(String[] args) {
	Person myObj = new Person("rohan",14,"naxal");
	System.out.println("Name:"+myObj.name);
	System.out.println("age:"+myObj.age);
	System.out.println("Address:"+myObj.address);
}
}
