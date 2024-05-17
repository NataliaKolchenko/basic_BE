package org.example;

import java.util.Scanner;

import static org.example.Constants.*;

public class Utils {

    private static Scanner scanner = new Scanner(System.in);

    public static void printResult (String str) {
        System.out.println(str);
    }


    public static String stringResult (double[] array, char[] operator, double result) {

        StringBuilder str = new StringBuilder();
        if (result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY) {
            System.out.println(ERROR_MSG_DIVISION_ZERO);
        }
        else {
            for (int i = 0; i < array.length; i++) {
                if (i == array.length-1) {
                    str.append(String.format("%.2f", array[i]));
                } else {
                    str.append(String.format("%.2f",array[i]));
                    str.append(" " + operator[i] + " ");
                }


            }
            str.append(" = ");
            str.append(String.format(" %.2f ", result));

        }
        return  String.valueOf(str);
    }

    public static void saveHistory (String expression) {

        for (int i = 0;i < HISTORY_ARRAY.length; i++ ) {
            if (HISTORY_ARRAY[i] == null) {
                HISTORY_ARRAY[i] = expression;
                break;
            }

        }

    }

    public static void printHistory (String [] history) {
        System.out.println("History " + HISTORY_SIZE +" expressions");
        for (String strHistory : history) {
            System.out.println(strHistory);
        }
    }

    public static boolean isNotCorrectOperator (char operator) {
        return operator != '+' && operator != '-' && operator != '*' && operator != '/' && operator != '%';
    }


//    public static double insertDoubleData (String msg){
//        System.out.println(msg);
//        return scanner.nextDouble();
//    }
    public static char insertCharData (String msg){
        System.out.println(msg);
        return scanner.next().trim().toUpperCase().charAt(0);
    }
//    public static char insertOperator (String msg){
//
//
//        char operator = insertCharData(msg);
//        while(isNotCorrectOperator(operator)){
//            System.out.println(ERROR_MSG_OPERATION);
//            operator = insertCharData(CHOSE_OPERATION);
//        }
//        return operator;
//    }


    public static double calculateResult (double[] array, char [] operator) {
        double result = array[0];

        for (int i = 1; i < array.length; i++) {

            switch (operator[i-1]) {
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

//    public static int amountUserNumbers () {
//        System.out.println(AMOUNT_OF_NUMBERS);
//        int amountNumbers = scanner.nextInt();
//        while (amountNumbers < 2) {
//            System.out.println(MIN_AMOUNT_OF_NUMBERS_MSG);
//            amountNumbers = scanner.nextInt();
//        }
//        return amountNumbers;
//    }

    public static boolean isSign (char sign) {
        return sign == PLUS || sign == MINUS || sign == MULTIPLY || sign == DIVISION;
    }

    public static void splitExpressionToArrays (String userString, double[] numbersArr, char[] operatorsArr) {
        userString = userString.replace(',', '.');
        int lastSign = 0;
        int count = 0;
        for (int i = 0; i < userString.length(); i++) {
            if (isSign(userString.charAt(i))) {
                operatorsArr[count] = userString.charAt(i);
                numbersArr[count] = Double.parseDouble(userString.substring(lastSign,i));
                lastSign = i;
                count++;
            } else if (i == userString.length()-1){
                numbersArr[count] = Double.parseDouble(userString.substring(lastSign,i+1));
            }

        }
    }




    public static int countOfNumbersInExpression (String userExpression) {
        int counter = 1;
        for (int i = 0; i < userExpression.length(); i++) {
            if (isSign(userExpression.charAt(i))) {
                counter++;
        }
    }
        return counter;
    }



}
