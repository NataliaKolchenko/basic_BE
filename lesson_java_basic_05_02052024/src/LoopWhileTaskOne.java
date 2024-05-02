import java.util.Scanner;

public class LoopWhileTaskOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num = scanner.nextInt();

        while (num != 0) {
            sum += num;
            num = scanner.nextInt();

        }
        System.out.println(sum);

    }
}
