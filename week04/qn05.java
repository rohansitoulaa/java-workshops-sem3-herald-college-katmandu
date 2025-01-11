package week04;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class Product{
	String name;
	double price;
	int quantity;
	
	boolean isAffordable(double budget) {
		double totalPrice = quantity*price;
		return totalPrice <=budget;
}
}
public class qn05 {
	@Test
	 public void testProduct() {
		Product myProd = new Product();
		myProd.name = "Rohan";
		myProd.price = 100;
		myProd.quantity = 2;
//		myProd.isAffordable(200);
		assertAll("Product Assertions",
	            // Verifying that the name is not null
	            () -> assertNotNull(myProd.name, "Product name should not be null"),
	            
	            // Verifying that the price is positive
	            () -> assertTrue(myProd.price > 0, "Product price should be positive"),
	            
	            // Verifying the isAffordable method with different budgets
	            () -> assertTrue(myProd.isAffordable(2500), "Product should be affordable with a budget of 2500"),
	            () -> assertFalse(myProd.isAffordable(1500), "Product should not be affordable with a budget of 1500")
	        );
		
	}
}
