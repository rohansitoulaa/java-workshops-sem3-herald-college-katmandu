package week04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Calculator{
	int sumInt(int a , int b) {
		
		return a+b;
	}
}
public class qn02 {
	@Test
	   public void testAddTwoNumbers() {

        int num1 = 5;
        int num2 = 6;
        Calculator mathUtils = new Calculator();


        int result = mathUtils.sumInt(num1, num2);


        assertEquals(11, result);
    }
}
 