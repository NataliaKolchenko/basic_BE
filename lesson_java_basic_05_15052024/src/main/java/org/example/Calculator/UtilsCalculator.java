package org.example.Calculator;

public class UtilsCalculator {

    public static double summation (double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double subtraction (double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;

    }

    public static double multiplication (double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public static double division (double firstNumber, double secondNumber) {
        return  firstNumber / secondNumber;
    }

    public static double moduleDivision (double firstNumber, double secondNumber) {
        return firstNumber % secondNumber;
    }

    public static void printResult (double firstNum, double secondNum, char operator, double result) {
        System.out.printf("%.2f %c %.2f = %.2f \n", firstNum, operator, secondNum, result);
    }

    public static boolean isNotCorrectOperator (char operator) {
        return operator != '+' && operator != '-' && operator != '*' && operator != '/' && operator != '%';
    }
}
