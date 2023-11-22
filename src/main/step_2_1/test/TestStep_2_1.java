package main.step_2_1.test;

import main.step_2_1.main.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class TestStep_2_1 {
    private BoolCheck boolCheck;
    private YearCount yearCount;

    private FlipBitClass flipBitClass;

    private ExpressionABC expressionABC;

    @BeforeEach
    void setUp() {
        boolCheck = new BoolCheck();
        yearCount = new YearCount();
        expressionABC = new ExpressionABC();
        flipBitClass = new FlipBitClass();
    }

    @Test
    public void testBool_1_false() {
        boolean expectedResult = false;
        boolean result = boolCheck.booleanExpression(false, false, false, false);
        assertEquals(expectedResult, result, "Error testBool_1_false");
    }

    @Test
    public void testBool_2_false() {
        boolean expectedResult = false;
        boolean result = boolCheck.booleanExpression(true, true, true, true);
        assertEquals(expectedResult, result, "Error testBool_2_false");
    }

    @Test
    public void testBool_3_true() {
        boolean expectedResult = true;
        boolean result = boolCheck.booleanExpression(false, false, true, true);
        assertEquals(expectedResult, result, "Error testBool_3_true");
    }

    @Test
    public void testBool_4_true() {
        boolean expectedResult = false;
        boolean result = boolCheck.booleanExpression(false, true, true, true);
        assertEquals(expectedResult, result, "Error testBool_4_true");
    }

    @Test
    public void testBool_5_true() {
        boolean expectedResult = false;
        boolean result = boolCheck.booleanExpression(false, true, false, false);
        assertEquals(expectedResult, result, "Error testBool_5_true");
    }

    @Test
    public void testYear_1() {
        int year = 1;
        int expectedResult = 0;
        int result = yearCount.leapYearCount(year);
        assertEquals(expectedResult, result, "Error testYear_1");
    }

    @Test
    public void testYear_2() {
        int year = 4;
        int expectedResult = 1;
        int result = yearCount.leapYearCount(year);
        assertEquals(expectedResult, result, "Error testYear_2");
    }

    @Test
    public void testYear_3() {
        int year = 100;
        int expectedResult = 24;
        int result = yearCount.leapYearCount(year);
        assertEquals(expectedResult, result, "Error testYear_3");
    }

    @Test
    public void testYear_4() {
        int year = 300;
        int expectedResult = 72;
        int result = yearCount.leapYearCount(year);
        assertEquals(expectedResult, result, "Error testYear_4");
    }

    @Test
    public void testYear_5() {
        int year = 400;
        int expectedResult = 97;
        int result = yearCount.leapYearCount(year);
        assertEquals(expectedResult, result, "Error testYear_5");
    }

    @Test
    public void testYear_6() {
        int year = 2000 + 15;
        int expectedResult = 485 + 3;
        int result = yearCount.leapYearCount(year);
        assertEquals(expectedResult, result, "Error testYear_6");
    }

    @Test
    public void testExpression_1_true() {
        boolean expectedResult = true;
        boolean result = expressionABC.doubleExpression(0.1, 0.2, 0.3);
        assertEquals(expectedResult, result, "Error testExpression_1_true");
    }

    @Test
    public void testflip_1() {
        int expectedResult = 1;
        int result = flipBitClass.flipBit(0, 1);
        assertEquals(expectedResult, result, "Error testflip_1");
    }

    @Test
    public void testflip_2() {
        int expectedResult = 12;
        int result = flipBitClass.flipBit(13, 1);
        assertEquals(expectedResult, result, "Error testflip_2");
    }

    @Test
    public void testflip_3() {
        int expectedResult = 15;
        int result = flipBitClass.flipBit(13, 2);
        assertEquals(expectedResult, result, "Error testflip_3");
    }

    @Test
    public void testflip_4() {
        int expectedResult = 9;
        int result = flipBitClass.flipBit(13, 3);
        assertEquals(expectedResult, result, "Error testflip_4");
    }

    @Test
    public void testflip_5() {
        int expectedResult = 5;
        int result = flipBitClass.flipBit(13, 4);
        assertEquals(expectedResult, result, "Error testflip_5");
    }

    @Test
    public void testflip_6() {
        int expectedResult = 960;
        int result = flipBitClass.flipBit(964, 3);
        assertEquals(expectedResult, result, "Error testflip_6");
    }

}