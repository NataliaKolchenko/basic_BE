public class SwitchDaysTernary {

    //        1. Создайте switch-блок, который мог бы определить, является ли
//        переданный день выходным или рабочим днем.
//        2. Создайте переменную String dayString;

    //переписать на if-else




//        public static void main(String[] args) {
//
//            int day = 5;
//            String dayType;
//
//            if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
//                dayType = "working";
//            } else {
//                dayType = "Weekend";
//            }
//
//            System.out.println(dayType);
//            }

    //переписать на тернарный оператор
    public static void main(String[] args) {

        int day = 7;
        String dayType;

       dayType =  day <= 5
           ?  "working"
           :  "Weekend";


        System.out.println(dayType);
    }

        }





