import java.util.Enumeration;

public class ExampleReturn {
    public static void main(String[] args) throws Exception {
        print(10);
        System.out.println(square(10));
        System.out.println(exeptionOnZero(10));
        exeptionOnZero(0);
    }

    public static void print (int number) {
        System.out.println(number);
    }

    public static int square (int number) {
        return number * number;
    }

    public static int exeptionOnZero (int number) throws Exception {

        if (number == 0) {
            throw new Exception("Zero");
        }
        return number;

    }
}
