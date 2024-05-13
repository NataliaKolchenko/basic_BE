package Array;//Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
//        отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).
//        Перед созданием массива подумайте, какого он будет размера.
//При выводе чисел в столбик, вывести их в обратном порядке.

import java.util.Arrays;

public class EvenArray {

    public static void main(String[] args) {
        int [] evenArr = new int [10];
        int j = 0;
        for (int i = 2; i <= 20; i+=2){
            evenArr[j] = i;
            System.out.print(evenArr[j] + " ") ;
            j++;
        }

        System.out.println();

        for (int i = evenArr.length -1; i >= 0; i-=1) {

            System.out.println(evenArr[i]);
        }
    }
}
