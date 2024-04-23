//Напишите программу на Java, чтобы поменять местами значения, хранящиеся в
//        двух переменных, без использования третьей переменной:
//        На вход: а = 2; b = 5;
//        На выход: a = 5; b = 2;
//        c использованием переменной temp;

public class ChangeNumberPlace {

    public static void main(String[] args) {

        int a = 4;
        int b = 6;


     Swapper(a,b);


    }

    public static void Swapper (int a, int b) {

        System.out.println(a + " , " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " , " + b);
    }
}
