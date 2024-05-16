package org.example.StringBuilder;//Дан массив символов, объедините его и замените символ '?' на правильный символ,
// выведите результат на консоль.
//        char[] arr = {'I', ' ', 'l', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};

public class StringBuilderTask2AppendReplace {

    public static void main(String[] args) {
        char[] arr = {'I', ' ', 'l', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};
        StringBuilder sB1 = new StringBuilder();
        sB1.append(arr);
        System.out.println(sB1);
        sB1.replace(5,6,"e");
        //если мы не знаем позицию
//        sb.replace(sb.indexOf("?"), sb.indexOf("?") + 1,"e");
        System.out.println(sB1);
    }
}
