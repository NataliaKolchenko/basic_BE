package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.example.FindMaxNumber.findMax;

class FindMaxNumberTest {

        @Test
        void findMaxNotEmptyArrayTest() {
//        int[] arr = {1,3,5,7,9,-5,0,-234};
            assertNotNull(findMax(new int []{1,3,5,7,9,-5,0,-234}));
        }

        @Test
        void findMaxEmptyArrayTest() {
            int[] arr = null;
        assertEquals(null,findMax(arr)); //либо/либо
            assertNull(findMax(arr));
        }

        @Test
        void findMaxExpectResultTest() {
            int[] arr = {1,3,5,7,9,-5,0,-234};
            int max = 9;
            assertEquals(max, findMax(arr));
        }


        @Test
        void findMaxNotEmptyResultTest() {
            int[] arr = {0, -5, 7};
            assertNotNull(findMax(arr));
        }




    }

