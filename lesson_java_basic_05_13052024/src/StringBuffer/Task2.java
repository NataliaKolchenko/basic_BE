//Создайте объект StringBuffer используя конструктор String
//        "It is String Builder Object"
//        Распечатайте объект
//        Замените слово Builder на слово Buffer
//        Используйте метод replace()
//        Распечатайте результат

package StringBuffer;

public class Task2 {

    public static void main(String[] args) {
        String  str = "It is String Builder Object";
        StringBuffer sb1 = new StringBuffer(str);
//        StringBuffer str4 = new StringBuffer("Hello");
//        StringBuffer str3 = new StringBuffer(10);

        System.out.println(sb1);
        sb1.replace(13,19, "Buffer");
        System.out.println(sb1);
    }
}
