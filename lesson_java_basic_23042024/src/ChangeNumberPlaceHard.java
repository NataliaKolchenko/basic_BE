import java.util.ArrayList;

public class ChangeNumberPlaceHard {

    public static void main(String[] args) {

        int a = 4;
        int b = 6;


        Swapper(a, b);


    }

    public static void Swapper(int a, int b) {

        System.out.println(a + " , " + b);

//вариант 1
        a = a + b; // a теперь 7
        b = a - b; // b теперь 2 (7 - 5)
        a = a - b; // a теперь 5 (7 - 2)

        //вариант 2
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;


        System.out.println(a + " , " + b);

    }

}
