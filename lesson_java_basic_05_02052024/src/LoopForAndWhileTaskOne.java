//        Инициализируйте переменную int count = 10;
//        2. Создать метод, который печатает в консоле “Привет программист”
//        count раз
//        3. Используйте цикл while

public class LoopForAndWhileTaskOne {
    public static void main(String[] args) {

        printHelloFor(10);
        System.out.println("-----------");
        printHelloWhile(10);
    }

    public static void printHelloFor (int count) {

        for (int i = 1; i <= count; i++) {
            System.out.println(i + " Hello Developer");
        }

    }

    public static void printHelloWhile (int count) {
        int i = 1;
        while (i <= count) {

            System.out.println(i + " Hello Developer");
            i++;
        }
    }
}