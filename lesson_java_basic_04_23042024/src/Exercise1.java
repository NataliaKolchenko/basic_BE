//Напишите метод, который принимает на вход количество студентов и
//“рандомально” выбирает любого студента начиная со второго включительно.

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
//        System.out.println("Add total students");
//        Scanner scan = new Scanner(System.in);
//        String numberStudents = Integer.valueOf(scan.nextLine());

        System.out.println(RandomStudent(30));

    }

    public static int RandomStudent (int maxSt) {
        int min = 2;
        int max = maxSt;
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
