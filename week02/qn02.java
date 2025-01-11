//Write a Java program to create a class called Shape with methods called 
//getPerimeter() and getArea(). Create a subclass called Circle that 
//overrides the getPerimeter() and getArea() methods to calculate the 
//area and perimeter of a circle.


package week02;

class Shape{
	public void getPerimeter(int r) {
		System.out.println("this is from parent class perimeter");
	}
	public void getArea(int r) {
		System.out.println("this is from parent class area");
	}
}
class Circle extends Shape{
	@Override
	public void getPerimeter(int r) {
		System.out.println(2*Math.PI * r);
	}
	@Override
	public void getArea(int r) {
		System.out.println(Math.PI * r*r);
	}
}
		

public class qn02 {
	public static void main(String[] args) {
		int radius = 10;
		Circle circle = new Circle()	;
		circle.getPerimeter(radius);
		circle.getArea(radius);
	}
	
}
