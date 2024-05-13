//Создайте StringBuilder объекты используя все предоставленные конструкторы
//        Используя метод append добавьте к объекту, который создан при помощи конструктора без параметров, строку “StartaUniversity”
//        Распечатайте все объекты на консоле
//        Примените метод reverse() к любому созданному объекту
//        Распечатайте объект на консоле


package StringBuilder;

public class Task1 {
    public static void main(String[] args) {
        String str = "heyyyy";
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder(str);
        StringBuilder str4 = new StringBuilder("Hello");
        StringBuilder str3 = new StringBuilder(10);


        str1.append("Starta University");
        System.out.println(str1);
//        str1.append("aaa");
//        System.out.println(str1);

//        str2.append("aaa");
        System.out.println(str2);

//        str2.reverse();
//        System.out.println(str2);
//
//        System.out.println(str3);

//        System.out.println(str1.charAt(0));
//        System.out.println(str1.delete(0,6));
//        System.out.println(str1.deleteCharAt(0));
//        System.out.println(str1.substring(6));
//        System.out.println(str1.replace(0,6,"java"));

    }



}
