package week04;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.*;

class NumberUtils {
    int[] getEvenNumbers(int[] numbers) {
        int evenCount = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }

        int[] arr = new int[evenCount];
        int index = 0;
        
        for (int num : numbers) {
            if (num % 2 == 0) {
                arr[index++] = num;
            }
        }
        
        return arr;
    }
}

public class qn04 {
    @Test
    public void testEvenNum() {
        NumberUtils myArr = new NumberUtils();
        int[] input = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        int[] expectedOutput = new int[] {2, 4, 6, 8, 10};
        
        // Call the method to test.
        int[] result = myArr.getEvenNumbers(input);
        
        assertArrayEquals(expectedOutput, result);
    }
}
