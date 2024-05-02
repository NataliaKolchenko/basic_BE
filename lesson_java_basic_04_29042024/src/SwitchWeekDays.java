//        Создайте switch-блок с днями недели
//        2. Создайте переменные int day; String dayString;
//        3. В каждом кейсе инициализируйте переменную dayString правильным
//        значением.
//        4. Запустите программу, передав в switch-условие день 2.
//        5. В case №4 удалите break;
//        6. Запустите программу
//        7. Проанализируйте вывод

public class SwitchWeekDays {

    public static void main(String[] args) {

        int day = 2;
        String dayString = "try";

        switch (day) {
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wensday";
                break;
            case 4:
                dayString = "Thusday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            case 7:
                dayString = "Sunday";
                break;
            default:
                dayString = "wrong";
                throw new RuntimeException("ERROR: wrong day!!!!!!!!!!!!!!");
        }
        System.out.println(dayString);

    }
}
