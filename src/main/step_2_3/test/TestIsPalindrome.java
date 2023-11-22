package main.step_2_3.test;

import main.step_2_3.main.MainIsPalindrome;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestIsPalindrome {
    private MainIsPalindrome mainIsPalindrome;

    @BeforeEach
    void setUp () {
        mainIsPalindrome = new MainIsPalindrome();
    }

    @Test
    public void testIsPalindrome_1 () {
        boolean expectedResult = true;
        boolean result = mainIsPalindrome.isPalindrome("Madam, I'm Adam!");
        assertEquals(expectedResult, result, "Error testIsPalindrome_1");
    }

    @Test
    public void testIsPalindrome_2 () {
        boolean expectedResult = false;
        boolean result = mainIsPalindrome.isPalindrome("ABRACADABRA");
        assertEquals(expectedResult, result, "Error testIsPalindrome_2");
    }
}
