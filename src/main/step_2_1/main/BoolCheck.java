package main.step_2_1.main;

public class BoolCheck {
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return (a && b && !c && !d) ||
                (a && !b && c && !d) ||
                (a && !b && !c && d) ||
                (!a && b && c && !d) ||
                (!a && b && !c && d) ||
                (!a && !b && c && d);
    }
}
