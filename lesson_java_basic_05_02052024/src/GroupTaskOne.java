//По данному натуральному n вычислите сумму 1^2 + 2^2 + ... + n^2

public class GroupTaskOne {

    public static void main(String[] args) {
        int n = 4;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i*i;

        }

        System.out.println(sum);
    }
}
