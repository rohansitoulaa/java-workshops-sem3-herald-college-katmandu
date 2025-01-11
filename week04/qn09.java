package week04;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StringManipulator {
    String reverse(String input) {
        String rev = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            rev += input.charAt(i);
        }
        return rev;
    }


    String toUpperCase(String input) {
        return input.toUpperCase();
    }


    boolean isPalindrome(String input) {
        String rev = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            rev += input.charAt(i);
        }
        if (rev.equals(input)) {
            return true;
        } else {
            return false;
        }
    }


    int countVowels(String input) {
        String vowels = "aeiou";
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char input_char = Character.toLowerCase(input.charAt(i)); 
            for (int j = 0; j < vowels.length(); j++) {
                if (input_char == vowels.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }
}

public class qn09 {
    @Test
    public void checkMethods() {
        StringManipulator manipulator = new StringManipulator();
        String sample = "radar";

        assertAll("StringManipulator Tests",
            () -> assertEquals("radar", manipulator.reverse(sample), "The reverse of 'radar' should be 'radar'"),
            () -> assertEquals("olleh", manipulator.reverse("hello"), "The reverse of 'hello' should be 'olleh'"),

            () -> assertEquals("RADAR", manipulator.toUpperCase(sample), "'radar' in uppercase should be 'RADAR'"),
            () -> assertEquals("HELLO", manipulator.toUpperCase("hello"), "'hello' in uppercase should be 'HELLO'"),


            () -> assertTrue(manipulator.isPalindrome(sample), "'radar' should be identified as a palindrome"),
            () -> assertFalse(manipulator.isPalindrome("hello"), "'hello' should not be identified as a palindrome"),


            () -> assertEquals(2, manipulator.countVowels("hello"), "'hello' should have 2 vowels"),
            () -> assertEquals(5, manipulator.countVowels("beautiful"), "'beautiful' should have 5 vowels")
        );
    }
}
