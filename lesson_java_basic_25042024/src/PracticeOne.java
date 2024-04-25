//        написать программу, которая считывает два целых
//        числа с клавиатуры и выводит на экран сообщение
//        о том, какое из чисел больше, или сообщает, что они равны.
//        "первое число больше"
//        "второе число больше"
//        "числа равны"

import java.util.Scanner;

public class PracticeOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add 1st number");
        int numberOne = scanner.nextInt();
        System.out.println("Add 2nd number");
        int numberTwo = scanner.nextInt();

        if (numberOne > numberOne) {
            System.out.println("первое число больше");
        } else if (numberOne < numberTwo) {
            System.out.println("второе число больше");
        } else {
            System.out.println("числа равны");
        }
    }
}
