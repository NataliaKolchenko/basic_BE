//        Создать программу, выводящую на экран случайно сгенерированное
//        трёхзначное натуральное число и его наибольшую цифру.
//        Например: 398
//        Выход: 9

import java.util.Random;

public class RandomAndNumber {

    public static void main(String[] args) {
//        Random random = new Random();
        int min = 100;
        int max = 999;

         int randomNumber = (int)(Math.random()*(max - min + 1)+min);
//         int randomNumber = 812;

        System.out.println("Random number is " + randomNumber);

        int numberThree = randomNumber % 10; //третье число
        int number2 = randomNumber / 10;
        int numberTwo = number2 % 10; //второе число
        int numberOne = number2 / 10; //первое число
//        System.out.println(number1);
//        System.out.println(number3);
//        System.out.println(number4);

        int largerNumber = 0;

//        if (numberOne >= numberTwo) {
//            largerNumber = numberOne;
//        } else {
//            largerNumber = numberTwo;
//        }
//
//        if (numberOne >= numberThree) {
//            largerNumber = numberOne;
//        } else {
//            largerNumber = numberThree;
//        }
//
//        if (numberTwo >= largerNumber) {
//            largerNumber = numberTwo;
//        } else {
//            largerNumber = largerNumber;
//        }

        largerNumber = numberOne >= numberTwo
                ? numberOne
                : numberTwo;

        largerNumber = numberOne >= numberThree ? numberOne : numberThree;

        largerNumber = numberTwo >= largerNumber
                ? numberTwo
                : largerNumber;


        System.out.println("The largest number is " + largerNumber);




    }
}
