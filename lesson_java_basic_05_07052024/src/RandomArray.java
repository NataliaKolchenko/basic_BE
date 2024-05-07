//Создайте массив из 15 случайных целых чисел из отрезка [0;9]. 
//Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {

        int min = 0;
        int max = 9;
        int randomNumber;
        int evenNum = 0;

        int[] randomArr = new int[15];

        for (int i = 0; i < randomArr.length; i++) {
            randomNumber = (int)(Math.random()*(max - min + 1)+min);
            randomArr[i] = randomNumber;
            if (randomArr[i] % 2 ==0) {
                evenNum++;
            }
        }


        //так же рандом можно использвать так:
//        Random random = new Random();
//        randomArr[i] = random.nextInt(10); // Генерация случайного числа от 0 до 9

        System.out.println(Arrays.toString(randomArr));
        System.out.println("Even numbers: " + evenNum);





    }
}

