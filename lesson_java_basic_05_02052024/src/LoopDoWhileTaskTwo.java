public class LoopDoWhileTaskTwo {

    public static void main(String[] args) {

        int x = 20;
        int sum = 0;

        do {
            sum += x;
            x--;
        } while (x>10);
        System.out.println("Summ: " + sum);
    }
}
