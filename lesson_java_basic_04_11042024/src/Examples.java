//---------------------------
//Создать новую строку: “I study Java”
//        Вывести в консоль длину строки
//        Вывести в консоль часть строки “Java” используя substring

//public class Examples {
//
//    public static void main(String[] args) {
//        String str1 = "I study Java";
//
//        System.out.println("Length of string = " + str1.length());
//        System.out.println(str1.substring(8));
//        System.out.println(str1.substring(str1.length() - 4));
//
//    }
//}

//---------------------------
//        1Распечатать последний символ строки. Используем метод String.charAt().
//        2Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
//        3Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
//        4Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//        5Найти позицию подстроки “Java” в строке “I like Java!!!”.
//        6Заменить все символы “а” на “о”.
//        7Преобразуйте строку к верхнему регистру.
//        8Преобразуйте строку к нижнему регистру.



//public class Examples {
//
//    public static void main(String[] args) {
//        String str1 = "I like Java!!!";
//
//        System.out.println("1 " + str1.charAt(str1.length()-1));
//        System.out.println("2 " + str1.endsWith("!!!"));
//        System.out.println("3 " + str1.startsWith("I like"));
//        System.out.println("4 " + str1.contains("Java"));
//        System.out.println("5 " + str1.indexOf("Java"));
//        System.out.println("6 " + str1 + " => " + str1.replace('a', '0'));
//        System.out.println("7 " + str1 + " => " + str1.toUpperCase());
//        System.out.println("8 " + str1 + " => " + str1.toLowerCase());
//
//    }
//}

//---------------------------
//Условие здачи: ввести 2 слова, состоящие из четного числа букв.
//        Получить слово состоящее из первой половины первого слова и второй половины второго слова.


import java.util.Scanner;

public class Examples {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add 1st word");
        String userStr1 = scanner.nextLine();
        System.out.println("Add 2nd wor");
        String userStr2 = scanner.nextLine();

        String newUserStr1 = userStr1.substring(0, (userStr1.length() / 2));


        String newUserStr2 = userStr2.substring(userStr2.length() / 2);

        System.out.println("New word: " + newUserStr1 + newUserStr2);



    }
}