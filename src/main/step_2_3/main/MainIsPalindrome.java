package main.step_2_3.main;

public class MainIsPalindrome {
    public static boolean isPalindrome(String text) {
        String textTemp = text.replaceAll("[^a-zA-Z0-9]", "").toUpperCase();

        StringBuilder stringBuilder = new StringBuilder(textTemp);
        String textPalindrome = String.valueOf(stringBuilder.reverse());

        return textTemp.equals(textPalindrome);
    }
}
