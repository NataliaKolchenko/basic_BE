package org.example;

import org.junit.jupiter.api.Test;

import static org.example.Constants.*;
import static org.example.Utils.*;
import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    private static double [] arrayD = {1.3,1.5,7.8};
    private static char [] arrayCh = {'+', '-'};
    @Test
    void stringResultNotNullTest() {
        double result = 40;
        assertNotNull(stringResult(arrayD, arrayCh, result));
    }

    @Test
    void stringResultCorrectResultTest() {
        double result = -5;
        String strResult = "1,30 + 1,50 - 7,80 = -5,00";
        assertEquals(strResult, stringResult(arrayD, arrayCh, result));
    }

    @Test
    void stringResultIncorrectResultTest () {
        double result = 10;
        String strResult = "1,30 + 1,50 - 7,80 = -5,00";
        assertNotEquals(strResult, stringResult(arrayD, arrayCh, result));
    }

    @Test
    void stringResultErrorMessageNegativeInfinityTest () {

        double result = Double.NEGATIVE_INFINITY;
        String strResult = ERROR_MSG_DIVISION_ZERO;
        assertEquals(strResult, stringResult(arrayD, arrayCh, result));
    }
    @Test
    void stringResultErrorMessagePositiveInfinityTest () {

        double result = Double.POSITIVE_INFINITY;
        String strResult = ERROR_MSG_DIVISION_ZERO;
        assertEquals(strResult, stringResult(arrayD, arrayCh, result));
    }


    @Test
    void insertCharDataCorrectResultYesBigTest() {
        String userStr = "Y";
        assertEquals('Y',insertCharData(userStr));
    }

    @Test
    void insertCharDataCorrectResultYesSmallTest() {
        String userStr = "y";
        assertEquals('Y',insertCharData(userStr));
    }

    @Test
    void insertCharDataCorrectResultNoBigTest() {
        String userStr = "N";
        assertEquals('N',insertCharData(userStr));
    }

    @Test
    void insertCharDataCorrectResultNoSmallTest() {
        String userStr = "n";
        assertEquals('N',insertCharData(userStr));
    }

    @Test
    void insertCharDataIncorrectCharTest() {
        String userStr = "G";
        assertNotEquals('N', insertCharData(userStr));
    }

    @Test
    void calculateResultCorrectTest() {
        assertEquals(-5 ,calculateResult (arrayD, arrayCh));
    }

    @Test
    void calculateResultSummationTest () {
        double [] arrD = {1.5,1.5};
        char [] arrCh = {'+'};
        assertEquals(3, calculateResult(arrD, arrCh));
    }

    @Test
    void calculateResultSubtractionTest () {
        double [] arrD = {4.2,1.2};
        char [] arrCh = {'-'};
        assertEquals(3, calculateResult(arrD, arrCh));
    }

    @Test
    void calculateResultMultiplicationTest () {
        double [] arrD = {4.2,1.2};
        char [] arrCh = {'*'};
        assertEquals(5.04, calculateResult(arrD, arrCh));
    }

    @Test
    void calculateResultDivisionTest () {
        double [] arrD = {6.3,1.5};
        char [] arrCh = {'/'};
        assertEquals(4.2, calculateResult(arrD, arrCh));
    }

    @Test
    void calculateResultZeroTest () {
        double [] arrD = {1,0};
        char [] arrCh = {'/'};
        assertEquals(Double.POSITIVE_INFINITY, calculateResult(arrD, arrCh));
    }


    @Test
    void isSignPlusTest() {
        assertTrue(isSign(PLUS));
    }

    @Test
    void isSignMinusTest() {
        assertTrue(isSign(MINUS));
    }

    @Test
    void isSignMultiplyTest() {
        assertTrue(isSign(MULTIPLY));
    }

    @Test
    void isSignDivisionTest() {
        assertTrue(isSign(DIVISION));
    }

    @Test
    void isSignIncorrectCharTest () {
        assertFalse((isSign('^')));
    }

    @Test
    void countOfNumbersInExpressionCorrectTest() {
        String userStr = "2+2";
        assertEquals(2,countOfNumbersInExpression(userStr));
    }
}