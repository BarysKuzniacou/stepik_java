package main.step_2_4.main;

import java.math.BigInteger;

public class MainFactorial {
    public static BigInteger factorial(int value) {
        BigInteger factorialValue = BigInteger.valueOf(1);

        for (int i = value; i > 0; i--) {
            factorialValue = factorialValue.multiply(BigInteger.valueOf(i));
        }

        return factorialValue;
    }
}
