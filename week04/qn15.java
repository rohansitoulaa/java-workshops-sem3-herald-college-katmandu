package week04;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

//Base class Shape with a method area() that returns 0
class Shape {
 // Default area method in base class
 public double area() {
     return 0;
 }
}

//Derived class Circle with radius and overridden area() method
class Circle extends Shape {
 private double radius;

 // Constructor to initialize the radius of the circle
 public Circle(double radius) {
     this.radius = radius;
 }

 // Overridden method to calculate the area of the circle
 @Override
 public double area() {
     return Math.PI * radius * radius; // Area of the circle: πr²
 }
}

//Derived class Rectangle with length and width and overridden area() method
class Rect extends Shape {
 private double length;
 private double width;
 public Rect(double length, double width) {
     this.length = length;
     this.width = width;
 }


 @Override
 public double area() {
     return length * width; 
 }
}

public class qn15 {

    @Test
    public void testShapeArea() {
        Shape circle = new Circle(5);
        assertEquals(78.53981633974483, circle.area(), 0.0001, "Area of Circle with radius 5 should be 78.5398");

        Shape rectangle = new Rect(4, 6);
        assertEquals(24, rectangle.area(), "Area of Rectangle with length 4 and width 6 should be 24");
    }
}
