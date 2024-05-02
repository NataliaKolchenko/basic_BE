package basic_BE.lesson_java_basic_04_10042024.src;

import java.util.Scanner;
d
//-------------------------
//1. Создать объект Scanner
//        2. Получить от пользователя строку
//        3. Получить от пользователя число
//        4. Получить от пользователя булеан значение 
//        5. Получить от пользователя длинное число
//        6. Получить от пользователя дробное число
//


//public class Main {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Add string");
//        String userStr = scanner.nextLine();
//        System.out.println(userStr);
//
//        System.out.println("Add number");
//        int userNumber = scanner.nextInt();
//        System.out.println(userNumber);
//
//        System.out.println("Add true or false");
//        boolean userBool = scanner.nextBoolean();
//        System.out.println(userBool);
//
//        System.out.println("Add long number");
//        long userLongNum = scanner.nextLong();
//        System.out.println(userLongNum);
//
//        System.out.println("Add double number");
//        double userDouble = scanner.nextDouble();
//        System.out.println(userDouble);
//    }
//}

//-----------------------
//Создать объект Scanner
//        Получить от пользователя первое число
//        Получить от пользователя второе число
//        Произвести математические операции +, -, *, /
//        Вывести результат в консоль

//public class Main {
//    public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//        System.out.println("Give me first number");
//        int firstNumber = scanner.nextInt();
//
//        System.out.println("Give me second number");
//        int secondNumber = scanner.nextInt();
//
//        int sum = firstNumber + secondNumber;
//        int subtraction = firstNumber - secondNumber;
//        int multiplications = firstNumber * secondNumber;
//        double division = ((double) (firstNumber) / (double) (secondNumber));
//
//        System.out.println(sum);
//        System.out.println(subtraction);
//        System.out.println(multiplications);
//        System.out.println(division);
//
//    }
//}

//-----------------------

//5x + 10y = ?

//public class Main {
//    public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//        System.out.println("Give me X number");
//        int xNumber = scanner.nextInt();
//
//        System.out.println("Give me Y number");
//        int yNumber = scanner.nextInt();
//
//        int result = 5 * xNumber + 10 * yNumber;
//
//        System.out.println("5x + 10y = " + result);
//
//    }
//}

//-----------------------

//    Пользователь вводит радиус окружности и вывести площадь
//S = π × r2

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me radius");
        int userRad = scanner.nextInt();

        double sCirc = Math.PI * (userRad * userRad);

        System.out.println("S = π × r2; \nS = " + sCirc);


    }
}

