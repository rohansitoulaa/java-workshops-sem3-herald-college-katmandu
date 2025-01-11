package week04;
//Public class for testing
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Rectangle {
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public double area() {
        return length * width;
    }

    // Method to calculate the perimeter of the rectangle
    public double perimeter() {
        return 2 * (length + width);
    }
}
public class qn14 {
	// Test case for area and perimeter of the rectangle
    @Test
    public void testRectangleMethods() {
        Rectangle rect1 = new Rectangle(5, 3);
        assertEquals(15, rect1.area(), "Area of rectangle with length 5 and width 3 should be 15");
        assertEquals(16, rect1.perimeter(), "Perimeter of rectangle with length 5 and width 3 should be 16");

        Rectangle rect2 = new Rectangle(7, 4);
        assertEquals(28, rect2.area(), "Area of rectangle with length 7 and width 4 should be 28");
        assertEquals(22, rect2.perimeter(), "Perimeter of rectangle with length 7 and width 4 should be 22");
    }
}
