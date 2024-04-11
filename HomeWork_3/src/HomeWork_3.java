import java.util.Scanner;

public class HomeWork_3 {

    public static void main(String[] args) {
//        -----------------------------------
//        Task 1
//        Условие здачи: ввести 2 слова, состоящие из четного числа букв.
//        Получить слово состоящее из первой половины первого слова и второй половины второго слова.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add 1st word");
        String userStr1 = scanner.nextLine();
        System.out.println("Add 2nd word");
        String userStr2 = scanner.nextLine();

        String newUserStr1 = userStr1.substring(0, (userStr1.length() / 2));

        String newUserStr2 = userStr2.substring(userStr2.length() / 2);

        System.out.println("New word: " + newUserStr1 + newUserStr2);

        System.out.println("----------------------------------------------------------------------");









    }
}

