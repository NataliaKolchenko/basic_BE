package org.example.Lottery;

import java.util.Scanner;

public class UtilsLottery {

    public static boolean isArrContainNum (int number, int[] userArr) {
        for (int item : userArr) {
            if (item == number) {
                return true;
            }
        }
        return false;
    }

    public static int compareWinNumbers (int [] userArr, int [] winNumbersArr) {
        int count = 0;
        for (int i = 0; i < userArr.length; i++) {
            if (isArrContainNum(userArr[i], winNumbersArr)){
                count++;
            }
        }
        return count;
    }

    public static int[] getWinNumbers (int lengthArray, int min, int max) {
        int [] arr = new int [lengthArray];
        int lucky;
        int countLuckyNumbers = 0;
        while (arr.length > countLuckyNumbers) {

            lucky = (int)(Math.random()*(max - min + 1)+min);

            if (!isArrContainNum(lucky, arr)) {
                arr[countLuckyNumbers] = lucky;
                countLuckyNumbers++;
            }
        }
        return arr;
    }

    public static int [] getUserNumbers (int lengthArray, int min, int max) {
        int [] userArr = new int [lengthArray];
        int countUserNumbers = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add 5 numbers in range [1..50]");

        while (userArr.length > countUserNumbers) {
            int userNumber = scanner.nextInt();
            if ((!isArrContainNum(userNumber, userArr)) && userNumber >= min && userNumber <= max) {
                userArr[countUserNumbers] = userNumber;
                countUserNumbers++;
            }
        }
        scanner.close();
        return userArr;
    }

    public static void printArray (int [] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
}
