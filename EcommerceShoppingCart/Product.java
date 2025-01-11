package EcommerceShoppingCart;

	/**
	 * Represents a product in the e-commerce system.
	 */
public class Product {
	    int productId;
	    String name;
	    double price;
	    int stockQuantity;

	    /**
	     * Gets the details of the product.
	     */
	    public void getDetails() {
	        System.out.println("Product ID: " + productId);
	        System.out.println("Name: " + name);
	        System.out.println("Price: " + price);
	        System.out.println("Stock Quantity: " + stockQuantity);
	    }

	    /**
	     * Checks if the product is available in stock.
	     */
	    public boolean checkAvailability(int requestedQuantity) {
	        return stockQuantity >= requestedQuantity;
	    }
}
