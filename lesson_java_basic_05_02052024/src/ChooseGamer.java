//Реализуйте меню выбора игрока (Elf or Orc and Exit)
//        a. Отобразите меню
//        i. 1. Elf
//        ii. 2. Orc
//        iii. 3. Exit
//        b. Проверьте ввод на соответствие, в случае неверного ввода
//        распечатайте "Choose any one : " и покажите меню выбора
//        c. Сохраните выбор
//        d. Распечатайте выбор в консоль

import java.util.Scanner;

public class ChooseGamer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose one gamer: \n1.ELF \n2.Orc \n3.Green");
            String userChoose = scanner.nextLine();

            if (userChoose.equals("ELF") || userChoose.equals("Orc") || userChoose.equals("Green")) {
                System.out.println(userChoose);
                break;
            } else {
                System.out.println("Choose another one");

            }
        }


    }
}
