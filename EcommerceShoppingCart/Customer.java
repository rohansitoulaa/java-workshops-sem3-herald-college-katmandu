package EcommerceShoppingCart;

/**
 * Represents a customer in the e-commerce system.
 */
public class Customer {
    int customerId;
    String name;
    String email;
    String password;

    /**
     * Registers a new customer.
     */
    public void register() {
        System.out.println("Registering customer: " + name);
        // Logic to save customer details to the database.
    }

    /**
     * Logs in an existing customer.
     */
    public void login() {
        System.out.println("Logging in customer: " + email);
        // Logic to validate customer credentials and log them in.
    }

    /**
     * Displays the available products to the customer.
     */
    public void viewProducts() {
        System.out.println("Displaying available products...");
        // Logic to fetch and display product details from the database or inventory.
    }

    /**
     * Adds a product to the customer's shopping cart.
     */
    public void addToCart(Product product, int quantity, ShoppingCart cart) {
        cart.addProduct(product, quantity);
        System.out.println("Added " + quantity + " of " + product.name + " to the cart.");
    }

    /**
     * Proceeds to checkout.
     */
    public void checkout(ShoppingCart cart) {
        cart.calculateTotalPrice();
        System.out.println("Proceeding to checkout with total price: " + cart.totalPrice);
        // Logic to finalize the order, e.g., payment and order confirmation.
    }
}

