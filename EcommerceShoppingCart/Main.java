package EcommerceShoppingCart;

/**
 * Main class to demonstrate the e-commerce system.
 */
public class Main {
    public static void main(String[] args) {
        // Create some products
        Product product1 = new Product();
        product1.productId = 1;
        product1.name = "Laptop";
        product1.price = 1000.0;
        product1.stockQuantity = 5;

        Product product2 = new Product();
        product2.productId = 2;
        product2.name = "Smartphone";
        product2.price = 500.0;
        product2.stockQuantity = 10;

        // Display product details
        product1.getDetails();
        product2.getDetails();

        // Create a customer
        Customer customer = new Customer();
        customer.customerId = 101;
        customer.name = "John Doe";
        customer.email = "john.doe@example.com";
        customer.password = "password123";

        // Customer actions
        customer.register();
        customer.login();

        // Create a shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Add products to the cart
        customer.addToCart(product1, 2, cart);
        customer.addToCart(product2, 1, cart);

        // View cart items
        cart.viewCartItems();

        // Checkout
        customer.checkout(cart);
    }
}

