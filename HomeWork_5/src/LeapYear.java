//        Реализуйте программу, которая попросит пользователя ввести год и
//        напечатать этот год isLeap (високосный) или нет.
//        Високосным является год, номер которого кратен четырём, но не кратен 100. При этом годы, кратные четырем, также високосные.
//        Отсюда следует распределение високосных годов:
//        год, номер которого кратен 400, — високосный;
//        остальные годы, номер которых кратен 100, — невисокосные (например, годы 1700, 1800, 1900, 2100, 2200, 2300);
//        остальные годы, номер которых кратен 4, — високосные;
//        все остальные годы — невисокосные.

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add a year");
        int userYear = scanner.nextInt();

        isLeap(userYear);

    }

    public static void isLeap (int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))   {
            System.out.println("This year is leap");
        } else {
            System.out.println("This year is not leap");
        }

    }
}
