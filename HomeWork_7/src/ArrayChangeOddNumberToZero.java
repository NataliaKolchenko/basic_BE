//№1.
//        Создайте массив из 8 случайных целых чисел из интервала [1;50]
//        Выведите массив на консоль в строку.
//        Замените каждый элемент с нечетным индексом на ноль.
//        Снова выведете массив на консоль в отдельной строке.


public class ArrayChangeOddNumberToZero {
    public static void main(String[] args) {

        int min = 1;
        int max = 50;
        int randomNumber;

        int[] randomArr = new int[8];

        for (int i = 0; i < randomArr.length; i++){
            randomNumber = (int)(Math.random()*(max - min + 1) +min);
            randomArr[i] = randomNumber;



            System.out.print(randomArr[i] + " ");
        }

        System.out.println("");

        for (int j = 0; j < randomArr.length; j++){
            randomNumber = (int)(Math.random()*(max - min + 1) +min);
            if (j % 2 != 0) {
                randomArr[j] = 0;
            } else {
                randomArr[j] = randomNumber;
            }
            System.out.print(randomArr[j] + " ");
        }



    }
}