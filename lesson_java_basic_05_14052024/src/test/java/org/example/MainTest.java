package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
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
    void getNumbersAssertNotEqualsTest() {
        int[] arr = {1,2,3};
        assertNotEquals(arr, Main.getNumbers());
    }

    @Test
    void getNumbersAssertArrayEqualsTest() {
        int[] arr = {1,2,3};
        assertArrayEquals(arr, Main.getNumbers());

    }

    @Test
    void getNumbersCheckNotNullTest() {
        assertNotNull(Main.getNumbers());
    }
}