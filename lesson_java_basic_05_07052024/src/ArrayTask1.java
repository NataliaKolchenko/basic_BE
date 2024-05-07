//        Создайте массив L = 10
//        Инициализируйте массив числами от 1 до 10 используя способ литерала
//        Выведите на консоль элемент из второй ячейки
//        Выведите на консоль элемент из предпоследней ячейки
//        Распечатайте на консоль все элементы из ячеек массива
//        Используйте инструкцию .print()
//        Замените все элементы в данном массиве на значение “-1”
//        Распечатайте на консоль все элементы из ячеек массива
//        Используйте инструкцию .print()

public class ArrayTask1 {

    public static void main(String[] args) {

        int[] arrayL = new int [10];
        for (int i = 0; i < arrayL.length; i++) {
            arrayL[i] = i;
        }
//        Выведите на консоль элемент из второй ячейки
        System.out.println("2nd place: " + arrayL[1]);

//        Выведите на консоль элемент из предпоследней ячейки
        System.out.println("2nd place before end: " + (arrayL.length-2));

//        Распечатайте на консоль все элементы из ячеек массива
        for (int i = 0; i < arrayL.length; i++) {
            System.out.print(arrayL[i] + " ");
        }

        System.out.println();

//        Замените все элементы в данном массиве на значение “-1”
        for (int i = 0; i < arrayL.length; i++) {
            arrayL[i] = -1;
            System.out.print(arrayL[i] + " ");
        }

    }
}
