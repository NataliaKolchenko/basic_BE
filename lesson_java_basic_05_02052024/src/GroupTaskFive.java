//2) Многие натуральные числа можно представить в виде n = 3*A + 5*B, где A и B -- целые неотрицательные числа.
//        Вам требуется по заданному числу определить, можно ли его представить в таком виде, и если это возможно, найти подходящие A и B.
//        В противном случае вывести -1 -1

import java.util.Scanner;

public class GroupTaskFive {

    //1 version
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input Number");
//        int number = scanner.nextInt();
//        int a=0;
//        int b=0;
//        boolean found = false;
//        for (a = 0; a < (number/3 + 1); a++) {
//            for (b = 0; b < (number/5 + 1); b++) {
//                if ((3 * a + 5 * b) == number) {
//                    found = true;
//                    break;
//                }
//            }
//            if (found) break;
//
//        }
//        if (found) {
//            System.out.println("Number " + number + " = 3 * " + a + " + 5 * " + b);
//        }
//        else System.out.println("-1");
//    }


    //2 version
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Number");
        int number = scanner.nextInt();
        int a=0;
        int b=0;
        boolean found = false;
        for (a = 0; a < (number/3 + 1); a++) {
            if ((number - a * 3) % 5 == 0) {
                b = (number - a * 3) / 5;
                found = true;
                break;

            }
        }

        if (found) {
            System.out.println("Number " + number + " = 3 * " + a + " + 5 * " + b);
        }
        else System.out.println("-1");
    }

    }



