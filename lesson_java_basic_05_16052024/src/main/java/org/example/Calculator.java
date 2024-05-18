//Доработайте программу "Калькулятор" (версии 2) таким образом,
//        чтобы она позволяла пользователю вводить вычисляемое математическое выражение
//        в виде одной строки. Например, так 10.5*5+1-7.1+8*7 и последовательно выполняла
//        бы указанные арифметические операции над аргументами.

package org.example;

import java.util.Scanner;

import static org.example.Constants.*;
import static org.example.Utils.*;

public class Calculator {
    public  void run() {
        Scanner scanner = new Scanner(System.in);

        char userAnswer = YES;

        do {
            if (userAnswer == YES) {

                String userExpression = scanner.nextLine();
                int amountNumbers = countOfNumbersInExpression(userExpression);

                double[] numbersArray = new double[amountNumbers];
                char [] operatorArr = new char[amountNumbers-1];

                splitExpressionToArrays(userExpression, numbersArray, operatorArr);

                String currentResult = stringResult (numbersArray, operatorArr, calculateResult (numbersArray, operatorArr));
                printResult(currentResult);
                saveHistory(currentResult);
                printHistory (HISTORY_ARRAY);

            } else {
                System.out.println(CONTINUE_YES_NO_MSG);
            }

            String answer = scanner.nextLine();
            userAnswer = insertCharData(CONTINUE_QUESTION, answer);


        } while (userAnswer != NO);



    }
}
