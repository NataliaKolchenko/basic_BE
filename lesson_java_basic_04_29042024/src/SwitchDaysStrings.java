//        1. Создайте switch-блок, который мог бы определить, является ли
//        переданный день выходным или рабочим днем.
//        2. Создайте переменную String dayString;

public class SwitchDaysStrings {

    public static void main(String[] args) {

        String dayString = "So";

        switch (dayString) {
            case "Mo":
            case "Tu":
            case "We":
            case "Th":
            case "Fr":
                dayString = "working";
                break;

            case "Sa":
            case "So":
                dayString = "Weekend";
                break;

            default:
                dayString = "wrong";
                throw new RuntimeException("ERROR: wrong day!!!!!!!!!!!!!!");

        }
        System.out.println(dayString);

    }
}
