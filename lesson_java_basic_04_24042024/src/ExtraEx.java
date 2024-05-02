//        Создайте массив из 20 случайных целых чисел.
//        Используя цикл, подсчитайте количество чётных и нечётных чисел в массиве,
//        используя инкремент для обоих счетчиков. Выведите оба счетчика после окончания цикла.

import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;

public class ExtraEx {

    public static void main(String[] args) {

        int countEven = 0;
        int countOdd = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while (list.size() <= 19) {
            list.add((int) (Math.random() * (100 - 1 + 1) + 1));

        }


        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }

            //System.out.println(list.get(i));
        }

        System.out.println("Total even numbers are " + countEven);
        System.out.println("Total odd numbers are " + countOdd);
    }

}

