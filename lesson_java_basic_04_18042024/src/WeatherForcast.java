//При помощи Math.random() сгенерировать 3 числа --
// прогноз температуры на сегодня, завтра и послезавтра и вывести на экран.
// температура может быть от -20 до +30 градусов.

public class WeatherForcast {
//    --------1 version------------------
//    public static void main(String[] args) {
//        int min = -20;
//        int max = +30;
//        int randomNum1 = (int)(Math.random() * (max - min + 1) + min); //number [0.0, 1.0]
//        int randomNum2 = (int)(Math.random() * (max - min + 1) + min); //number [0.0, 1.0]
//        int randomNum3 = (int)(Math.random() * (max - min + 1) + min); //number [0.0, 1.0]
//        System.out.println("today is " + randomNum1);
//        System.out.println("tomorrow is " + randomNum2);
//        System.out.println("2 days later is " + randomNum3);
//    }
//    --------2 version------------------
//    public static void main(String[] args) {
//        int min = -20;
//        int max = +30;
//        for (int i = 0; i < 3; i++) {
//            int randomNum = (int)(Math.random() * (max - min + 1) + min); //number [0.0, 1.0]
//            System.out.println(randomNum);
//        }
//    }


//    --------3 version------------------
    public static void main(String[] args) {

        printWeather();

        System.out.println(generateTemp(5, 45));

    }

    public static void printWeather () {
        System.out.println("Today is " + generateTemp());
        System.out.println("tomorrow is " + generateTemp());
        System.out.println("2 days later is " + generateTemp());

    }

    public static int generateTemp () {
        int min = -20;
        int max = +30;

        return  (int)(Math.random() * (max - min + 1) + min);
    }


    //написать перегруженный метод generateTemp(int min, int max)

    public static int generateTemp (int min, int max) {

        return  (int)(Math.random() * (max - min + 1) + min);

    }
}
