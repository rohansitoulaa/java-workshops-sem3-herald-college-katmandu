package week01;

class Rectangle{
	double width;
	double height;
	public Rectangle(double width , double height) {
		this.height = height;
		this.width = width;
	}
	@Override
	public String toString() {
		return "Width: "+width+" "+"Height: "+height;
	}
}

public class qn16 {
public static void main(String[] args) {
	Rectangle rect = new Rectangle(10, 12);
	System.out.println(rect);
}
}
