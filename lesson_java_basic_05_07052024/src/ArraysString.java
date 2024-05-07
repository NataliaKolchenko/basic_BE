//        Создать массив типа String с размером 7. 
//        Записать в него значения дней недели.
//        Вывести на консоль значение последнего элемента.


import java.util.Arrays;

public class ArraysString {

    public static void main(String[] args) {
        String[] daysOfWeek = {"Mo", "Tue", "We", "Thu", "Fr", "Sa", "Su"};

        System.out.println(daysOfWeek[daysOfWeek.length-1]);

    }
}
