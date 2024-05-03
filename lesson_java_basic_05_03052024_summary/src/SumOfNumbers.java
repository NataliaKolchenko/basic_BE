import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add number");
        int number = scanner.nextInt();

        int result = 0;

        for (int i = 1; i <= number; i++) {
            result += i;
        }

        System.out.println(result);
    }
}
