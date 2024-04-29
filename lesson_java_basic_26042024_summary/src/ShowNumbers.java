//    Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
//        Числа могут быть, как целочисленные, так и дробные.
//        Например :
//        ввод : m=10.5, n=10.45
//        вывод: Число 10.45 ближе к 10.

public class ShowNumbers {

    public static void main(String[] args) {

        System.out.println(closeTo10(9.8, 10));

    }

    private static double closeTo10 (double a, double b) {
        //        используется только если простая проверка "если ЭТО, иначе ТО
        return Math.abs(10 - a) < Math.abs(10 - b)
                ? a //если условие true
                :b; //иначе

//        аналог выше записи
//        if ((Math.abs(10 - a) < Math.abs(10 - b)) {
//            return a;
//        } else {
//            return b;
//        }
    }
}
