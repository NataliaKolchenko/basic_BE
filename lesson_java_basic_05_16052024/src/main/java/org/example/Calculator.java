package org.example;

import java.util.Scanner;

import static org.example.Constants.*;
import static org.example.Utils.*;

public class Calculator {
    public  void run() {

        Scanner scan = new Scanner(System.in);


        char userAnswer = YES;

        do {
            if (userAnswer == YES) {
                System.out.println(AMOUNT_OF_NUMBERS);
                int amountNumbers = scan.nextInt();
                double[] numbersArray = new double[amountNumbers];
                for (int i = 0; i < amountNumbers; i++){
                    numbersArray[i] = insertDoubleData(ADD_NUMBER);
                }


                char operator = insertOperator(CHOSE_OPERATION);
                printResult(numbersArray, operator, calculateResult (numbersArray, operator));


            } else {
                System.out.println(CONTINUE_YES_NO_MSG);
            }


            userAnswer = insertCharData(CONTINUE_QUESTION);


        } while (userAnswer != NO);



    }
}
