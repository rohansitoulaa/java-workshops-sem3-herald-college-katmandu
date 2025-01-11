package week04_tutorial;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;
class TempConverter {
    double celToFah(double cel) {
        return (cel * (9.0 / 5) + 32); 
    }

    double fahToCel(double fah) {
        return ((fah - 32) * 5.0 / 9);
    }
}


public class qn03 {
	TempConverter myTemp;
	 @Test
	    public void testAddTwoNumbers() {

	        double cel = 100.0;
	        double fah = 212.0;
	        myTemp = new TempConverter();
	        
	        
	        double result = myTemp.celToFah(cel);
	        double result2 = myTemp.fahToCel(fah);
	        System.out.println(result);
	        System.out.println(result2);
	        assertEquals(212.0, result);
	        assertEquals(100.0, result2);
	    }
}
