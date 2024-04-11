import java.util.Scanner;

public class HomeWork_3 {

    public static void main(String[] args) {
//        -----------------------------------
//        Task 1
//        Условие здачи: ввести 2 слова, состоящие из четного числа букв.
//        Получить слово состоящее из первой половины первого слова и второй половины второго слова.

        System.out.println("Task 1");

        Scanner scannerTask1 = new Scanner(System.in);
        System.out.println("Add 1st word");
        String userStr1 = scannerTask1.nextLine();
        System.out.println("Add 2nd word");
        String userStr2 = scannerTask1.nextLine();

        String newUserStr1 = userStr1.substring(0, (userStr1.length() / 2));

        String newUserStr2 = userStr2.substring(userStr2.length() / 2);

        System.out.println("New word: " + newUserStr1 + newUserStr2);

        System.out.println("----------------------------------------------------------------------");

//        -----------------------------------
//        Task 2
//        Создайте методы с математическими операциями +, -, *, /
//        Каждый метод принимает два числа в параметрах и возвращает результат
//        Вызовите все методы в main
//        Результат распечатайте в консоль

        System.out.println("Task 2");

        Scanner scannerTask2 = new Scanner(System.in);
        System.out.println("Add 1st number");
        int firstNumber = scannerTask2.nextInt();
        System.out.println("Add 2nd number");
        int secondNumber = scannerTask2.nextInt();

        Summation sumOne = new Summation(firstNumber, secondNumber);
        sumOne.sum();

        Subtraction subtractionOne = new Subtraction(firstNumber, secondNumber);
        subtractionOne.subtraction();

        Multiplication multiplicationOne = new Multiplication(firstNumber, secondNumber);
        multiplicationOne.multiplication();

        Division divisionOne = new Division( firstNumber, secondNumber);
        divisionOne.division();

        System.out.println("----------------------------------------------------------------------");

//         -----------------------------------
//        Task 3.1
//        Напишите программу, которая запрашивает имя пользователя и выводит на экран «Добрый день <…….. !>».

        System.out.println("Task 3");

        Scanner scannerTask3 = new Scanner(System.in);
        String userName = scannerTask3.nextLine();

        System.out.println("Good afternoon, " + userName + "!");

        System.out.println("----------------------------------------------------------------------");

//        ---------------------------------
//        Task 3.2
//        Улучшите программу, которая запрашивает имя пользователя и выводит на экран
//«Добрый день  <…….. !>».
//«Ваше имя начинается с символа <.> и заканчивается на символ <.>».

        System.out.println("Ваше имя начинается с символа " + userName.charAt(0) + " и заканчивается на символ " + userName.charAt(userName.length()-1));









    }
}

