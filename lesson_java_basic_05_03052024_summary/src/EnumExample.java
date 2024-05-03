import java.util.Scanner;

public class EnumExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(Weekday.getDay(input));
    }

    enum Weekday {
        MONDAY(1),
        TUESDAY (2),
        WENDSDAY (3),
        THURSDAY (4),
        FRIDAY(5),
        SATURDAY (6),
        SUNDAY (7),
        UNKNOWN (0);

        private int numberOfDay;

        Weekday (int numberOfDay) {
            this.numberOfDay = numberOfDay;
        }

        public static Weekday getDay (int input) {
            if (1 == input) {
                return Weekday.MONDAY;
            } else if (2 == input) {
                return Weekday.TUESDAY;
            }  else if (3 == input) {
                return Weekday.WENDSDAY;
            } else if (4 == input) {
                return Weekday.THURSDAY;
            }
            else if (5 == input) {
                return Weekday.FRIDAY;
            }
            else if (6 == input) {
                return Weekday.SATURDAY;
            }
            else if (7 == input) {
                return Weekday.SUNDAY;
            }  else {
                return UNKNOWN;
            }
        }
    }



}
