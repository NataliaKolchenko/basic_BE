//Реализуйте метод который принимает два числа, сравнивает их и возвращает
//        сумму всех вхождений в максимальное число.
//        Например:
//        Вход = 2, 3
//        Выход = 6
//        Объяснение: 3 больше чем 2, все вхождения 1+2+3 = 6

public class FoorLoopCompareNumers {

    public static void main(String[] args) {

        int first = 9;
        int second = 8;

        int sum = 0;
//version 1
        if (first > second) {
            for (int i = 1; i <= first; i++) {
                sum += i;

            }
        } else {
            for (int i = 1; i <= second; i++) {
                sum += i;
            }
        }

        //version 2
        for (int i = 1; i <= (first > second ? first : second); i++) {
            sum += i;
        }

        System.out.println("sum " + sum);
    }
}
