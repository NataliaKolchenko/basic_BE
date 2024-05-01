//Получите от пользователя Строку.
//        2. Напечатайте все буквы из строки, игнорируйте знаки препинания ?, !, ., ,’ и пробел
//        3. Для решения используйте цикл и charAt() метод
//        Например:
//        Вход = “I don’t like rain !”
//        выход = I,d,o,n,t,l,i,k,e,r,a,i,n

import java.util.Scanner;

public class LoopForStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userStr = scanner.nextLine();

        printChar(userStr);


    }
    private static final String PUNCT = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";

    public static String printChar (String str) {

        StringBuilder string = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            System.out.println(symbol);

            if (PUNCT.indexOf(symbol) < 0) {
                string.append(symbol);

            }
        }
        return string.toString();
    }
}
