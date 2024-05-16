package org.example;

import org.junit.jupiter.api.Test;

import static org.example.BankCard.isValidAccountNumber;
import static org.junit.jupiter.api.Assertions.*;

class BankCardTest {

    //  account number has 14 numbers (true)
    @Test
    void isValidAccountNumber14NumbersTest() {

        assertTrue(isValidAccountNumber("12345678901234"));
    }

    //    account number is null (false)
    @Test
    void isValidAccountNumberNullTest() {

        assertFalse(isValidAccountNumber(null));
    }

    //    account number is empty (false)
    @Test
    void isValidAccountNumberEmptyTest() {
        assertFalse(isValidAccountNumber(""));
    }

    //    account number has less 14 numbers (false)
    @Test
    void isValidAccountNumberLess14NumbersTest () {
        assertFalse(isValidAccountNumber("123"));
    }

    //    account number has more then 14 numbers (false)
    @Test
    void isValidAccountNumberMore14NumbersTest () {
        assertFalse(isValidAccountNumber("123456789012345"));
    }

    //    account number has letter (false)
    @Test
    void isValidAccountNumberLettersTest () {
        assertFalse(isValidAccountNumber("ewsehfkehfeiuf"));
    }

    //    account number has symbols (false)
    @Test
    void isValidAccountNumberSymbolsTest () {
        assertFalse(isValidAccountNumber("!@#$%%"));
    }

    //    account number has mix symbols, letters, numbers, spase (false)
    @Test
    void isValidAccountNumberMixTest () {
        assertFalse(isValidAccountNumber("2@k "));
    }

    //    account number has all 0 (false)
    @Test
    void isValidAccountNumberZerosTest () {
        assertFalse(isValidAccountNumber("00000000000000"));
    }



}