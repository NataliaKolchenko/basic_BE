public class incorrectFactorial {

    public static void main(String[] args) {
        int number = 20;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is " + result);
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
