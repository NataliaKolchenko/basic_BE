//Создать массив из 15 случайных элементов
//        В массиве найти максимальный элемент
//
//        В массиве найти максимальный элемент с четным индексом

import java.util.Arrays;

public class RandomMaxItemInArray {

    public static void main(String[] args) {
        int min = 0;
        int max = 100;
        int randomNumber;
        int maxNumber = 0;
        int maxEvenNumber = 0;

        int[] randomArr = new int[15];

        for (int i = 0; i < randomArr.length; i++) {
            randomNumber = (int)(Math.random()*(max - min + 1)+min);
            randomArr[i] = randomNumber;
            if (randomArr[i] > maxNumber) {
                maxNumber = randomArr[i];
            }
            if ((i % 2 ==0) && (randomArr[i] > maxEvenNumber)) {
                    maxEvenNumber = randomArr[i];
            }
        }
        System.out.println(Arrays.toString(randomArr));
        System.out.println("Max number:" + maxNumber);
        System.out.println("Max even: " + maxEvenNumber);
    }
}
