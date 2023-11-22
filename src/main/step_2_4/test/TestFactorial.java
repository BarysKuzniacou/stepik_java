package main.step_2_4.test;

import main.step_2_4.main.MainFactorial;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static main.step_2_4.main.MainFactorial.factorial;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFactorial {
    private MainFactorial mainFactorial;

    @BeforeEach
    void setUp() {
        mainFactorial = new MainFactorial();
    }

    @Test
    public void testFactorial_1() {
        BigInteger expectedResult = BigInteger.valueOf(1);
        BigInteger actualResult = factorial(1);
        assertEquals(expectedResult, actualResult, "Error testFactorial_1");

    }

    @Test
    public void testFactorial_2() {
        BigInteger expectedResult = BigInteger.valueOf(6);
        BigInteger actualResult = factorial(3);
        assertEquals(expectedResult, actualResult, "Error testFactorial_2");

    }
}
