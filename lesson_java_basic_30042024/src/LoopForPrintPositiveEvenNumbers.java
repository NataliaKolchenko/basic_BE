//Создайте метод, который принимает число и выводит в консоль все четные
//        положительные числа меньше него

public class LoopForPrintPositiveEvenNumbers {

    public static void main(String[] args) {

        printPosotiveEvenNumbers(8);

        System.out.println("------------");

        print(7);

    }
//меняем внешнее число
    public static void printPosotiveEvenNumbers (int number) {
        for (int i = 0; i < number-1; number--) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

    //меняем переменную
    public static void print (int number) {
        for (int i = number-1; i > 0; i--){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
