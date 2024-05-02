//        1. Реализуйте метод, принимающий в параметре число.
//        2. Распечатайте все числа от 1 до этого числа

import java.util.Scanner;

public class LoopForPrintNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int userNumber = scan.nextInt();

        printNumbers(userNumber);

    }

    public static void printNumbers (int number) {
        for (int i = 0; i <= number; i++) {
            System.out.println(i);
        }
//            если число меньше нуля
             if (number < 0) {
                 for (int b = 0; b > number; b--) {
                     System.out.println(b);
                 }
             }


    }
}