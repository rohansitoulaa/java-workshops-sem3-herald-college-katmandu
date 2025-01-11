package week04_tutorial;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MathUtilsTest{
int 	addTwoNumbers(int a, int b) {
	return a+b;
	
}

	
}

public class qn01 {

    @Test
    public void testAddTwoNumbers() {

        int num1 = 5;
        int num2 = 6;
        MathUtilsTest mathUtils = new MathUtilsTest();


        int result = mathUtils.addTwoNumbers(num1, num2);


        assertEquals(11, result);
    }
}
