import java.util.Scanner;
import java.util.SortedMap;

public class LargestNumberInArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ints = new int[5];

        System.out.println("Add 5 numbers");

        for (int i = 0; i < ints.length; i++) {
            ints[i] = scanner.nextInt();
        }
        int max = ints[0];
        int min = ints[0];

        for (int number : ints) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}
