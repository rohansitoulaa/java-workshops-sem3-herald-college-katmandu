package week04;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class IMS {
    String name;
    int quantityInStock;

    void values(String name, int quantity) {
        this.name = name;
        this.quantityInStock = quantity;
    }

    boolean isProductAvailable(String productName, int quantity) {
        if (this.name.equals(productName) && this.quantityInStock >= quantity) {
            return true; // Product is available in the requested quantity
        }
        return false;
    }
}

public class qn06 {
    @Test
    public void testProductAvailability() {
        IMS laptopInventory = new IMS();
        laptopInventory.values("Laptop", 10);
        
        IMS smartphoneInventory = new IMS();
        smartphoneInventory.values("Smartphone", 5);
        assertTrue(laptopInventory.isProductAvailable("Laptop", 5), "Laptop should be available in quantity 5");
        assertFalse(laptopInventory.isProductAvailable("Laptop", 15), "Laptop should not be available in quantity 15");
        assertTrue(smartphoneInventory.isProductAvailable("Smartphone", 3), "Smartphone should be available in quantity 3");
        assertFalse(smartphoneInventory.isProductAvailable("Smartphone", 6), "Smartphone should not be available in quantity 6");
    }
}
