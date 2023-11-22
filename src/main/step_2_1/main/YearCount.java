package main.step_2_1.main;

public class YearCount {
    public static int leapYearCount(int year) {

        int years = 0;

        if (year < 4) {
            years = 0;
        } else if (year >= 4 && year < 100) {
            years = year / 4;
        } else if (year >= 100 && year < 400) {
            years = (year / 4) - (year/100);
        } else {
            years = (year / 4) - (year/100) + (year/400);
        }

        return years;
    }
}
