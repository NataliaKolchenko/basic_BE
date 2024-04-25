// вернуть минимальное из трех чисел

public class ReturnMinNumber {

    public static void main(String[] args) {
        System.out.println(minOfThree(1, 1, 3));
    }


    public static int minOfThree (int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        }
        if (b <= a && b <= c) {
            return b;
        }
        return c;
        }


    }



