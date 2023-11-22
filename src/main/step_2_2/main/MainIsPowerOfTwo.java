package main.step_2_2.main;

public class MainIsPowerOfTwo {
    public static boolean isPowerOfTwo(int value) {
        value = Math.abs(value);
        return  Integer.bitCount(value) == 1;
    }
}
