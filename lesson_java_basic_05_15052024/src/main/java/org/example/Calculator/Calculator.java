package org.example.Calculator;

import java.util.Scanner;

import static org.example.Calculator.ConstantsCalculator.*;
import static org.example.Calculator.UtilsCalculator.*;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char userAnswer = YES;

        do {

            if (userAnswer == YES) {
                System.out.println("Add 1st number");
                double firstNumber = scanner.nextDouble();

                System.out.println("Add 2nd number");
                double secondNumber = scanner.nextDouble();

                System.out.println("what will be the operation?");
                String userOperator = scanner.next();
                char operator = userOperator.charAt(0);

                while (isNotCorrectOperator(operator)) {
                    System.out.println("Incorrect operator");
                    System.out.println("You can use + - * / %");
                    userOperator = scanner.next();
                    operator = userOperator.charAt(0);
                }



                switch (operator) {
                    case PLUS :
                        printResult (firstNumber, secondNumber, '+', summation(firstNumber, secondNumber));
                        break;
                    case MINUS :
                        printResult (firstNumber, secondNumber, '-', subtraction(firstNumber, secondNumber));
                        break;
                    case MULTIPLY :
                        printResult (firstNumber, secondNumber, '*', multiplication(firstNumber, secondNumber));
                        break;
                    case DIVISION :
                        while (secondNumber == 0) {
                            System.out.println("Division by zero");
                            System.out.println("Input 2nd number again. Not 0!");
                            secondNumber = scanner.nextDouble();
                        }
                        printResult (firstNumber, secondNumber, '/', division(firstNumber, secondNumber));

                        break;
                    case MODULE_DIVISION:
                        printResult (firstNumber, secondNumber, '%', moduleDivision(firstNumber, secondNumber));
                        break;
                }
            } else {
                System.out.println("To continue input 'Y or y', to exit - 'N or n'");
            }



            System.out.println("Would you like continue?");
            userAnswer = scanner.next().toUpperCase().charAt(0);

        } while (userAnswer != NO);








    }


}
