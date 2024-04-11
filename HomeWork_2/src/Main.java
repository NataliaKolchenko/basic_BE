import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        1) В методе main инициализировать 3 переменные примитивного типа и вывести на консоль результат выполнения операций + - *  / %.
//        2) Дано трехзначное число. Вывести на экран все цифры этого числа
//        Пример: 345
//        Вывод в консоль: Число 345 -> 3, 4, 5

        System.out.println("Task 1");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add 1st number");
        double firstNumber = scanner.nextDouble();
        System.out.println("Add 2nd number");
        double secondNumber = scanner.nextDouble();
        System.out.println("Add 3rd number");
        double thirdNumber = scanner.nextDouble();

        double sum = firstNumber + secondNumber + thirdNumber;
        double sub = firstNumber - secondNumber - thirdNumber;
        double mult = firstNumber * secondNumber * thirdNumber;
        double div = firstNumber / secondNumber / thirdNumber;

        System.out.println(firstNumber + " + " + secondNumber + " + " + thirdNumber + " = " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " - " + thirdNumber + " = " + sub);
        System.out.println(firstNumber + " * " + secondNumber + " * " + thirdNumber + " = " + mult);
        System.out.println(firstNumber + " / " + secondNumber + " / " + thirdNumber + " = " + div);

        System.out.println("------------------------------------------------------------");
        System.out.println("Task 2");

        int number = 345;
        System.out.println("Number = " + number);

        System.out.println("version 1");

        String numberStr = String.valueOf(number);

        System.out.println(numberStr.charAt(0));
        System.out.println(numberStr.charAt(1));
        System.out.println(numberStr.charAt(2));


        System.out.println("version 2");

        int firstElem = number / 100;
        System.out.println(firstElem);

        int middleElem = number / 10 % 10;
        System.out.println(middleElem);

        int lastElem = number % 10;
        System.out.println(lastElem);


    }
}