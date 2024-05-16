package org.example;

import java.util.Scanner;

import static org.example.Constants.*;

public class Utils {

    private static Scanner scanner = new Scanner(System.in);

    public static void printResult (double[] array, char operator, double result) {

        if (result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY) {
            System.out.println(ERROR_MSG_DIVISION_ZERO);
        }
        else {
            for (int i = 0; i < array.length; i++) {

                System.out.printf("%.2f", array[i]);
                if (i != array.length-1){
                    System.out.printf(" %c ", operator);
                }

            }
            System.out.printf(" = %.2f \n", result);
        }

    }

    public static boolean isNotCorrectOperator (char operator) {
        return operator != '+' && operator != '-' && operator != '*' && operator != '/' && operator != '%';
    }


    public static double insertDoubleData (String msg){
        System.out.println(msg);
        return scanner.nextDouble();
    }
    public static char insertCharData (String msg){
        System.out.println(msg);
        return scanner.next().trim().toUpperCase().charAt(0);
    }
    public static char insertOperator (String msg){


        char operator = insertCharData(msg);
        while(isNotCorrectOperator(operator)){
            System.out.println(ERROR_MSG_OPERATION);
            operator = insertCharData(CHOSE_OPERATION);
        }
        return operator;
    }


    public static double calculateResult (double[] array, char operator) {
        double result = array[0];

        for (int i = 1; i < array.length; i++) {
            switch (operator) {
                case PLUS:
                    result += array[i];
                    break;
                case MINUS:
                    result -= array[i];
                    break;
                case MULTIPLY:
                    result *= array[i];
                    break;
                case DIVISION:
                    result /= array[i];
                    if (array[i] == 0) {
                        return result;
                    }
                    break;

            };
        }
        return result;
    }

}
