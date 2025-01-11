package EcommerceShoppingCart;

/**
 * Represents a shopping cart in the e-commerce system.
 */
public class ShoppingCart {
    Product[] cartItems;
    int[] quantities;
    int itemCount;
    double totalPrice;

    /**
     * Initializes an empty shopping cart.
     */
    public ShoppingCart() {
        cartItems = new Product[10];
        quantities = new int[10];
        itemCount = 0;
        totalPrice = 0.0;
    }

    /**
     * Adds a product to the shopping cart.
     */
    public void addProduct(Product product, int quantity) {
        if (product.checkAvailability(quantity)) {
            cartItems[itemCount] = product;
            quantities[itemCount] = quantity;
            itemCount++;
            product.stockQuantity -= quantity;
            System.out.println("Added " + quantity + " of " + product.name + " to the cart.");
        } else {
            System.out.println("Insufficient stock for product: " + product.name);
        }
    }

    /**
     * Removes a product from the shopping cart.
     */
    public void removeProduct(int index) {
        if (index < itemCount) {
            Product product = cartItems[index];
            product.stockQuantity += quantities[index];
            for (int i = index; i < itemCount - 1; i++) {
                cartItems[i] = cartItems[i + 1];
                quantities[i] = quantities[i + 1];
            }
            cartItems[itemCount - 1] = null;
            quantities[itemCount - 1] = 0;
            itemCount--;
            System.out.println("Removed product from cart: " + product.name);
        } else {
            System.out.println("Invalid index. Cannot remove product.");
        }
    }

    /**
     * Calculates the total price of the shopping cart.
     */
    public void calculateTotalPrice() {
        totalPrice = 0.0;
        for (int i = 0; i < itemCount; i++) {
            totalPrice += cartItems[i].price * quantities[i];
        }
        System.out.println("Total price calculated: " + totalPrice);
    }

    /**
     * Displays the items in the shopping cart.
     */
    public void viewCartItems() {
        System.out.println("Items in your cart:");
        for (int i = 0; i < itemCount; i++) {
            System.out.println("Product: " + cartItems[i].name + ", Quantity: " + quantities[i] + ", Price: " + cartItems[i].price);
        }
        System.out.println("Total Price: " + totalPrice);
    }
}