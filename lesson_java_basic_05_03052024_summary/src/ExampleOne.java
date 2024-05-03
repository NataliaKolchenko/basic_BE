import java.util.Scanner;

public class ExampleOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = "empty";

        while (!input.equals("exit")) {
            input = scanner.nextLine();
            System.out.println("Input: " + input);
        }
        System.out.println("Finish");
        scanner.close();
    }
}