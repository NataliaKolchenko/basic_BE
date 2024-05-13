package Car;//Создайте 5 объектов типа Car.Car
//        Объект Car.Car должен содержать поля
//private double price;
//private String model;
//        и конструктор с этими полями
//        Сохраните объекты в массив
//        Распечатайте результат
//        Результат печати одного авто должен выглядеть:
//        Car.Car - BMW, price = 2.3
//        Применив метод “сортировка пузырьком” отсортируйте массив по стоимости
//        Распечатайте результат
//        Применив метод “сортировка пузырьком” отсортируйте массив по модели (первая буква из модели)
//        Распечатайте результат

import Car.Car;

import java.util.Arrays;

public class CarSort {

    public static void main(String[] args) {
        Car [] cars = new Car[] {
                new Car(1.5, "bwm 530i"),
                new Car (21, "volvo s80"),
                new Car (10, "ford focus"),
                new Car (5.7, "app mustang")
        };

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);

        }

        System.out.println();
        System.out.println(Arrays.toString(bubbleSortCarsByPrice(cars)));
        System.out.println();
        System.out.println(Arrays.toString(bubbleSortCarsByModel(cars)));



    }

    public static Car[]  bubbleSortCarsByPrice (Car[] arr) {
        boolean isSorted = false;
        Car temp;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++){
                if (arr[i].getPrice() > arr[i+1].getPrice()){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    isSorted = false;
                }
            }
        }
        return arr;
    }


    public static Car[]  bubbleSortCarsByModel (Car[] arr) {
        boolean isSorted = false;
        Car temp;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++){
                if (arr[i].getModel().charAt(0) > arr[i+1].getModel().charAt(0)){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    isSorted = false;
                }
            }
        }
        return arr;
    }

}
