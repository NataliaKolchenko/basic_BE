//        Создать программу, выводящую на экран случайно сгенерированное
//        трёхзначное натуральное число и его наибольшую цифру.
//        Например: 398
//        Выход: 9

import java.util.Random;

public class RandomAndNumber {

    public static void main(String[] args) {
        Random random = new Random();
        int min = 100;
        int max = 999;

         int randomNumber = (int)(Math.random()*(max - min + 1)+min);

         int singleNumber = 0;


    }
}
