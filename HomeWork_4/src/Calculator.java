import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {



//        Создайте методы с математическими операциями +, -, *, /
//        Каждый метод принимает два числа в параметрах и возвращает результат
//        Вызовите все методы в main
//        Результат распечатайте в консоль


        Scanner scannerTask2 = new Scanner(System.in);
        System.out.println("Add 1st number");
        int firstNumber = scannerTask2.nextInt();
        System.out.println("Add 2nd number");
        int secondNumber = scannerTask2.nextInt();

        summation(firstNumber, secondNumber);
        subtraction(firstNumber, secondNumber);
        multiplication(firstNumber, secondNumber);
        division(firstNumber, secondNumber);





    }

    public static void summation (int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
    }

    public static void subtraction (int firstNumber, int secondNumber) {
        int subtractionNumbers = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + subtractionNumbers);
    }

    public static void multiplication (int firstNumber, int secondNumber) {
        int multiplicationNumbers = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + multiplicationNumbers);
    }

    public static void division (int firstNumber, int secondNumber) {
        double divisionNumbers = (double) firstNumber / (double) secondNumber;
        System.out.println(firstNumber + " / " + secondNumber + " = " + divisionNumbers);
    }
}
