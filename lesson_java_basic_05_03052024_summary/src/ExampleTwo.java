import java.util.Scanner;

public class ExampleTwo {

    enum Weekday {
        MONDAY, TUESDAY, WENDSDAY, THURSDAY,
        FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (1 == input) {
            System.out.println(Weekday.MONDAY);
        } else if (2 == input) {
            System.out.println(Weekday.TUESDAY);
        }  else if (3 == input) {
            System.out.println(Weekday.WENDSDAY);
        } else if (4 == input) {
            System.out.println(Weekday.THURSDAY);
        }
        else if (5 == input) {
            System.out.println(Weekday.FRIDAY);
        }
        else if (6 == input) {
            System.out.println(Weekday.SATURDAY);
        }
        else if (7 == input) {
            System.out.println(Weekday.SUNDAY);
        }  else {
            System.out.println("Fail");
        }
    }
}
