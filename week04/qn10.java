package week04;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


class Calc {
    // Basic arithmetic operations
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return (double) a / b;
    }
}

public class qn10 {
	Calc calculator;
	@BeforeAll
    public static void setUpBeforeClass() {
        System.out.println("Setting up global resources before running tests...");
    }

    @AfterAll
    public static void tearDownAfterClass() {
        System.out.println("Cleaning up global resources after running all tests...");
    }

    @BeforeEach
    public void setUp() {
    	calculator = new Calc(); // Initialize Calculator before each test
        System.out.println("Calculator initialized for a test");
    }

    @AfterEach
    public void tearDown() {
        calculator = null; // Reset calculator object after each test
        System.out.println("Calculator reset after a test");
    }

    @Test
    public void testAddition() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    public void testSubtraction() {
        assertEquals(1, calculator.subtract(3, 2), "3 - 2 should equal 1");
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, calculator.multiply(2, 3), "2 * 3 should equal 6");
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, calculator.divide(6, 3), "6 / 3 should equal 2.0");
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0), "Division by zero should throw ArithmeticException");
    }
}
