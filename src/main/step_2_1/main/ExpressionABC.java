package main.step_2_1.main;

public class ExpressionABC {
    public static boolean doubleExpression(double a, double b, double c) {
        double result;
        double accuracy = 0.0001;
        result = Math.abs((a+b)-c);
        return result < accuracy;
    }
}
