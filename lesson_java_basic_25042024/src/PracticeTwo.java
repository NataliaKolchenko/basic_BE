//        написать программу, которая проверяет, является ли
//        введенное пользователем число четным или нечетным,
//        и выводит соответствующее сообщение.

import java.util.Scanner;

public class PracticeTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add number");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even");
        } else {
            System.out.println("Number " + number + " is odd");
        }
    }
}
