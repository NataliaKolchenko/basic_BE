//        1 уровень сложности: 1. Создайте две переменные isEdekaOpen и isReweOpen, значения которых
//        зависят от того, открыты магазины или нет.
//        a. Реализует логический метод canBuy, возвращающий boolean
//        b. Значение этой переменной должно быть true, если хотя бы один
//        магазин открыт, иначе false.
//        c. Отобразите строку «Я могу купить еду, это ……» и значение.

//P.S. я немного изменила реализацию программы для отработки тернарных операторов

public class ShopsIsOpen {
    public static void main(String[] args) {


        boolean isEdekaOpen = false;
        boolean isReweOpen = false;

        System.out.println(canBuy(isEdekaOpen, isReweOpen));



        boolean result = canBuy(isEdekaOpen, isReweOpen) == true
            ? print(canBuy(isEdekaOpen, isReweOpen))
                : print(canBuy(isEdekaOpen, isReweOpen));


    }

    public static boolean canBuy (boolean isEdekaOpen, boolean isReweOpen) {


        return isEdekaOpen || isReweOpen ? true : false;
    }

    public static boolean print (boolean b) {
        if (b == true) {
            System.out.println ("Shop is opening");
            return b;
        } else {
            System.out.println ("Shop is closing");
            return b;
        }



    }
}