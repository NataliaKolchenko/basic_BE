//работа со строками
public class WorkWithStrings {
    public static void main(String[] args) {

        String str1 = "Hello Java! new world";
//приведение к нижнему регистру
        System.out.println(str1 + " =>" + str1.toLowerCase());
//приведение к верхнему регистру
        System.out.println(str1 + " => +" + str1.toUpperCase());
//вывод только одной буквы (например, 1ю. Отсчет с нуля)
        System.out.println(str1.charAt(0));
//по 5 индексу находится пробел (т.5 поиск индекса у определенного символа)
        System.out.println(str1.indexOf(' '));
//вывести интекс определенного символа  и сам этот символ
        System.out.println(str1.charAt((str1.indexOf("l"))));
//повторить сколько угодно раз
        System.out.println(str1.repeat(10));
//спрашиваем, начинает ли наша строка с определенной буквы. возвращается булевое значение
        System.out.println(str1.startsWith("H"));
//спрашиваем, заканчивается ли наша строка с определенной буквы. возвращается булевое значение
        System.out.println(str1.endsWith("a"));
//вывод строки все, после определенного символа (например, все, после 6го символа), символ, с которого начинаем - не включается в вывож
        System.out.println(str1.substring(6));
//вывод строки все, между определенных символов (например, все, межлу 3 и 7 символом)
        System.out.println(str1.substring(1, 3));

//        замена символов с 'а' на 'о'
        System.out.println("6 " + str1 + " => " + str1.replace('a', '0'));
//         проверить содержится ли что-то (например Java) в строке
        System.out.println("4 " + str1.contains("Java"));
    }
}

//---------------------------------------------
//преобразование Char в Int
