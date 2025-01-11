package week04;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Factorial {

    // Method to calculate factorial
    public static int calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
public class qn13 {
	 @Test
     public void testFactorial() {
         assertEquals(1, Factorial.calculateFactorial(0), "Factorial of 0 should be 1");
         assertEquals(1, Factorial.calculateFactorial(1), "Factorial of 1 should be 1");
         assertEquals(120, Factorial.calculateFactorial(5), "Factorial of 5 should be 120");
         assertEquals(5040, Factorial.calculateFactorial(7), "Factorial of 7 should be 5040");
         assertThrows(IllegalArgumentException.class, () -> Factorial.calculateFactorial(-1), "Factorial of negative number should throw exception");
     }
}
}
