//Дополнительно
//
//        Дан массив размера  N-1  , содержащий только различные целые числа в диапазоне от  1 до N . Найдите недостающий элемент.
//        Пример 1:
//        Вход:
//        N = 5
//        А[] = {1,2,3,5}
//        Выход: 4
//
//
//        Пример 2:
//        Вход:
//        N = 10
//        А[] = {6,1,2,8,3,4,7,10,5}
//        Выход: 9


import java.util.Random;
import java.util.Scanner;

public class FindLostNumber {

    public static void main(String[] args) {
        int i;
        int j;
//        int arraySize = 4; //размер массива (N-1)
//        int randomSize = 5; //размер рандома (N)

        Scanner scan = new Scanner(System.in);
        System.out.println("Size of array");
        int arraySize = scan.nextInt();
        int randomSize = arraySize + 1;

        Random myRandom = new Random();
        int [] arr1 = new int[arraySize];

        System.out.println("Our array");

        for (i = 0; i < arr1.length;){
            int randomNumber = myRandom.nextInt(randomSize);

            for (j = 0; j < i; j++) {
                if (arr1[j] == randomNumber) {
                    break;
                }
            }
            if (j ==i) {
                arr1[i] = randomNumber;
                System.out.print(arr1[i] + " ");
                i++;
            }

        }

        System.out.println(" ");

        System.out.println("Losted number is " + missingNumber(arr1));
    }

    public static int missingNumber (int [] arr) {
        int realSum = 0;
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        for (int i = 0; i <= arr.length; i++) {
            realSum += i;
        }
//        System.out.println(sum);
//        System.out.println(realSum);
        return realSum - sum;
//        return sum - realSum;
    }
}
