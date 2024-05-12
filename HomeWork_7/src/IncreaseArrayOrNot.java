//№2.
//        Создайте массив из 5 случайных целых чисел из интервала [10;99]
//        Выведите его на консоль в строку.
//        Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.

public class IncreaseArrayOrNot {

    public static void main(String[] args) {

        int min = 10;
        int max = 99;
        int randomNumber;
        int i = 0;

        int[] randomArr = new int [5];

        for (; i < randomArr.length; i++) {
            randomNumber = (int)(Math.random()*(max - min + 1) + min);
            randomArr[i] = randomNumber;

            System.out.print(randomArr[i] + " ");

        }

        System.out.println(" ");
//1 version

//        if ((randomArr[0] > randomArr[1]) && (randomArr[1] > randomArr[2]) && (randomArr[2] > randomArr[3]) && (randomArr[3] > randomArr[4])) {
//            System.out.println("This is increasing random");
//        } else {
//            System.out.println("NOPE");
//        }


//2 version

            boolean flag = true;
            for (int j = 1; j <randomArr.length; j++) {
                if (randomArr[j] <= randomArr[j-1])  {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println("This is increasing random");
            } else {
                System.out.println("NOPE");
            }





    }
}
