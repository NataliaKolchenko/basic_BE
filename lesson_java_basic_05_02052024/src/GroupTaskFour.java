//1) Подсчитайте, сколько среди данных n чисел нулей, положительных чисел и отрицательных чисел.


import java.util.Scanner;

public class GroupTaskFour {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countZero = 0;
        int countPositiveNumbers = 0;
        int countNegativeNumbers = 0;

        while (true) {
            int userNumber = scanner.nextInt();

            if (userNumber == 555) {
                break;
            } else if (userNumber == 0) {
                countZero +=1;
            } else if (userNumber > 0) {
                countPositiveNumbers += 1;
            } else if (userNumber < 0) {
                countNegativeNumbers += 1;
            }



        }
        System.out.println("numbers of zero is " + countZero);
        System.out.println("amount positive numbers is " + countPositiveNumbers);
        System.out.println("amount negative numbers is " + countNegativeNumbers);

    }
}
