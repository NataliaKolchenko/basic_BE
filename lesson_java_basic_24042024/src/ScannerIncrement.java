//        Напишите программу, которая запрашивает у пользователя числа до тех пор,
//        пока не будет введено число 0. Подсчитайте, сколько раз было введено каждое из чисел:
//        положительное или отрицательное (используйте инкремент для счетчиков).

import java.util.Scanner;

public class ScannerIncrement {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int countPositive = 0;
        int countNegative = 0;
        while (true) {
            System.out.println("Add number");
            int userNumber = scan.nextInt();
            if (userNumber == 0) {
                break;
            } else if (userNumber > 0) {
                countPositive++;
            } else if (userNumber < 0) {
                countNegative++;
            }


        }

        System.out.println("Positive numbers amount " + countPositive);
        System.out.println("Negative numbers amount " + countNegative);
    }
}
