//        Реализуйте программу, которая попросит пользователя ввести три целых
//        числа (используйте сканер) и напечатает максимум из трех чисел.

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add 1st number");
        int firstNumber = scanner.nextInt();

        System.out.println("Add 2nd number");
        int secondNumber = scanner.nextInt();

        System.out.println("Add 3rd number");
        int thirdNumber = scanner.nextInt();



       int  largestNumber =  firstNumber > secondNumber
                ? firstNumber
                : secondNumber;

       largestNumber = largestNumber > thirdNumber
               ? largestNumber
               : thirdNumber;

       largestNumber = largestNumber > secondNumber
               ? largestNumber
               : secondNumber;

        System.out.println("The largest number is " + largestNumber);
    }
}
