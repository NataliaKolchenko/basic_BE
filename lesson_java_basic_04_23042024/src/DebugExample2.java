public class DebugExample2 {

    public static void main(String[] args) {
        int limit = 10; // Мы ожидаем, что сумма чисел от 1 до 10 будет 55
        int sum = calculateSum(limit);
        System.out.println("Sum from 1 to " + limit + " is " + sum);
    }

    public static int calculateSum(int limit) {
        int sum = 0;
        for (int i = 1; i <= limit; i++) {
            sum += i; // Точка останова
        }
        return sum;
    }
}
