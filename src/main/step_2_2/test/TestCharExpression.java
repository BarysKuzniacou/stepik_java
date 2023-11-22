package main.step_2_2.test;

import main.step_2_2.main.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCharExpression {

    private MainCharExpression mainCharExpression;

    @BeforeEach
    void setUp() {
        mainCharExpression = new MainCharExpression();
    }

    @Test
    public void testCharExpression_1() {
        char expectedResult = '|';
        char result = mainCharExpression.charExpression(32);
        assertEquals(expectedResult, result, "Error testCharExpression_1");
    }

    @Test
    public void testCharExpression_2() {
        char expectedResult = 'y';
        char result = mainCharExpression.charExpression(29);
        assertEquals(expectedResult, result, "Error testCharExpression_2");
    }
}
