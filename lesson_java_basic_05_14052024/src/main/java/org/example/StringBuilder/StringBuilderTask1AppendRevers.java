package org.example.StringBuilder;//Напишите метод, который принимает две строки в аргументах,
// соединяет их и определяет реверсивный порядок,
// выведите результат на консоль.
//        concatReversStr(String str1, String str2)


//1 version
public class StringBuilderTask1AppendRevers {
    public static void main(String[] args) {

        String str1 ="Good ";
        String str2 = "morning!";
        concatReversStr(str1, str2);
    }

    public static void concatReversStr (String str1, String str2) {
        StringBuilder strString1 = new StringBuilder(str1);
        System.out.println(strString1.append(str2));
        System.out.println(strString1.reverse());

    }
}

//2version
//public static String concatReversStr(String str1, String str2) {
//    StringBuilder str = new StringBuilder();
//    str.append(str1);
//    str.append(str2);
//    str.reverse();
//    return str.toString();
//}
