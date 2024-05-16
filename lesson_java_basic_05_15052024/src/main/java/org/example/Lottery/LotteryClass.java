package org.example.Lottery;

import static org.example.Lottery.UtilsLottery.*;
import static org.example.Lottery.VariablesLottery.*;

public class LotteryClass {

    public void start () {

        int[] userArr = getUserNumbers(NUM_OF_LUCKY_NUMBERS, MIN, MAX);
        int[] winNumbersArr = getWinNumbers(NUM_OF_LUCKY_NUMBERS, MIN, MAX);


        System.out.print("User's numbers: ");
        printArray(userArr);
        System.out.print("Win numbers: ");
        printArray(winNumbersArr);
        System.out.print("User was right in " + compareWinNumbers(userArr, winNumbersArr) + " cases");

    }

}
