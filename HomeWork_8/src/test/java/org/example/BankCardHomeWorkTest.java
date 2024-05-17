package org.example;

import org.junit.jupiter.api.*;

import static org.example.BankCardHomeWork.isValidAccountNumber;
import static org.junit.jupiter.api.Assertions.*;

class BankCardHomeWorkTest {
    @BeforeAll
    static void initBeforeAll(){
        System.out.println("Before all");
    }

    @AfterAll
    static void initAfterAll() {
        System.out.println("After All");
    }

    @BeforeEach
    void initBeforeEach() {
        System.out.println("Before Each");
    }

    @AfterEach
    void initAfterEach(){
        System.out.println("After each");
    }

    @Test
    void isValidAccountNumber14NumberTest () {

        assertTrue(isValidAccountNumber("12345678901234"));
    }

    @Test
    void isValidAccountNumberMore14Numbers () {
        assertFalse(isValidAccountNumber("12345678901234567890"));
    }

    @Test
    void isValidAccountNumberLess14Numbers () {
        assertFalse(isValidAccountNumber("123"));
    }

    @Test
    void isValidAccountNumberAllZero () {
        assertFalse(isValidAccountNumber("00000000000000"));
    }

    @Test
    void isValidAccountNumberLetters () {
        assertFalse(isValidAccountNumber("qwertyuiopasdfg"));
    }

    @Test
    void isValidAccountNumberSymbols () {
        assertFalse(isValidAccountNumber("!@#$%^&*()_+~!"));
    }

    @Test
    void isValidAccountNumberIsNull () {
        assertFalse(isValidAccountNumber(null));
    }

    @Test
    void isValidAccountNumberIsEmpty () {
        assertFalse(isValidAccountNumber(""));
    }

    @Test
    void isValidAccountNumberMix () {
        assertFalse(isValidAccountNumber("qwe123!@#   Q1"));
    }


}