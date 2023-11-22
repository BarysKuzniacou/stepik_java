package main.step_2_1.main;

import java.util.Arrays;

public class FlipBitClass {
    public static int flipBit(int value, int bitIndex) {
        /*
        String valueString = Integer.toBinaryString(value);

        char[] valueNumbers = valueString.toCharArray();
        String[] resultValueArray =  new String[valueString.length()];


        for (int i = 0; i < valueString.length(); i++) {
            resultValueArray[valueString.length()-i-1] = String.valueOf(valueNumbers[i]);
        }

        if (resultValueArray[bitIndex-1].equals("0")) {
            resultValueArray[bitIndex-1] = "1";
        } else {
            resultValueArray[bitIndex-1] = "0";
        }

        int resultValue = 0;
        int[] bitArray = new int[valueString.length()];

        for (int i = 0; i < valueString.length(); i++) {
            bitArray[i] = Integer.parseInt(resultValueArray[i]);
        }

        for (int i = 0; i < valueString.length(); i++) {
            if (bitArray[i] == 1) {
                resultValue += Math.pow(2, i);
            }
        }

        return resultValue;

         */
        return value^(1<<(bitIndex-1));
    }
}
