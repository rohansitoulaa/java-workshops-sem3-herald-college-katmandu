//Create class Parent with a private variable, a protected variable,
//and a public variable. Create a subclass Child and demonstrate how
//each type of variable is accessed (or not accessed) within the subclass.

package week02;

class Parent{
	private String pri_var;
	protected int pro_var;
	public int pub_var;
	public String getPri_var() {
		return pri_var;
	}
	public void setPri_var(String pri_var) {
		this.pri_var = pri_var;
	}
}
class Child extends Parent{
	public void Display(int pro_var,int pub_var) {
		System.out.println("private "+getPri_var()+" protected "+pro_var+" public "+pub_var);
	}
}
public class qn05 {
	public static void main(String[] args) {
		Child myChild = new Child();
		myChild.setPri_var("rohan");
		myChild.Display(10,10);
	}
}
