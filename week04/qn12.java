package week04;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PrimeNumber {
    boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0, 1, and negative numbers are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If divisible, not prime
            }
        }
        return true; // Otherwise, prime
    }


}
public class qn12  {
	PrimeNumber myPrime = new PrimeNumber();
	    @Test
	    public void testPrimeNumber() {
	        assertTrue(myPrime.isPrime(2), "2 is a prime number");
	        assertTrue(myPrime.isPrime(3), "3 is a prime number");
	        assertFalse(myPrime.isPrime(4), "4 is not a prime number");
	        
	    }
	}
