//Напишите класс Converter для конвертации из градусов по Цельсию в
//        Кельвины , Фаренгейты:
//        У класса должны быть методы для конвертации.
//        Реализуйте два метода в классе:
//        runKelvinConverter(double baseValue)
//        runFahrenheitConverter(double baseValue)

public class Converter {

    public static void main(String[] args) {
        int cel = 9;
        System.out.println("5 градусов по Цельсию это " + (runKelvinConverter (cel) + " градусов по Кельвину" ));
       // System.out.println(runKelvinConverter (5));
        System.out.println("5 градусов по Цельсию это " + (runFahrenheitConverter (cel) + " градусов по Кельвину" ));
        //System.out.println(runFahrenheitConverter(5));
    }

    public static double runKelvinConverter (double baseValue) {
//        0 °C + 273,15
        return (baseValue + 273.15);

    }

    public static double runFahrenheitConverter (double baseValue) {
//        (0 °C × 9/5) + 32 = 32 °F
//        9/5 = 1.8

        return ((baseValue * 1.8) + 32);
    }

}
