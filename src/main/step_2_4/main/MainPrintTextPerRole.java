package main.step_2_4.main;

import java.util.Scanner;

public class MainPrintTextPerRole {
    /*
    *
    *Change private to public for test
    *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner("Строка 1\n" +
                "Строка 2\n" +
                "Строка 3\n" +
                "Строка 4");
        String str0 = scanner.nextLine();
        System.out.println(str0);
        String str1 = scanner.nextLine();
        System.out.println(str1);
    }
    public String printTextPerRole(String[] roles, String[] textLines) {
        return "";
    }
}
