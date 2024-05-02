//        написать программу, считывающую 2 числа и выводящую их сумму
//        если два числа равны между собой, вывести одно число и остановить программу.

import java.util.Scanner;

public class SumInTheLoop {

//    1 version
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {

            System.out.println("1st number");
            int numberOne = scanner.nextInt();
            System.out.println("2nd number");
            int numberTwo = scanner.nextInt();

            if (numberTwo == numberOne) {
                System.out.println(numberOne);
                break;
            } else {
                sum = numberOne + numberTwo;
                System.out.println("sum is " + sum);
            }

        }




    }

//    2 version
//public static void weirdSumPrinter() {
//    Scanner scanner = new Scanner(System.in);
//    int a = scanner.nextInt(), b = scanner.nextInt();
//
//    while (a != b) {
//        System.out.println(a + b);
//        a = scanner.nextInt();
//        b = scanner.nextInt();
//    }
//    System.out.println(a);
//}
}
