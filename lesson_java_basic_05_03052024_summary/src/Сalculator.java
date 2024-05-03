import java.util.Scanner;

public class Сalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Add 1st number");
            int firstNumber = scanner.nextInt();

            System.out.println("Add 2nd number");
            int secondNumber = scanner.nextInt();

            System.out.println("Add operation");
            char operator = scanner.next().charAt(0);

            if (operator == '=') return;

            switch (operator) {
                case ('+') -> System.out.println("result = " + (firstNumber + secondNumber));
                case ('-') -> System.out.println("result = " + (firstNumber - secondNumber));
                case ('*') -> System.out.println("result = " + (firstNumber * secondNumber));
                case ('/') -> System.out.println("result = " + (firstNumber / secondNumber));
            }
        }

    }
}
