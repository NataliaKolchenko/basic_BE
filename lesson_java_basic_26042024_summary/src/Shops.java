//Создайте две переменные *isEdekaOpen* и *isReweOpen*, значения которых зависят от того, открыты магазины или нет.
//Реализует логический метод *canBuy*,  возвращающий boolean
//Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
//Отобразите строку «Я могу купить еду, это ……» и значение.
//Реализуйте программу, которая попросит пользователя ввести год и напечатать этот год isLeap (високосный) или нет.
//Реализуйте программу, которая попросит пользователя ввести три целых числа (используйте сканер) и напечатает максимум из трех чисел.

public class Shops {

    public static void main(String[] args) {
        boolean isEdekaOpen = false;
        boolean isReweOpen = false;

        System.out.println("Я могу кушать? " + canBuy(isEdekaOpen, isReweOpen));
    }

    private static boolean canBuy (boolean isEdekaOpen, boolean isReweOpen) {
        return isEdekaOpen || isReweOpen;
    }
}
