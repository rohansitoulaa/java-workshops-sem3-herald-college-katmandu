package week06;

interface DrawShape{
	public void drawShape(String message);
}
class drawCircle implements DrawShape {
	   public void drawShape(String message) {
	    System.out.println(message);
	   }
}
class drawSquare implements DrawShape{
	public void drawShape(String message) {
		System.out.println(message);
	}
}
class Triangle implements DrawShape{
	public void drawShape(String message) {
		System.out.println(message);
	}
}

class Shape{
	DrawShape shape;
	public Shape(DrawShape shape) {
		this.shape = shape;
	}
	public void drawing(String message) {
		shape.drawShape(message);
	}
}
public class qn07 {
public static void main(String[] args) {
	DrawShape circle = new drawCircle();
	DrawShape triangle = new Triangle();
	Shape circles = new Shape(circle);
	Shape triangles = new Shape(triangle);
	
	circles.drawing("Drawing a circle");
	triangles.drawing("Drawing a triangle");
	
}
}














