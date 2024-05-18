package org.example;

import org.junit.jupiter.api.Test;

import static org.example.Constants.CONTINUE_QUESTION;
import static org.example.Constants.ERROR_MSG_DIVISION_ZERO;
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
    void stringResultErrorMessageTest () {

        double result = Double.NEGATIVE_INFINITY;
        String strResult = ERROR_MSG_DIVISION_ZERO;
        assertEquals(strResult, stringResult(arrayD, arrayCh, result));
    }

    @Test
    void insertCharDataCorrectResultYesBigTest() {
        String userStr = "Y";
        assertEquals('Y',insertCharData(CONTINUE_QUESTION,userStr));
    }

    @Test
    void calculateResult() {
    }

    @org.junit.jupiter.api.Test
    void isSign() {
    }

    @org.junit.jupiter.api.Test
    void splitExpressionToArrays() {
    }

    @org.junit.jupiter.api.Test
    void countOfNumbersInExpression() {
    }
}