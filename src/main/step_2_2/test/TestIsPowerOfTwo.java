package main.step_2_2.test;

import main.step_2_2.main.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestIsPowerOfTwo {
    private MainIsPowerOfTwo mainIsPowerOfTwo;

    @BeforeEach
    public void setUp() {
        mainIsPowerOfTwo = new MainIsPowerOfTwo();
    }

    @Test
    public void testIsPowerOfTwo_1() {
        boolean expectedResult = false;
        boolean result = mainIsPowerOfTwo.isPowerOfTwo(0);
        assertEquals(expectedResult, result, "Error testIsPowerOfTwo_1");
    }

    @Test
    public void testIsPowerOfTwo_2() {
        boolean expectedResult = true;
        boolean result = mainIsPowerOfTwo.isPowerOfTwo(1);
        assertEquals(expectedResult, result, "Error testIsPowerOfTwo_2");
    }

    @Test
    public void testIsPowerOfTwo_3() {
        boolean expectedResult = true;
        boolean result = mainIsPowerOfTwo.isPowerOfTwo(-2);
        assertEquals(expectedResult, result, "Error testIsPowerOfTwo_3");
    }
}
