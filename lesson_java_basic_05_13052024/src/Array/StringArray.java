package Array;//Создайте строку как литерал: str1 = “Java”
//        Создайте строку как литерал: str2 = “Java”
//        Создайте строку как Объект: str 3 = new (“Java”)
//        Создайте строку как Объект: str 4 = new (“Java”)
//        Сравните строки 1 и 2 используя ==
//        Сравните строки 1 и 2 используя equals
//        Сравните строки 3 и 4 используя ==
//        Сравните строки 3 и 4 используя equals
//        Сравните строки 1 и 3 используя ==
//        Сравните строки 1 и 3 используя equals
//        Проанализируйте результат

public class StringArray {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        String str4 = new String("Java");
        str3 = str3.intern(); //кладет переменную в пулл строк

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));

//        System.out.println();
//        System.out.println(str1 == str3);



    }
}
