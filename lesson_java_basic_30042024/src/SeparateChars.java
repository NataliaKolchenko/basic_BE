//        Получите от пользователя Строку.
//        2. Напечатайте все буквы из строки, игнорируйте знаки препинания ?, !, ., ,’ и пробел
//        3. Для решения используйте цикл и charAt() метод
//        Например:
//        Вход = “I don’t like rain !”
//        выход = I,d,o,n,t,l,i,k,e,r,a,i,n

import java.util.Scanner;

public class SeparateChars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userString = scanner.nextLine();

        for (int i = 0; i < userString.length(); i++) {

            switch (userString.charAt(i)) {
                case '?':
                case '!':
                case '.':
                case ',':
                case ' ':
                break;

                default:
                    System.out.print(userString.charAt(i));


                    StringBuilder s = new StringBuilder(userString.charAt(i));
                    s.append(",");


                    System.out.print(s);


            };


        }


    }
}
