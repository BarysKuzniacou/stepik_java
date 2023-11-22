package main.step_2_4.test;

import main.step_2_4.main.MainMergeArrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static main.step_2_4.main.MainMergeArrays.mergeArrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMergeArrays {
    private MainMergeArrays mainMergeArrays;

    @BeforeEach
    void setUp() {
        mainMergeArrays = new MainMergeArrays();
    }


    @Test
    public void testMergeArrays_1() {
        int[] array1 = {0, 2, 2};
        int[] array2 = {1, 3};
        int[] expectedArray = {0, 1, 2, 2, 3};
        boolean expectedResult = true;

        int[] actualArray = mergeArrays(array1, array2);

        boolean actualResult = Arrays.equals(actualArray, expectedArray);

        assertEquals(expectedResult, actualResult, "Error testMergeArrays_1");
    }

    @Test
    public void testMergeArrays_2() {
        int[] array1 = {0, 2, 2, 10, 10, 20};
        int[] array2 = {1, 3, 5, 7, 8, 10, 10};
        int[] expectedArray = {0, 1, 2, 2, 3, 5, 7, 8, 10, 10, 10, 10, 20};
        boolean expectedResult = true;

        int[] actualArray = mergeArrays(array1, array2);

        boolean actualResult = Arrays.equals(actualArray, expectedArray);

        assertEquals(expectedResult, actualResult, "Error testMergeArrays_2");
    }

    @Test
    public void testMergeArrays_3() {
        int[] array1 = {6};
        int[] array2 = {1, 3, 5};
        int[] expectedArray = {1, 3, 5, 6};
        boolean expectedResult = true;

        int[] actualArray = mergeArrays(array1, array2);

        boolean actualResult = Arrays.equals(actualArray, expectedArray);

        assertEquals(expectedResult, actualResult, "Error testMergeArrays_3");
    }

    @Test
    public void testMergeArrays_4() {
        int[] array1 = {0, 2, 2, 6};
        int[] array2 = {1, 3};
        int[] expectedArray = {0, 1, 2, 2, 3, 6};
        boolean expectedResult = true;

        int[] actualArray = mergeArrays(array1, array2);

        boolean actualResult = Arrays.equals(actualArray, expectedArray);

        assertEquals(expectedResult, actualResult, "Error testMergeArrays_4");
    }

    @Test
    public void testMergeArrays_5() {
        int[] array1 = {-3, -2, -1, 0};
        int[] array2 = {-1, 1, 1};
        int[] expectedArray = {-3, -2, -1, -1, 0, 1, 1};
        boolean expectedResult = true;

        int[] actualArray = mergeArrays(array1, array2);

        boolean actualResult = Arrays.equals(actualArray, expectedArray);

        assertEquals(expectedResult, actualResult, "Error testMergeArrays_5");
    }

    @Test
    public void testMergeArrays_6() {
        int[] array1 = {};
        int[] array2 = {-1, 5, 6, 11};
        int[] expectedArray = {-1, 5, 6, 11};
        boolean expectedResult = true;

        int[] actualArray = mergeArrays(array1, array2);

        boolean actualResult = Arrays.equals(actualArray, expectedArray);

        assertEquals(expectedResult, actualResult, "Error testMergeArrays_6");
    }

    @Test
    public void testMergeArrays_7() {
        int[] array1 = {-3, -2, -1, 0};
        int[] array2 = {};
        int[] expectedArray = {-3, -2, -1, 0};
        boolean expectedResult = true;

        int[] actualArray = mergeArrays(array1, array2);

        boolean actualResult = Arrays.equals(actualArray, expectedArray);

        assertEquals(expectedResult, actualResult, "Error testMergeArrays_7");
    }

    @Test
    public void testMergeArrays_8() {
        int[] array1 = {-30, -2, -1, 1};
        int[] array2 = {-15, -4, 7, 10};
        int[] expectedArray = {-30, -15, -4, -2, -1, 1, 7, 10};
        boolean expectedResult = true;

        int[] actualArray = mergeArrays(array1, array2);

        boolean actualResult = Arrays.equals(actualArray, expectedArray);

        assertEquals(expectedResult, actualResult, "Error testMergeArrays_8");
    }
}
